
package sistemarhino.validator;

import sistemarhino.dto.ClienteDTO;

public class ClienteValidator {
    public static void validar(ClienteDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Cliente undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
        
        if (dto.getNit().isEmpty())
            throw new IllegalArgumentException("El NIT es Obligatorio");
        
        if (dto.getCelular().isEmpty())
            throw new IllegalArgumentException("El celular es Obligatorio");
    }
}
