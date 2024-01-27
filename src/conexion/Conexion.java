
package conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conexion {
    
    //Connection local
    
    public static Connection conectar(){
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3680057", "sql3680057", "cc3FGldEZB");
        return connection;
        }
        catch (SQLException e){
            System.out.println("Error de coneccion" +e);
        }
        
        return null;
    }
    
}
