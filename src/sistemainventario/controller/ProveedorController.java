
package sistemainventario.controller;

import java.util.List;
import sistemainventario.dto.ProveedorDTO;
import sistemainventario.services.ProveedorService;
import sistemainventario.util.Mensajes;

public class ProveedorController {
    private final ProveedorService proveedorService;

    public ProveedorController() {
        this.proveedorService= new ProveedorService();
    }
    
    
    public List<ProveedorDTO> listarProveedores(){
        return proveedorService.listarTodos();
    }
    
    public ProveedorDTO obtenerProveedor(int id){
        return proveedorService.obtenerPorId(id);
    }
    
    public boolean nuevoProveedor(ProveedorDTO proveedor) {
        try {
            proveedorService.guardar(proveedor);
            Mensajes.info("Se guardó el Proveedor correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarProveedor(ProveedorDTO proveedor) {
        try {
            proveedorService.actualizar(proveedor);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean eliminarProveedor(int id) {
        try {
            if (Mensajes.confirmar("¿Seguro que desea eliminar el Proveedor?") == 0) {
                proveedorService.eliminar(id);
                Mensajes.info("Se eliminó correctamente el Proveedor");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
}
