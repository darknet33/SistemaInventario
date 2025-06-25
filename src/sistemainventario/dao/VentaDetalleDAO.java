package sistemainventario.dao;

import sistemainventario.entity.VentaDetalle;
import sistemainventario.entity.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VentaDetalleDAO extends DAO<VentaDetalle, Integer> {
    
    @Override
    public VentaDetalle mapResultSetToEntity(ResultSet rs) throws SQLException {
        VentaDetalle detalle = new VentaDetalle();

        detalle.setId(rs.getInt("id_detalle_venta"));
        detalle.setIdMovimiento(rs.getInt("venta_id"));
        detalle.setCantidad(rs.getInt("cantidad_detalle_venta"));
        detalle.setPrecio(rs.getDouble("precio_detalle_venta"));
        
        ProductoDAO productoDAO = new ProductoDAO();
        Producto producto = productoDAO.getById(rs.getInt("producto_id"));
        detalle.setProducto(producto);

        return detalle;
    }

    @Override
    public VentaDetalle getById(Integer id) {
        String sql = "SELECT * FROM detalles_venta WHERE id_detalle_venta = ?";
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
    public List<VentaDetalle> getAll() {
        List<VentaDetalle> lista = new ArrayList<>();
        String sql = "SELECT * FROM detalles_venta";

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

    public List<VentaDetalle> getByVentaId(int ventaId) {
        List<VentaDetalle> lista = new ArrayList<>();
        String sql = "SELECT * FROM detalles_venta WHERE venta_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ventaId);
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
    public void save(VentaDetalle entity) {
        String sql = "INSERT INTO detalles_venta (venta_id, producto_id, cantidad_detalle_venta, precio_detalle_venta) VALUES (?, ?, ?, ?)";
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
    public void update(VentaDetalle entity) {
        String sql = "UPDATE detalles_venta SET venta_id = ?, producto_id = ?, cantidad_detalle_venta = ?, precio_detalle_venta = ? WHERE id_detalle_venta = ?";
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
        String sql = "DELETE FROM detalles_venta WHERE id_detalle_venta = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }
}
