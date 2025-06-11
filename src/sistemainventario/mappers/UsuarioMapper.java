package sistemainventario.mappers;


import java.util.List;
import java.sql.*;
import sistemainventario.entity.Usuario;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.entity.Rol;
import sistemainventario.dao.RolDAO;

public class UsuarioMapper implements IMapper<Usuario, UsuarioDTO> {
    private final RolMapper rolMapper = new RolMapper();
    private final RolDAO rolDAO=new RolDAO();
    
   
    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        if (entity==null){
            return null;
        }
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setNombres(entity.getNombres());
        dto.setApellidos(entity.getApellidos());
        dto.setCargo(entity.getCargo());
        dto.setRol(rolMapper.toDTO(entity.getRol()));
        dto.setEstado(entity.getEstado());
        dto.setFechaRegistro(entity.getFechaRegistro());
        dto.setFechaActualizado(entity.getFechaActualizado());

        return dto;
    }

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        Usuario entity = new Usuario();

        entity.setId(dto.getId());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setNombres(dto.getNombres());
        entity.setApellidos(dto.getApellidos());
        entity.setCargo(dto.getCargo());
        entity.setRol(rolMapper.toEntity(dto.getRol()));
        entity.setEstado(dto.getEstado());
        entity.setFechaRegistro(dto.getFechaRegistro());
        entity.setFechaActualizado(dto.getFechaActualizado());

        return entity;
    }

    @Override
    public List<UsuarioDTO> toDTOList(List<Usuario> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> toEntityList(List<UsuarioDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
