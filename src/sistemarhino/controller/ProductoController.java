package sistemarhino.controller;

import java.util.List;
import sistemarhino.dto.ProductoDTO;
import sistemarhino.services.ProductoService;
import sistemarhino.util.Mensajes;

public class ProductoController {
    private final ProductoService productoService;

    public ProductoController() {
        this.productoService = new ProductoService();
    }

    public List<ProductoDTO> listarProductos() {
        return productoService.listarTodos();
    }
    
    public ProductoDTO obtenerProducto(int id){
        return productoService.obtenerPorId(id);
    }
    
    public boolean nuevaProducto(ProductoDTO producto){
        try {
            productoService.guardar(producto);
            Mensajes.info("Se guardo el producto Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
    
    public boolean actulizarProducto(ProductoDTO producto){
        try {
            productoService.actualizar(producto);
            Mensajes.info("Se guardo los cambios Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }
    
    public boolean eliminarProducto(int id){
        try {
            if (Mensajes.confirmar("Seguro que desea eliminar el Producto")==0){
                productoService.eliminar(id);            
                Mensajes.info("Se elimino correctamente el Producto");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }        
    }
}
