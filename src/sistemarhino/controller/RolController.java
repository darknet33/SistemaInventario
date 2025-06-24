
package sistemarhino.controller;

import java.util.List;
import sistemarhino.dto.RolDTO;
import sistemarhino.services.RolService;
import sistemarhino.util.Mensajes;

public class RolController {
    private final RolService rolService;
    
    public RolController() {
        this.rolService=new RolService();
    }
    
    public List<RolDTO> listarRoles(){
        return rolService.listarTodos();
    }
    
    public RolDTO obtenerRol(int id){
        return rolService.obtenerPorId(id);
    }
    
    public boolean nuevoRol(RolDTO dto) {
        try {
            rolService.guardar(dto);
            Mensajes.info("Se guardó el Proveedor correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarRol(RolDTO dto) {
        try {
            rolService.actualizar(dto);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean eliminarRol(int id) {
        try {
            if (Mensajes.confirmar("¿Seguro que desea eliminar el Rol?") == 0) {
                rolService.eliminar(id);
                Mensajes.info("Se eliminó correctamente el rol");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    } 
    
}
