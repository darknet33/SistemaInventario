package sistemarhino.dto;

import java.util.ArrayList;
import java.util.List;

public class VentaDTO  implements IDTO{
    private int id;
    private String fecha;    
    private ClienteDTO cliente;
    private ComprobanteDTO comprobante;
    private String nroComprobante;
    private EstadoDTO estado;
    private double total;
    private double impuesto;
    private double descuento;
    private UsuarioDTO usuario;
    private List<VentaDetalleDTO> detalles;

    public VentaDTO() {
        detalles= new ArrayList<VentaDetalleDTO>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
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

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public List<VentaDetalleDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<VentaDetalleDTO> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return  fecha + " " + cliente + " " + comprobante + "-" + nroComprobante +" "+total;
    }

    @Override
    public int getPK() {
        return id;
    }
    
    
}
