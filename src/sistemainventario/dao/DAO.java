package sistemainventario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO<T, ID> implements IDAO<T, ID>{

    protected final Connection conn;

    protected DAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    public int obtenerID() {
        int idUltimo=0;
        String sql = "SELECT LAST_INSERT_ID()";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                idUltimo=rs.getInt(1);
            }
            return idUltimo;
        } catch (SQLException e) {
            throw new IllegalArgumentException(sql);
        }
    }
}
