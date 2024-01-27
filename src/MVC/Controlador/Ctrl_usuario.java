package MVC.Controlador;

import conexion.Conexion;
import dataContext.Messages;
import java.sql.*;
import javax.swing.JOptionPane;
import MVC.modelo.Usuario;

public class Ctrl_usuario {

    Messages dataContext;

    //Metodo para inicar sesion
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT  usuario, password FROM tb_usuario WHERE  usuario= '" + objeto.getUsuario() + "' and password= '" + objeto.getPassword() + "';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (Exception e) {
            dataContext.userDataIncorrect();
        }
        return respuesta;
    }

    //GUARDAR USUARIO
    public Boolean saveUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_usuario  VALUES (?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            } else {
                dataContext.intenteNuevemante();
            }
            cn.close();
        } catch (SQLException e) {
            //dataContext.errorToSave();
            System.out.println(e);
        }
        return respuesta;
    }

    //METODO PARA COMPROBAR EXISTENCIA
    public Boolean comprobarExitencia(String user) {
        boolean respuesta = false;
        String sql = "SELECT  usuario FROM tb_usuario WHERE  usuario= '" + user + "';";
        Statement st;
        System.out.println(sql);
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
           // dataContext.userDuplicated();
            System.out.println(e);
        }
        return respuesta;
    }
    
    public Boolean updateUser(Usuario objeto, int idUsuar){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE tb_usuario SET nombre=?, apellido=?, usuario=?, password=?, telefono=?, estado=? WHERE  idUsuario='" + idUsuar + "';");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());
            
            if (consulta.executeUpdate()>0) {
                respuesta = true;
                
            } else {
                //dataContext.intenteNuevemante();
                System.out.println(cn);
            }
            cn.close();            
        } catch (SQLException e) {
           // dataContext.errorToUpdate();
            System.out.println(e);
        }
    return respuesta;
    }
    
    public Boolean DeletUser(int idUser){
        boolean respuesta = false ;
        Connection cn = conexion.Conexion.conectar();        
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM tb_usuario WHERE  idUsuario='"+idUser+"';");
            pst.executeUpdate();
            if (pst.executeUpdate()>0) {
                respuesta = true;            }
            cn.close();
        } catch (SQLException e) {
            dataContext.errorToUpdate();
        }       
        
        return respuesta;
    }

}
