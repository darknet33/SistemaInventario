package sistemarhino.util;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.PermisoDTO;
import sistemarhino.dto.UsuarioDTO;

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
    
    public static List<String> getPermisos() {
        return listaPermisos.stream()
                            .filter(p -> p.getEstado()==true)
                            .map(p -> p.getModulo()) 
                            .collect(Collectors.toList());
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

    public static boolean estaLogueado() {
        return usuarioActual != null;
    }
}
