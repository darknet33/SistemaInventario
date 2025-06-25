package sistemainventario.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.entity.Categoria;

public class CategoriaMapper implements IMapper<Categoria, CategoriaDTO>{
    
    @Override
    public CategoriaDTO toDTO(Categoria entity){
        CategoriaDTO dto=new CategoriaDTO();
        
        if(entity==null) return null;
        
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        
        return dto;
    }
    
    @Override
    public Categoria toEntity(CategoriaDTO dto){
        Categoria entity=new Categoria();
        
        if(dto==null) return null;
        
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        
        return entity;
    }

    @Override
    public List<CategoriaDTO> toDTOList(List<Categoria> entities) {
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Categoria> toEntityList(List<CategoriaDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
}
