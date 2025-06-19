package sistemainventario.views;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import sistemainventario.dto.IDTO;
import sistemainventario.util.ModeloTablaBuilder;

public abstract class ViewPanel<T extends IDTO> extends javax.swing.JPanel implements IPanel<T> {

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

    /**
     * Método template: construye y muestra la tabla
     */
    protected void CargarTabla(List<T> data, JTable table) {
        DefaultTableModel model = builder.construirModelo(
                getColumnNames(),
                data,
                this::toRow // referencia a método
        );
        table.setModel(model);
        AnchoColumnaTabla(table, 50, 1); // volemos el método de ancho si lo quieres común
    }

    protected void AnchoColumnaTabla(JTable tabla, int ancho, int nroColumna) {
        TableColumn columna0 = tabla.getColumnModel().getColumn(nroColumna - 1);

        // Fijar ancho mínimo, máximo y preferido
        columna0.setMinWidth(ancho);
        columna0.setMaxWidth(ancho);
        columna0.setPreferredWidth(ancho);
    }

    protected void obtenerEntidad(JTable tabla) {
        int id = obtenerID(tabla);
        entidadDTO = listadoDTOS.stream()
                .filter(e -> e.getPK() == id)
                .findFirst()
                .orElse(null);
    }

    private void cambiarVista(boolean datos, boolean Accion, boolean Guardar) {
        jpDatos.setVisible(datos);
        jpAction.setVisible(Accion);
        jpActionSave.setVisible(Guardar);
    }

    public void activarButton(JButton btn) {
        btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ENTER"), "presionar");

        btn.getActionMap().put("presionar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.doClick(); // Simula clic
            }
        });
    }

    public double sumarColumna(JTable tabla, int columnaIndex) {
        double suma = 0.0;

        for (int i = 0; i < tabla.getRowCount(); i++) {
            Object valor = tabla.getValueAt(i, columnaIndex);
            if (valor instanceof Number) {
                suma += ((Number) valor).doubleValue();
            } else {
                try {
                    suma += Double.parseDouble(valor.toString());
                } catch (NumberFormatException e) {
                    // Ignora valores no numéricos
                }
            }
        }

        return suma;
    }

    public void ocultarPestañas(JTabbedPane Pestañas) {
        Pestañas.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int runCount, int maxTabHeight) {
                return 0;
            }

            @Override
            protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
            }
        });
    }
    
    public void ventaAuxiliar(JPanel xPanel,String titulo){
        JFrame ventaAux=new JFrame(titulo);
        ventaAux.setLocationRelativeTo(null);
        ventaAux.setSize(950, 600);
        ventaAux.add(xPanel);
        ventaAux.setVisible(true);
    }

}
