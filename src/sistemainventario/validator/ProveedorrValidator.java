
package sistemainventario.validator;

import sistemainventario.dto.ProveedorDTO;

public class ProveedorrValidator {
    public static void validar(ProveedorDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Proveedor undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
        
        if (dto.getNit().isEmpty())
            throw new IllegalArgumentException("El NIT es Obligatorio");
        
        if (dto.getCelular().isEmpty())
            throw new IllegalArgumentException("El celular es Obligatorio");
                
        if (!dto.getEmail().isEmpty() && !dto.getEmail().contains("@"))
            throw new IllegalArgumentException("EL email no es Valido");
    }
}
