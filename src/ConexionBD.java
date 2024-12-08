import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/prestamos_db"; // Cambia por tu URL
    private static final String USER = "root"; // Cambia por tu usuario
    private static final String PASSWORD = ""; // Cambia por tu contraseña

    // Método para obtener la conexión
    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            return null;
        }
    }
}
