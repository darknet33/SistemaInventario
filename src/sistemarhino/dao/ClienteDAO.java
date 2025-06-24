package sistemarhino.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemarhino.entity.Cliente;


public class ClienteDAO implements IDAO<Cliente, Integer>{
    private final Connection conn;

    public ClienteDAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    @Override
    public Cliente mapResultSetToEntity(ResultSet rs) throws SQLException {
        Cliente entity = new Cliente();
        
        entity.setId(rs.getInt("id"));
        entity.setNombre(rs.getString("nombre"));
        entity.setNit(rs.getString("nit"));
        entity.setCelular(rs.getString("celular"));
        entity.setDireccion(rs.getString("direccion"));
        entity.setEstado(rs.getBoolean("activo"));
        entity.setFechaRegistro(rs.getDate("fecha_registro"));
        
        return entity;
    }
    
    @Override
    public Cliente getById(Integer id) {
        String sql="SELECT * FROM clientes WHERE id = ?";
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
    public List<Cliente> getAll() {
        List<Cliente> lista = new ArrayList<>();
        String sql="SELECT * FROM clientes";
        
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

    @Override
    public void save(Cliente entity) {
        String sql = "INSERT INTO clientes (nombre, nit, celular, direccion, activo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getCelular());
            stmt.setString(4, entity.getDireccion());
            stmt.setBoolean(5, entity.getEstado());
            stmt.executeUpdate();  
        } catch (Exception e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Cliente entity) {
        String sql = "UPDATE clientes SET nombre = ?, nit = ?, celular = ?, direccion = ?, activo = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getCelular());
            stmt.setString(4, entity.getDireccion());
            stmt.setBoolean(5, entity.getEstado());
            stmt.setInt(6, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    
}
