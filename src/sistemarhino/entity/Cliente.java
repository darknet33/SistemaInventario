package sistemarhino.entity;

import java.util.Date;

public class Cliente extends Empresa{
    private boolean Estado;
    private Date fechaRegistro;

    public Cliente () {
    }

    public Cliente(boolean estado, Date fechaRegistro, int ID, String Nombre, String Nit, String Representante, String Direccion, String Celular, String Email, String Tipo, byte[] Logo) {
        super(ID, Nombre, Nit, Representante, Direccion, Celular, Email, Tipo, Logo);
        this.Estado = estado;
        this.fechaRegistro = fechaRegistro;
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
