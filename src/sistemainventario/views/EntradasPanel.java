package sistemainventario.views;

import javax.swing.table.DefaultTableModel;


public class EntradasPanel extends javax.swing.JPanel {


    public EntradasPanel() {
        initComponents();
        //jtpPestanias.setUI(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPestanias = new javax.swing.JTabbedPane();
        jpCompras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        btnNuevo = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        jpComprasRegistro = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        cboProveedores = new javax.swing.JComboBox<>();
        lblComprobante = new javax.swing.JLabel();
        cboComprobantes = new javax.swing.JComboBox<>();
        lblNroComprobante = new javax.swing.JLabel();
        txtNroComprobante = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cboEstados = new javax.swing.JComboBox<>();
        btnBuscarProductos = new javax.swing.JButton();
        txtBuscarProductos = new javax.swing.JTextField();
        cboProductos = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnQuitar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        jpActionSave = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(950, 600));

        jtpPestanias.setName(""); // NOI18N

        jpCompras.setBackground(new java.awt.Color(255, 255, 255));

        tblCompras.setBackground(new java.awt.Color(255, 255, 255));
        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCompras);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/newCompra.png"))); // NOI18N
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setIconTextGap(50);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

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
            .addGroup(jpActionLayout.createSequentialGroup()
                .addGroup(jpActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpComprasLayout = new javax.swing.GroupLayout(jpCompras);
        jpCompras.setLayout(jpComprasLayout);
        jpComprasLayout.setHorizontalGroup(
            jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComprasLayout.createSequentialGroup()
                .addGroup(jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpComprasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpComprasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jpComprasLayout.setVerticalGroup(
            jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComprasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPestanias.addTab("Compras", jpCompras);

        jpComprasRegistro.setBackground(new java.awt.Color(255, 255, 255));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 153, 255));
        lblFecha.setText("Fecha:");

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFecha.setName(""); // NOI18N

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(0, 153, 255));
        lblProveedor.setText("Proveedor:");

        cboProveedores.setBackground(new java.awt.Color(255, 255, 255));
        cboProveedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblComprobante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblComprobante.setForeground(new java.awt.Color(0, 153, 255));
        lblComprobante.setText("Comprobante:");

        cboComprobantes.setBackground(new java.awt.Color(255, 255, 255));
        cboComprobantes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNroComprobante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNroComprobante.setForeground(new java.awt.Color(0, 153, 255));
        lblNroComprobante.setText("Nro Comprobante:");

        txtNroComprobante.setBackground(new java.awt.Color(255, 255, 255));
        txtNroComprobante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 153, 255));
        lblEstado.setText("Estado:");

        cboEstados.setBackground(new java.awt.Color(255, 255, 255));
        cboEstados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBuscarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnBuscar.png"))); // NOI18N
        btnBuscarProductos.setBorder(null);
        btnBuscarProductos.setOpaque(false);
        btnBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductosActionPerformed(evt);
            }
        });

        txtBuscarProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cboProductos.setBackground(new java.awt.Color(255, 255, 255));
        cboProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 153, 255));
        lblCantidad.setText("Cantidad");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(0, 153, 255));
        lblCosto.setText("Costo");

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDetalle);

        btnQuitar.setBackground(new java.awt.Color(255, 255, 255));
        btnQuitar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnQuitar.png"))); // NOI18N
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQuitar.setIconTextGap(50);
        btnQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitarMouseClicked(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/contenedor/btnAgregar.png"))); // NOI18N
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setIconTextGap(50);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        jpActionSave.setOpaque(false);

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

        javax.swing.GroupLayout jpActionSaveLayout = new javax.swing.GroupLayout(jpActionSave);
        jpActionSave.setLayout(jpActionSaveLayout);
        jpActionSaveLayout.setHorizontalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpActionSaveLayout.setVerticalGroup(
            jpActionSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionSaveLayout.createSequentialGroup()
                .addComponent(btnGuardar)
                .addGap(12, 12, 12)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 153, 255));
        lblTotal.setText("Total");

        javax.swing.GroupLayout jpComprasRegistroLayout = new javax.swing.GroupLayout(jpComprasRegistro);
        jpComprasRegistro.setLayout(jpComprasRegistroLayout);
        jpComprasRegistroLayout.setHorizontalGroup(
            jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComprasRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                .addComponent(lblProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNroComprobante))
                            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComprobante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNroComprobante)
                            .addComponent(cboComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                        .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarProductos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidad)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                        .addComponent(lblCosto)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComprasRegistroLayout.createSequentialGroup()
                                .addGap(0, 95, Short.MAX_VALUE)
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jpComprasRegistroLayout.setVerticalGroup(
            jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblProveedor))
                            .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComprobante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroComprobante))
                        .addGap(1, 1, 1)))
                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarProductos)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(lblCosto)))
                    .addGroup(jpComprasRegistroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar)
                        .addComponent(btnQuitar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpComprasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpPestanias.addTab("Registros", jpComprasRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpPestanias)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpPestanias))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        vistaGuardar(true);
        limpiar();
        //compraDTO=null;
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked

    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductosActionPerformed

    private void btnQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        jtpPestanias.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarMouseClicked
    private void limpiar() {
        txtFecha.setText("");
        cboProveedores.setSelectedItem(0);
        cboComprobantes.setSelectedItem(0);
        txtNroComprobante.setText("");
        cboEstados.setSelectedItem(0);

        txtBuscarProductos.setText("");
        limpiarDetalle();

        cboProductos.setSelectedItem(0);
        txtCantidad.setText("");
        txtTotal.setText("");

        //comprasDTO=null;
        tblCompras.clearSelection();

    }

    public void limpiarDetalle() {
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
        modelo.setRowCount(0); // Limpia filas
    }

    private void vista(Boolean bool) {
        //jpDatos.setVisible(bool);
        jpAction.setVisible(bool);
        jpActionSave.setVisible(bool);
    }

    private void vistaGuardar(Boolean bool) {
        //jpDatos.setVisible(bool);
        jpAction.setVisible(!bool);
        jpActionSave.setVisible(bool);
        cEditable(true);
        jtpPestanias.setSelectedIndex(1);
    }

    private void vistaEditDel(Boolean bool) {
        // jpDatos.setVisible(bool);
        jpAction.setVisible(bool);
        jpActionSave.setVisible(!bool);

        cEditable(false);
    }

    private void cargaDTO() {
        /*txtFecha.setText(productoDTO.getCodigo());
        cboProveedores.setSelectedItem(productoDTO.getCategoria().getNombre());
        cboComprobantes.setSelectedItem(productoDTO.getCategoria().getNombre());
        txtNroComprobante.setText(productoDTO.getMarca());
        cboEstados.setSelectedItem(productoDTO.getCategoria().getNombre());*/
    }

    private void cEditable(Boolean value) {
        txtFecha.setEditable(value);
        cboProveedores.setEnabled(value);
        cboComprobantes.setEditable(value);
        txtNroComprobante.setEditable(value);
        cboEstados.setEditable(value);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnQuitar;
    private javax.swing.JComboBox<String> cboComprobantes;
    private javax.swing.JComboBox<String> cboEstados;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JComboBox<String> cboProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpCompras;
    private javax.swing.JPanel jpComprasRegistro;
    private javax.swing.JTabbedPane jtpPestanias;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblComprobante;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNroComprobante;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtBuscarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNroComprobante;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
