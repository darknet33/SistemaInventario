package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.mappers.ProductoMapper;
import sistemainventario.validator.ProductoValidator;

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
        ProductoValidator.validar(dto);
        productoDAO.save(productoMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ProductoDTO dto) {
        ProductoValidator.validar(dto);
        productoDAO.update(productoMapper.toEntity(dto));
    }

    @Override
    public void eliminar(Integer id) {
        productoDAO.delete(id);
    }
    
}
