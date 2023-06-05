package Modelo;

public class modeloAvion {

    private int id_Aviones;
    private String Matricula;
    private String Fabricante;
    private String Codigo;
    private String Modelo;
    private int CapPasajeros;
    private String Caracteristicas;
    private String Estado;

    public modeloAvion() {
    }

    public modeloAvion(int id_Aviones, String Matricula, String Fabricante, String Codigo, String Modelo, int CapPasajeros, String Caracteristicas, String Estado) {
        this.id_Aviones = id_Aviones;
        this.Matricula = Matricula;
        this.Fabricante = Fabricante;
        this.Codigo = Codigo;
        this.Modelo = Modelo;
        this.CapPasajeros = CapPasajeros;
        this.Caracteristicas = Caracteristicas;
        this.Estado = Estado;
    }

    public int getId_Aviones() {
        return id_Aviones;
    }

    public void setId_Aviones(int id_Aviones) {
        this.id_Aviones = id_Aviones;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getCapPasajeros() {
        return CapPasajeros;
    }

    public void setCapPasajeros(int CapPasajeros) {
        this.CapPasajeros = CapPasajeros;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
