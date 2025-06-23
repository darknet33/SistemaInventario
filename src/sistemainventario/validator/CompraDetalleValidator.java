package sistemainventario.validator;

import sistemainventario.dto.CompraDetalleDTO;
import sistemainventario.util.Texto;

public class CompraDetalleValidator {

    public static void Validar(CompraDetalleDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("Detalle no Valido");
        }

        if (dto.getProducto() == null) {
            throw new IllegalArgumentException("Producto no Valido");
        }

        if (dto.getCantidad().isEmpty()) {
            throw new IllegalArgumentException("Cantidad Vacio");
        }

        if (!Texto.isInteger(dto.getCantidad())) {
            throw new IllegalArgumentException("Cantidad no Valida, ingrese solo numeros");
        }

        if (dto.getPrecio().isEmpty()) {
            throw new IllegalArgumentException("Costo Vacio");
        }

        if (!Texto.isDecimal(dto.getPrecio())) {
            throw new IllegalArgumentException("Precio no Valida, ingrese solo numeros");
        }

    }
}
