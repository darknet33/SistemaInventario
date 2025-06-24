package sistemarhino.validator;

import sistemarhino.dto.VentaDetalleDTO;
import sistemarhino.util.Texto;

public class VentaDetalleValidator {

    public static void Validar(VentaDetalleDTO dto) {
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
            throw new IllegalArgumentException("Precio Vacio");
        }

        if (!Texto.isDecimal(dto.getPrecio())) {
            throw new IllegalArgumentException("Precio no Valida, ingrese solo numeros");
        }

    }
}
