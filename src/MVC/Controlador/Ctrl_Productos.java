package MVC.Controlador;

import conexion.Conexion;
import dataContext.Messages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import MVC.modelo.Producto;

public class Ctrl_Productos {
    
    Messages dataMessages = new Messages();
    
     //FUNCION PARA REGISTRAR NUEVO PRODUCTO
    public Boolean guardarProducto(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_producto VALUES (?,?,?,?,?,?,?,?)");
            consulta.setInt(1, objeto.getIdProducto());            
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());
           // consulta.setString(9, objeto.getGramage());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            } else {
                dataMessages.intenteNuevemante();     
            }
            cn.close();
        } catch (SQLException e) {
            dataMessages.errorToSave();
        }
        return respuesta;
    }

    //CUANDO INTENTA PUBLICAR prepareStatement CON UN VALOR YA AGREGADO
    public Boolean comprobarExistente(String producto) {
        boolean respuesta = false;
        String sql = "SELECT nombre FROM tb_producto WHERE nombre ='" + producto + "';";
        Statement st;
        try {
            //FUNCION PARA CONECTAR A LA DB       
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            dataMessages.errorToConsult();
        }
        return respuesta;
    }
       
}
