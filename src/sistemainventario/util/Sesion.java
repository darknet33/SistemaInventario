package sistemainventario.util;

import java.util.List;
import sistemainventario.dto.PermisoDTO;
import sistemainventario.dto.UsuarioDTO;

public class Sesion {
    private static UsuarioDTO usuarioActual;
    private static List<PermisoDTO> listaPermisos;
    
    public static void setUsuario(UsuarioDTO usuario) {
        usuarioActual = usuario;
        listaPermisos=usuarioActual.getRol().getPermisos();
    }

    public static UsuarioDTO getUsuario() {
        return usuarioActual;
    }
    
    public static PermisoDTO getPermiso(String modulo) {
        return listaPermisos.stream()
        .filter(p -> p.getModulo().equalsIgnoreCase(modulo))
        .findFirst()
        .orElse(null);
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

    public static boolean estaLogueado() {
        return usuarioActual != null;
    }
}
