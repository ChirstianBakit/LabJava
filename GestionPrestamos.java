/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.prestamo;

/**
 *
 * @author user
 */
public class GestionPrestamos extends javax.swing.JPanel {

    /**
     * Creates new form GestionPrestamos
     */
    public GestionPrestamos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_aprobarRechazar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_idPrestmoGestion = new javax.swing.JTextField();
        jrb_aprobar = new javax.swing.JRadioButton();
        jrb_rechazar = new javax.swing.JRadioButton();
        btn_confimarGestion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1890, 655));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1890, 655));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de Prestamos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 40, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Prestamo", "Nombre", "Apellido", "Monto Solicitado", "Fecha de Solicitud", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 84, 625, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Aprobar o Rechazar Solicitudes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 114, 225, 24));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("ID Del Prestamo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 161, -1, -1));

        text_idPrestmoGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idPrestmoGestionActionPerformed(evt);
            }
        });
        jPanel1.add(text_idPrestmoGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 156, 114, -1));

        btnGroup_aprobarRechazar.add(jrb_aprobar);
        jrb_aprobar.setText("Aprobar");
        jrb_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_aprobarActionPerformed(evt);
            }
        });
        jPanel1.add(jrb_aprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 196, 99, -1));

        btnGroup_aprobarRechazar.add(jrb_rechazar);
        jrb_rechazar.setText("Rechazar");
        jrb_rechazar.setBorder(null);
        jPanel1.add(jrb_rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 197, 114, -1));

        btn_confimarGestion.setBackground(new java.awt.Color(0, 0, 153));
        btn_confimarGestion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_confimarGestion.setForeground(new java.awt.Color(255, 255, 255));
        btn_confimarGestion.setText("Confirmar");
        jPanel1.add(btn_confimarGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 235, 225, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 86, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 289, 280, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 12, 220));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 76, 12, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_idPrestmoGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idPrestmoGestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idPrestmoGestionActionPerformed

    private void jrb_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_aprobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_aprobarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup_aprobarRechazar;
    private javax.swing.JButton btn_confimarGestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jrb_aprobar;
    private javax.swing.JRadioButton jrb_rechazar;
    private javax.swing.JTextField text_idPrestmoGestion;
    // End of variables declaration//GEN-END:variables
}
