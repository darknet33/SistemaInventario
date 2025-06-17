package sistemainventario.views;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import sistemainventario.controller.RolController;
import sistemainventario.controller.UsuarioController;
import sistemainventario.dto.RolDTO;
import sistemainventario.dto.UsuarioDTO;

public class UsuarioPanel extends ViewPanel<UsuarioDTO> {
    private final UsuarioController usuarioController;
    private final RolController rolController;
    private List<RolDTO> roles;
    
    public UsuarioPanel() {
        this.usuarioController=new UsuarioController();
        this.rolController=new RolController();
        initComponents();
        inicializarPaneles(jpDatos, jpAction, jpActionSave);
        refrescarTablaPrincipal();
        cargarRoles();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        cboRol = new javax.swing.JComboBox<>();
        lblCargo1 = new javax.swing.JLabel();
        jpActionSave = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 600));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/newUsuario.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        jpDatos.setBackground(new java.awt.Color(255, 255, 255));

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 153, 255));
        lblUserName.setText("Usuario");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(0, 153, 255));
        lblContrasenia.setText("Contraseña");

        txtContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre1.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(0, 153, 255));
        lblCargo.setText("Cargo");

        txtCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cboRol.setBackground(new java.awt.Color(255, 255, 255));
        cboRol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboRol.setForeground(new java.awt.Color(51, 51, 51));

        lblCargo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCargo1.setForeground(new java.awt.Color(0, 153, 255));
        lblCargo1.setText("Rol");

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
                .addGap(82, 82, 82)
                .addGroup(jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(85, Short.MAX_VALUE))
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
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(83, 83, 83))
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

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkEstado.setText("Estado");

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblContrasenia)
                            .addComponent(lblNombre1)
                            .addComponent(lblCargo)
                            .addComponent(lblCargo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEstado)
                            .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpDatosLayout.createSequentialGroup()
                                    .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addGap(97, 97, 97))
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                                    .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cboRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre))
                                    .addGap(50, 50, 50))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenia))
                .addGap(15, 15, 15)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1))
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tblUsuarios.setRowHeight(30);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        cancelar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        selectDTO();
    }//GEN-LAST:event_tblUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JComboBox<String> cboRol;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

@Override
    public void guardar() {
        controlSetDTO();

        boolean result = isEdit
                ? usuarioController.actualizarUsuario(entidadDTO)
                : usuarioController.nuevoUsuario(entidadDTO);

        if (result) {
             refrescarTablaPrincipal();
        }
    }

    @Override
    public void nuevo() {
        limpiar();
        vistaNuevo();
        entidadDTO = new UsuarioDTO();
    }

    @Override
    public void editar() {
        vistaEditar();
        controlsEditable(true);
    }

    @Override
    public void eliminar() {
        if (usuarioController.eliminarUsuario(entidadDTO.getId())) {
             refrescarTablaPrincipal();
        }
    }
    
    @Override
    public void cancelar(){
        vistaCancelar(tblUsuarios,()->selectDTO());
    }
    
    @Override
    public void refrescarTablaPrincipal(){
        listadoDTOS = usuarioController.listarUsuarios();
        cargarTablaPrincipal(listadoDTOS);
        vistaInicial();
    }

    @Override
    public void cargarTablaPrincipal(List<UsuarioDTO> lista) {
        String[] columnas = {"ID", "Usuario", "Nombre y Apellido","Rol","Estado"};
        
        DefaultTableModel modelo = builder.construirModelo(columnas, lista,
                e -> new Object[]{e.getId(), e.getUsername(),e.getNombres() + " " + e.getApellidos(),e.getRol().getNombre(),e.getEstado()? "ON":"OFF"}
        );

        tblUsuarios.setModel(modelo);
        AnchoColumnaTabla(tblUsuarios, 50, 1);
    }

    @Override
    public void limpiar() {
        txtUsername.setText("");
        txtContrasenia.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCargo.setText("");
        cboRol.setSelectedIndex(0);
        chkEstado.setSelected(false);

        tblUsuarios.clearSelection();
    }

    @Override
    public void selectDTO() {        
        entidadDTO = obtenerEntidad(tblUsuarios);
        vistaSeleccion();
        controlGetDTO();
        controlsEditable(false);
    }
   
    @Override
    public void controlGetDTO() {
        txtUsername.setText(entidadDTO.getUsername());
        txtContrasenia.setText(entidadDTO.getPassword());
        txtNombre.setText(entidadDTO.getNombres());
        txtApellido.setText(entidadDTO.getApellidos());
        txtCargo.setText(entidadDTO.getCargo());
        cboRol.setSelectedItem(entidadDTO.getRol().getNombre());
        chkEstado.setSelected(entidadDTO.getEstado());
    }

    @Override
    public void controlSetDTO() {
        entidadDTO.setUsername(txtUsername.getText());
        entidadDTO.setPassword(txtContrasenia.getText());
        entidadDTO.setNombres(txtNombre.getText());
        entidadDTO.setApellidos(txtApellido.getText());
        entidadDTO.setCargo(txtCargo.getText());
        entidadDTO.setRol(obtenerRol((String)cboRol.getSelectedItem()));
        entidadDTO.setEstado(chkEstado.isSelected());
    }

    @Override
    public void controlsEditable(boolean value) {
        txtUsername.setEditable(value);
        txtContrasenia.setEditable(value);
        txtNombre.setEditable(value);
        txtApellido.setEditable(value);
        txtCargo.setEditable(value);
        cboRol.setEnabled(value);
        chkEstado.setEnabled(value);
    }
    
    private void cargarRoles(){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        roles=rolController.listarRoles();
        roles.forEach(e -> modelo.addElement(e.toString()));
        cboRol.setModel(modelo);
    }
    
    private RolDTO obtenerRol(String nombre){
        return roles.stream()
                .filter(e->e.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
