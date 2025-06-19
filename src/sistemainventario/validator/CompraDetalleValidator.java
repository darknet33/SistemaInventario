package sistemainventario.validator;

import sistemainventario.dto.CompraDetalleDTO;
import sistemainventario.util.Texto;

public class CompraDetalleValidator {
    public static void Validar(CompraDetalleDTO dto){
        if(dto==null)
            throw new IllegalArgumentException("Detalle no Valido");
        
        if(dto.getProducto()==null)
            throw new IllegalArgumentException("Producto no Valido");
        
        if(!Texto.isInteger(dto.getCantidad()))
            throw new IllegalArgumentException("Cantidad no Valida, ingrese solo numeros");
        
        if(!Texto.isDecimal(dto.getPrecio()))
            throw new IllegalArgumentException("Precio no Valida, ingrese solo numeros");

    }
}
