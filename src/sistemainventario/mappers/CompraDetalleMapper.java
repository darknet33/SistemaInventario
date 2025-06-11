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
        dto.setProduct(productoMapper.toDTO(entity.getProducto()));
        dto.setCantidad(entity.getCantidad());
        dto.setPrecio(entity.getPrecio());

        return dto;
    }

    @Override
    public CompraDetalle toEntity(CompraDetalleDTO dto) {
        CompraDetalle entity= new CompraDetalle();
        entity.setId(dto.getId());
        entity.setMovimiento(compraMapper.toEntity(dto.getMovimiento()));
        entity.setProducto(productoMapper.toEntity(dto.getProduct()));
        entity.setCantidad(dto.getCantidad());
        entity.setPrecio(dto.getPrecio());

        return entity;
    }

    @Override
    public List<CompraDetalleDTO> toDTOList(List<CompraDetalle> entities) {
        List<CompraDetalleDTO> dtos=new ArrayList<>();
        
        entities.forEach(cd -> {
            dtos.add(toDTO(cd));
        });
        
        return dtos;
    }

    @Override
    public List<CompraDetalle> toEntityList(List<CompraDetalleDTO> dtos) {
        List<CompraDetalle> entities=new ArrayList<>();
        
        dtos.forEach(cd -> {
            entities.add(toEntity(cd));
        });
        
        return entities;
    }
    
}
