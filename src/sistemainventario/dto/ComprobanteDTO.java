package sistemainventario.dto;

public class ComprobanteDTO implements IDTO {
    private int id;
    private String nombre;

    public ComprobanteDTO() {
    }

    public ComprobanteDTO(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComprobanteDTO other = (ComprobanteDTO) obj;
        return this.id == other.id;
    }

    @Override
    public int getPK() {
        return id;
    }
   
    
    
}
