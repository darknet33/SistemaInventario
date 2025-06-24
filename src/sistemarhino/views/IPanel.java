package sistemarhino.views;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

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
