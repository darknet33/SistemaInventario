package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.mappers.ProductoMapper;

public class ProductoService implements IService<ProductoDTO, Integer>{
    
    private final ProductoDAO productoDAO;
    private final ProductoMapper productoMapper;
    
    public ProductoService() {
        this.productoDAO = new ProductoDAO();
        this.productoMapper=new ProductoMapper();
    }
    
    @Override
    public ProductoDTO obtenerPorId(Integer id) {
        return productoMapper.toDTO(productoDAO.getById(id));
    }

    @Override
    public List<ProductoDTO> listarTodos() {
        return productoDAO.getAll().stream()
                                   .map(productoMapper::toDTO)
                                   .toList();
    }

    @Override
    public void guardar(ProductoDTO dto) {
        productoDAO.save(productoMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ProductoDTO dto) {
        productoDAO.update(productoMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        productoDAO.delete(id);
    }
    
}
