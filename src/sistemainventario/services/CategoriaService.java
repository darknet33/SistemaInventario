package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.CategoriaDAO;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.mappers.CategoriaMapper;
import sistemainventario.validator.CategoriaValidator;

public class CategoriaService implements IService<CategoriaDTO, Integer>{
    private final CategoriaDAO categoriaDAO;
    private final ProductoDAO productoDAO;
    private final CategoriaMapper categoriaMapper;
    
    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAO();
        this.productoDAO= new ProductoDAO();
        this.categoriaMapper =new CategoriaMapper();
    }
    
    @Override
    public CategoriaDTO obtenerPorId(Integer id) {
        return categoriaMapper.toDTO(categoriaDAO.getById(id));
    }

    @Override
    public List<CategoriaDTO> listarTodos() {
        return categoriaDAO.getAll()
                            .stream()
                            .map(categoriaMapper::toDTO)
                            .toList();
    }

    @Override
    public void guardar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.save(categoriaMapper.toEntity(dto));
    }

    @Override
    public void actualizar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.update(categoriaMapper.toEntity(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        int cantidadProductos = productoDAO.contarPorCategoria(id);
        if (cantidadProductos > 0) {
            throw new IllegalArgumentException("No se puede eliminar la categoría porque tiene productos asociados.");
        }else{
            categoriaDAO.delete(id); 
        }
    }

    
}
