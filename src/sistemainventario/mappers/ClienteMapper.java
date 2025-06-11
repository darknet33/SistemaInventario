package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.ClienteDTO;
import sistemainventario.entity.Cliente;

public class ClienteMapper implements IMapper<Cliente, ClienteDTO>{

    @Override
    public ClienteDTO toDTO(Cliente entity) {
        ClienteDTO dto=new ClienteDTO();
        
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setNit(entity.getNit());
        dto.setCelular(entity.getCelular());
        dto.setDireccion(entity.getDireccion());
        dto.setEstado(entity.getEstado());
        dto.setFechaRegistro(entity.getFechaRegistro());

        return dto;
    }

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        Cliente entity=new Cliente();
        
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setNit(dto.getNit());
        entity.setCelular(dto.getCelular());
        entity.setDireccion(dto.getDireccion());
        entity.setEstado(dto.getEstado());
        entity.setFechaRegistro(dto.getFechaRegistro());
        
        return entity;
    }

    @Override
    public List<ClienteDTO> toDTOList(List<Cliente> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> toEntityList(List<ClienteDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
