package sistemainventario.validator;

import sistemainventario.dto.CategoriaDTO;

public class CategoriaValidator {
    
    public static void validar(CategoriaDTO categoria){
        if (categoria==null)
            throw new IllegalArgumentException("Categoria undefine");
        
        if (categoria.getNombre().isEmpty())
            throw new IllegalArgumentException("El nombre es Obligatorio");
    }
}
