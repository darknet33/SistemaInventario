
package sistemarhino.controller;

import java.util.List;
import sistemarhino.dto.EstadoDTO;
import sistemarhino.services.EstadoService;

public class EstadoController {
    private final EstadoService estadoService;

    public EstadoController() {
        this.estadoService =new EstadoService();
    }
    
    public List<EstadoDTO> listarEstado() {
        return estadoService.listarTodos();
    }
    
}
