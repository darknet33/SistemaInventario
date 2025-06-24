package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.CompraDetalleDAO;
import sistemarhino.dto.CompraDetalleDTO;
import sistemarhino.mappers.CompraDetalleMapper;
import sistemarhino.validator.CompraDetalleValidator;

public class CompraDetalleService implements IService<CompraDetalleDTO, Integer>{
    private final CompraDetalleDAO detalleDAO;
    private final CompraDetalleMapper detalleMapper;

    public CompraDetalleService() {
        this.detalleDAO=new CompraDetalleDAO();
        this.detalleMapper=new CompraDetalleMapper();
    }
        
    @Override
    public CompraDetalleDTO obtenerPorId(Integer id) {
        return detalleMapper.toDTO(detalleDAO.getById(id));
    }

    @Override
    public List<CompraDetalleDTO> listarTodos() {
        return detalleMapper.toDTOList(detalleDAO.getAll());
    }

    @Override
    public void guardar(CompraDetalleDTO dto) {
        CompraDetalleValidator.Validar(dto);
        detalleDAO.save(detalleMapper.toEntity(dto));
    }

    @Override
    public void actualizar(CompraDetalleDTO dto) {
        CompraDetalleValidator.Validar(dto);
        detalleDAO.update(detalleMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        detalleDAO.delete(id);
    }
    
}
