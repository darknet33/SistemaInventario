package sistemainventario.controller;

import java.util.List;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.UsuarioService;
import sistemainventario.util.Mensajes;


public class UsuarioController {

    private final UsuarioService usuarioService;


    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    public void mostrarUsuarios() {
        List<UsuarioDTO> usuarios = usuarioService.listarTodos();
        
        usuarios.forEach(u->{System.out.println("Usuario: " + u.getUsername() + " - Rol: " + u.getRol());});
                
    }
    
    public boolean nuevoUsuario(UsuarioDTO dto) {
        try {
            usuarioService.guardar(dto);
            Mensajes.info("Se guardó el Proveedor correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actualizarUsuario(UsuarioDTO dto) {
        try {
            usuarioService.actualizar(dto);
            Mensajes.info("Se guardaron los cambios correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean eliminarUsuario(int id) {
        try {
            if (Mensajes.confirmar("¿Seguro que desea eliminar el Usuario?") == 0) {
                usuarioService.eliminar(id);
                Mensajes.info("Se eliminó correctamente el usuario");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    } 
        
    public void cambiarEstado(int id){
        usuarioService.cambiarEstado(id);
        
        Mensajes.info("Se cambio el estado");
    }
    
}