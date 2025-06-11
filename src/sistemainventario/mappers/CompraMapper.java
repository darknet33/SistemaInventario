
package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.CompraDTO;
import sistemainventario.entity.Compra;

public class CompraMapper implements IMapper<Compra, CompraDTO>{
    private final ProveedorMapper proveedorMapper= new ProveedorMapper();
    private final ComprobanteMapper comprobanteMapper= new ComprobanteMapper();
    private final EstadoMapper estadoMapper= new EstadoMapper();
    private final UsuarioMapper usuarioMapper= new UsuarioMapper();

    @Override
    public CompraDTO toDTO(Compra entity) {
        CompraDTO dto=new CompraDTO();
        
        dto.setId(entity.getId());
        dto.setProveedor(proveedorMapper.toDTO(entity.getProveedor()));
        dto.setComprobante(comprobanteMapper.toDTO(entity.getComprobante()));
        dto.setNroComprobante(entity.getNroComprobante());
        dto.setEstado(estadoMapper.toDTO(entity.getEstado()));
        dto.setTotal(entity.getTotal());
        dto.setUsuario(usuarioMapper.toDTO(entity.getUsuario()));
        
        return dto;
    }

    @Override
    public Compra toEntity(CompraDTO dto) {
        Compra entity=new Compra();
        
        entity.setId(dto.getId());
        entity.setProveedor(proveedorMapper.toEntity(dto.getProveedor()));
        entity.setComprobante(comprobanteMapper.toEntity(dto.getComprobante()));
        entity.setNroComprobante(dto.getNroComprobante());
        entity.setEstado(estadoMapper.toEntity(dto.getEstado()));
        entity.setTotal(dto.getTotal());
        entity.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        
        return entity;
    }

    @Override
    public List<CompraDTO> toDTOList(List<Compra> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Compra> toEntityList(List<CompraDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
