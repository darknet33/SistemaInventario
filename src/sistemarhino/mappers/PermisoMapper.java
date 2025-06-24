package sistemarhino.mappers;


import sistemarhino.dto.PermisoDTO;
import sistemarhino.entity.Permiso;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PermisoMapper implements IMapper<Permiso, PermisoDTO>{
    
    @Override    
    public  PermisoDTO toDTO(Permiso model) {
        PermisoDTO dto =new PermisoDTO();
        dto.setModulo(model.getModulo());
        dto.setEstado(model.isEstado());
        return dto;
    }
    
    @Override    
    public Permiso toEntity(PermisoDTO dto){
        Permiso model=new Permiso();
        model.setModulo(dto.getModulo());
        model.setEstado(dto.getEstado());
        return model;
    }
    
    @Override
    public List<PermisoDTO> toDTOList(List<Permiso> entities){
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }
    
    @Override
    public List<Permiso> toEntityList(List<PermisoDTO> dtos){
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
