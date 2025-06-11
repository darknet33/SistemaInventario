
package sistemainventario.entity;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int id;
    private String nombre;
    private List<Permiso> permisos;

    public Rol() {
        permisos = new ArrayList<>();
    }

    public Rol(int id, String nombre, List<Permiso> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Permiso> getPermisos() { return permisos; }
    public void setPermisos(List<Permiso> permisos) { this.permisos = permisos; }

    public void agregarPermiso(Permiso permiso) {
        permisos.add(permiso);
    }

    public boolean tienePermisoActivo(String modulo) {
        for (Permiso p : permisos) {
            if (p.getModulo().equalsIgnoreCase(modulo) && p.isEstado()) {
                return true;
            }
        }
        return false;
    }
}