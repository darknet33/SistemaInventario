package sistemainventario.dao;

import sistemainventario.entity.Rol;
import sistemainventario.entity.Permiso;

import java.sql.*;
import java.util.*;

public class RolDAO implements IDAO<Rol, Integer> {

    private final Connection conn;

    public RolDAO() {
        this.conn = ConexionDAO.getConexion();
    }

    @Override
    public Rol mapResultSetToEntity(ResultSet rs) throws SQLException {
        Rol entity = new Rol();
        entity.setId(rs.getInt("id_rol"));
        entity.setNombre(rs.getString("nombre_rol"));
        entity.setPermisos(getByPermisosForRolId(rs.getInt("id_rol")));

        return entity;
    }

    @Override
    public Rol getById(Integer id) {
        String sql = "SELECT * FROM roles WHERE id_rol = ?";

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
    public List<Rol> getAll() {
        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT * FROM roles";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }

        return lista;
    }

    @Override
    public void save(Rol entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Rol entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Obtener todos los permisos asignados a un rol específico
    private List<Permiso> getByPermisosForRolId(long rolId) {
        List<Permiso> permisos = new ArrayList<>();

        String sql = "SELECT id_permiso, modulo_permiso, estado_permiso "
                + "FROM permisos "
                + "JOIN rol_permiso ON id_permiso = permiso_id "
                + "WHERE rol_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, rolId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Permiso permiso = new Permiso();
                permiso.setId(rs.getLong("id_permiso"));
                permiso.setModulo(rs.getString("modulo_permiso"));
                permiso.setEstado(rs.getBoolean("estado_permiso"));
                permisos.add(permiso);
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }

        return permisos;
    }

}
