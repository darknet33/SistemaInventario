package sistemainventario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDAO {

    private static final String URL = "jdbc:mariadb://localhost:3307/testSistema";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection conexion = null;

    // Constructor privado para evitar instanciación
    private ConexionDAO() {}

    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✔ Conexión establecida.");
            }
        } catch (SQLException e) {
            System.err.println("✘ Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public static void closeConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("✔ Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("✘ Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
