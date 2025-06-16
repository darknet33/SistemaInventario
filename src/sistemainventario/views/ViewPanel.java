package sistemainventario.views;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import sistemainventario.dto.IDTO;
import sistemainventario.util.ModeloTablaBuilder;

public abstract class ViewPanel<T> extends javax.swing.JPanel implements IPanel<T> {

    protected JPanel jpDatos;
    protected JPanel jpAction;
    protected JPanel jpActionSave;
    protected boolean isEdit;
    protected int idDTO;
    protected ModeloTablaBuilder<T> builder = new ModeloTablaBuilder<>();
    protected T entidadDTO;
    protected List<T> listadoDTOS;

    protected void inicializarPaneles(JPanel datos, JPanel action, JPanel actionSave) {
        this.jpDatos = datos;
        this.jpAction = action;
        this.jpActionSave = actionSave;

        vistaInicial();
    }

    public void vistaInicial() {
        cambiarVista(false, false, false);
    }

    public void vistaNuevo() {
        isEdit = false;
        cambiarVista(true, false, true);
    }

    protected void vistaEditar() {
        isEdit = true;
        cambiarVista(true, false, true);
    }

    protected void vistaSeleccion() {
        isEdit = false;
        cambiarVista(true, true, false);
    }

    protected int obtenerID(JTable tblPrincipal) {
        int fila = tblPrincipal.getSelectedRow();
        if (fila == -1) {
            return 0;
        }
        return (Integer) tblPrincipal.getValueAt(fila, 0);
    }

    protected void vistaCancelar(JTable tblPrincipal, Runnable enabledControl) {
        if (isEdit) {
            cambiarVista(true, true, false);
            isEdit = false;
            enabledControl.run();
        } else {
            vistaInicial();
            tblPrincipal.clearSelection();
        }
    }

    protected void AnchoColumnaTabla(JTable tabla, int ancho, int nroColumna) {
        TableColumn columna0 = tabla.getColumnModel().getColumn(nroColumna - 1);

        // Fijar ancho mínimo, máximo y preferido
        columna0.setMinWidth(ancho);
        columna0.setMaxWidth(ancho);
        columna0.setPreferredWidth(ancho);
    }

    protected T obtenerEntidad(JTable tabla) {
        int id = obtenerID(tabla);

        return listadoDTOS.stream()
                .map(e -> (IDTO) e)   // hacer cast si T no extiende IDTO directamente
                .filter(e -> e.getPK()== id)
                .map(e -> (T) e)      // volver a castear al tipo original
                .findFirst()
                .orElse(null);
    }

    private void cambiarVista(boolean datos, boolean Accion, boolean Guardar) {
        jpDatos.setVisible(datos);
        jpAction.setVisible(Accion);
        jpActionSave.setVisible(Guardar);
    }

}
