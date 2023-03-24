/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zoopolis.interfaz;

/**
 *
 * @author Joseph Roldan, Carlos Castaño, Osvairo Moreno
 */
public class RegsitroAnimal extends javax.swing.JFrame {

    /**
     * Creates new form RegsitroAnimal
     */
    public RegsitroAnimal() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnRegistroAnimal = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnGoPlan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        btnCrear = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 300, 90));

        btnInicio.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setDefaultCapable(false);
        btnInicio.setFocusPainted(false);
        btnInicio.setFocusable(false);
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 50));

        btnRegistroAnimal.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnRegistroAnimal.setText("Registro Animal");
        btnRegistroAnimal.setBorder(null);
        btnRegistroAnimal.setBorderPainted(false);
        btnRegistroAnimal.setContentAreaFilled(false);
        btnRegistroAnimal.setDefaultCapable(false);
        btnRegistroAnimal.setFocusPainted(false);
        btnRegistroAnimal.setFocusable(false);
        btnRegistroAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 210, 50));

        btnPlanes.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnPlanes.setText("Animales");
        btnPlanes.setBorder(null);
        btnPlanes.setBorderPainted(false);
        btnPlanes.setContentAreaFilled(false);
        btnPlanes.setDefaultCapable(false);
        btnPlanes.setFocusPainted(false);
        btnPlanes.setFocusable(false);
        btnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 50));

        btnBalance.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnBalance.setText("Balance");
        btnBalance.setBorder(null);
        btnBalance.setBorderPainted(false);
        btnBalance.setContentAreaFilled(false);
        btnBalance.setDefaultCapable(false);
        btnBalance.setFocusPainted(false);
        btnBalance.setFocusable(false);
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 120, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Foto.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 190));

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jRadioButton1.setText("Animal Domestico");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jRadioButton2.setText("Animal Salvaje");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel2.setBackground(new java.awt.Color(1, 196, 76));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 460, 45));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel4.setText("Especie");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, 50));

        jTextField1.setBackground(new java.awt.Color(227, 251, 230));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 280, 35));

        jTextField2.setBackground(new java.awt.Color(227, 251, 230));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 280, 35));

        jTextField3.setBackground(new java.awt.Color(227, 251, 230));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 280, 35));

        btnGoPlan.setBackground(new java.awt.Color(1, 196, 76));
        btnGoPlan.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        btnGoPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnGoPlan.setText("Examinar");
        btnGoPlan.setBorder(null);
        btnGoPlan.setContentAreaFilled(false);
        btnGoPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoPlan.setFocusPainted(false);
        btnGoPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoPlan.setOpaque(true);
        btnGoPlan.setRequestFocusEnabled(false);
        btnGoPlan.setVerifyInputWhenFocusTarget(false);
        btnGoPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoPlanActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Linea_1.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 912, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 196, 76));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DATOS ESPECIFICOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 340, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel9.setText("Raza");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel10.setText("Color");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, 50));

        jTextField4.setBackground(new java.awt.Color(227, 251, 230));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 280, 35));

        jTextField5.setBackground(new java.awt.Color(227, 251, 230));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 280, 35));

        jTextField6.setBackground(new java.awt.Color(227, 251, 230));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 280, 35));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel11.setText("Peligrosidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel12.setText("Habitat");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, 50));

        jTextField7.setBackground(new java.awt.Color(227, 251, 230));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 196, 76), 2));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 280, 35));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        jTextPane2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane2.setFocusCycleRoot(false);
        jTextPane2.setFocusable(false);
        jTextPane2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextPane2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 400, 100));

        btnCrear.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(153, 153, 153));
        btnCrear.setText("Cancelar");
        btnCrear.setBorder(null);
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.setDefaultCapable(false);
        btnCrear.setFocusPainted(false);
        btnCrear.setFocusable(false);
        btnCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrear.setRequestFocusEnabled(false);
        btnCrear.setVerifyInputWhenFocusTarget(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 180, 50));

        btnIniciar.setBackground(new java.awt.Color(1, 196, 76));
        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("REGISTRAR");
        btnIniciar.setBorder(null);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciar.setOpaque(true);
        btnIniciar.setRequestFocusEnabled(false);
        btnIniciar.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAnimalActionPerformed
 
    }//GEN-LAST:event_btnRegistroAnimalActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed

    }//GEN-LAST:event_btnPlanesActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed


    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnGoPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoPlanActionPerformed
        
    }//GEN-LAST:event_btnGoPlanActionPerformed
    
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

    }//GEN-LAST:event_btnCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegsitroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegsitroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegsitroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegsitroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegsitroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGoPlan;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JButton btnRegistroAnimal;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}