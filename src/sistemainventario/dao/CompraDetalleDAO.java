package sistemainventario.dao;

import sistemainventario.entity.CompraDetalle;
import sistemainventario.entity.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompraDetalleDAO extends DAO<CompraDetalle, Integer> {

    @Override
    public CompraDetalle mapResultSetToEntity(ResultSet rs) throws SQLException {
        CompraDetalle detalle = new CompraDetalle();

        detalle.setId(rs.getInt("id_detalle_compra"));
        detalle.setIdMovimiento(rs.getInt("compra_id"));
        detalle.setCantidad(rs.getInt("cantidad_detalle_compra"));
        detalle.setPrecio(rs.getDouble("costo_detalle_compra"));
        
        ProductoDAO productoDAO = new ProductoDAO();
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
            throw new IllegalArgumentException(sql);
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
            throw new IllegalArgumentException(sql);
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
            throw new IllegalArgumentException(sql);
        }

        return lista;
    }

    @Override
    public void save(CompraDetalle entity) {
        String sql = "INSERT INTO detalles_compra (compra_id, producto_id, cantidad_detalle_compra, costo_detalle_compra) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, entity.getIdMovimiento());
            stmt.setInt(2, entity.getProducto().getId());
            stmt.setInt(3, entity.getCantidad());
            stmt.setDouble(4, entity.getPrecio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(CompraDetalle entity) {
        String sql = "UPDATE detalles_compra SET compra_id = ?, producto_id = ?, cantidad_detalle_compra = ?, costo_detalle_compra = ? WHERE id_detalle_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, entity.getIdMovimiento());
            stmt.setInt(2, entity.getProducto().getId());
            stmt.setInt(3, entity.getCantidad());
            stmt.setDouble(4, entity.getPrecio());
            stmt.setInt(5, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM detalles_compra WHERE id_detalle_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }
}
