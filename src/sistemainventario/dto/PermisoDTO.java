package sistemainventario.dto;


public class PermisoDTO implements IDTO{
    private int id;
    private String modulo;
    private boolean estado;

    public PermisoDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return modulo;
    }

    @Override
    public int getPK() {
        return id;
    }
    
    
    
}
