package sistemarhino.controller;

import java.util.List;
import javax.swing.SwingWorker;
import sistemarhino.dto.CompraDTO;
import sistemarhino.dto.CompraDetalleDTO;
import sistemarhino.services.CompraDetalleService;
import sistemarhino.services.CompraService;
import sistemarhino.util.Mensajes;

public class CompraController {

    private final CompraService compraService;
    private final CompraDetalleService detalleService;

    public CompraController() {
        this.compraService = new CompraService();
        this.detalleService = new CompraDetalleService();
    }

    public List<CompraDTO> listarCompras() {
        return compraService.listarTodos();
    }

    public CompraDTO obtenerCompra(int id) {
        return compraService.obtenerPorId(id);
    }

    public boolean nuevaCompra(CompraDTO compra) {
        try {
            compraService.guardar(compra);
            Mensajes.info("Se guardó la compra correctamente");
            guardarDetalles(compra);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarCompra(CompraDTO compra) {
        try {
            compraService.actualizar(compra);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean addDetalle(CompraDetalleDTO detalle) {
        try {
            detalleService.guardar(detalle);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean editDetalle(CompraDetalleDTO detalle) {
        try {
            detalleService.actualizar(detalle);
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean delDetalle(CompraDetalleDTO detalle) {
        try {
            detalleService.eliminar(detalle.getId());
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }

    }

    public void guardarDetalles(CompraDTO compra) {
        try {
            int id = compraService.idCompra();
            compra.getDetalles().stream()
                    .peek(dc -> dc.setIdMovimiento(id))
                    .forEach(this::addDetalle);
        } catch (Exception e) {
        }
    }
}
