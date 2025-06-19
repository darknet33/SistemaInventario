
package sistemainventario.controller;

import java.util.List;
import sistemainventario.dto.EstadoDTO;
import sistemainventario.services.EstadoService;

public class EstadoController {
    private final EstadoService estadoService;

    public EstadoController() {
        this.estadoService =new EstadoService();
    }
    
    public List<EstadoDTO> listarEstado() {
        return estadoService.listarTodos();
    }
    
}
