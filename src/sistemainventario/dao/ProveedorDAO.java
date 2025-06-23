
package sistemainventario.dao;


import sistemainventario.entity.Proveedor;

import java.sql.*;
import java.util.*;
import sistemainventario.util.*;

public class ProveedorDAO implements IDAO<Proveedor, Integer>{
    private final Connection conn;
    
    public ProveedorDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Proveedor mapResultSetToEntity(ResultSet rs) throws SQLException {
        Proveedor entity = new Proveedor();
        
        entity.setId(rs.getInt("id_proveedor"));
        entity.setNombre(rs.getString("nombre_proveedor"));
        entity.setNit(rs.getString("nit_proveedor"));
        entity.setMaterial(rs.getString("materiales_proveedor"));
        entity.setContacto(rs.getString("contacto_proveedor"));
        entity.setCelular(rs.getString("celular_contacto_proveedor"));
        entity.setEmail(rs.getString("email_contacto_proveedor"));
        entity.setEstado(rs.getBoolean("estado_proveedor"));
        entity.setFechaRegistro(rs.getDate("f_registro_proveedor"));
        
        return entity;
    }

    @Override
    public Proveedor getById(Integer id) {
        String sql="SELECT * FROM proveedores WHERE id_proveedor = ?";
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
        String sql = "INSERT INTO proveedores (nombre_proveedor, nit_proveedor, materiales_proveedor, contacto_proveedor, celular_contacto_proveedor, email_contacto_proveedor, estado_proveedor) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
        String sql = "UPDATE proveedores SET nombre_proveedor = ?, nit_proveedor = ?, materiales_proveedor = ?, contacto_proveedor = ?, celular_contacto_proveedor = ?, email_contacto_proveedor = ?, estado_proveedor = ? WHERE id_proveedor = ?";
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
        String sql = "DELETE FROM proveedores WHERE id_proveedor = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    
}
