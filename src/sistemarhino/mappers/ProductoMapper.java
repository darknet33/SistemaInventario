package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.CategoriaDTO;
import sistemarhino.dto.ProductoDTO;
import sistemarhino.entity.Producto;

public class ProductoMapper implements IMapper<Producto, ProductoDTO>{
    private final CategoriaMapper categoriaMapper = new CategoriaMapper();
    private final UsuarioMapper usuarioMapper = new UsuarioMapper();
    
    @Override    
    public ProductoDTO toDTO(Producto entity){
        ProductoDTO dto=new ProductoDTO();
        
        dto.setId(entity.getId());
        dto.setCodigo(entity.getCodigo());        
        dto.setCategoria(categoriaMapper.toDTO(entity.getCategoria()));
        dto.setDescripcion(entity.getDescripcion());
        dto.setMarca(entity.getMarca());
        dto.setProcedencia(entity.getProcedencia().toUpperCase());
        dto.setPeso(entity.getPeso());
        dto.setStockInicial(String.valueOf(entity.getStockInicial()));
        dto.setStockActual(String.valueOf(entity.getStockActual()));
        dto.setStockMinimo(String.valueOf(entity.getStockMinimo()));
        dto.setEstado(entity.getEstado());       
        dto.setFechaRegistro(entity.getFechaRegistro());
        dto.setFechaActualizado(entity.getFechaActualizado());
        dto.setUsuario(usuarioMapper.toDTO(entity.getUsuario()));
        
        return dto;
    }
    
    @Override
    public Producto toEntity(ProductoDTO dto){
        Producto entity=new Producto();
        
        entity.setId(dto.getId());
        entity.setCodigo(dto.getCodigo());
        entity.setCategoria(categoriaMapper.toEntity(dto.getCategoria()));
        entity.setDescripcion(dto.getDescripcion());
        entity.setMarca(dto.getMarca());
        entity.setProcedencia(dto.getProcedencia());
        entity.setPeso(dto.getPeso());
        entity.setStockInicial(Integer.parseInt(dto.getStockInicial()));
        entity.setStockActual(Integer.parseInt(dto.getStockActual()));
        entity.setStockMinimo(Integer.parseInt(dto.getStockMinimo()));
        entity.setEstado(dto.getEstado());
        entity.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        
        return entity;
    }

    @Override
    public List<ProductoDTO> toDTOList(List<Producto> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Producto> toEntityList(List<ProductoDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
