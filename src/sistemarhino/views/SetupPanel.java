
package sistemarhino.views;


public class SetupPanel extends javax.swing.JPanel {

    public SetupPanel() {
        initComponents();
        cboTipo.setSelectedIndex(1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblRepresentante = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        lblRepresentante1 = new javax.swing.JLabel();
        txtRepresentante1 = new javax.swing.JTextField();
        lblRepresentante2 = new javax.swing.JLabel();
        txtRepresentante2 = new javax.swing.JTextField();
        lblRepresentante3 = new javax.swing.JLabel();
        txtRepresentante3 = new javax.swing.JTextField();
        lblRepresentante4 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        imagen1 = new sistemarhino.util.Imagen();

        setBackground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");

        txtNombre.setBackground(null);
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("Muelles Rhino");

        txtNit.setBackground(null);
        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNit.setForeground(new java.awt.Color(102, 102, 102));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre1.setText("NIT");

        lblRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante.setText("Representante legal");

        txtRepresentante.setBackground(null);
        txtRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante.setForeground(new java.awt.Color(102, 102, 102));
        txtRepresentante.setText("David Huayrana");
        txtRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepresentanteActionPerformed(evt);
            }
        });

        lblRepresentante1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante1.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante1.setText("Direccion");

        txtRepresentante1.setBackground(null);
        txtRepresentante1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante1.setForeground(new java.awt.Color(102, 102, 102));
        txtRepresentante1.setText("Avenida 1 #2 Zona Rosas Pampa");

        lblRepresentante2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante2.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante2.setText("Celular");

        txtRepresentante2.setBackground(null);
        txtRepresentante2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante2.setForeground(new java.awt.Color(102, 102, 102));
        txtRepresentante2.setText("78809825");

        lblRepresentante3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante3.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante3.setText("Email");

        txtRepresentante3.setBackground(null);
        txtRepresentante3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante3.setForeground(new java.awt.Color(102, 102, 102));

        lblRepresentante4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante4.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante4.setText("Tipo");

        cboTipo.setBackground(null);
        cboTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboTipo.setForeground(new java.awt.Color(102, 102, 102));
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juridico", "Natural" }));

        imagen1.setText("imagen1");
        imagen1.setRuta("/logo.jpg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRepresentante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblRepresentante1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRepresentante2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRepresentante4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRepresentante3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)))
                        .addContainerGap(424, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRepresentante1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRepresentante2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRepresentante3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(273, 273, 273))
                            .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepresentante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepresentante1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepresentante2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepresentante3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRepresentante4)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepresentanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepresentanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboTipo;
    private sistemarhino.util.Imagen imagen1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblRepresentante;
    private javax.swing.JLabel lblRepresentante1;
    private javax.swing.JLabel lblRepresentante2;
    private javax.swing.JLabel lblRepresentante3;
    private javax.swing.JLabel lblRepresentante4;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtRepresentante1;
    private javax.swing.JTextField txtRepresentante2;
    private javax.swing.JTextField txtRepresentante3;
    // End of variables declaration//GEN-END:variables
}
