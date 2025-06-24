package sistemarhino.dto;

import java.util.List;

public class RolDTO implements IDTO{
    private int id;
    private String nombre;
    private List<PermisoDTO> permisos;

    public RolDTO() {
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

    public List<PermisoDTO> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<PermisoDTO> permisos) {
        this.permisos = permisos;
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
