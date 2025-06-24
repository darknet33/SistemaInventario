package sistemarhino.entity;

import java.util.Date;

public class Producto {
    private int id;
    private String codigo;
    private Categoria categoria;
    private String descripcion;
    private String marca;
    private String procedencia;
    private String Peso;
    private int stockInicial;
    private int stockActual;
    private int stockMinimo;
    private Date fechaRegistro;
    private Date fechaActualizado;
    private boolean estado;
    private Usuario usuario;

    public Producto() {
    }

    public Producto(int id, String codigo, Categoria categoria, String descripcion, String marca, String procedencia, String Peso, int stockInicial, int stockActual, int stockMinimo, Date fechaRegistro, Date fechaActualizado, boolean estado, Usuario usuario) {
        this.id = id;
        this.codigo = codigo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.marca = marca;
        this.procedencia = procedencia;
        this.Peso = Peso;
        this.stockInicial = stockInicial;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizado = fechaActualizado;
        this.estado = estado;
        this.usuario = usuario;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(Date fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

}
