package Modelo;

import java.util.Date;

public class modeloVuelo {

    private int Id;
    private String numVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int idAeropuerto;
    private String Aeropuerto;
    private String codigoAvion;
    private int idAvion;
    private float precio;
    private Date FechaO;
    private Date FechaV;
    private String HoraIda;
    private String HoraVuelta;
    private int idAdministrador;

    public modeloVuelo() {
    }

    public modeloVuelo(int Id, String numVuelo, String ciudadOrigen, String ciudadDestino, int idAeropuerto, String Aeropuerto, String codigoAvion, int idAvion, float precio, Date FechaO, Date FechaV, String HoraIda, String HoraVuelta, int idAdministrador) {
        this.Id = Id;
        this.numVuelo = numVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.idAeropuerto = idAeropuerto;
        this.Aeropuerto = Aeropuerto;
        this.codigoAvion = codigoAvion;
        this.idAvion = idAvion;
        this.precio = precio;
        this.FechaO = FechaO;
        this.FechaV = FechaV;
        this.HoraIda = HoraIda;
        this.HoraVuelta = HoraVuelta;
        this.idAdministrador = idAdministrador;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getAeropuerto() {
        return Aeropuerto;
    }

    public void setAeropuerto(String Aeropuerto) {
        this.Aeropuerto = Aeropuerto;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFechaO() {
        return FechaO;
    }

    public void setFechaO(Date FechaO) {
        this.FechaO = FechaO;
    }

    public Date getFechaV() {
        return FechaV;
    }

    public void setFechaV(Date FechaV) {
        this.FechaV = FechaV;
    }

    public String getHoraIda() {
        return HoraIda;
    }

    public void setHoraIda(String HoraIda) {
        this.HoraIda = HoraIda;
    }

    public String getHoraVuelta() {
        return HoraVuelta;
    }

    public void setHoraVuelta(String HoraVuelta) {
        this.HoraVuelta = HoraVuelta;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

}
