package sistemarhino.mappers;

import java.util.List;
import java.util.stream.Collectors;
import sistemarhino.dto.ClienteDTO;
import sistemarhino.entity.Cliente;

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
        return entities
                 .stream()
                 .map(this::toDTO)
                 .collect(Collectors.toList());
    }

    @Override
    public List<Cliente> toEntityList(List<ClienteDTO> dtos) {
        return dtos
                 .stream()
                 .map(this::toEntity)
                 .collect(Collectors.toList());
    }
    
}
