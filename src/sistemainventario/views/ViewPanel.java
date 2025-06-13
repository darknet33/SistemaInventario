package sistemainventario.views;

import javax.swing.JPanel;

public abstract class ViewPanel <T> extends javax.swing.JPanel implements IPanel<T> {
    // Paneles comunes de la vista

    protected JPanel jpDatos;
    protected JPanel jpAction;
    protected JPanel jpActionSave;

    /**
     * Método para inicializar los paneles usados por las vistas. Este debe
     * llamarse en el constructor del panel hijo.
     */
    protected void inicializarPaneles(JPanel datos, JPanel action, JPanel actionSave) {
        this.jpDatos = datos;
        this.jpAction = action;
        this.jpActionSave = actionSave;
    }

    /**
     * Muestra u oculta todos los paneles principales.
     */
    protected void vistaInicial(boolean mostrar) {
        jpDatos.setVisible(mostrar);
        jpAction.setVisible(mostrar);
        jpActionSave.setVisible(mostrar);
    }

    /**
     * Activa la vista de guardado (para nuevo o edición).
     */
    protected void vistaGuardar(boolean mostrar, Runnable controlEditable) {
        jpDatos.setVisible(mostrar);
        jpAction.setVisible(!mostrar);
        jpActionSave.setVisible(mostrar);
        controlEditable.run(); // Define qué campos son editables
    }

    /**
     * Activa la vista de edición o eliminación.
     */
    protected void vistaEditDel(boolean mostrar, Runnable controlEditable) {
        jpDatos.setVisible(mostrar);
        jpAction.setVisible(mostrar);
        jpActionSave.setVisible(!mostrar);
        controlEditable.run(); // Define qué campos son editables
    }
}
