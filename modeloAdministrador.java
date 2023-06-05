package Modelo;

public class modeloAdministrador {

    private int Id;
    private String Nombres;
    private String Apellidos;
    private String TipoDocumento;
    private String NumeroDocumento;
    private String Edad;
    private String Sexo;
    private String Email;
    private String Direccion;
    private String Contraseña;
    private String Estado;

    public modeloAdministrador() {
    }

    public modeloAdministrador(int Id_usuario, String Nombres, String Apellidos, String TipoDocumento, String NumeroDocumento, String Edad, String Sexo, String Email, String Direccion, String Contraseña, String Estado) {
        this.Id = Id_usuario;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.TipoDocumento = TipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Contraseña = Contraseña;
        this.Estado = Estado;
    }

    public int getId_usuario() {
        return Id;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id = Id_usuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
