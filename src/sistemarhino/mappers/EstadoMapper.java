package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.EstadoDTO;
import sistemarhino.entity.Estado;

public class EstadoMapper implements IMapper<Estado, EstadoDTO>{
    
    @Override
    public EstadoDTO toDTO(Estado model){
        EstadoDTO dto=new EstadoDTO();
        
        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        
        return dto;
    }
    
    @Override
    public Estado toEntity(EstadoDTO dto){
        Estado model=new Estado();
        
        model.setId(dto.getId());
        model.setNombre(dto.getNombre());
        
        return model;
    }

    @Override
    public List<EstadoDTO> toDTOList(List<Estado> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Estado> toEntityList(List<EstadoDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
