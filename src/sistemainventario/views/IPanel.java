package sistemainventario.views;

import java.util.List;

public interface IPanel<T> {

    void guardar();
    void nuevo();
    void editar();
    void eliminar();
    void refrescarTablaPrincipal();
    void cargarTablaPrincipal(List<T> lista);
    void limpiar();
    void vistaCancelar();
    void selectDTO();
    void controlGetDTO();
    void controlSetDTO();
    void controlsEditable(boolean value);
}
