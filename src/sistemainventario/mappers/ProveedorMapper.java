package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.ProveedorDTO;
import sistemainventario.entity.Proveedor;

public class ProveedorMapper implements IMapper<Proveedor, ProveedorDTO> {

    @Override
    public ProveedorDTO toDTO(Proveedor entity) {
        ProveedorDTO dto = new ProveedorDTO();
        dto.setId(entity.getId());
        dto.setNit(entity.getNit());
        dto.setNombre(entity.getNombre());
        dto.setMateriales(entity.getMaterial());
        dto.setContacto(entity.getContacto());
        dto.setCelular(entity.getCelular());
        dto.setEmail(entity.getEmail());
        dto.setEstado(entity.getEstado());
        dto.setFechaRegistro(entity.getFechaRegistro());

        return dto;
    }

    @Override
    public Proveedor toEntity(ProveedorDTO dto) {
        Proveedor entity = new Proveedor();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setNit(dto.getNit());
        entity.setMaterial(dto.getMateriales());
        entity.setContacto(dto.getContacto());
        entity.setCelular(dto.getCelular());
        entity.setEmail(dto.getEmail());
        entity.setEstado(dto.getEstado());
        entity.setFechaRegistro(dto.getFechaRegistro());

        return entity;
    }

    @Override
    public List<ProveedorDTO> toDTOList(List<Proveedor> entities) {
        return entities
                .stream()
                .map(this::toDTO)
                .toList();
    }

    @Override
    public List<Proveedor> toEntityList(List<ProveedorDTO> dtos) {
        return dtos
                .stream()
                .map(this::toEntity)
                .toList();
    }

}
