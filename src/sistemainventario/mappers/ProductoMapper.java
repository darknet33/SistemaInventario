package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.entity.Producto;

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
        dto.setStockInicial(entity.getStockInicial());
        dto.setStockActual(entity.getStockActual());
        dto.setStockMinimo(entity.getStockMinimo());
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
        entity.setStockInicial(dto.getStockInicial());
        entity.setStockActual(dto.getStockActual());
        entity.setStockMinimo(dto.getStockMinimo());
        entity.setEstado(dto.getEstado());
        entity.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        
        return entity;
    }

    @Override
    public List<ProductoDTO> toDTOList(List<Producto> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .toList();
    }

    @Override
    public List<Producto> toEntityList(List<ProductoDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .toList();
    }
}
