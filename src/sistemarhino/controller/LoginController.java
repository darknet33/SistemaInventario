package sistemarhino.controller;

import sistemarhino.services.UsuarioService;
import sistemarhino.util.Mensajes;
import sistemarhino.util.Sesion;

public class LoginController {
    
    private final UsuarioService usuarioService;
    
    public LoginController() {
        this.usuarioService = new UsuarioService();
    }

    public boolean Ingresar(String username, String password) {
        try {
            Sesion.setUsuario(usuarioService.login(username, password));
            return true;
        } catch (IllegalArgumentException e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public void cerrarSesion (){
         Sesion.cerrarSesion();
    }
    
    
}
