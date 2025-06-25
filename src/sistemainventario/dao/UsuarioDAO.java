package sistemainventario.dao;

import sistemainventario.entity.Usuario;

import java.sql.*;
import java.util.*;
import sistemainventario.dao.RolDAO;
import sistemainventario.entity.Rol;

public class UsuarioDAO extends DAO<Usuario, Integer> {

    @Override
    public Usuario mapResultSetToEntity(ResultSet rs) throws SQLException {
        Usuario entity = new Usuario();
        entity.setId(rs.getInt("id_usuario"));
        entity.setUsername(rs.getString("username_usuario"));
        entity.setPassword(rs.getString("password_usuario"));
        entity.setNombres(rs.getString("nombres_usuario"));
        entity.setApellidos(rs.getString("apellidos_usuario"));
        entity.setCargo(rs.getString("cargo_usuario"));
        entity.setFechaRegistro(rs.getTimestamp("f_registro_usuario"));
        entity.setFechaActualizado(rs.getTimestamp("f_actualizado_usuario"));
        entity.setEstado(rs.getBoolean("estado_usuario"));

        RolDAO rolDAO = new RolDAO();
        Rol rol = rolDAO.getById(rs.getInt("rol_id"));
        entity.setRol(rol);

        return entity;
    }

    @Override
    public Usuario getById(Integer id) {
        String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";

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
    public List<Usuario> getAll() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

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
    public void save(Usuario entity) {
        String sql = "INSERT INTO usuarios (username_usuario, password_usuario, nombres_usuario, apellidos_usuario, cargo_usuario, rol_id, estado_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getUsername());
            stmt.setString(2, entity.getPassword());
            stmt.setString(3, entity.getNombres());
            stmt.setString(4, entity.getApellidos());
            stmt.setString(5, entity.getCargo());
            stmt.setInt(6, entity.getRol().getId());
            stmt.setBoolean(7, entity.getEstado());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void update(Usuario entity) {
        String sql = "UPDATE usuarios SET username_usuario = ?, password_usuario = ?, nombres_usuario = ?, apellidos_usuario = ?, cargo_usuario = ?, rol_id = ?, estado_usuario = ? WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getUsername());
            stmt.setString(2, entity.getPassword());
            stmt.setString(3, entity.getNombres());
            stmt.setString(4, entity.getApellidos());
            stmt.setString(5, entity.getCargo());
            stmt.setInt(6, entity.getRol().getId());
            stmt.setBoolean(7, entity.getEstado());
            stmt.setInt(8, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

    public Usuario getByUsername(String Username) {
        String sql = "SELECT * FROM usuarios WHERE username_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
        return null;
    }

    public Usuario getByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE username_usuario = ? AND password_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
        return null;
    }

    public void changeEstado(int id) {
        String sql = "UPDATE usuarios SET estado_usuario = NOT estado_usuario WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }

}
