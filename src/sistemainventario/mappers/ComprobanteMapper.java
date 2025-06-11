package sistemainventario.mappers;

import java.util.List;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Comprobante> toEntityList(List<ComprobanteDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
