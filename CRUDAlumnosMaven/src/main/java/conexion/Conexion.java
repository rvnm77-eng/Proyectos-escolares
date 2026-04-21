
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
  Clase que gestiona la conexión a la base de datos MySQL
  Proporciona un método estático para obtener la conexión
 */

public class Conexion {
    //url de conexion a la base de datos escuela en localhost
    private static final String URL = "jdbc:mysql://localhost:3306/escuela";
    
    //usuario de mysql
    private static final String USER = "root";
    
    //contraseña de mysql 
    private static final String PASSWORD = "btr2003elevate";
    
    /*
      Método que establece y devuelve una conexión a la base de datos
      @return Connection objeto de conexión o null si hay error
     */

    public static Connection getconexion() {
      Connection con = null;
        try {
            // Intenta establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            
            // Si hay error, lo muestra en consola
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con; 
    }

    public static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
