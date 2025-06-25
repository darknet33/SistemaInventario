package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.mappers.ProductoMapper;
import sistemainventario.validator.ProductoValidator;

public class ProductoService implements IService<ProductoDTO, Integer> {

    private final ProductoDAO productoDAO;
    private final ProductoMapper productoMapper;
    private final CategoriaService categoriaService;

    public ProductoService() {
        this.productoDAO = new ProductoDAO();
        this.productoMapper = new ProductoMapper();
        this.categoriaService=new CategoriaService();
    }

    @Override
    public ProductoDTO obtenerPorId(Integer id) {
        return productoMapper.toDTO(productoDAO.getById(id));
    }

    @Override
    public List<ProductoDTO> listarTodos() {
        return productoMapper.toDTOList(productoDAO.getAll());
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
    
    public ProductoDTO obtenerPorCodigo(String codigo) {
        return productoMapper.toDTO(productoDAO.getByCodigo(codigo));
    }

    public void importar(List<ProductoDTO> productosImportados, UsuarioDTO usuarioActual) {
        
        for (ProductoDTO producto : productosImportados) {
            // Buscar categoría por nombre (suponiendo que viene como texto desde el Excel)
            String nombreCategoria = producto.getCategoria().getNombre();
            CategoriaDTO categoriaEncontrada = categoriaService.obtenerPorNombre(nombreCategoria);
            
            if (categoriaEncontrada!=null) {
                producto.setCategoria(categoriaEncontrada);
            } else {
                categoriaEncontrada=new CategoriaDTO();
                categoriaEncontrada.setNombre(nombreCategoria);                
                categoriaService.guardar(categoriaEncontrada);
                categoriaEncontrada.setId(categoriaService.getIDInsert());
                producto.setCategoria(categoriaEncontrada);
            }

            // Asignar usuario actual
            producto.setUsuario(usuarioActual);
            
            String codigoProducto=producto.getCodigo();
            ProductoDTO productoEncontrado=obtenerPorCodigo(codigoProducto);
            if(productoEncontrado!=null){
                actualizar(productoEncontrado);
            }else{
                guardar(producto);
            }
            
        }
    }

}
