package MVC.Controlador;

import conexion.Conexion;
import javax.swing.JComboBox;

/**
 *
 * @author Administrator
 */
public class fillComboBox {
    
    private String idCategoria;
    private String descripcion;
    
    Conexion con = new Conexion();

    public fillComboBox(String idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }
    
    public fillComboBox() {
        
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //METODO PARA LLENAR COMBO
    public void llenarCombo(JComboBox<fillComboBox> fillCombox){
        String sql = "";
        //con. = 
    }
    
    
    
}
