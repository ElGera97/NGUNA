
package conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conexion {
    
    //Connection local
    
    public static Connection conectar(){
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_sistema_ventas", "root", "");
        return connection;
        }
        catch (SQLException e){
            System.out.println("Error de coneccion" +e);
        }
        
        return null;
    }
    
}
