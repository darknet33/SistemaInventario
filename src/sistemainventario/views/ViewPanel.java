package sistemainventario.views;

import javax.swing.JPanel;
import javax.swing.JTable;

public abstract class ViewPanel<T> extends javax.swing.JPanel implements IPanel<T> {
    // Paneles comunes de la vista

    protected JPanel jpDatos;
    protected JPanel jpAction;
    protected JPanel jpActionSave;
    protected boolean isEdit;
    protected int idDTO;

    /**
     * Método para inicializar los paneles usados por las vistas. Este debe
     * llamarse en el constructor del panel hijo.
     */
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

    protected void vistaCancelar(JTable tblPrincipal) {
        if (isEdit) {
            cambiarVista(true, true, false);
            isEdit = false;
        } else {
            vistaInicial();
            tblPrincipal.clearSelection();
        }
    }

    private void cambiarVista(boolean datos, boolean Accion, boolean Guardar) {
        jpDatos.setVisible(datos);
        jpAction.setVisible(Accion);
        jpActionSave.setVisible(!Guardar);
    }
}
