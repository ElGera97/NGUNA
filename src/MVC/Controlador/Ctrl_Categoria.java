package MVC.Controlador;

import conexion.Conexion;
import dataContext.Messages;
import MVC.modelo.Categoria;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ctrl_Categoria {

    Messages dataContext;
    private String dtaaq;

    public Boolean guardarCategoria(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_categoria VALUES (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            } else {
                dataContext.intenteNuevemante();
            }
            cn.close();
        } catch (SQLException e) {
            dataContext.errorToSave();
        }
        return respuesta;
    }

    //CUANDO INTENTA PUBLICAR prepareStatement CON UN VALOR YA AGREGADO
    public Boolean comprobarExistente(String categoriaString) {
        boolean respuesta = false;
        String sql = "SELECT descripcion FROM tb_categoria WHERE descripcion ='" + categoriaString + "';";
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
            dataContext.errorToConsult();
        }
        return respuesta;
    }

    //Funcion para actualizar la informacion de 1 CATEGORIA
    public Boolean actualizarCategoria(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta
                    = cn.prepareStatement("UPDATE tb_categoria SET descripcion=? WHERE  idCategoria='" + idCategoria + "';");
            consulta.setString(1, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            } else {
                dataContext.intenteNuevemante();
            }
            cn.close();
        } catch (SQLException e) {
            dataContext.errorToUpdate();
        }
        return respuesta;
    }

    //FUNCION PARA ELIMINAR UN REGISTRO DE LA CATEGORIA
    public Boolean eliminarCategoria(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta
                    = cn.prepareStatement("DELETE FROM tb_categoria WHERE  idCategoria='" + idCategoria + "';");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la informacion" + e);
        }
        return respuesta;
    }

    public String showCategorias() {
        Categoria obj = new Categoria();
        String sql = "SELECT * FROM tb_categoria";
        Statement st;
        //String[] dtaa = null;
        try {
            //FUNCION PARA CONECTAR A LA DB       
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obj.getDescripcion();
                String dtaaq = rs.getString("descripcion");
                // String rs[] = categoria.setDescripcion(dtaaq);
                System.out.println(dtaaq);
                //JOptionPane.showMessageDialog(null, "datsss"+dtaa);
            }
            cn.close();
        } catch (SQLException e) {
            dataContext.errorToConsult();
        }
        return dtaaq;
    }
//        Connection cn = Conexion.conectar();
//        String querty = "SELECT * FROM tb_categoria";
//        Statement st;
//
//        try {
//            st = cn.createStatement();
//            ResultSet rs = st.executeQuery(querty);
//            JOptionPane.showMessageDialog(null, rs.getString("descripcion"));
//
//        } catch (SQLException e) {
//            JOptionPane.showConfirmDialog(null, e);
//
//        }

    public static class dtaa {

        public dtaa() {
        }
    }
}
