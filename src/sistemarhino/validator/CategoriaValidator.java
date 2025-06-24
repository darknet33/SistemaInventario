package sistemarhino.validator;

import sistemarhino.dto.CategoriaDTO;

public class CategoriaValidator {
    
    public static void validar(CategoriaDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Categoria undefine");
        
        if (dto.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
