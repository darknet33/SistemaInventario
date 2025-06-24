package sistemarhino.services;

import java.util.List;
import sistemarhino.dao.CompraDAO;
import sistemarhino.dao.ComprobanteDAO;
import sistemarhino.dto.ComprobanteDTO;
import sistemarhino.mappers.ComprobanteMapper;
import sistemarhino.validator.ComprobanteValidator;

public class ComprobanteService implements IService<ComprobanteDTO, Integer>{
    private final ComprobanteDAO comprobanteDAO;
    private final CompraDAO compraDAO;
    private final ComprobanteMapper comprobanteMapper;
    
    public ComprobanteService() {
        this.comprobanteDAO = new ComprobanteDAO();
        this.compraDAO= new CompraDAO();
        this.comprobanteMapper =new ComprobanteMapper();
    }
    
    @Override
    public ComprobanteDTO obtenerPorId(Integer id) {
        return comprobanteMapper.toDTO(comprobanteDAO.getById(id));
    }

    @Override
    public List<ComprobanteDTO> listarTodos() {
        return comprobanteMapper.toDTOList(comprobanteDAO.getAll());
    }

    @Override
    public void guardar(ComprobanteDTO dto) {
        ComprobanteValidator.validar(dto);
        comprobanteDAO.save(comprobanteMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ComprobanteDTO dto) {
        ComprobanteValidator.validar(dto);
        comprobanteDAO.update(comprobanteMapper.toEntity(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        /*int cantidadProductos = productoDAO.contarPorComprobante(id);
        if (cantidadProductos > 0) {
            throw new IllegalArgumentException("No se puede eliminar la categoría porque tiene productos asociados.");
        }else{
            comprobanteDAO.delete(id); 
        }*/
    }

    
}
