package sistemainventario.validator;

import sistemainventario.dto.EstadoDTO;

public class EstadoValidator {
    
    public static void validar(EstadoDTO estado){
        if (estado==null)
            throw new IllegalArgumentException("Estado undefine");
        
        if (estado.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
