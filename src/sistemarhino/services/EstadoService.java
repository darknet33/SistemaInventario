package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.EstadoDAO;
import sistemarhino.dao.ProductoDAO;
import sistemarhino.dto.EstadoDTO;
import sistemarhino.mappers.EstadoMapper;
import sistemarhino.validator.EstadoValidator;

public class EstadoService implements IService<EstadoDTO, Integer>{
    private final EstadoDAO estadoDAO;
    private final ProductoDAO productoDAO;
    private final EstadoMapper estadoMapper;
    
    public EstadoService() {
        this.estadoDAO = new EstadoDAO();
        this.productoDAO= new ProductoDAO();
        this.estadoMapper =new EstadoMapper();
    }
    
    @Override
    public EstadoDTO obtenerPorId(Integer id) {
        return estadoMapper.toDTO(estadoDAO.getById(id));
    }

    @Override
    public List<EstadoDTO> listarTodos() {
        return estadoMapper.toDTOList(estadoDAO.getAll());
    }

    @Override
    public void guardar(EstadoDTO dto) {
        EstadoValidator.validar(dto);
        estadoDAO.save(estadoMapper.toEntity(dto));
    }

    @Override
    public void actualizar(EstadoDTO dto) {
        EstadoValidator.validar(dto);
        estadoDAO.update(estadoMapper.toEntity(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        /*int cantidadProductos = productoDAO.contarPorEstado(id);
        if (cantidadProductos > 0) {
            throw new IllegalArgumentException("No se puede eliminar la categoría porque tiene productos asociados.");
        }else{
            estadoDAO.delete(id); 
        }*/
    }

    
}
