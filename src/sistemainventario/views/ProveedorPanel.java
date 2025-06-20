package sistemainventario.views;

import java.util.List;
import java.util.stream.Collectors;
import sistemainventario.controller.ProveedorController;
import sistemainventario.dto.ProveedorDTO;

public class ProveedorPanel extends ViewPanel<ProveedorDTO> {

    private final ProveedorController proveedorController;

    public ProveedorPanel() {
        this.proveedorController = new ProveedorController();
        initComponents();
        inicializarPaneles(jpDatos, jpAction, jpActionSave);
        refrescarTablaPrincipal();
        activarButton(btnBuscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnNuevo = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jpActionSave = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        lblNit = new javax.swing.JLabel();
        txtMateriales = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        txtContacto = new javax.swing.JTextField();
        lblContacto = new javax.swing.JLabel();
        lblMateriales = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(950, 600));

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        tblProveedor.setBackground(new java.awt.Color(255, 255, 255));
        tblProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProveedor.setForeground(new java.awt.Color(51, 51, 51));
        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProveedor.setGridColor(new java.awt.Color(255, 255, 255));
        tblProveedor.setRowHeight(20);
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/newProveedor.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        jpDatos.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(62, 62, 62))
        );
        jpActionSaveLayout.setVerticalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar))
        );

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
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(54, 54, 54))
        );
        jpActionLayout.setVerticalGroup(
            jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        lblNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNit.setForeground(new java.awt.Color(0, 153, 255));
        lblNit.setText("NIT:");

        txtMateriales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 153, 255));
        lblEmail.setText("Email");

        lblCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 153, 255));
        lblCelular.setText("Celular");

        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkEstado.setText("Estado");

        txtContacto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblContacto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContacto.setForeground(new java.awt.Color(0, 153, 255));
        lblContacto.setText("Contacto:");

        lblMateriales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMateriales.setForeground(new java.awt.Color(0, 153, 255));
        lblMateriales.setText("Materiales:");

        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpActionSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContacto)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblCelular)
                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNit)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lblMateriales)
                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpDatosLayout.createSequentialGroup()
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(chkEstado)
                            .addGap(3, 3, 3))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMateriales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNuevo)
                        .addGap(13, 13, 13)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addGroup(jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnNuevo))
                    .addGroup(jpContainerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpContainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        selectDTO();
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_btnNuevoMouseClicked

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado = txtBuscar.getText();
        CargarTabla(buscarClientes(valorBuscado),tblProveedor);
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMateriales;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMateriales;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void guardar() {
        controlSetDTO();

        boolean result = isEdit
                ? proveedorController.actualizarProveedor(entidadDTO)
                : proveedorController.nuevoProveedor(entidadDTO);

        if (result) {
            refrescarTablaPrincipal();
        }
    }

    @Override
    public void nuevo() {
        limpiar();
        vistaNuevo();
        entidadDTO = new ProveedorDTO();
    }

    @Override
    public void editar() {
        vistaEditar();
        controlsEditable(true);
    }

    @Override
    public void eliminar() {
        if (proveedorController.eliminarProveedor(entidadDTO.getId())) {
            refrescarTablaPrincipal();
        }
    }

    @Override
    public void cancelar() {
        vistaCancelar(tblProveedor, () -> selectDTO());
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{"ID", "Nombre", "Materiales"};
    }

    @Override
    public Object[] toRow(ProveedorDTO e) {
        return new Object[]{
            e.getId(), 
            e.getNombre(), 
            e.getMateriales()
        };
    }

    @Override
    public void refrescarTablaPrincipal() {
        listadoDTOS = proveedorController.listarProveedores();
        CargarTabla(listadoDTOS,tblProveedor);
        vistaInicial();
    }

    @Override
    public void limpiar() {
        txtNombre.setText("");
        txtNit.setText("");
        txtMateriales.setText("");
        txtContacto.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        chkEstado.setSelected(false);

        tblProveedor.clearSelection();

    }

    @Override
    public void selectDTO() {
        obtenerEntidad(tblProveedor);
        vistaSeleccion();
        controlGetDTO();
        controlsEditable(false);
    }

    @Override
    public void controlGetDTO() {
        txtNombre.setText(entidadDTO.getNombre());
        txtNit.setText(entidadDTO.getNit());
        txtMateriales.setText(entidadDTO.getMateriales());
        txtContacto.setText(entidadDTO.getContacto());
        txtCelular.setText(entidadDTO.getCelular());
        txtEmail.setText(entidadDTO.getEmail());
        chkEstado.setSelected(entidadDTO.getEstado());
    }

    @Override
    public void controlSetDTO() {
        entidadDTO.setNombre(txtNombre.getText());
        entidadDTO.setNit(txtNit.getText());
        entidadDTO.setMateriales(txtMateriales.getText());
        entidadDTO.setContacto(txtContacto.getText());
        entidadDTO.setCelular(txtCelular.getText());
        entidadDTO.setEmail(txtEmail.getText());
        entidadDTO.setEstado(chkEstado.isSelected());
    }

    @Override
    public void controlsEditable(boolean value) {
        txtNombre.setEditable(value);
        txtNit.setEditable(value);
        txtMateriales.setEditable(value);
        txtContacto.setEditable(value);
        txtCelular.setEditable(value);
        txtEmail.setEditable(value);
        chkEstado.setEnabled(value);
    }

    private List<ProveedorDTO> buscarClientes(String valorBuscado) {
        if (valorBuscado == null || valorBuscado.isEmpty()) {
            return listadoDTOS;
        }

        return listadoDTOS.stream()
                .filter(p -> p.toString().toLowerCase().contains(valorBuscado.toLowerCase()))
                .collect(Collectors.toList());
    }

}
