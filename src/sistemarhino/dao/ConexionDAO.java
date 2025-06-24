package sistemarhino.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDAO {

    public enum MotorBD {
        MARIADB, POSTGRESQL
    }

    // Cambiar aquí para seleccionar el motor
    private static final MotorBD MOTOR = MotorBD.MARIADB; // o POSTGRESQL

    // Configuración para MariaDB
    private static final String MARIADB_URL = "jdbc:mariadb://localhost:3307/sistemarhino";
    private static final String MARIADB_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String MARIADB_USER = "rhino";
    private static final String MARIADB_PASSWORD = "rhino_password";

    // Configuración para PostgreSQL
    private static final String POSTGRES_URL = "jdbc:postgresql://db.ngngawuhzingkbbanfkv.supabase.co:5432/postgres?user=postgres&password=gyrx100PRE#?sslmode=require";
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    private static final String POSTGRES_USER = "rhino";
    private static final String POSTGRES_PASSWORD = "gyrx100pre";

    private static Connection conexion = null;

    private ConexionDAO() {
    }

    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                switch (MOTOR) {
                    case MARIADB:
                        Class.forName(MARIADB_DRIVER);
                        conexion = DriverManager.getConnection(MARIADB_URL, MARIADB_USER, MARIADB_PASSWORD);
                        break;
                    case POSTGRESQL:
                        Class.forName(POSTGRES_DRIVER);
                        conexion = DriverManager.getConnection(POSTGRES_URL);
                        break;
                }
                System.out.println("✔ Conexión establecida a " + MOTOR);
            }
            return conexion;
        } catch (ClassNotFoundException e) {
            System.err.println("✘ Driver no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("✘ Error al conectar: " + e.getMessage());
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
            System.err.println("✘ Error al cerrar conexión: " + e.getMessage());
        }
    }

    public static boolean probarConexion() {
        try {
            Connection testConn;
            switch (MOTOR) {
                case MARIADB:
                    Class.forName(MARIADB_DRIVER);
                    testConn = DriverManager.getConnection(MARIADB_URL, MARIADB_USER, MARIADB_PASSWORD);
                    break;
                case POSTGRESQL:
                    Class.forName(POSTGRES_DRIVER);
                    testConn = DriverManager.getConnection(POSTGRES_URL, POSTGRES_USER, POSTGRES_PASSWORD);
                    break;
                default:
                    return false;
            }
            testConn.close();
            return true;
        } catch (Exception e) {
            System.err.println("❌ Error al probar conexión: " + e.getMessage());
            return false;
        }
    }
}
