package sistemainventario.validator;

import sistemainventario.dto.ComprobanteDTO;

public class ComprobanteValidator {
    
    public static void validar(ComprobanteDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Comprobante undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
