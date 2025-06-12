package sistemainventario.validator;

import sistemainventario.dto.UsuarioDTO;

public class UsuarioValidator {
    public static void validar(UsuarioDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Usuario undefine");
        
        if (dto.getRol()==null)
            throw new IllegalArgumentException("Rol undefine");
        
        if (dto.getUsername().isEmpty())
            throw new IllegalArgumentException("El usuario es Obligatorio");
        
        if (dto.getPassword().isEmpty())
            throw new IllegalArgumentException("El contraseña es Obligatorio");
        
        if (dto.getNombres().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
        
        if (dto.getApellidos().isEmpty())
            throw new IllegalArgumentException("El apellido es Obligatorio");
        
        if (dto.getCargo().isEmpty())
            throw new IllegalArgumentException("El cargo es Obligatorio");

    }
    
    public static void validarLogin(String username, String password) {
        if (username == null || username.isBlank())
            throw new IllegalArgumentException("El usuario es obligatorio");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("La contraseña es obligatoria");
    }
    

}

