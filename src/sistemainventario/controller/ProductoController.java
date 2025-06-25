package sistemainventario.controller;

import java.io.File;
import java.util.List;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.services.ProductoService;
import sistemainventario.util.Mensajes;

public class ProductoController implements IImportableController<ProductoDTO> {

    private final ProductoService productoService;

    public ProductoController() {
        this.productoService = new ProductoService();
    }

    public List<ProductoDTO> listarProductos() {
        return productoService.listarTodos();
    }

    public ProductoDTO obtenerProducto(int id) {
        return productoService.obtenerPorId(id);
    }

    public boolean nuevaProducto(ProductoDTO producto) {
        try {
            productoService.guardar(producto);
            Mensajes.info("Se guardo el producto Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean actulizarProducto(ProductoDTO producto) {
        try {
            productoService.actualizar(producto);
            Mensajes.info("Se guardo los cambios Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
    }

    public boolean eliminarProducto(int id) {
        try {
            if (Mensajes.confirmar("Seguro que desea eliminar el Producto") == 0) {
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

    @Override
    public void importar(List<ProductoDTO> datos, UsuarioDTO usuario) {
        try {
            productoService.importar(datos, usuario);
            Mensajes.info("Productos importados correctamente.");
        } catch (Exception ex) {
            Mensajes.errorValidaciones(ex);
        }
    }

}
