
package sistemainventario.views;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.util.Mensajes;
import sistemainventario.util.Sesion;
import sistemainventario.util.Imagen;
import sistemainventario.controller.LoginController;

public final class MainView extends javax.swing.JFrame {

    private final LoginController controllerLogin;
    private final Color colorMenu = new Color(50, 150, 255);
    private final Color colorHover = new Color(50, 200, 230);
    private List<String> opciones = new ArrayList<>();
    private String opcionSelect;

    public MainView() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.controllerLogin = new LoginController();
        this.opciones.addAll(Arrays.asList("Inicio", "Productos", "Entradas", "Salidas", "Reportes", "Gastos", "Setup", "Logout"));
        this.opcionSelect = "Inicio";
        this.setSize(1240, 750);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/RINHO.png")).getImage());

        cargaDatos();
        jpContainer.setLayout(new BorderLayout());
        generarMenu();
        seleccionarOpcion("inicio");
        
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ESCAPE"), "cerrar");

        getRootPane().getActionMap().put("cerrar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salir();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBG = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnMinimizar = new sistemainventario.util.Imagen();
        btnCerrar = new sistemainventario.util.Imagen();
        imagen1 = new sistemainventario.util.Imagen();
        jpContainer = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpBG.setBackground(new java.awt.Color(255, 255, 255));

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(85, 96, 128));
        lblNombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblRol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRol.setForeground(new java.awt.Color(85, 96, 128));
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Titulo");

        btnMinimizar.setText("imagen1");
        btnMinimizar.setRuta("/resources/images/cabezera/btnMinimizar24N.png");
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        btnCerrar.setText("imagen1");
        btnCerrar.setRuta("/resources/images/cabezera/btnCerrar24N.png");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/images/cabezera/Usuario.png");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                        .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                        .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        jpContainerLayout.setVerticalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpMenu.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBGLayout = new javax.swing.GroupLayout(jpBG);
        jpBG.setLayout(jpBGLayout);
        jpBGLayout.setHorizontalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBGLayout.createSequentialGroup()
                        .addComponent(jpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jpBGLayout.setVerticalGroup(
            jpBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBGLayout.createSequentialGroup()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(sistemainventario.views.MainView.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        salir();
    }//GEN-LAST:event_btnCerrarMouseClicked

    public void cargaDatos() {
        UsuarioDTO u = Sesion.getUsuario();

        lblNombreCompleto.setText(u.getNombres() + " " + u.getApellidos());
        lblRol.setText(u.getRol().getNombre());
        lblTitulo.setText("Inicio");

        u.getRol().getPermisos().forEach(p -> System.out.println(p.getModulo()));
    }

    public void salir() {
        if (Mensajes.confirmar("Seguro deseas cerrar sesión?") == 0) {
            controllerLogin.cerrarSesion();
            this.dispose();
            new LoginView().setVisible(true);
        }

    }

    public boolean tienePermiso(String modulo) {
        if (Sesion.getPermiso(modulo) != null) {
            return Sesion.getPermiso(modulo).isEstado(); //Mensajes.advertencia("Modulo en mantenimiento");
        }
        //Mensajes.advertencia("Modulo No Exisite");
        return false;
    }

    public void minimizar() {
        this.setState(sistemainventario.views.MainView.ICONIFIED);
    }

    private void generarMenu() {
        jpMenu.removeAll(); // limpia el menú antes de reconstruirlo

        JPanel titulo = crearbtnMenu("RINHO", 20, 50, new Font("Segoe UI", Font.BOLD, 28));
        jpMenu.add(titulo);

        int y = 90;

        for (String opcion : opciones) {
            if (opcion.equals(opciones.getLast())) {
                y = 630;
            }
            JPanel labelOpcion = crearbtnMenu(opcion, y, 50, new Font("Arial", Font.PLAIN, 20));

            // Comportamiento visual
            if (opcion.equalsIgnoreCase(opcionSelect)) {
                labelOpcion.setBackground(colorHover);
            } else {
                labelOpcion.setBackground(colorMenu);
            }

            labelOpcion.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
//                    Mensajes.info("Seleccionaste: " + opcion);
//                    if(tienePermiso(opcion)){
                    seleccionarOpcion(opcion);                    
                    generarMenu();
                    //} else{
//                        Mensajes.advertencia("No tiene acceso a este modulo");
//                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    labelOpcion.setBackground(colorHover);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (opcion.equalsIgnoreCase(opcionSelect)) {
                        labelOpcion.setBackground(colorHover);
                    } else {
                        labelOpcion.setBackground(colorMenu);
                    }
                }
            });

            jpMenu.add(labelOpcion);
            y += 60;
        }

        jpMenu.revalidate();
        jpMenu.repaint();
    }

    private JLabel crearImgMenu(String texto, int alto) {
        Imagen img = new Imagen();
        img.setRuta("/resources/images/menu/" + texto + ".png");
        img.setBounds(10, 2, 40, alto - 10); // corregido: Y relativo al panel, no global
        return img;
    }

    private JLabel crearLabelMenu(String texto, int alto, Font fuente) {
        JLabel label = new JLabel(texto);
        label.setBounds(90, 2, 160, alto - 4);
        label.setFont(fuente);
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        return label;
    }

    private JPanel crearbtnMenu(String texto, int y, int alto, Font fuente) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, y, 250, alto);
        panel.setBackground(colorMenu);
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JLabel image = crearImgMenu(texto, alto);
        JLabel txtmenu = crearLabelMenu(texto, alto, fuente);

        panel.add(image);
        panel.add(txtmenu);
        return panel;
    }

    private void seleccionarOpcion(String opcion) {
        jpContainer.removeAll();
        String Titulo = "";
        JPanel panel;

        switch (opcion.toLowerCase()) {
            case "inicio":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Inicio", "Productos", "Entradas", "Salidas", "Reportes", "Gastos", "Setup", "Logout"));
                this.opcionSelect = this.opciones.get(0);
                Titulo = "Dashboard";
                panel = new InicioPanel();
                break;
            case "productos":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Productos", "Categorias", "Regresar"));
                this.opcionSelect = this.opciones.get(0);
                Titulo = opcion;
                panel = new ProductosPanel();
                break;
            case "categorias":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Productos", "Categorias", "Regresar"));
                this.opcionSelect = this.opciones.get(1);
                Titulo = opcion;
                panel = new CategoriasPanel();
                break;
            case "entradas":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.opciones.get(0);
                Titulo = "Compras";
                panel = new EntradasPanel();
                break;
            case "proveedores":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.opciones.get(1);
                Titulo = opcion;
                panel = new ProveedorPanel();
                break;
            case "pagos":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.opciones.get(2);
                Titulo = opcion;
                panel = new ProductosPanel();
                break;
            case "regresar":
                opciones.clear();
                this.opciones.addAll(Arrays.asList("Inicio", "Productos", "Entradas", "Salidas", "Reportes", "Gastos", "Setup", "Logout"));
                this.opcionSelect = this.opciones.get(0);
                Titulo = "Inicio";
                panel = new InicioPanel();
                break;
            case "logout":
                this.dispose();
                new LoginView().setVisible(true);
                return;
            default:
                panel = new JPanel();
        }

        lblTitulo.setText(Titulo);
        jpContainer.add(panel, BorderLayout.CENTER);

        jpContainer.revalidate();
        jpContainer.repaint();  
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemainventario.util.Imagen btnCerrar;
    private sistemainventario.util.Imagen btnMinimizar;
    private sistemainventario.util.Imagen imagen1;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpContainer;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
