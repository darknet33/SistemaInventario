package sistemarhino.entity;


public class Permiso {
    private long id;
    private String modulo;
    private boolean estado;

    // Constructor vacío
    public Permiso() {}

    // Constructor con parámetros
    public Permiso(long id, String modulo, boolean estado) {
        this.id = id;
        this.modulo = modulo;
        this.estado = estado;
    }

    // Getters y setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getModulo() { return modulo; }
    public void setModulo(String modulo) { this.modulo = modulo; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}