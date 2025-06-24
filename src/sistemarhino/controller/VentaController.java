
package sistemarhino.controller;

import java.util.List;
import sistemarhino.dto.VentaDTO;
import sistemarhino.dto.VentaDetalleDTO;
import sistemarhino.services.VentaDetalleService;
import sistemarhino.services.VentaService;
import sistemarhino.util.Mensajes;

public class VentaController {
    private final VentaService ventaService;
    private final VentaDetalleService detalleService;
    
    public VentaController() {
        this.ventaService=new VentaService();
        this.detalleService=new VentaDetalleService();
    }
    
    public List<VentaDTO> listarVentas(){
        return ventaService.listarTodos();
    }
    
    public VentaDTO obtenerVenta(int id){
        return ventaService.obtenerPorId(id);
    }
    
    public boolean nuevaVenta(VentaDTO venta) {
        try {
            ventaService.guardar(venta);
            Mensajes.info("Se guardó la venta correctamente");
            guardarDetalles(venta);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarVenta(VentaDTO venta) {
        try {
            ventaService.actualizar(venta);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
    
    
    public boolean addDetalle(VentaDetalleDTO detalle){
        try {
            detalleService.guardar(detalle);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
    
    public boolean editDetalle(VentaDetalleDTO detalle){
        try {
            detalleService.actualizar(detalle);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
    
    public boolean delDetalle(VentaDetalleDTO detalle){
        try {
            detalleService.eliminar(detalle.getId());
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
        
    }
    
    public void guardarDetalles(VentaDTO venta){
        try {
            int id=ventaService.idVenta();
            venta.getDetalles().stream()
                    .peek(dc -> dc.setIdMovimiento(id))
                    .forEach(this::addDetalle);
        } catch (Exception e) {
        }
    }
}
