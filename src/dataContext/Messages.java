package dataContext;

import javax.swing.JOptionPane;

public class Messages {

    public Messages() {
    }

    public boolean mensageDeBienvenida() {
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA DE VENTA");
        return true;
    }

    public void userDataIncorrect() {
        JOptionPane.showMessageDialog(null, "USUARIO O PASSOWORD INCORRECTO");
    }

    public void dataEmty() {
        JOptionPane.showMessageDialog(null, "AL PARECER NO ESCRIBIÓ NADA, INGRESE LOS DATOS CORRECTOS");
    }

    public void intenteNuevemante() {
        JOptionPane.showMessageDialog(null, "ALGO SALIO MAL, INTENTE NUEVAMENTE");
    }
    
    public void successfullSave() {
        JOptionPane.showMessageDialog(null, "INFORMACIÓN REGISTRADA EXITOSAMENTE");
    }
    
    public void sucessfullUpdate(){
    JOptionPane.showConfirmDialog(null, "LA INFORMACIÓN SE ACTUALIZO CON ÉXITO");
    }
    
    public void successfullDeleted(){
    JOptionPane.showMessageDialog(null, "LA INFORMACIÓN SE ELIMINÓ EXITOSAMENTE");
    }
    
    public void errorToSave() {
        JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LA INFORMACIÓN");
    }

    public void errorToConsult() {
        JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR LA INFORMACIÓN");
    }

    public void errorToUpdate() {
        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA INFORMACIÓN");
    }

    public void nameDuplicated() {
        JOptionPane.showMessageDialog(null, "EL NOMBRE YA SE ENCUENTRA EN LA BASE DE DATOS.");
    }

    //USER
    public void userDuplicated() {
        JOptionPane.showMessageDialog(null, "EL USUARIO YA SE ENCUENTRA EN LA BASE DE DATOS.");
    }

}
