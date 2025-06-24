
package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.CompraDTO;
import sistemarhino.entity.Compra;
import sistemarhino.util.Texto;

public class CompraMapper implements IMapper<Compra, CompraDTO>{
    private final ProveedorMapper proveedorMapper= new ProveedorMapper();
    private final ComprobanteMapper comprobanteMapper= new ComprobanteMapper();
    private final EstadoMapper estadoMapper= new EstadoMapper();
    private final UsuarioMapper usuarioMapper= new UsuarioMapper();

    @Override
    public CompraDTO toDTO(Compra entity) {
        CompraDTO dto=new CompraDTO();
        CompraDetalleMapper detalleMapper=new CompraDetalleMapper();
        
        dto.setId(entity.getId());
        dto.setFecha(entity.getFecha().toString());
        dto.setProveedor(proveedorMapper.toDTO(entity.getProveedor()));
        dto.setComprobante(comprobanteMapper.toDTO(entity.getComprobante()));
        dto.setNroComprobante(entity.getNroComprobante());
        dto.setEstado(estadoMapper.toDTO(entity.getEstado()));
        dto.setTotal(entity.getTotal());
        dto.setUsuario(usuarioMapper.toDTO(entity.getUsuario()));
        dto.setDetalles(detalleMapper.toDTOList(entity.getDetalles()));
        
        return dto;
    }

    @Override
    public Compra toEntity(CompraDTO dto) {
        Compra entity=new Compra();
        CompraDetalleMapper detalleMapper=new CompraDetalleMapper();
        
        entity.setId(dto.getId());
        entity.setFecha(Texto.stringtoLocaDate(dto.getFecha()));
        entity.setProveedor(proveedorMapper.toEntity(dto.getProveedor()));
        entity.setComprobante(comprobanteMapper.toEntity(dto.getComprobante()));
        entity.setNroComprobante(dto.getNroComprobante());
        entity.setEstado(estadoMapper.toEntity(dto.getEstado()));
        entity.setTotal(dto.getTotal());
        entity.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        entity.setDetalles(detalleMapper.toEntityList(dto.getDetalles()));
        
        return entity;
    }

    @Override
    public List<CompraDTO> toDTOList(List<Compra> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Compra> toEntityList(List<CompraDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
    
}
