
package sistemainventario.controller;

import java.util.List;
import sistemainventario.dto.ComprobanteDTO;
import sistemainventario.services.ComprobanteService;

public class ComprobanteController {
    private final ComprobanteService comprobanteService;

    public ComprobanteController() {
        this.comprobanteService =new ComprobanteService();
    }
    
    public List<ComprobanteDTO> listarComprobante() {
        return comprobanteService.listarTodos();
    }
    
}
