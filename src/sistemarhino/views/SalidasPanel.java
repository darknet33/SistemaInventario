package sistemarhino.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import sistemarhino.controller.VentaController;
import sistemarhino.controller.ComprobanteController;
import sistemarhino.controller.EstadoController;
import sistemarhino.controller.ProductoController;
import sistemarhino.controller.ClienteController;
import sistemarhino.dto.ComprobanteDTO;
import sistemarhino.dto.EstadoDTO;
import sistemarhino.dto.ProductoDTO;
import sistemarhino.dto.ClienteDTO;
import sistemarhino.dto.VentaDTO;
import sistemarhino.dto.VentaDetalleDTO;
import sistemarhino.util.Mensajes;
import sistemarhino.util.ModeloTablaBuilder;
import sistemarhino.util.Sesion;

public class SalidasPanel extends ViewPanel<VentaDTO> implements IPanelDetalle<VentaDetalleDTO>{
    
    private final ClienteController clienteController = new ClienteController();
    private List<ClienteDTO> clienteesDTOS;
    private final ComprobanteController comprobanteController = new ComprobanteController();
    private List<ComprobanteDTO> comprobantesDTOS;
    private final EstadoController estadoController = new EstadoController();
    private List<EstadoDTO> estadosDTOS;

    private final ProductoController productoController = new ProductoController();
    private List<ProductoDTO> produtoDTOS;

    private final VentaController ventaController;
    private ModeloTablaBuilder<VentaDetalleDTO> builderDetails = new ModeloTablaBuilder<>();
    private List<VentaDetalleDTO> listaDetalle;
    
    public SalidasPanel() {
        this.ventaController = new VentaController();
        initComponents();
        refrescarTablaPrincipal();
        cargarClientees();
        cargarComprobantes();
        cargarEstados();
        cargarProductos();
        ocultarPestañas(jtpPestanias);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPestanias = new javax.swing.JTabbedPane();
        jpVentas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnNuevo = new javax.swing.JLabel();
        jpAction = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        jpVentasRegistro = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        cboClientes = new javax.swing.JComboBox();
        lblComprobante = new javax.swing.JLabel();
        cboComprobantes = new javax.swing.JComboBox();
        lblNroComprobante = new javax.swing.JLabel();
        txtNroComprobante = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cboEstados = new javax.swing.JComboBox();
        btnBuscarProductos = new javax.swing.JButton();
        txtBuscarProductos = new javax.swing.JTextField();
        cboProductos = new javax.swing.JComboBox();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnQuitar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        jpActionSave = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JTextField();
        lblImpuesto = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();

        jtpPestanias.setName(""); // NOI18N

        jpVentas.setBackground(new java.awt.Color(255, 255, 255));

        tblVentas.setBackground(new java.awt.Color(255, 255, 255));
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVentas);

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

        javax.swing.GroupLayout jpVentasLayout = new javax.swing.GroupLayout(jpVentas);
        jpVentas.setLayout(jpVentasLayout);
        jpVentasLayout.setHorizontalGroup(
            jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentasLayout.createSequentialGroup()
                .addGroup(jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpAction, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVentasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpVentasLayout.setVerticalGroup(
            jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPestanias.addTab("Venta", jpVentas);

        jpVentasRegistro.setBackground(new java.awt.Color(255, 255, 255));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 153, 255));
        lblFecha.setText("Fecha:");

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFecha.setName(""); // NOI18N

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(0, 153, 255));
        lblProveedor.setText("Cliente");

        cboClientes.setBackground(new java.awt.Color(255, 255, 255));
        cboClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
        lblCosto.setText("Precio");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        txtImpuesto.setBackground(new java.awt.Color(255, 255, 255));
        txtImpuesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblImpuesto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImpuesto.setForeground(new java.awt.Color(0, 153, 255));
        lblImpuesto.setText("% Impuesto");

        lblDescuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(0, 153, 255));
        lblDescuento.setText("% Descuento");

        txtDescuento.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpVentasRegistroLayout = new javax.swing.GroupLayout(jpVentasRegistro);
        jpVentasRegistro.setLayout(jpVentasRegistroLayout);
        jpVentasRegistroLayout.setHorizontalGroup(
            jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVentasRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                        .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarProductos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidad)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCosto)
                                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnQuitar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVentasRegistroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                .addComponent(lblImpuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(lblDescuento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                                .addComponent(lblEstado))
                            .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFecha)
                                    .addComponent(lblProveedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                        .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNroComprobante))
                                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblComprobante)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEstados, 0, 178, Short.MAX_VALUE)
                            .addComponent(txtNroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboComprobantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        jpVentasRegistroLayout.setVerticalGroup(
            jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProveedor)))
                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComprobante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNroComprobante))
                        .addGap(1, 1, 1)))
                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblImpuesto)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDescuento))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtBuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarProductos)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(lblCosto)))
                    .addGroup(jpVentasRegistroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar)
                        .addComponent(btnQuitar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVentasRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpActionSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jtpPestanias.addTab("Registros", jpVentasRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPestanias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPestanias)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        selectDTO();
    }//GEN-LAST:event_tblVentasMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductosActionPerformed
        String valorBuscado=txtBuscarProductos.getText().toLowerCase().strip();
        buscarProductos(valorBuscado);
    }//GEN-LAST:event_btnBuscarProductosActionPerformed

    private void btnQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseClicked
        int fila = tblDetalle.getSelectedRow();
        if (fila == -1) {
            Mensajes.advertencia("Debe elejir un registro");
            return;
        }
        ProductoDTO producto = (ProductoDTO) tblDetalle.getValueAt(fila, 1);
        VentaDetalleDTO detalle = existeDetalle(producto);
        if (quitarDetalle(detalle)) {
            cargarDetails();
        }
    }//GEN-LAST:event_btnQuitarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        VentaDetalleDTO detalle = existeDetalle((ProductoDTO) cboProductos.getSelectedItem());
        if (agregarDetalle(detalle)) {
            cargarDetails();
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        cancelar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        guardar();
    }//GEN-LAST:event_btnGuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel btnQuitar;
    private javax.swing.JComboBox cboClientes;
    private javax.swing.JComboBox cboComprobantes;
    private javax.swing.JComboBox cboEstados;
    private javax.swing.JComboBox cboProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAction;
    private javax.swing.JPanel jpActionSave;
    private javax.swing.JPanel jpVentas;
    private javax.swing.JPanel jpVentasRegistro;
    private javax.swing.JTabbedPane jtpPestanias;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblComprobante;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblNroComprobante;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtBuscarProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtNroComprobante;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void guardar() {
        controlSetDTO();

        boolean result = isEdit
                ? ventaController.actualizarVenta(entidadDTO)
                : ventaController.nuevaVenta(entidadDTO);

        if (result) {
            refrescarTablaPrincipal();
        }
    }

    @Override
    public void nuevo() {
        jtpPestanias.setSelectedIndex(1);
        isEdit = false;
        entidadDTO = new VentaDTO();
        listaDetalle = entidadDTO.getDetalles();
        System.out.println(listaDetalle == null);
        limpiar();
    }

    @Override
    public void editar() {
        if (tblVentas.getSelectedRowCount() <= 0) {
            Mensajes.advertencia("Tiene que seleccionar una registro");
            return;
        }
        isEdit = true;
        jtpPestanias.setSelectedIndex(1);
        limpiarDetalle();
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelar() {
        if (isEdit) {
            tblVentas.clearSelection();
        }

        jtpPestanias.setSelectedIndex(0);
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{"ID", "Fecha", "Cliente", "Comprobante", "Estado", "Total", "Usuario"};
    }

    @Override
    public Object[] toRow(VentaDTO e) {
        return new Object[]{
            e.getId(),
            e.getFecha(),
            e.getCliente(),
            e.getComprobante() + " Nro " + e.getNroComprobante(),
            e.getEstado(),
            e.getTotal(),
            e.getUsuario().getNombres()
        };
    }

    @Override
    public void refrescarTablaPrincipal() {
        listadoDTOS = ventaController.listarVentas();
        CargarTabla(listadoDTOS, tblVentas);
        jtpPestanias.setSelectedIndex(0);
    }

    @Override
    public void limpiar() {
        txtFecha.setText(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        cboClientes.setSelectedIndex(0);
        cboComprobantes.setSelectedIndex(0);
        txtNroComprobante.setText("0");
        cboEstados.setSelectedIndex(0);
        txtTotal.setText("0.0");
        txtImpuesto.setText("0.0");
        txtDescuento.setText("0.0");

        txtBuscarProductos.setText("");
        cargarProductos();
        limpiarDetalle();
        txtPrecio.setText("0");

        cargarDetails();
        tblVentas.clearSelection();
    }

    public void limpiarDetalle() {
        txtCantidad.setText("1");
    }

    @Override
    public void selectDTO() {
        obtenerEntidad(tblVentas);
        isEdit = false;
        controlGetDTO();
    }

    @Override
    public void controlGetDTO() {
        txtFecha.setText(entidadDTO.getFecha());
        cboClientes.setSelectedItem(entidadDTO.getCliente());
        cboComprobantes.setSelectedItem(entidadDTO.getComprobante());
        txtNroComprobante.setText(entidadDTO.getNroComprobante());
        cboEstados.setSelectedItem(entidadDTO.getEstado());
        txtTotal.setText(String.valueOf(entidadDTO.getTotal()));
        txtImpuesto.setText(String.valueOf(entidadDTO.getImpuesto()));
        txtDescuento.setText(String.valueOf(entidadDTO.getDescuento()));
        
        listaDetalle = entidadDTO.getDetalles();
        cargarDetails();
    }

    @Override
    public void controlSetDTO() {

        ClienteDTO cliente = (ClienteDTO) cboClientes.getSelectedItem();
        ComprobanteDTO comprobante = (ComprobanteDTO) cboComprobantes.getSelectedItem();
        EstadoDTO estado = (EstadoDTO) cboEstados.getSelectedItem();

        entidadDTO.setFecha(txtFecha.getText().strip());
        entidadDTO.setCliente(cliente);
        entidadDTO.setComprobante(comprobante);
        entidadDTO.setNroComprobante(txtNroComprobante.getText().strip());
        entidadDTO.setEstado(estado);
        entidadDTO.setTotal(Double.parseDouble((txtTotal.getText())));
        entidadDTO.setImpuesto(Double.parseDouble((txtImpuesto.getText())));
        entidadDTO.setDescuento(Double.parseDouble((txtDescuento.getText())));
        entidadDTO.setUsuario(Sesion.getUsuario());
    }

    @Override
    public void controlsEditable(boolean value) {

    }

    private void cargarClientees() {
        clienteesDTOS = clienteController.listarClientes();
        DefaultComboBoxModel<ClienteDTO> modelo = new DefaultComboBoxModel<>();
        clienteesDTOS.forEach(modelo::addElement);
        cboClientes.setModel(modelo);
    }

    private void cargarComprobantes() {
        comprobantesDTOS = comprobanteController.listarComprobante();
        DefaultComboBoxModel<ComprobanteDTO> modelo = new DefaultComboBoxModel<>();
        comprobantesDTOS.forEach(modelo::addElement);
        cboComprobantes.setModel(modelo);
    }

    private void cargarEstados() {
        estadosDTOS = estadoController.listarEstado();
        DefaultComboBoxModel<EstadoDTO> modelo = new DefaultComboBoxModel<>();
        estadosDTOS.forEach(modelo::addElement);
        cboEstados.setModel(modelo);
    }

    private void cargarProductos() {
        produtoDTOS = productoController.listarProductos();
        DefaultComboBoxModel<ProductoDTO> modelo = new DefaultComboBoxModel<>();
        produtoDTOS.forEach(modelo::addElement);
        cboProductos.setModel(modelo);
    }

    private void buscarProductos(String valorBuscado) {
        DefaultComboBoxModel<ProductoDTO> modelo = new DefaultComboBoxModel<>();
        System.out.println(valorBuscado);
        if (valorBuscado.equals("")) {
            produtoDTOS.forEach(modelo::addElement);
        } else {
            List<ProductoDTO> filtrado = produtoDTOS.stream()
                    .filter(p -> {
                        System.out.println(p);
                        boolean coin=p.getDescripcion().toLowerCase().contains(valorBuscado);
                        System.out.println(coin);
                        return coin;
                    })
                    .collect(Collectors.toList());
            filtrado.forEach(modelo::addElement);
        }
        cboProductos.setModel(modelo);
    }

    @Override
    public VentaDetalleDTO existeDetalle(ProductoDTO producto) {
        if (listaDetalle == null) {
            return null;
        }
        return listaDetalle.stream()
                .filter(d -> d.getProducto().getId() == producto.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public void cargarDetails() {
        DefaultTableModel model = builderDetails.construirModelo(
                this.getColumnDetails(),
                listaDetalle,
                this::toRowDetails // referencia a método
        );
        tblDetalle.setModel(model);
        txtTotal.setText(actualizarTotal());
        AnchoColumnaTabla(tblDetalle, 0, 1);
        AnchoColumnaTabla(tblDetalle, 560, 2);
    }

    @Override
    public Object[] toRowDetails(VentaDetalleDTO e) {
        return new Object[]{
            e.getProducto().getId(),
            e.getProducto(),
            e.getCantidad(),
            e.getPrecio(),
            e.getImporte()
        };
    }

    @Override
    public String[] getColumnDetails() {
        return new String[]{"IDProducto", "Producto", "Cantidad", "Costo", "Importe"};
    }

    private String actualizarTotal() {
        return String.valueOf(listaDetalle.stream()
                .mapToDouble(d -> Integer.parseInt(d.getCantidad()) * Double.parseDouble(d.getPrecio()))
                .sum());
    }

    @Override
    public boolean agregarDetalle(VentaDetalleDTO detalle) {
        if (!isEdit && detalle == null) {
            detalle = new VentaDetalleDTO();
            ControlsetDTODetails(detalle);
            listaDetalle.add(detalle);
        } else if (!isEdit && detalle != null) {
            detalle.setCantidad(cantidadNew(detalle.getCantidad(), +1));
        } else if (isEdit && detalle == null) {
            detalle = new VentaDetalleDTO();
            ControlsetDTODetails(detalle);
            listaDetalle.add(detalle);
            return ventaController.addDetalle(detalle);
        } else if (isEdit && detalle != null) {
            detalle.setCantidad(cantidadNew(detalle.getCantidad(), +1));
            return ventaController.editDetalle(detalle);
        }
        return true;
    }

    @Override
    public String cantidadNew(String cantidadOld, int IncDec) {
        int cantidad = Integer.parseInt(cantidadOld);
        return String.valueOf(cantidad + IncDec);

    }

    @Override
    public boolean quitarDetalle(VentaDetalleDTO detalle) {
        if (detalle.getIdMovimiento() <= 0) {
            detalle.setCantidad(cantidadNew(detalle.getCantidad(), -1));
            if (Integer.parseInt(detalle.getCantidad()) < 1) {
                listaDetalle.remove(detalle);
                return true;
            }
        } else {
            detalle.setCantidad(cantidadNew(detalle.getCantidad(), -1));
            if (Integer.parseInt(detalle.getCantidad()) >= 1) {
                ventaController.editDetalle(detalle);
                return true;
            } else {
                listaDetalle.remove(detalle);
                return ventaController.delDetalle(detalle);
            }
        }
        return true;
    }

    @Override
    public void ControlsetDTODetails(VentaDetalleDTO detalle) {
        detalle.setIdMovimiento(entidadDTO.getId());
        detalle.setProducto((ProductoDTO) cboProductos.getSelectedItem());
        detalle.setCantidad(txtCantidad.getText().strip());
        detalle.setPrecio(txtPrecio.getText().strip());
    }
}
