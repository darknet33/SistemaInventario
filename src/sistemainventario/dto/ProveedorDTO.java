
package sistemainventario.dto;

import java.util.Date;

public class ProveedorDTO implements IDTO {
    private int Id;
    private String Nombre;
    private String Nit;
    private String Materiales;
    private String Contacto;    
    private String Celular;
    private String Email;
    private boolean Estado;
    private Date fechaRegistro;

    public ProveedorDTO() {
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

    public String getMateriales() {
        return Materiales;
    }

    public void setMateriales(String Materiales) {
        this.Materiales = Materiales;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
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

    @Override
    public String toString() {
        return Nombre ;
    }

    @Override
    public int getPK() {
        return Id;
    }
    
    
}
