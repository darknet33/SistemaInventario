package sistemainventario.dto;

import java.util.Date;

public class ProductoDTO implements IDTO {

    private int id;
    private String codigo;
    private CategoriaDTO categoria;
    private String descripcion;
    private String marca;
    private String procedencia;
    private String Peso;
    private String stockInicial;
    private String stockActual;
    private String stockMinimo;
    private Date fechaRegistro;
    private Date fechaActualizado;
    private boolean estado;
    private UsuarioDTO usuario;

    public ProductoDTO() {
        this.categoria=new CategoriaDTO();
    }

    public ProductoDTO(int id, String codigo, CategoriaDTO categoria, String descripcion, String marca, String procedencia, String Peso, String stockInicial, String stockActual, String stockMinimo, Date fechaRegistro, Date fechaActualizado, boolean estado, UsuarioDTO usuario) {
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

    public String getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(String stockInicial) {
        this.stockInicial = stockInicial;
    }

    public String getStockActual() {
        return stockActual;
    }

    public void setStockActual(String stockActual) {
        this.stockActual = stockActual;
    }

    public String getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(String stockMinimo) {
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

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return categoria + " " + descripcion + " " + marca;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final ProductoDTO other = (ProductoDTO) obj;
        return this.id == other.id;
    }

    @Override
    public int getPK() {
        return id;
    }

}
