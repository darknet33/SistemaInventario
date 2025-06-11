package sistemainventario.dao;

import sistemainventario.entity.CompraDetalle;
import sistemainventario.entity.Producto;
import sistemainventario.entity.Compra;
import sistemainventario.util.Mensajes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompraDetalleDAO implements IDAO<CompraDetalle, Integer> {
    private final Connection conn;
    private final CompraDAO compraDAO = new CompraDAO();
    private final ProductoDAO productoDAO = new ProductoDAO();
    
    public CompraDetalleDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public CompraDetalle mapResultSetToEntity(ResultSet rs) throws SQLException {
        CompraDetalle detalle = new CompraDetalle();

        detalle.setId(rs.getInt("id_detalle_compra"));
        detalle.setCantidad(rs.getInt("cantidad_detalle_compra"));
        detalle.setPrecio(rs.getDouble("costo_detalle_compra"));
    
        Compra compra = compraDAO.getById(rs.getInt("compra_id"));
        detalle.setMovimiento(compra);
     
        Producto producto = productoDAO.getById(rs.getInt("producto_id"));
        detalle.setProducto(producto);

        return detalle;
    }

    @Override
    public CompraDetalle getById(Integer id) {
        String sql = "SELECT * FROM detalles_compra WHERE id_detalle_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
        return null;
    }

    @Override
    public List<CompraDetalle> getAll() {
        List<CompraDetalle> lista = new ArrayList<>();
        String sql = "SELECT * FROM detalles_compra";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }

        return lista;
    }

    public List<CompraDetalle> getByCompraId(int compraId) {
        List<CompraDetalle> lista = new ArrayList<>();
        String sql = "SELECT * FROM detalles_compra WHERE compra_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, compraId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }

        return lista;
    }

    @Override
    public void save(CompraDetalle entity) {
        String sql = "INSERT INTO detalles_compra (compra_id, producto_id, cantidad_detalle_compra, costo_detalle_compra, precio_detalle_compra) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, entity.getMovimiento().getId());
            stmt.setInt(2, entity.getProducto().getId());
            stmt.setInt(3, entity.getCantidad());
            stmt.setDouble(4, entity.getPrecio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(CompraDetalle entity) {
        String sql = "UPDATE detalles_compra SET compra_id = ?, producto_id = ?, cantidad_detalle_compra = ?, costo_detalle_compra = ? WHERE id_detalle_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, entity.getMovimiento().getId());
            stmt.setInt(2, entity.getProducto().getId());
            stmt.setInt(3, entity.getCantidad());
            stmt.setDouble(4, entity.getPrecio());
            stmt.setInt(5, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM detalles_compra WHERE id_detalle_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }
}
