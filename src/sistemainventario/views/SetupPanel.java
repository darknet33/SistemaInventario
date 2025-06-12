
package sistemainventario.views;


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
        imagen1 = new sistemainventario.util.Imagen();

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setText("Muelles Rhino");

        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(0, 153, 255));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre1.setText("NIT");

        lblRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante.setText("Representante legal");

        txtRepresentante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        txtRepresentante1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante1.setText("Avenida 1 #2 Zona Rosas Pampa");

        lblRepresentante2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante2.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante2.setText("Celular");

        txtRepresentante2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepresentante2.setText("78809825");

        lblRepresentante3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante3.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante3.setText("Email");

        txtRepresentante3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRepresentante4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRepresentante4.setForeground(new java.awt.Color(0, 153, 255));
        lblRepresentante4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRepresentante4.setText("Tipo");

        cboTipo.setBackground(new java.awt.Color(255, 255, 255));
        cboTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboTipo.setForeground(new java.awt.Color(51, 51, 51));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRepresentante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRepresentante, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                        .addGap(424, 424, 424))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRepresentante1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtRepresentante1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblRepresentante2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRepresentante2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRepresentante4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRepresentante3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRepresentante3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
    private sistemainventario.util.Imagen imagen1;
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
