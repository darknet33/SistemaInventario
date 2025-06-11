package sistemainventario.controller;

import sistemainventario.dao.ConexionDAO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.UsuarioService;
import sistemainventario.util.Mensajes;
import sistemainventario.util.Sesion;

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
        try {
            usuarioService.actualizar(Sesion.getUsuario());
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
        }finally{
            Sesion.cerrarSesion();
        }
    }
    
    public void cerrarConexion(){
        ConexionDAO.closeConexion();
    }
}
