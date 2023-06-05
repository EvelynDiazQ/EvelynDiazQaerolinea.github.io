package Modelo;

import java.util.Date;

public class modeloReserva {

    private int id;
    private int idVuelo;
    private int idUsuario;
    private String Clase;
    private int numPasajeros;
    private String nacionalidad;
    private String telefono;
    private Date fechaReserva;
    private boolean estadoReserva;
    private float total;

    public modeloReserva() {
    }

    public modeloReserva(int id, int idVuelo, int idUsuario, String Clase, int numPasajeros, String nacionalidad, String telefono, Date fechaReserva, boolean estadoReserva, float total) {
        this.id = id;
        this.idVuelo = idVuelo;
        this.idUsuario = idUsuario;
        this.Clase = Clase;
        this.numPasajeros = numPasajeros;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
