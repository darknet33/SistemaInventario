package sistemainventario.mappers;

import java.util.ArrayList;
import java.util.List;
import sistemainventario.dto.CompraDetalleDTO;
import sistemainventario.entity.CompraDetalle;

public class CompraDetalleMapper implements IMapper<CompraDetalle, CompraDetalleDTO>{
    private final CompraMapper compraMapper= new CompraMapper();
    private final ProductoMapper productoMapper= new ProductoMapper();
    @Override
    public CompraDetalleDTO toDTO(CompraDetalle entity) {
        CompraDetalleDTO dto= new CompraDetalleDTO();
        dto.setId(entity.getId());
        dto.setMovimiento(compraMapper.toDTO(entity.getMovimiento()));
        dto.setProducto(productoMapper.toDTO(entity.getProducto()));
        dto.setCantidad(entity.getCantidad());
        dto.setPrecio(entity.getPrecio());

        return dto;
    }

    @Override
    public CompraDetalle toEntity(CompraDetalleDTO dto) {
        CompraDetalle entity= new CompraDetalle();
        entity.setId(dto.getId());
        entity.setMovimiento(compraMapper.toEntity(dto.getMovimiento()));
        entity.setProducto(productoMapper.toEntity(dto.getProducto()));
        entity.setCantidad(dto.getCantidad());
        entity.setPrecio(dto.getPrecio());

        return entity;
    }

    @Override
    public List<CompraDetalleDTO> toDTOList(List<CompraDetalle> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .toList();
    }

    @Override
    public List<CompraDetalle> toEntityList(List<CompraDetalleDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .toList();
    }
    
}
