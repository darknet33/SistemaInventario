package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.VentaDetalleDTO;
import sistemarhino.entity.VentaDetalle;

public class VentaDetalleMapper implements IMapper<VentaDetalle, VentaDetalleDTO> {

    private final ProductoMapper productoMapper = new ProductoMapper();

    @Override
    public VentaDetalleDTO toDTO(VentaDetalle entity) {
        VentaDetalleDTO dto = new VentaDetalleDTO();
        dto.setId(entity.getId());
        dto.setIdMovimiento(entity.getIdMovimiento());
        dto.setProducto(productoMapper.toDTO(entity.getProducto()));
        dto.setCantidad(String.valueOf(entity.getCantidad()));
        dto.setPrecio(String.valueOf(entity.getPrecio()));

        return dto;
    }

    @Override
    public VentaDetalle toEntity(VentaDetalleDTO dto) {
        VentaDetalle entity = new VentaDetalle();
        entity.setId(dto.getId());
        entity.setIdMovimiento(dto.getIdMovimiento());
        entity.setProducto(productoMapper.toEntity(dto.getProducto()));
        entity.setCantidad(Integer.parseInt(dto.getCantidad()));
        entity.setPrecio(Double.parseDouble(dto.getPrecio()));

        return entity;
    }

    @Override
    public List<VentaDetalleDTO> toDTOList(List<VentaDetalle> entities) {
        return entities
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<VentaDetalle> toEntityList(List<VentaDetalleDTO> dtos) {
        return dtos
                .stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

}
