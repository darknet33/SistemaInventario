package sistemainventario.mappers;


import sistemainventario.dto.PermisoDTO;
import sistemainventario.entity.Permiso;
import java.util.ArrayList;
import java.util.List;

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
        model.setEstado(dto.isEstado());
        return model;
    }
    
    @Override
    public List<PermisoDTO> toDTOList(List<Permiso> entities){
        List<PermisoDTO> dtos=new ArrayList<>();
        
        entities.forEach(p -> {
            dtos.add(toDTO(p));
        });
        
        return dtos;
    }
    
    @Override
    public List<Permiso> toEntityList(List<PermisoDTO> dtos){
        List<Permiso> models=new ArrayList<>();
        
        dtos.forEach(p -> {
            models.add(toEntity(p));
        });
        
        return models;
    }
}
