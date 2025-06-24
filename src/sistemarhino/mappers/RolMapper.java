package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.RolDTO;
import sistemarhino.entity.Rol;


public class RolMapper implements IMapper<Rol, RolDTO>{
    private final PermisoMapper permisoMapper=new PermisoMapper();
    
    @Override
    public RolDTO toDTO(Rol entity) {
        RolDTO dto = new RolDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        
        dto.setPermisos(permisoMapper.toDTOList(entity.getPermisos()));
               
        return dto;
    }
    
    @Override
    public Rol toEntity(RolDTO dto){
        Rol entity=new Rol();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        
        entity.setPermisos(permisoMapper.toEntityList(dto.getPermisos()));
        return entity;
    }

    @Override
    public List<RolDTO> toDTOList(List<Rol> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Rol> toEntityList(List<RolDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
