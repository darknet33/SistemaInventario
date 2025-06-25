package sistemainventario.validator;

import sistemainventario.dto.CategoriaDTO;

public class CategoriaValidator {
    
    public static void validar(CategoriaDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Categoria: undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("Categoria: nombre es Obligatorio");
    }
}
