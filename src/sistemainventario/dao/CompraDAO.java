package sistemainventario.dao;

import sistemainventario.entity.Compra;
import sistemainventario.entity.CompraDetalle;
import sistemainventario.entity.Proveedor;
import sistemainventario.entity.Comprobante;
import sistemainventario.entity.Estado;
import sistemainventario.entity.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.util.Mensajes;

public class CompraDAO implements IDAO<Compra, Integer> {

    private final Connection conn;
    
    public CompraDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Compra mapResultSetToEntity(ResultSet rs) throws SQLException {
        Compra entity = new Compra();

        entity.setId(rs.getInt("id_compra"));
        entity.setFecha(rs.getTimestamp("fecha_compra").toLocalDateTime().toLocalDate());
        entity.setNroComprobante(rs.getString("num_comprobante_compra"));
        entity.setTotal(rs.getDouble("total_compra"));

        // Relacionales
        ProveedorDAO proveedorDAO = new ProveedorDAO();        
        Proveedor proveedor = proveedorDAO.getById(rs.getInt("proveedor_id"));
        entity.setProveedor(proveedor);
        
        ComprobanteDAO comprobanteDAO = new ComprobanteDAO();
        Comprobante comprobante = comprobanteDAO.getById(rs.getInt("comprobante_id"));
        entity.setComprobante(comprobante);
        
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.getById(rs.getInt("estado_id"));
        entity.setEstado(estado);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getById(rs.getInt("usuario_id"));
        entity.setUsuario(usuario); 
        
        CompraDetalleDAO compradetalleDAO= new CompraDetalleDAO();
        List<CompraDetalle> detalle = compradetalleDAO.getByCompraId(rs.getInt("id_compra"));
        entity.setDetalles(detalle);
        
        return entity;
    }

    @Override
    public Compra getById(Integer id) {
        String sql = "SELECT * FROM compras WHERE id_compra = ?";
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
    public List<Compra> getAll() {
        List<Compra> lista = new ArrayList<>();
        String sql = "SELECT * FROM compras";
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

    @Override
    public void save(Compra entity) {
        String sql = "INSERT INTO compras (fecha_compra, proveedor_id, comprobante_id, num_comprobante_compra, estado_id, total_compra, usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1,Timestamp.valueOf(entity.getFecha().atStartOfDay()));
            stmt.setInt(2, entity.getProveedor().getId());
            stmt.setInt(3, entity.getComprobante().getId());
            stmt.setString(4, entity.getNroComprobante());
            stmt.setInt(5, entity.getEstado().getId());
            stmt.setDouble(6, entity.getTotal());
            stmt.setInt(7, entity.getUsuario().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Compra entity) {
        String sql = "UPDATE compras SET fecha_compra = ?, proveedor_id = ?, comprobante_id = ?, num_comprobante_compra = ?, estado_id = ?, total_compra = ?, usuario_id = ? WHERE id_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(entity.getFecha().atStartOfDay()));
            stmt.setInt(2, entity.getProveedor().getId());
            stmt.setInt(3, entity.getComprobante().getId());
            stmt.setString(4, entity.getNroComprobante());
            stmt.setInt(5, entity.getEstado().getId());
            stmt.setDouble(6, entity.getTotal());
            stmt.setInt(7, entity.getUsuario().getId());
            stmt.setInt(8, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM compras WHERE id_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    public void changeEstado(int id, int nuevoEstadoId) {
        String sql = "UPDATE compras SET estado_id = ? WHERE id_compra = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, nuevoEstadoId);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }
    
}
