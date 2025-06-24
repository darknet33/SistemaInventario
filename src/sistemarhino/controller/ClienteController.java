package sistemarhino.controller;

import java.util.List;
import sistemarhino.util.Mensajes;
import sistemarhino.dto.ClienteDTO;
import sistemarhino.services.ClienteService;

public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController() {
        this.clienteService= new ClienteService();
    }
    
    public List<ClienteDTO> listarClientes(){
        return clienteService.listarTodos();
    }
    
    public ClienteDTO obtenerCliente(int id){
        return clienteService.obtenerPorId(id);
    }
    
    public boolean nuevoCliente(ClienteDTO cliente) {
        try {
            clienteService.guardar(cliente);
            Mensajes.info("Se guardó el Cliente correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarCliente(ClienteDTO cliente) {
        try {
            clienteService.actualizar(cliente);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean eliminarCliente(int id) {
        try {
            if (Mensajes.confirmar("¿Seguro que desea eliminar el Cliente?") == 0) {
                clienteService.eliminar(id);
                Mensajes.info("Se eliminó correctamente el Cliente");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

}
