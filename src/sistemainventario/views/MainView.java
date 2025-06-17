
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
import sistemainventario.util.UIConstants;

public final class MainView extends javax.swing.JFrame {

    private final LoginController controllerLogin;
    private final Color colorMenu = UIConstants.COLOR_PRIMARIO;
    private final Color colorHover = UIConstants.COLOR_SECUNDARIO;
    private final List<String> menuPrimario = Sesion.getPermisos(); 
    private List<String> menuSecundario=new ArrayList<>();

    private String opcionSelect;

    public MainView() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.controllerLogin = new LoginController();

        this.opcionSelect = "Inicio";
        this.setSize(1240, 750);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/RHINO.png")).getImage());

        cargaDatos();
        jpContainer.setLayout(new BorderLayout());
        
        generarMenu(menuPrimario);
        seleccionarPanel(opcionSelect);
        
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

        imagen1.setRuta("/resources/images/cabezera/Usuario.png");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(lblNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpHeaderLayout.createSequentialGroup()
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );

        jpContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContainerLayout = new javax.swing.GroupLayout(jpContainer);
        jpContainer.setLayout(jpContainerLayout);
        jpContainerLayout.setHorizontalGroup(
            jpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
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
    
    public void cargaDatos() {
        UsuarioDTO u = Sesion.getUsuario();

        lblNombreCompleto.setText(u.getNombres() + " " + u.getApellidos());
        lblRol.setText(u.getRol().getNombre());
        
        lblTitulo.setForeground(UIConstants.COLOR_SECUNDARIO);
        lblNombreCompleto.setForeground(UIConstants.COLOR_PRIMARIO);
        lblRol.setForeground(UIConstants.COLOR_PRIMARIO);        
        jpMenu.setBackground(UIConstants.COLOR_PRIMARIO);
        Sesion.getPermisos().forEach(System.out::println);
    }

    public void salir() {
        if (Mensajes.confirmar("Seguro deseas cerrar sesión?") == 0) {
            controllerLogin.cerrarSesion();
            this.dispose();
            new LoginView().setVisible(true);
        }

    }

    public void minimizar() {
        this.setState(sistemainventario.views.MainView.ICONIFIED);
    }

    private void generarMenu(List<String> menu) {
        jpMenu.removeAll(); // limpia el menú antes de reconstruirlo

        JPanel titulo = crearbtnMenuTitulo("RHINO", 20, 40, new Font("Segoe UI", Font.BOLD, 28));
        jpMenu.add(titulo);

        int y = 90;

        for (String opcion : menu) {
            if (opcion.equals(menu.getLast())) {
                y = 630;
            }
            JPanel menuOption = crearbtnMenu(opcion, y, 54, new Font("Arial", Font.PLAIN, 20));

            // Comportamiento visual

            menuOption.setBackground(opcion.equalsIgnoreCase(opcionSelect)?colorHover:colorMenu);


            menuOption.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    seleccionarPanel(opcion);                    
                    generarMenu(menuSecundario);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    menuOption.setBackground(colorHover);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (opcion.equalsIgnoreCase(opcionSelect)) {
                        menuOption.setBackground(colorHover);
                    } else {
                        menuOption.setBackground(colorMenu);
                    }
                }
            });

            jpMenu.add(menuOption);
            y += 60;
        }

        jpMenu.revalidate();
        jpMenu.repaint();
    }
    
    private JPanel crearbtnMenuTitulo(String texto, int y, int alto, Font fuente) {
        Imagen img = new Imagen();
        img.setRuta(UIConstants.getIconPath(texto));
        img.setBounds(10, 2, 70, alto - 10);
        
        JLabel label = new JLabel(texto);
        label.setBounds(90, 2, 160, alto - 4);
        label.setFont(fuente);
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, y, 250, alto);
        panel.setBackground(colorMenu);
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panel.add(img);
        panel.add(label);
        return panel;
    }

    private JPanel crearbtnMenu(String texto, int y, int alto, Font fuente) {
        Imagen img = new Imagen();
        img.setRuta(UIConstants.getIconPath(texto));
        img.setBounds(10, 4, 40, alto - 10);
        
        JLabel label = new JLabel(texto);
        label.setBounds(90, 4, 160, alto - 4);
        label.setFont(fuente);
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, y, 250, alto);
        panel.setBackground(colorMenu);
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panel.add(img);
        panel.add(label);
        return panel;
    }

    private void seleccionarPanel(String opcion) {
        jpContainer.removeAll();
        String Titulo = "";
        JPanel panel;

        this.menuSecundario.clear();
        switch (opcion.toLowerCase()) {
            case "inicio":
                this.menuSecundario.addAll(menuPrimario);
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Dashboard";
                panel = new InicioPanel();
                break;
            case "productos":
                this.menuSecundario.addAll(Arrays.asList("Productos", "Categorias", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = opcion;
                panel = new ProductosPanel();
                break;
            case "categorias":
                this.menuSecundario.addAll(Arrays.asList("Productos", "Categorias", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(1);
                Titulo = opcion;
                panel = new CategoriasPanel();
                break;
            case "entradas":
                this.menuSecundario.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Compras";
                panel = new EntradasPanel();
                break;
             case "compras":
                this.menuSecundario.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Compras";
                panel = new EntradasPanel();
                break;
            case "proveedores":
                this.menuSecundario.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(1);
                Titulo = opcion;
                panel = new ProveedorPanel();
                break;
            case "pagos":
                this.menuSecundario.addAll(Arrays.asList("Compras", "Proveedores", "Pagos", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(2);
                Titulo = opcion;
                panel = new JPanel();
                break;
            case "salidas":
                this.menuSecundario.addAll(Arrays.asList("Ventas", "Clientes", "Cobros", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Ventas";
                panel = new SalidasPanel();
                break;
            case "ventas":
                this.menuSecundario.addAll(Arrays.asList("Ventas", "Clientes", "Cobros", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Ventas";
                panel = new SalidasPanel();
                break;
            case "clientes":
                this.menuSecundario.addAll(Arrays.asList("Ventas", "Clientes", "Cobros", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(1);
                Titulo = opcion;
                panel = new ClientesPanel();
                break;
            case "cobros":
                this.menuSecundario.addAll(Arrays.asList("Ventas", "Clientes", "Cobros", "Regresar"));
                this.opcionSelect = this.menuSecundario.get(2);
                Titulo = opcion;
                panel = new JPanel();
                break;
            case "setup":
                this.menuSecundario.addAll(Arrays.asList("Empresa","Usuario", "Roles", "Modulos", "Comprobantes","Transacciones","Estados","Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Empresa";
                panel = new SetupPanel();
                break;
            case "empresa":
                this.menuSecundario.addAll(Arrays.asList("Empresa","Usuario", "Roles", "Modulos", "Comprobantes","Transacciones","Estados","Regresar"));
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Empresa";
                panel = new SetupPanel();
                break;
            case "usuario":
                this.menuSecundario.addAll(Arrays.asList("Empresa","Usuario", "Roles", "Modulos", "Comprobantes","Transacciones","Estados","Regresar"));
                this.opcionSelect = this.menuSecundario.get(1);
                Titulo = "Usuario";
                panel = new UsuarioPanel();
                break;
            case "regresar":
                this.menuSecundario.addAll(menuPrimario);
                this.opcionSelect = this.menuSecundario.get(0);
                Titulo = "Inicio";
                panel = new InicioPanel();
                break;
            case "logout":
                this.dispose();
                new LoginView().setVisible(true);
                return;
            default:
                this.menuSecundario.addAll(Arrays.asList("Regresar"));                
                panel = new JPanel();
                Mensajes.advertencia("Modulo en Desarrolo");
        }

        lblTitulo.setText(Titulo);
        jpContainer.add(panel, BorderLayout.CENTER);

        jpContainer.revalidate();
        jpContainer.repaint();  
    }
}
