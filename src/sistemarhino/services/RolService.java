
package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.RolDAO;
import sistemarhino.dto.RolDTO;
import sistemarhino.mappers.RolMapper;


public class RolService implements IService<RolDTO, Integer>{
    
    private final RolDAO rolDAO;
    private final RolMapper rolMapper;
    
    public RolService() {
        this.rolDAO = new RolDAO();
        this.rolMapper= new RolMapper();
    }
    
    @Override
    public RolDTO obtenerPorId(Integer id) {
        return rolMapper.toDTO(rolDAO.getById(id));
    }

    @Override
    public List<RolDTO> listarTodos() {
        return rolMapper.toDTOList(rolDAO.getAll());
    }

    @Override
    public void guardar(RolDTO dto) {
        rolDAO.save(rolMapper.toEntity(dto));
    }

    @Override
    public void actualizar(RolDTO dto) {
        rolDAO.update(rolMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        rolDAO.delete(id);
    }
    
}
