package sistemainventario.controller;

import java.util.List;
import sistemainventario.util.Mensajes;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.services.CategoriaService;

public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController() {
        this.categoriaService = new CategoriaService();
    }
    
    public List<CategoriaDTO> listarCategoria(){
        return categoriaService.listarTodos();
    }
    
    public CategoriaDTO obtenerCategoria(int id){
        return categoriaService.obtenerPorId(id);
    }
    
    public boolean nuevaCategoria(CategoriaDTO categoria){
        try {
            categoriaService.guardar(categoria);
            Mensajes.info("Se guardo la Categoria Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }        
    }
    
    public boolean actulizarCategoria(CategoriaDTO categoria){
        try {
            categoriaService.actualizar(categoria);
            Mensajes.info("Se guardo los cambios Correctamente");
            return true;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }
        
    }
    
    public boolean eliminarCategoria(int id){
        try {
            if (Mensajes.confirmar("Seguro que desea eliminar la Categoria")==0){
                categoriaService.eliminar(id);            
                Mensajes.info("Se elimino correctamente el usuario");
                return true;
            }
            return false;
        } catch (Exception e) {
            Mensajes.errorValidaciones(e);
            return false;
        }        
    }
    
    
}
