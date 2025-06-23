package sistemainventario.views;

import java.util.*;
import java.util.stream.Collectors;
import javax.swing.*;
import sistemainventario.controller.CategoriaController;
import sistemainventario.controller.ProductoController;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.util.Sesion;
import sistemainventario.util.Texto;

public final class ProductosPanel extends ViewPanel<ProductoDTO> {

    private final CategoriaController categoriaController;
    private final ProductoController productoController;
    private List<CategoriaDTO> categorias;

    public ProductosPanel() {
        this.productoController = new ProductoController();
        this.categoriaController = new CategoriaController();
        initComponents();
        inicializarPaneles(jpDatos, jpAction, jpActionSave);
        refrescarTablaPrincipal();
        cargarCategorias();

        activarButton(btnBuscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContainer = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jpDatos = new javax.swing.JPanel();
        jpActionSave = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnRefreshCategoria = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblUltimamodificacion = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblProcedencia = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtProcedencia = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtStockInicial = new javax.swing.JTextField();
        txtStockMinimo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblStockMinimo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        cboCategoria = new javax.swing.JComboBox<>();
        lblStockInicial1 = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        lblFechaActualizado = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        cboCriterio = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 600));

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/newProducto.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        tblProducto.setBackground(new java.awt.Color(255, 255, 255));
        tblProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProducto.setForeground(new java.awt.Color(51, 51, 51));
        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProducto.setGridColor(new java.awt.Color(255, 255, 255));
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblProducto);

        jpDatos.setOpaque(false);
        jpDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpActionSave.setOpaque(false);

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setIconTextGap(1);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setIconTextGap(1);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpActionSaveLayout = new javax.swing.GroupLayout(jpActionSave);
        jpActionSave.setLayout(jpActionSaveLayout);
        jpActionSaveLayout.setHorizontalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpActionSaveLayout.setVerticalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpDatos.add(jpActionSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 180, 90));

        jpAction.setOpaque(false);

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/Editar.png"))); // NOI18N
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.setIconTextGap(50);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/Eliminar.png"))); // NOI18N
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setIconTextGap(50);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpActionLayout = new javax.swing.GroupLayout(jpAction);
        jpAction.setLayout(jpActionLayout);
        jpActionLayout.setHorizontalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(16, 16, 16))
        );
        jpActionLayout.setVerticalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
        );

        jpDatos.add(jpAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 100, 70));

        btnRefreshCategoria.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshCategoria.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnRefreshCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnRecargar.png"))); // NOI18N
        btnRefreshCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRefreshCategoria.setIconTextGap(50);
        btnRefreshCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshCategoriaMouseClicked(evt);
            }
        });
        jpDatos.add(btnRefreshCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 153, 255));
        lblMarca.setText("Marca");
        jpDatos.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        lblUltimamodificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUltimamodificacion.setForeground(new java.awt.Color(0, 153, 255));
        lblUltimamodificacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUltimamodificacion.setText("Ultima Modificacion:");
        jpDatos.add(lblUltimamodificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 400, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 153, 255));
        lblDescripcion.setText("Descripcion");
        jpDatos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblProcedencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProcedencia.setForeground(new java.awt.Color(0, 153, 255));
        lblProcedencia.setText("Procedencia");
        jpDatos.add(lblProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 260, 34));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 153, 255));
        lblCategoria.setText("Categoria");
        jpDatos.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        txtProcedencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 260, 34));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 166, 34));

        txtStockInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtStockInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 166, 34));

        txtStockMinimo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 166, 34));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 153, 255));
        lblCodigo.setText("Codigo");
        jpDatos.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 10, 140, 34));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpDatos.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 620, 34));

        lblStockMinimo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStockMinimo.setForeground(new java.awt.Color(0, 153, 255));
        lblStockMinimo.setText("Stock Minimo (Unid.)");
        jpDatos.add(lblStockMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        lblPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(0, 153, 255));
        lblPeso.setText("Peso (Kg)");
        jpDatos.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkEstado.setForeground(new java.awt.Color(0, 153, 255));
        chkEstado.setText("Estado");
        jpDatos.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 160, -1));

        cboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jpDatos.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 34));

        lblStockInicial1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStockInicial1.setForeground(new java.awt.Color(0, 153, 255));
        lblStockInicial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStockInicial1.setText("Stock Inicial (Unid.)");
        jpDatos.add(lblStockInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, -1));

        lblFechaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(0, 153, 255));
        lblFechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaRegistro.setText("Fecha Registro:");
        jpDatos.add(lblFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 400, -1));

        lblFechaActualizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaActualizado.setForeground(new java.awt.Color(0, 153, 255));
        lblFechaActualizado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaActualizado.setText("Fecha Actualizacion:");
        jpDatos.add(lblFechaActualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 400, -1));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 153, 255));
        lblBuscar.setText("Buscar");

        cboCriterio.setBackground(new java.awt.Color(255, 255, 255));
        cboCriterio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboCriterio.setForeground(new java.awt.Color(51, 51, 51));
        cboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripcion", "Categoria", "Marca", "Procedencia", "Codigo" }));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(71, 71, 71))))
            .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addGap(36, 36, 36)))
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscar)
                        .addComponent(cboCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpContainerLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGap(356, 356, 356)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        selectDTO();
    }//GEN-LAST:event_tblProductoMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        cancelar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnRefreshCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshCategoriaMouseClicked
        cargarCategorias();
    }//GEN-LAST:event_btnRefreshCategoriaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado=txtBuscar.getText().strip();
        String criterio=cboCriterio.getSelectedItem().toString();
        CargarTabla(buscarProducto(valorBuscado, criterio),tblProducto);
        vistaInicial();
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnRefreshCategoria;
    private javax.swing.JComboBox<CategoriaDTO> cboCategoria;
    private javax.swing.JComboBox<String> cboCriterio;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaActualizado;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblProcedencia;
    private javax.swing.JLabel lblStockInicial1;
    private javax.swing.JLabel lblStockMinimo;
    private javax.swing.JLabel lblUltimamodificacion;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtStockInicial;
    private javax.swing.JTextField txtStockMinimo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void guardar() {
        controlSetDTO();

        boolean result = isEdit
                ? productoController.actulizarProducto(entidadDTO)
                : productoController.nuevaProducto(entidadDTO);

        if (result) {
            refrescarTablaPrincipal();
        }
    }

    @Override
    public void nuevo() {
        limpiar();
        vistaNuevo();
        entidadDTO = new ProductoDTO();
    }

    @Override
    public void editar() {
        vistaEditar();
        controlsEditable(true);
    }

    @Override
    public void eliminar() {
        if (productoController.eliminarProducto(entidadDTO.getId())) {
            refrescarTablaPrincipal();
        }
    }

    @Override
    public void cancelar() {
        vistaCancelar(tblProducto, () -> selectDTO());
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{"ID", "Codigo", "Categoria", "Descripcion", "Marca", "Stock", "Minimo", "Estado"};
    }

    @Override
    public Object[] toRow(ProductoDTO e) {
        return new Object[]{
            e.getId(),
            e.getCodigo(),
            e.getCategoria().getNombre(),
            e.getDescripcion(), 
            e.getMarca(), 
            e.getStockActual(),
            e.getStockMinimo(),
            (e.getEstado() ? "ON" : "OFF")
        };
    }

    @Override
    public void refrescarTablaPrincipal() {
        listadoDTOS = productoController.listarProductos();
        CargarTabla(listadoDTOS,tblProducto);
        vistaInicial();
    }

    @Override
    public void limpiar() {
        txtCodigo.setText("");
        cboCategoria.setSelectedIndex(0);
        txtDescripcion.setText("");
        txtMarca.setText("");
        txtProcedencia.setText("");
        txtPeso.setText("-");
        txtStockInicial.setText("0");
        txtStockMinimo.setText("0");

        tblProducto.clearSelection();
        controlsEditable(true);
    }

    @Override
    public void selectDTO() {
        obtenerEntidad(tblProducto);
        vistaSeleccion();
        controlGetDTO();
        controlsEditable(false);
    }

    @Override
    public void controlGetDTO() {
        txtCodigo.setText(entidadDTO.getCodigo());
        cboCategoria.setSelectedItem(entidadDTO.getCategoria());
        txtDescripcion.setText(entidadDTO.getDescripcion());
        txtMarca.setText(entidadDTO.getMarca());
        txtProcedencia.setText(entidadDTO.getProcedencia());
        txtPeso.setText(entidadDTO.getPeso());
        txtStockInicial.setText("" + entidadDTO.getStockInicial());
        txtStockMinimo.setText("" + entidadDTO.getStockMinimo());
        chkEstado.setSelected(entidadDTO.getEstado());
        lblFechaRegistro.setText("Fecha Registro: " + entidadDTO.getFechaRegistro().toString());
        lblFechaActualizado.setText("Fecha Actualizacion: " + entidadDTO.getFechaActualizado().toString());
        lblUltimamodificacion.setText("Ultima Modificacion: " + entidadDTO.getUsuario().getNombres() + " " + entidadDTO.getUsuario().getApellidos());

    }

    @Override
    public void controlSetDTO() {
        CategoriaDTO categoria = (CategoriaDTO) cboCategoria.getSelectedItem();

        entidadDTO.setCodigo(txtCodigo.getText().toUpperCase().strip());
        entidadDTO.setCategoria(categoria);
        entidadDTO.setDescripcion(Texto.capitalizeTexto(txtDescripcion.getText().strip()));
        entidadDTO.setPeso(txtPeso.getText().strip());
        entidadDTO.setProcedencia(Texto.capitalizeTexto(txtProcedencia.getText().strip()));
        entidadDTO.setMarca(txtMarca.getText().toUpperCase().strip());
        entidadDTO.setStockInicial(txtStockInicial.getText().strip());
        entidadDTO.setStockActual(txtStockInicial.getText().strip());
        entidadDTO.setStockMinimo(txtStockMinimo.getText().strip());
        entidadDTO.setEstado(chkEstado.isSelected());
        entidadDTO.setUsuario(Sesion.getUsuario());
    }

    @Override
    public void controlsEditable(boolean value) {
        txtCodigo.setEditable(value);
        cboCategoria.setEnabled(value);
        txtDescripcion.setEditable(value);
        txtMarca.setEditable(value);
        txtProcedencia.setEditable(value);
        txtPeso.setEditable(value);
        txtStockInicial.setEditable(value);
        txtStockMinimo.setEditable(value);
        chkEstado.setEnabled(value);
    }

    public void cargarCategorias() {
        categorias=categoriaController.listarCategoria();
        DefaultComboBoxModel<CategoriaDTO> modelo = new DefaultComboBoxModel<>();
        categorias.forEach(modelo::addElement);
        cboCategoria.setModel(modelo);
    }

    public CategoriaDTO buscarCategoria(String Nombre) {
        return categorias.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(Nombre))
                .findFirst()
                .orElse(null);
    }

    private List<ProductoDTO> buscarProducto(String valorBuscado, String criterioBusqueda) {
        if (valorBuscado == null || valorBuscado.isEmpty()) {
            return listadoDTOS;
        }

        String valor = valorBuscado.toLowerCase();

        return listadoDTOS.stream()
                .filter(p -> {
                    switch (criterioBusqueda.toLowerCase()) {
                        case "codigo":
                            return p.getCodigo().toLowerCase().contains(valor);
                        case "descripcion":
                            return p.getDescripcion().toLowerCase().contains(valor);
                        case "categoria":
                            return p.getCategoria().getNombre().toLowerCase().contains(valor);
                        case "marca":
                            return p.getMarca().toLowerCase().contains(valor);
                        case "procedencia":
                            return p.getProcedencia().toLowerCase().contains(valor);
                        default:
                            return false;
                    }
                })
                .collect(Collectors.toList());
    }

}
