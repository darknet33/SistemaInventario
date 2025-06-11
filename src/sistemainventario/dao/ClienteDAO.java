package sistemainventario.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.entity.Cliente;
import sistemainventario.util.Mensajes;


public class ClienteDAO implements IDAO<Cliente, Integer>{
    private final Connection conn;

    public ClienteDAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    @Override
    public Cliente mapResultSetToEntity(ResultSet rs) throws SQLException {
        Cliente entity = new Cliente();
        
        entity.setId(rs.getInt("id_cliente"));
        entity.setNombre(rs.getString("nombre_cliente"));
        entity.setNit(rs.getString("nit_cliente"));
        entity.setCelular(rs.getString("celular_cliente"));
        entity.setDireccion(rs.getString("direccion_cliente"));
        entity.setEstado(rs.getBoolean("estado_cliente"));
        entity.setFechaRegistro(rs.getDate("f_registro_cliente"));
        
        return entity;
    }
    
    @Override
    public Cliente getById(Integer id) {
        String sql="SELECT * FROM clientes WHERE id_cliente = ?";
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
    public List<Cliente> getAll() {
        List<Cliente> lista = new ArrayList<>();
        String sql="SELECT * FROM clientes";
        
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
    public void save(Cliente entity) {
        String sql = "INSERT INTO clientes (nombre_cliente, nit_cliente, celular_cliente, direccion_cliente, estado_cliente) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getCelular());
            stmt.setString(4, entity.getDireccion());
            stmt.setBoolean(5, entity.getEstado());
            stmt.executeUpdate();  
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Cliente entity) {
        String sql = "UPDATE clientes SET nombre_cliente = ?, nit_cliente = ?, celular_cliente = ?, direccion_cliente = ?, estado_cliente = ? WHERE id_cliente = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getCelular());
            stmt.setString(4, entity.getDireccion());
            stmt.setBoolean(5, entity.getEstado());
            stmt.setInt(6, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM clientes WHERE id_cliente = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    
}
