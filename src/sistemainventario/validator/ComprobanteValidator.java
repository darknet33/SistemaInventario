package sistemainventario.validator;

import sistemainventario.dto.ComprobanteDTO;

public class ComprobanteValidator {
    
    public static void validar(ComprobanteDTO comprobante){
        if (comprobante==null)
            throw new IllegalArgumentException("Comprobante undefine");
        
        if (comprobante.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
