package sistemainventario.validator;

import sistemainventario.dto.EstadoDTO;

public class EstadoValidator {
    
    public static void validar(EstadoDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Estado undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
