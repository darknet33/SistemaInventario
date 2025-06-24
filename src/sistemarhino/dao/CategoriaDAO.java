package sistemarhino.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemarhino.entity.Categoria;

public class CategoriaDAO implements IDAO<Categoria,Integer>{
    private final Connection conn;

    public CategoriaDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Categoria mapResultSetToEntity(ResultSet rs) throws SQLException {
        Categoria entity = new Categoria();
        entity.setId(rs.getInt("id"));
        entity.setNombre(rs.getString("nombre"));

        return entity;
    }

    @Override
    public Categoria getById(Integer id) {
        String sql = "SELECT * FROM categorias WHERE id = ?";

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
    public List<Categoria> getAll() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categorias";

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
    public void save(Categoria entity) {
        String sql = "INSERT INTO categorias "+
                     "(nombre)"+
                     " VALUES (?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
           stmt.setString(1, entity.getNombre());
           stmt.executeUpdate();
        } catch (Exception e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Categoria entity) {
        String sql = "UPDATE categorias SET nombre = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getNombre());
            stmt.setInt(2, entity.getId());

            int filas = stmt.executeUpdate(); 

            if (filas == 0) {
                System.out.println("No se actualizó ninguna fila. ¿ID inexistente?");
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);  // o solo el mensaje si prefieres no exponer el SQL
        }
    }


    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM categorias WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    
}
