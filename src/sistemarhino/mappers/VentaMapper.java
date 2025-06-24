package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.VentaDTO;
import sistemarhino.entity.Venta;
import sistemarhino.util.Texto;

public class VentaMapper implements IMapper<Venta, VentaDTO> {

    private final ClienteMapper clienteMapper = new ClienteMapper();
    private final ComprobanteMapper comprobanteMapper = new ComprobanteMapper();
    private final EstadoMapper estadoMapper = new EstadoMapper();
    private final UsuarioMapper usuarioMapper = new UsuarioMapper();

    @Override
    public VentaDTO toDTO(Venta entity) {
        VentaDTO dto = new VentaDTO();
        VentaDetalleMapper detalleMapper = new VentaDetalleMapper();

        dto.setId(entity.getId());
        dto.setFecha(entity.getFecha().toString());
        dto.setCliente(clienteMapper.toDTO(entity.getCliente()));
        dto.setComprobante(comprobanteMapper.toDTO(entity.getComprobante()));
        dto.setNroComprobante(entity.getNroComprobante());
        dto.setEstado(estadoMapper.toDTO(entity.getEstado()));
        dto.setTotal(entity.getTotal());
        dto.setImpuesto(entity.getImpuesto());
        dto.setDescuento(entity.getDescuento());
        dto.setUsuario(usuarioMapper.toDTO(entity.getUsuario()));
        dto.setDetalles(detalleMapper.toDTOList(entity.getDetalles()));

        return dto;
    }

    @Override
    public Venta toEntity(VentaDTO dto) {
        Venta entity = new Venta();
        VentaDetalleMapper detalleMapper = new VentaDetalleMapper();
        entity.setId(dto.getId());
        entity.setFecha(Texto.stringtoLocaDate(dto.getFecha()));
        entity.setCliente(clienteMapper.toEntity(dto.getCliente()));
        entity.setComprobante(comprobanteMapper.toEntity(dto.getComprobante()));
        entity.setNroComprobante(dto.getNroComprobante());
        entity.setEstado(estadoMapper.toEntity(dto.getEstado()));
        entity.setTotal(dto.getTotal());
        entity.setImpuesto(dto.getImpuesto());
        entity.setDescuento(dto.getDescuento());
        entity.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        entity.setDetalles(detalleMapper.toEntityList(dto.getDetalles()));
        return entity;
    }

    @Override
    public List<VentaDTO> toDTOList(List<Venta> entities) {
        return entities
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Venta> toEntityList(List<VentaDTO> dtos) {
        return dtos
                .stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

}
