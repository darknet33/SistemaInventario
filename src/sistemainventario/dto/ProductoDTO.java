package sistemainventario.dto;

import java.util.Date;


public class ProductoDTO {
    private int id;
    private String codigo;
    private CategoriaDTO categoria;
    private String descripcion;
    private String marca;
    private String procedencia;
    private String Peso;
    private int stockInicial;
    private int stockActual;
    private int stockMinimo;
    private Date fechaRegistro;
    private Date fechaActualizado;
    private Boolean estado;
    private UsuarioDTO usuario;

    public ProductoDTO() {
    }

    public ProductoDTO(int id, String codigo, CategoriaDTO categoria, String descripcion, String marca, String procedencia, String Peso, int stockInicial, int stockActual, int stockMinimo, Date fechaRegistro, Date fechaActualizado, Boolean estado, UsuarioDTO usuario) {
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

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id=" + id + ", codigo=" + codigo + ", categoria=" + categoria + ", descripcion=" + descripcion + ", marca=" + marca + ", procedencia=" + procedencia + ", Peso=" + Peso + ", stockInicial=" + stockInicial + ", stockActual=" + stockActual + ", stockMinimo=" + stockMinimo + ", fechaRegistro=" + fechaRegistro + ", fechaActualizado=" + fechaActualizado + ", estado=" + estado + ", usuario=" + usuario + '}';
    }
    
    
    
}
