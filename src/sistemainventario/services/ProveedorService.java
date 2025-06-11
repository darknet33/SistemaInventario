
package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ProveedorDAO;
import sistemainventario.dto.ProveedorDTO;
import sistemainventario.mappers.ProveedorMapper;
import sistemainventario.validator.ProveedorrValidator;

public class ProveedorService implements IService<ProveedorDTO, Integer>{
    private final ProveedorDAO proveedorDAO;
    private final ProveedorMapper proveedorMapper;

    public ProveedorService() {
        this.proveedorDAO=new ProveedorDAO();
        this.proveedorMapper=new ProveedorMapper();
    }
    
    @Override
    public ProveedorDTO obtenerPorId(Integer id) {
        return proveedorMapper.toDTO(proveedorDAO.getById(id));
    }

    @Override
    public List<ProveedorDTO> listarTodos() {
        return proveedorDAO.getAll()
                            .stream()
                            .map(proveedorMapper::toDTO)
                            .toList();
    }

    @Override
    public void guardar(ProveedorDTO dto) {
        ProveedorrValidator.validar(dto);
        proveedorDAO.save(proveedorMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ProveedorDTO dto) {
        ProveedorrValidator.validar(dto);
        proveedorDAO.update(proveedorMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        proveedorDAO.delete(id);
    }
    
}
