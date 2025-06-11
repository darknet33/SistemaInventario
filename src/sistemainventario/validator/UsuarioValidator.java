package sistemainventario.validator;

public class UsuarioValidator {
    public static void validarLogin(String username, String password) {
        if (username == null || username.isBlank())
            throw new IllegalArgumentException("El usuario es obligatorio");

        if (password == null || password.isBlank())
            throw new IllegalArgumentException("La contraseña es obligatoria");
       
    }
    

}

