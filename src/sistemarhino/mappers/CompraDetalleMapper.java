package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.CompraDetalleDTO;
import sistemarhino.entity.CompraDetalle;

public class CompraDetalleMapper implements IMapper<CompraDetalle, CompraDetalleDTO>{
    private final ProductoMapper productoMapper= new ProductoMapper();
    @Override
    public CompraDetalleDTO toDTO(CompraDetalle entity) {
        CompraDetalleDTO dto= new CompraDetalleDTO();
        dto.setId(entity.getId());
        dto.setIdMovimiento(entity.getIdMovimiento());
        dto.setProducto(productoMapper.toDTO(entity.getProducto()));
        dto.setCantidad(String.valueOf(entity.getCantidad()));
        dto.setPrecio(String.valueOf(entity.getPrecio()));

        return dto;
    }

    @Override
    public CompraDetalle toEntity(CompraDetalleDTO dto) {
        CompraDetalle entity= new CompraDetalle();
        entity.setId(dto.getId());
        entity.setIdMovimiento(dto.getIdMovimiento());
        entity.setProducto(productoMapper.toEntity(dto.getProducto()));
        entity.setCantidad(Integer.parseInt(dto.getCantidad()));
        entity.setPrecio(Double.parseDouble(dto.getPrecio()));

        return entity;
    }

    @Override
    public List<CompraDetalleDTO> toDTOList(List<CompraDetalle> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<CompraDetalle> toEntityList(List<CompraDetalleDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
    
}
