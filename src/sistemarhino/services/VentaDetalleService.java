package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.VentaDetalleDAO;
import sistemarhino.dto.VentaDetalleDTO;
import sistemarhino.mappers.VentaDetalleMapper;
import sistemarhino.validator.VentaDetalleValidator;

public class VentaDetalleService implements IService<VentaDetalleDTO, Integer>{
    private final VentaDetalleDAO detalleDAO;
    private final VentaDetalleMapper detalleMapper;

    public VentaDetalleService() {
        this.detalleDAO=new VentaDetalleDAO();
        this.detalleMapper=new VentaDetalleMapper();
    }
        
    @Override
    public VentaDetalleDTO obtenerPorId(Integer id) {
        return detalleMapper.toDTO(detalleDAO.getById(id));
    }

    @Override
    public List<VentaDetalleDTO> listarTodos() {
        return detalleMapper.toDTOList(detalleDAO.getAll());
    }

    @Override
    public void guardar(VentaDetalleDTO dto) {
        VentaDetalleValidator.Validar(dto);
        detalleDAO.save(detalleMapper.toEntity(dto));
    }

    @Override
    public void actualizar(VentaDetalleDTO dto) {
        VentaDetalleValidator.Validar(dto);
        detalleDAO.update(detalleMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        detalleDAO.delete(id);
    }
    
}
