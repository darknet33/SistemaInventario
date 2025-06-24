
package sistemarhino.validator;

import sistemarhino.dto.ProductoDTO;
import sistemarhino.util.Texto;

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
        
        if (dto.getStockInicial().isEmpty())
            throw new IllegalArgumentException("Stock Inicial esta Vacio");
        
        if (!Texto.isInteger(dto.getStockInicial()))
            throw new IllegalArgumentException("Stock Inicial solo acepta numeros");

        if (dto.getStockMinimo().isEmpty())
            throw new IllegalArgumentException("Stock Minimo esta Vacio");
        
        if (!Texto.isInteger(dto.getStockInicial()))
            throw new IllegalArgumentException("Stock Minimo solo acepta numeros");
        
        if(Integer.parseInt(dto.getStockMinimo())<=0)
            throw new IllegalArgumentException("Stock Minimo tiene que se mayor a 0");

    }
}
