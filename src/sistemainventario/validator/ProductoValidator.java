
package sistemainventario.validator;

import sistemainventario.dto.ProductoDTO;

public class ProductoValidator {
    public static void validar(ProductoDTO dto){
        if (dto==null)
            throw new IllegalArgumentException("Producto undefine");
        
        if (dto.getCategoria()==null)
            throw new IllegalArgumentException("Categoria undefine");
        
        if (dto.getUsuario()==null)
            throw new IllegalArgumentException("Usuario undefine");
        
        if (dto.getCodigo().isEmpty())
            throw new IllegalArgumentException("El codigo es Obligatorio");
        
        if (dto.getDescripcion().isEmpty())
            throw new IllegalArgumentException("La descripcion es Obligatorio");
        
        if (dto.getProcedencia().isEmpty())
            throw new IllegalArgumentException("La procedencia es Obligatorio");
        
        if (dto.getMarca().isEmpty())
            throw new IllegalArgumentException("La marca es Obligatorio");
        
        if (dto.getStockMinimo()<=0)
            throw new IllegalArgumentException("Stock Minimo debe ser mayor a 0");

    }
}
