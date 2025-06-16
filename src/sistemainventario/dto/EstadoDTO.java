package sistemainventario.dto;

public class EstadoDTO implements IDTO {
    private int id;
    private String nombre;

    public EstadoDTO() {
    }

    public EstadoDTO(String nombre) {
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
    public int getPK() {
        return id;
    }

 
   
    
    
}
