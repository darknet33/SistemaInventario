package sistemainventario.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemainventario.dto.ComprobanteDTO;
import sistemainventario.entity.Comprobante;

public class ComprobanteMapper implements IMapper<Comprobante, ComprobanteDTO>{
    
    @Override
    public ComprobanteDTO toDTO(Comprobante model){
        ComprobanteDTO dto=new ComprobanteDTO();
        
        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        
        return dto;
    }
    
    @Override
    public Comprobante toEntity(ComprobanteDTO dto){
        Comprobante model=new Comprobante();
        
        model.setId(dto.getId());
        model.setNombre(dto.getNombre());
        
        return model;
    }

    @Override
    public List<ComprobanteDTO> toDTOList(List<Comprobante> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Comprobante> toEntityList(List<ComprobanteDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
