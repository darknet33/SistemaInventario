package sistemainventario.views;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import sistemainventario.controller.IImportableController;
import sistemainventario.dto.IDTO;
import sistemainventario.mappers.ExcelMappable;
import sistemainventario.util.ExcelUtil;
import sistemainventario.util.Mensajes;
import sistemainventario.util.ModeloTablaBuilder;
import sistemainventario.util.Sesion;

public abstract class ViewPanel<T extends IDTO> extends javax.swing.JPanel implements IPanel<T> {

    protected JPanel jpDatos;
    protected JPanel jpAction;
    protected JPanel jpActionSave;
    protected boolean isEdit;
    protected int idDTO;
    protected ModeloTablaBuilder<T> builder = new ModeloTablaBuilder<>();
    protected T entidadDTO;
    protected IImportableController<T> controller;
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

    public void ventaAuxiliar(JPanel xPanel, String titulo) {
        JFrame ventaAux = new JFrame(titulo);
        ventaAux.setLocationRelativeTo(null);
        ventaAux.setSize(950, 600);
        ventaAux.add(xPanel);
        ventaAux.setVisible(true);
    }

    protected boolean accesoFuncionesEspeciales() {
        if (Sesion.getUsuario().getRol().getId() != 1) {
            Mensajes.advertencia("Solo los usuarios con rango Administrador tiene acceso a esta funcion");
            return false;
        }
        return true;
    }

    protected boolean importarDesdeExcel(ExcelMappable<T> mapper) {
        if (!accesoFuncionesEspeciales()) return false;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo Excel");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx"));

        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            try {
                List<T> datos = ExcelUtil.importFromExcel(archivo, mapper);

                if (controller instanceof IImportableController) {
                    IImportableController<T> importable = (IImportableController<T>) controller;
                    importable.importar(datos, Sesion.getUsuario());
                    return true;
                } else {
                    Mensajes.advertencia("Este módulo no admite importación.");
                    return false;
                }

            } catch (Exception ex) {
                Mensajes.errorValidaciones(ex);
                return false;
            }
        }

        return false; // El usuario canceló el diálogo
    }

    protected boolean exportarAExcel(List<T> datos, ExcelMappable<T> mapper, String nombreSugerido) {

        if (!accesoFuncionesEspeciales()) return false;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo Excel");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos Excel (*.xlsx)", "xlsx"));
        fileChooser.setSelectedFile(new File(nombreSugerido + ".xlsx"));

        int resultado = fileChooser.showSaveDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            // Asegurarse de que tenga extensión .xlsx
            if (!archivo.getName().toLowerCase().endsWith(".xlsx")) {
                archivo = new File(archivo.getAbsolutePath() + ".xlsx");
            }

            try {
                ExcelUtil.exportToExcel(datos, mapper, archivo.getAbsolutePath());
                Mensajes.info("Archivo exportado correctamente:\n" + archivo.getAbsolutePath());
                return true;
            } catch (Exception ex) {
                Mensajes.errorValidaciones(ex);
                return false;
            }
        }

        return false; // El usuario canceló
    }

}
