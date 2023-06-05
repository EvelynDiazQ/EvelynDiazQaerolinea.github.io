package Modelo;

public class modeloServicio {

    private int id_Servicio;
    private String Nombre;
    private String Descripcion;
    private float Precio;

    public modeloServicio() {
    }

    public modeloServicio(int id_Servicio, String Nombre, String Descripcion, float Precio) {
        this.id_Servicio = id_Servicio;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public int getId_Servicio() {
        return id_Servicio;
    }

    public void setId_Servicio(int id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

}
