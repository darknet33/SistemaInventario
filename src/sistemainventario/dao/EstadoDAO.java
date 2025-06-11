package sistemainventario.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.entity.Estado;
import sistemainventario.util.Mensajes;

public class EstadoDAO implements IDAO<Estado,Integer>{
    private final Connection conn;

    public EstadoDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Estado mapResultSetToEntity(ResultSet rs) throws SQLException {
        Estado entity = new Estado();
        entity.setId(rs.getInt("id_estado"));
        entity.setNombre(rs.getString("nombre_estado"));

        return entity;
    }

    @Override
    public Estado getById(Integer id) {
        String sql = "SELECT * FROM estados WHERE id_estado = ?";

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
    public List<Estado> getAll() {
        List<Estado> lista = new ArrayList<>();
        String sql = "SELECT * FROM estados";

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
    public void save(Estado entity) {
        String sql = "INSERT INTO estados "+
                     "(nombre_estado)"+
                     " VALUES (?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
           stmt.setString(1, entity.getNombre());
           stmt.executeUpdate();
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Estado entity) {
        String sql = "UPDATE estados SET nombre_estado = ? WHERE id_estado = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setInt(2, entity.getId());

            int filas = stmt.executeUpdate(); 

            if (filas == 0) {
                System.out.println("No se actualizó ninguna fila. ¿ID inexistente?");
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);  // o solo el mensaje si prefieres no exponer el SQL
        }
    }


    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM estados WHERE id_estado = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    
}
