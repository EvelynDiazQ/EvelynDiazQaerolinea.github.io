package Modelo;

public class modeloUsuarios {

    private int Id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String contraseña;
    private String Edad;
    private String Sexo;
    private String tipoIdentificacion;
    private String Identificacion;

    public modeloUsuarios() {
    }

    public modeloUsuarios(int Id, String Nombre, String Apellido, String Correo, String contraseña, String Edad, String Sexo, String tipoIdentificacion, String Identificacion) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.contraseña = contraseña;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.Identificacion = Identificacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

}
