package sistemarhino.entity;

import java.util.Date;


public class Proveedor extends Empresa{
    private String Material;
    private String Contacto;
    private boolean Estado;
    private Date fechaRegistro;

    public Proveedor() {
    }

    public Proveedor(String Material, String Contacto, boolean Estado, Date fechaRegistro, int ID, String Nombre, String Nit, String Representante, String Direccion, String Celular, String Email, String Tipo, byte[] Logo) {
        super(ID, Nombre, Nit, Representante, Direccion, Celular, Email, Tipo, Logo);
        this.Material = Material;
        this.Contacto = Contacto;
        this.Estado = Estado;
        this.fechaRegistro = fechaRegistro;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }    
    
}
