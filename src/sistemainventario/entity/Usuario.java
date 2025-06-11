package sistemainventario.entity;

import java.util.Date;

public class Usuario {
    private int id;
    private String username;
    private String password;
    private String nombres;
    private String apellidos;
    private String cargo;
    private Rol rol; // Asumiendo que tienes una clase modelo.Rol o ceRol
    private Date fechaRegistro;
    private Date fechaActualizado;
    private boolean estado;

    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los campos
    public Usuario(int id, String username, String password, String nombres, String apellidos,
                   String cargo, Rol rol, Date fechaRegistro, Date fechaActualizado, boolean estado) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizado = fechaActualizado;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public Date getFechaActualizado() { return fechaActualizado; }
    public void setFechaActualizado(Date fechaActualizado) { this.fechaActualizado = fechaActualizado; }

    public boolean getEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}
