package sistemainventario.dto;

public class CategoriaDTO implements IDTO{
    private int id;
    private String nombre;

    public CategoriaDTO() {
    }

    public CategoriaDTO(String nombre) {
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
        return  nombre;
    }

    @Override
    public int getPK() {
        return id;
    }
    
}
