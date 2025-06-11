package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.UsuarioDAO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.mappers.UsuarioMapper;
import sistemainventario.validator.UsuarioValidator;

public class UsuarioService implements IService<UsuarioDTO, Integer>{

    private final UsuarioDAO usuarioDAO;
    private final UsuarioMapper usuarioMapper;
    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
        this.usuarioMapper= new UsuarioMapper();
    }

    @Override
    public UsuarioDTO obtenerPorId(Integer id) {
        return usuarioMapper.toDTO(usuarioDAO.getById(id));
    }

    @Override
    public List<UsuarioDTO> listarTodos() {
        return usuarioDAO.getAll()
                 .stream()
                 .map(usuarioMapper::toDTO)
                 .toList();
    }

    @Override
    public void guardar(UsuarioDTO dto) {
        usuarioDAO.save(usuarioMapper.toEntity(dto));
    }

    @Override
    public void actualizar(UsuarioDTO dto) {
        usuarioDAO.update(usuarioMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
         usuarioDAO.delete(id);
    }
    
    public UsuarioDTO login(String username,String password) {
        UsuarioValidator.validarLogin(username, password);
        
        UsuarioDTO usuario = usuarioMapper.toDTO(usuarioDAO.getByUsername(username));
        if (usuario == null) 
            throw new IllegalArgumentException("El usuario es incorrecto.");
        
        if (!usuario.getPassword().equals(password))
            throw new IllegalArgumentException("Contraseña incorrecta.");
                
        if (usuario.getEstado()==false)
            throw new IllegalArgumentException("El usuario esta Inhabilitado");
        
        return usuario;
    }
    
    public void cambiarEstado(int id){
        usuarioDAO.changeEstado(id);
    }
}