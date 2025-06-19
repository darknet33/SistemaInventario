package sistemainventario.views;

import java.util.List;

public interface IPanel<T> {

    void guardar();
    void nuevo();
    void editar();
    void eliminar();
    void cancelar();
    String[] getColumnNames();
    Object[] toRow(T e);
    void refrescarTablaPrincipal();
    void limpiar();    
    void selectDTO();
    void controlGetDTO();
    void controlSetDTO();
    void controlsEditable(boolean value);
}
