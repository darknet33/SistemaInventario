package sistemainventario.services;

import java.util.List;

public interface IService<T, ID> {
    T obtenerPorId(ID id);
    List<T> listarTodos();
    void guardar(T dto);
    void actualizar(T dto);
    void eliminar(ID id);
}
