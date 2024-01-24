package modelo;

public class Producto {
    private int idProducto;
    private int idCategoria;
    private String nombre;
    private String cantidad;
    private double precio;
    private String descripcion;
    private int porcentajeIva;
    
    private int estado;
    //private String gramage;

    //CONTRUCTOR LLENO
    public Producto(int idProducto,  String nombre, String cantidad, double precio, String descripcion, int porcentajeIva,int idCategoria, int estado)
// String gramage) 
            {
        this.idProducto = idProducto;        
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
        this.idCategoria = idCategoria;
        this.estado = estado;
        //this.gramage = gramage;
    }

    //CONSTRUCTORE BASICO
    public Producto() {
        this.idProducto = 0;        
        this.nombre = "";
        this.precio = 0;
        this.descripcion = "";
        this.porcentajeIva = 0;
        this.idCategoria = 0;
        this.estado = 0;        
        //this.gramage = "";
    }

    //GET AND SET
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(int porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

//    public String getGramage() {
//        return gramage;
//    }
//
//    public void setGramage(String gramage) {
//        this.gramage = gramage;
//    }

}
