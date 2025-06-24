package sistemarhino.entity;

public class Empresa {
    private int Id;
    private String Nombre;
    private String Nit;
    private String Representante;
    private String Direccion;
    private String Celular;
    private String Email;
    private String Tipo;
    private byte[] Logo;

    public Empresa() {
    }

    public Empresa(int ID, String Nombre, String Nit, String Representante, String Direccion, String Celular, String Email, String Tipo, byte[] Logo) {
        this.Id = ID;
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.Representante = Representante;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Email = Email;
        this.Tipo = Tipo;
        this.Logo = Logo;
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

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public byte[] getLogo() {
        return Logo;
    }

    public void setLogo(byte[] Logo) {
        this.Logo = Logo;
    }
    
}
