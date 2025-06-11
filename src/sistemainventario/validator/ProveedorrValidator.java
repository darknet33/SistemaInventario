
package sistemainventario.validator;

import sistemainventario.dto.ProveedorDTO;

public class ProveedorrValidator {
    public static void validar(ProveedorDTO proveedor){
        if (proveedor==null)
            throw new IllegalArgumentException("Categoria undefine");
        
        if (proveedor.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
        
        if (proveedor.getNit().isEmpty())
            throw new IllegalArgumentException("El NIT es Obligatorio");
        
        if (proveedor.getCelular().isEmpty())
            throw new IllegalArgumentException("El celular es Obligatorio");
        
        if (proveedor.getEmail().isEmpty())
            throw new IllegalArgumentException("El Email es Obligatorio");
        
        if (!proveedor.getEmail().contains("@"))
            throw new IllegalArgumentException("Email no Valido");
    }
}
