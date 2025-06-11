package sistemainventario.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompraDTO {
    private int id;
    private Date fecha;    
    private ProveedorDTO proveedor;
    private ComprobanteDTO comprobante;
    private String nroComprobante;
    private EstadoDTO estado;
    private double total;
    private UsuarioDTO usuario;
    private List<CompraDetalleDTO> detalles;

    public CompraDTO() {
        detalles= new ArrayList<CompraDetalleDTO>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
    }

    public ComprobanteDTO getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteDTO comprobante) {
        this.comprobante = comprobante;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public List<CompraDetalleDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<CompraDetalleDTO> detalles) {
        this.detalles = detalles;
    }
    
    
}
