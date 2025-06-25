
package sistemainventario.mappers;

import sistemainventario.dto.ProductoDTO;

import java.util.Arrays;
import java.util.List;

public class ProductoExcelMapper implements ExcelMappable<ProductoDTO> {

    @Override
    public String[] getHeaders() {
        return new String[] {
            "Código", "Categoría", "Descripción", "Marca", "Procedencia", "Peso",
            "Stock Inicial", "Stock Actual", "Stock Mínimo", "Estado"
        };
    }

    @Override
    public List<String> mapToRow(ProductoDTO data) {
        return Arrays.asList(
            data.getCodigo(),
            data.getCategoria() != null ? data.getCategoria().toString() : "",
            data.getDescripcion(),
            data.getMarca(),
            data.getProcedencia(),
            data.getPeso(),
            data.getStockInicial(),
            data.getStockActual(),
            data.getStockMinimo(),
            data.getEstado() ? "Activo" : "Inactivo"
        );
    }

    @Override
    public ProductoDTO mapFromRow(List<String> rowValues) {
        ProductoDTO dto = new ProductoDTO();
        dto.setCodigo(rowValues.get(0));
        
        // ⚠️ Aquí solo se guarda como texto. Si necesitas asignar la categoría real, hazlo en el Service.
        dto.getCategoria().setNombre(rowValues.get(1));
        
        dto.setDescripcion(rowValues.get(2));
        dto.setMarca(rowValues.get(3));
        dto.setProcedencia(rowValues.get(4));
        dto.setPeso(rowValues.get(5));
        dto.setStockInicial(rowValues.get(6));
        dto.setStockActual(rowValues.get(7));
        dto.setStockMinimo(rowValues.get(8));
        dto.setEstado(rowValues.get(9).equalsIgnoreCase("Activo"));
        return dto;
    }
}
