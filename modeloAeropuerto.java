package Modelo;

public class modeloAeropuerto {

    private int Id_Aeropuerto;
    private String NombreAeropuerto;
    private String Direccion;
    private String Pais;
    private String Ciudad;
    private String Estado;

    public modeloAeropuerto() {
    }

    public modeloAeropuerto(int Id_Aeropuerto, String NombreAeropuerto, String Direccion, String Pais, String Ciudad, String Estado) {
        this.Id_Aeropuerto = Id_Aeropuerto;
        this.NombreAeropuerto = NombreAeropuerto;
        this.Direccion = Direccion;
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public int getId_Aeropuerto() {
        return Id_Aeropuerto;
    }

    public void setId_Aeropuerto(int Id_Aeropuerto) {
        this.Id_Aeropuerto = Id_Aeropuerto;
    }

    public String getNombreAeropuerto() {
        return NombreAeropuerto;
    }

    public void setNombreAeropuerto(String NombreAeropuerto) {
        this.NombreAeropuerto = NombreAeropuerto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
