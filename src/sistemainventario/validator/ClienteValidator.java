
package sistemainventario.validator;

import sistemainventario.dto.ClienteDTO;

public class ClienteValidator {
    public static void validar(ClienteDTO cliente){
        if (cliente==null)
            throw new IllegalArgumentException("Categoria undefine");
        
        if (cliente.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
        
        if (cliente.getNit().isEmpty())
            throw new IllegalArgumentException("El NIT es Obligatorio");
        
        if (cliente.getCelular().isEmpty())
            throw new IllegalArgumentException("El celular es Obligatorio");
    }
}
