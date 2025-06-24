
package sistemarhino.dao;


import sistemarhino.entity.Proveedor;

import java.sql.*;
import java.util.*;

public class ProveedorDAO implements IDAO<Proveedor, Integer>{
    private final Connection conn;
    
    public ProveedorDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Proveedor mapResultSetToEntity(ResultSet rs) throws SQLException {
        Proveedor entity = new Proveedor();
        
        entity.setId(rs.getInt("id"));
        entity.setNombre(rs.getString("nombre"));
        entity.setNit(rs.getString("nit"));
        entity.setMaterial(rs.getString("materiales"));
        entity.setContacto(rs.getString("contacto"));
        entity.setCelular(rs.getString("celular_contacto"));
        entity.setEmail(rs.getString("email_contacto"));
        entity.setEstado(rs.getBoolean("activo"));
        entity.setFechaRegistro(rs.getDate("fecha_registro"));
        
        return entity;
    }

    @Override
    public Proveedor getById(Integer id) {
        String sql="SELECT * FROM proveedores WHERE id = ?";
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
    public List<Proveedor> getAll() {
        List<Proveedor> lista = new ArrayList<>();
        String sql="SELECT * FROM proveedores";
        
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
    public void save(Proveedor entity) {
        String sql = "INSERT INTO proveedores (nombre, nit, materiales, contacto, celular_contacto, email_contacto, activo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getMaterial());
            stmt.setString(4, entity.getContacto());
            stmt.setString(5, entity.getCelular());
            stmt.setString(6, entity.getEmail());
            stmt.setBoolean(7, entity.getEstado());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Proveedor entity) {
        String sql = "UPDATE proveedores SET nombre = ?, nit = ?, materiales = ?, contacto = ?, celular_contacto = ?, email_contacto = ?, activo = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setString(2, entity.getNit());
            stmt.setString(3, entity.getMaterial());
            stmt.setString(4, entity.getContacto());
            stmt.setString(5, entity.getCelular());
            stmt.setString(6, entity.getEmail());
            stmt.setBoolean(7, entity.getEstado());
            stmt.setInt(8, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM proveedores WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    
}
