/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zoopolis.interfaz;

import com.zoopolis.zoopolis.Zoopolis;
import java.awt.Color;

/**
 *
 * @author Joseph Roldan, Carlos Castaño, Osvairo Moreno
 */
public class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Ticket() {
        initComponents();
        rbNO.setVisible(false);
        rbSI.setVisible(false);
        lblParqueadero.setVisible(false);
        btnTicket.setForeground(new java.awt.Color(1, 196, 76));
        btnTicket.setFont(new java.awt.Font("Arial", 1, 25));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        frmCompra = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        lblLogo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCrearCuenta1 = new javax.swing.JButton();
        panTicket = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();
        lblCarro = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblParqueadero = new javax.swing.JLabel();
        rbSI = new javax.swing.JRadioButton();
        rbNO = new javax.swing.JRadioButton();
        lblColorDescripcion = new javax.swing.JLabel();
        lblColorPrecio = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bntInicio = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        frmCompra.setAutoRequestFocus(false);
        frmCompra.setResizable(false);
        frmCompra.setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        jPanel1.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, 90));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TITULO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 400, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("CANTIDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("VALOR (ud)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("DESCUENTO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Nro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 40));

        jLabel10.setText("jLabel7");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("jLabel8");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 240, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("jLabel9");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 240, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("jLabel10");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 240, 30));

        jScrollPane4.setBorder(null);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setFocusable(false);
        jScrollPane4.setOpaque(false);
        jScrollPane4.setRequestFocusEnabled(false);
        jScrollPane4.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setWheelScrollingEnabled(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 16))); // NOI18N
        jTextArea2.setFocusable(false);
        jTextArea2.setRequestFocusEnabled(false);
        jTextArea2.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 420, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("$");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 140, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Linea.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 420, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setText("TOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        btnIniciarSesion.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(153, 153, 153));
        btnIniciarSesion.setText("Cancelar");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setDefaultCapable(false);
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setRequestFocusEnabled(false);
        btnIniciarSesion.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 130, 50));

        btnCrearCuenta1.setBackground(new java.awt.Color(1, 196, 76));
        btnCrearCuenta1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        btnCrearCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta1.setText("Pagar");
        btnCrearCuenta1.setBorder(null);
        btnCrearCuenta1.setContentAreaFilled(false);
        btnCrearCuenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta1.setFocusPainted(false);
        btnCrearCuenta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearCuenta1.setOpaque(true);
        btnCrearCuenta1.setRequestFocusEnabled(false);
        btnCrearCuenta1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(btnCrearCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 130, 50));

        frmCompra.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZOOPOLIS - Ticket");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTicket.setBackground(new java.awt.Color(255, 255, 255));
        panTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        panTicket.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 300, 90));

        lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ticket.png"))); // NOI18N
        panTicket.add(lblTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 480, 290));

        lblMoto.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lblMoto.setText("Parqueadero Moto      Valor     $9.900");
        panTicket.add(lblMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 310, 20));

        lblCarro.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lblCarro.setText("Parqueadero Carro     Valor     $15.000");
        panTicket.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 320, 20));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Valor  $70000");
        lblPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panTicket.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 460, 70));

        lblParqueadero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblParqueadero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParqueadero.setText("¿Hará uso del servicio de parqueadero?");
        lblParqueadero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panTicket.add(lblParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 370, 60));

        buttonGroup1.add(rbSI);
        rbSI.setText("SI");
        rbSI.setBorder(null);
        rbSI.setContentAreaFilled(false);
        rbSI.setFocusPainted(false);
        rbSI.setFocusable(false);
        rbSI.setRequestFocusEnabled(false);
        rbSI.setRolloverEnabled(false);
        rbSI.setVerifyInputWhenFocusTarget(false);
        panTicket.add(rbSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 606, 45, 50));

        buttonGroup1.add(rbNO);
        rbNO.setText("NO");
        rbNO.setBorder(null);
        rbNO.setContentAreaFilled(false);
        rbNO.setFocusPainted(false);
        rbNO.setFocusable(false);
        rbNO.setRequestFocusEnabled(false);
        rbNO.setRolloverEnabled(false);
        rbNO.setVerifyInputWhenFocusTarget(false);
        panTicket.add(rbNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 606, 45, 50));

        lblColorDescripcion.setBackground(new java.awt.Color(217, 217, 217));
        lblColorDescripcion.setOpaque(true);
        panTicket.add(lblColorDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 461, 64));

        lblColorPrecio.setBackground(new java.awt.Color(0, 0, 0));
        lblColorPrecio.setOpaque(true);
        lblColorPrecio.setRequestFocusEnabled(false);
        lblColorPrecio.setVerifyInputWhenFocusTarget(false);
        panTicket.add(lblColorPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 460, 70));

        btnComprar.setBackground(new java.awt.Color(0, 0, 0));
        btnComprar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("COMPRAR");
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setDefaultCapable(false);
        btnComprar.setFocusPainted(false);
        btnComprar.setFocusable(false);
        btnComprar.setOpaque(true);
        btnComprar.setRequestFocusEnabled(false);
        btnComprar.setRolloverEnabled(false);
        btnComprar.setVerifyInputWhenFocusTarget(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        panTicket.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 291, 82));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextPane2.setText("* Acceso a todas las áreas públicas del zoológico, y los programas educativos.\n\n* Mapas y guías para ayudar a los visitantes a navegar por el zoológico.\n\n* Acceso a servicios como baños, áreas de descanso y restaurantes.");
        jTextPane2.setAutoscrolls(false);
        jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane2.setFocusCycleRoot(false);
        jTextPane2.setFocusable(false);
        jTextPane2.setRequestFocusEnabled(false);
        jTextPane2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextPane2);

        panTicket.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 340, 150));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TICKET ESTÁNDAR");
        panTicket.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 400, -1));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextPane3.setText("* HORA DE APERTURA DE PUERTAS: 8:50AM\n* HORA DE LOS RECORRIDOS: 9AM A LAS 4PM (INICIO CADA HORA)");
        jTextPane3.setAutoscrolls(false);
        jTextPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane3.setFocusCycleRoot(false);
        jTextPane3.setFocusable(false);
        jTextPane3.setRequestFocusEnabled(false);
        jTextPane3.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(jTextPane3);

        panTicket.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 520, 50));

        jSpinner1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        jSpinner1.setBorder(null);
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setFocusable(false);
        jSpinner1.setRequestFocusEnabled(false);
        jSpinner1.setVerifyInputWhenFocusTarget(false);
        panTicket.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 70, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRECIO:");
        panTicket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD:");
        panTicket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 110, 30));

        jLabel4.setText("jLabel4");
        panTicket.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 190, 30));

        bntInicio.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        bntInicio.setText("Inicio");
        bntInicio.setBorder(null);
        bntInicio.setBorderPainted(false);
        bntInicio.setContentAreaFilled(false);
        bntInicio.setDefaultCapable(false);
        bntInicio.setFocusPainted(false);
        bntInicio.setFocusable(false);
        bntInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInicioActionPerformed(evt);
            }
        });
        panTicket.add(bntInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 100, 50));

        btnTicket.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnTicket.setText("Ticket");
        btnTicket.setBorder(null);
        btnTicket.setBorderPainted(false);
        btnTicket.setContentAreaFilled(false);
        btnTicket.setDefaultCapable(false);
        btnTicket.setFocusPainted(false);
        btnTicket.setFocusable(false);
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        panTicket.add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 100, 50));

        btnPlanes.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnPlanes.setText("Planes");
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
        panTicket.add(btnPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 100, 50));

        btnAdmin.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.setBorder(null);
        btnAdmin.setBorderPainted(false);
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setDefaultCapable(false);
        btnAdmin.setFocusPainted(false);
        btnAdmin.setFocusable(false);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        panTicket.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 100, 50));

        getContentPane().add(panTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        Index.irTicket();
        dispose();
    }//GEN-LAST:event_btnTicketActionPerformed

    private void bntInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInicioActionPerformed
        Index.irInicio();
        dispose();
    }//GEN-LAST:event_bntInicioActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        Index.irPlanes();
        dispose();
    }//GEN-LAST:event_btnPlanesActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        Index.iniciarSesion();
        if(Zoopolis.getAdminValido()){
             dispose();
         }
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        Compra compra = new Compra(frmCompra, true);
        compra.setVisible(true);

    }//GEN-LAST:event_btnComprarActionPerformed

    public void cambiarApariencia(char n) {

        switch (n) {
            case '1':
                lblTitulo.setText("AVENTURA FELINA");
                lblTitulo.setForeground(new java.awt.Color(255, 93, 0));
                lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PlanFelino.png")));
                lblPrecio.setText("x2 Tickets + Servicios");
                lblColorDescripcion.setBackground(new java.awt.Color(251, 240, 227));
                cambiarColor(Color.decode("#FF5D00"));
                mostrarYQuitar();

                break;
            case '2':
                lblTitulo.setText("AVENTURA REPTILIANA");
                lblTitulo.setForeground(new java.awt.Color(0, 198, 47));
                lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PlanReptiliano.png")));
                lblPrecio.setText("x3 Tickets + Servicios");
                lblColorDescripcion.setBackground(new java.awt.Color(227, 251, 230));
                cambiarColor(Color.decode("#00C62F"));
                mostrarYQuitar();
                break;
            case '3':
                lblTitulo.setText("AVENTURA ACUATICA");
                lblTitulo.setForeground(new java.awt.Color(30, 0, 184));
                lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PlanAcuatico.png")));
                lblPrecio.setText("x4 Tickets + Servicios");
                lblColorDescripcion.setBackground(new java.awt.Color(227, 240, 251));
                cambiarColor(Color.decode("#1E00B8"));
                mostrarYQuitar();
                break;
            case '4':
                lblTitulo.setText("AVENTURA TROPICAL");
                lblTitulo.setForeground(new java.awt.Color(0, 198, 163));
                lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PlanTropical.png")));
                lblPrecio.setText("x5 Tickets + Servicios");
                lblColorDescripcion.setBackground(new java.awt.Color(227, 251, 245));
                cambiarColor(Color.decode("#00C6A3"));
                mostrarYQuitar();
                break;
            case '5':
                lblTitulo.setText("AVENTURA ANIMAL TOTAL");
                lblTitulo.setForeground(new java.awt.Color(241, 0, 23));
                lblPrecio.setText("x6 Tickets + Servicios");
                lblColorDescripcion.setBackground(new java.awt.Color(251, 227, 227));
                cambiarColor(Color.decode("#F10017"));
                mostrarYQuitar();
                lblTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PlanAnimalTotal.png")));
                break;
            default:
                throw new AssertionError();
        }

    }

    public void mostrarYQuitar() {
        rbNO.setVisible(true);
        rbSI.setVisible(true);
        lblCarro.setVisible(false);
        lblMoto.setVisible(false);
        lblParqueadero.setVisible(true);

    }

    public void cambiarColor(java.awt.Color color) {
        lblPrecio.setFont(new java.awt.Font("Arial", 1, 36));
        lblColorPrecio.setBackground(color);
        btnComprar.setBackground(color);

    }

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntInicio;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnCrearCuenta1;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JButton btnTicket;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame frmCompra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblColorDescripcion;
    private javax.swing.JLabel lblColorPrecio;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JLabel lblParqueadero;
    private javax.swing.JLabel lblPrecio;
    private static javax.swing.JLabel lblTicket;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panTicket;
    private javax.swing.JRadioButton rbNO;
    private javax.swing.JRadioButton rbSI;
    // End of variables declaration//GEN-END:variables
}