
package sistemarhino.controller;

import java.util.List;
import sistemarhino.dto.ComprobanteDTO;
import sistemarhino.services.ComprobanteService;

public class ComprobanteController {
    private final ComprobanteService comprobanteService;

    public ComprobanteController() {
        this.comprobanteService =new ComprobanteService();
    }
    
    public List<ComprobanteDTO> listarComprobante() {
        return comprobanteService.listarTodos();
    }
    
}
