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
    private ConexionDAO() {
    }

    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                // Registrar el driver si aún no lo hizo (por seguridad)
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✔ Conexión establecida.");
            }
            return conexion;
        } catch (ClassNotFoundException e) {
            System.err.println("✘ Driver JDBC no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("✘ Error al conectar a la base de datos: " + e.getMessage());
        }
        return null;
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

    public static boolean probarConexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection testConn = DriverManager.getConnection(URL, USER, PASSWORD);
            testConn.close(); // solo probar, no guardar
            return true;
        } catch (Exception e) {
            System.err.println("❌ Error al probar conexión: " + e.getMessage());
            return false;
        }
    }

}
