package sistemarhino.dao;

import sistemarhino.entity.Comprobante;
import sistemarhino.entity.Estado;
import sistemarhino.entity.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemarhino.entity.Cliente;
import sistemarhino.entity.Venta;
import sistemarhino.entity.VentaDetalle;

public class VentaDAO implements IDAO<Venta, Integer> {

    private final Connection conn;

    public VentaDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Venta mapResultSetToEntity(ResultSet rs) throws SQLException {
        Venta entity = new Venta();

        entity.setId(rs.getInt("id"));
        entity.setFecha(rs.getTimestamp("fecha").toLocalDateTime().toLocalDate());
        entity.setNroComprobante(rs.getString("num_comprobante"));
        entity.setTotal(rs.getDouble("total"));
        entity.setImpuesto(rs.getInt("impuesto"));
        entity.setDescuento(rs.getInt("descuento"));

        // Relacionales
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.getById(rs.getInt("cliente_id"));
        entity.setCliente(cliente);

        ComprobanteDAO comprobanteDAO = new ComprobanteDAO();
        Comprobante comprobante = comprobanteDAO.getById(rs.getInt("comprobante_id"));
        entity.setComprobante(comprobante);

        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.getById(rs.getInt("estado_id"));
        entity.setEstado(estado);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getById(rs.getInt("usuario_id"));
        entity.setUsuario(usuario);

        VentaDetalleDAO ventadetalleDAO = new VentaDetalleDAO();
        List<VentaDetalle> detalle = ventadetalleDAO.getByVentaId(rs.getInt("id"));
        entity.setDetalles(detalle);

        return entity;
    }

    @Override
    public Venta getById(Integer id) {
        String sql = "SELECT * FROM ventas WHERE id = ?";
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
    public List<Venta> getAll() {
        List<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM ventas";
        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
        return lista;
    }

    @Override
    public void save(Venta entity) {
        String sql = "INSERT INTO ventas (fecha, cliente_id, comprobante_id, num_comprobante, estado_id, total, impuesto, descuento, usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(entity.getFecha().atStartOfDay()));
            stmt.setInt(2, entity.getCliente().getId());
            stmt.setInt(3, entity.getComprobante().getId());
            stmt.setString(4, entity.getNroComprobante());
            stmt.setInt(5, entity.getEstado().getId());
            stmt.setDouble(6, entity.getTotal());
            stmt.setDouble(7, entity.getImpuesto());
            stmt.setDouble(8, entity.getDescuento());
            stmt.setInt(9, entity.getUsuario().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Venta entity) {
        String sql = "UPDATE ventas SET fecha = ?, cliente_id = ?, comprobante_id = ?, num_comprobante = ?, estado_id = ?, total = ?, impuesto = ?, descuento = ?, usuario_id = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(entity.getFecha().atStartOfDay()));
            stmt.setInt(2, entity.getCliente().getId());
            stmt.setInt(3, entity.getComprobante().getId());
            stmt.setString(4, entity.getNroComprobante());
            stmt.setInt(5, entity.getEstado().getId());
            stmt.setDouble(6, entity.getTotal());
            stmt.setDouble(7, entity.getImpuesto());
            stmt.setDouble(8, entity.getDescuento());
            stmt.setInt(9, entity.getUsuario().getId());
            stmt.setInt(10, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM ventas WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    public void changeEstado(int id, int nuevoEstadoId) {
        String sql = "UPDATE ventas SET estado_id = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, nuevoEstadoId);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    public int obtenerIDUltimaVenta() {
        int idUltimo = 0;
        String sql = "SELECT LAST_INSERT_ID()";
        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                idUltimo = rs.getInt(1);
            }
            return idUltimo;
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

}
