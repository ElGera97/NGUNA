package MVC.modelo;

/**
 *
 * @author Administrator
 */
public class Categoria {

    private int idCategoria;
    private String descripcion;
    private int estado;

    //Contructor BASIO
    public Categoria() {
        this.idCategoria = 0;
        this.descripcion = "";
        this.estado = 0;
    }

    //Constructor Lleno
    public Categoria(int idCategoria, String descripcion, int estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String[] setDatos() {
        return new String[]{descripcion};
    }

}
