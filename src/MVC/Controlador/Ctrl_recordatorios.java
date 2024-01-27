package MVC.Controlador;

import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

import MVC.modelo.Recordatorio;

public class Ctrl_recordatorios {

    //Se llama al Objeto pendientes atravez de una varible BOOLEAN para poder obtener una respuesta de SI o NO
    public Boolean recordatorio(Recordatorio objeto) {

        boolean respuestaRecordatio = false;

        Connection cn = Conexion.conectar();
        String sql = "SELECT motivo_actividad, fecha FROM recordatorio";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuestaRecordatio = true;
                System.out.println(rs);
                System.out.println(st);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta" + e);

        }

        return respuestaRecordatio;

    }

}


//SELECT motivo_actividad, fecha FROM actividades_pendientes
