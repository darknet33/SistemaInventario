package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.EstadoDTO;
import sistemainventario.entity.Estado;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Estado> toEntityList(List<EstadoDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
