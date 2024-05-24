package com.skxawng.inventarioITST2;
import com.skxawng.inventarioITST2.acercaDe;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
        int contadorHam = 0;
        int contadorHot = 0;
        int contadorRef = 0;
        int contadorPap = 0;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_hamburguesa = new javax.swing.JButton();
        btn_hotdog = new javax.swing.JButton();
        btn_refrescos = new javax.swing.JButton();
        btn_papas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        marco_menu = new javax.swing.JLabel();
        lbl_hamburguesa = new javax.swing.JLabel();
        lbl_hotDog = new javax.swing.JLabel();
        btn_rehabastecer = new javax.swing.JButton();
        btn_contPedidos = new javax.swing.JButton();
        btn_aumentarHamburguesa = new javax.swing.JButton();
        btn_aumentarhotDog = new javax.swing.JButton();
        btn_aumentarRefrescos = new javax.swing.JButton();
        btn_aumentarPapas = new javax.swing.JButton();
        lbl_papas = new javax.swing.JLabel();
        lbl_refrescos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        btn_hamburguesa.setBackground(new java.awt.Color(255, 0, 0));
        btn_hamburguesa.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_hamburguesa.setForeground(new java.awt.Color(255, 255, 0));
        btn_hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1-menu.png"))); // NOI18N
        btn_hamburguesa.setText("Ordenar Hamburguesa");
        btn_hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hamburguesaActionPerformed(evt);
            }
        });

        btn_hotdog.setBackground(new java.awt.Color(255, 0, 0));
        btn_hotdog.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_hotdog.setForeground(new java.awt.Color(255, 255, 0));
        btn_hotdog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen2-menu.png"))); // NOI18N
        btn_hotdog.setText("Ordenar Hotdog");
        btn_hotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hotdogActionPerformed(evt);
            }
        });

        btn_refrescos.setBackground(new java.awt.Color(255, 0, 0));
        btn_refrescos.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_refrescos.setForeground(new java.awt.Color(255, 255, 0));
        btn_refrescos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen3-menu.png"))); // NOI18N
        btn_refrescos.setText("Ordenar Refresco");
        btn_refrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescosActionPerformed(evt);
            }
        });

        btn_papas.setBackground(new java.awt.Color(255, 0, 0));
        btn_papas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_papas.setForeground(new java.awt.Color(255, 255, 0));
        btn_papas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen4-menu.png"))); // NOI18N
        btn_papas.setText("Ordenar Papas");
        btn_papas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_papasActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jButton5.setText("Ver información acerca de nuestros productos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        marco_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marco_general.png"))); // NOI18N

        lbl_hamburguesa.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lbl_hamburguesa.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hamburguesa.setText("0");

        lbl_hotDog.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lbl_hotDog.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hotDog.setText("0");

        btn_rehabastecer.setBackground(new java.awt.Color(255, 0, 0));
        btn_rehabastecer.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_rehabastecer.setText("Reabastecer Inventario");
        btn_rehabastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rehabastecerActionPerformed(evt);
            }
        });

        btn_contPedidos.setBackground(new java.awt.Color(255, 0, 0));
        btn_contPedidos.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btn_contPedidos.setText("Continuar pedidos");
        btn_contPedidos.setEnabled(false);
        btn_contPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contPedidosActionPerformed(evt);
            }
        });

        btn_aumentarHamburguesa.setBackground(new java.awt.Color(255, 204, 0));
        btn_aumentarHamburguesa.setText("+");
        btn_aumentarHamburguesa.setEnabled(false);
        btn_aumentarHamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aumentarHamburguesaActionPerformed(evt);
            }
        });

        btn_aumentarhotDog.setBackground(new java.awt.Color(255, 204, 0));
        btn_aumentarhotDog.setText("+");
        btn_aumentarhotDog.setEnabled(false);
        btn_aumentarhotDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aumentarhotDogActionPerformed(evt);
            }
        });

        btn_aumentarRefrescos.setBackground(new java.awt.Color(255, 204, 0));
        btn_aumentarRefrescos.setText("+");
        btn_aumentarRefrescos.setEnabled(false);
        btn_aumentarRefrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aumentarRefrescosActionPerformed(evt);
            }
        });

        btn_aumentarPapas.setBackground(new java.awt.Color(255, 204, 0));
        btn_aumentarPapas.setText("+");
        btn_aumentarPapas.setEnabled(false);
        btn_aumentarPapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aumentarPapasActionPerformed(evt);
            }
        });

        lbl_papas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lbl_papas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papas.setText("0");

        lbl_refrescos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lbl_refrescos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_refrescos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(marco_menu))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_refrescos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_contPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_rehabastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_hamburguesa, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_papas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hotdog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btn_aumentarHamburguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_hamburguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aumentarhotDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_hotDog)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btn_aumentarRefrescos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_refrescos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aumentarPapas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_papas)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(marco_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_hotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hotDog)
                    .addComponent(btn_aumentarHamburguesa)
                    .addComponent(btn_aumentarhotDog)
                    .addComponent(lbl_hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_refrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_papas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aumentarRefrescos)
                    .addComponent(lbl_papas)
                    .addComponent(btn_aumentarPapas)
                    .addComponent(lbl_refrescos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rehabastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(btn_contPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            acercaDe pc = new acercaDe();
            pc.setVisible(true);
            this.dispose();        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_hamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hamburguesaActionPerformed
       contadorHam --;
        if(contadorHam <= -1){
        JOptionPane.showMessageDialog(rootPane, "No hay más hamburguesas, rehabastece tu inventario, porfavor.");  
        btn_hamburguesa.setEnabled(false);
        } else {
        String numero = String.valueOf(contadorHam);
        lbl_hamburguesa.setText(numero);
        }
    }//GEN-LAST:event_btn_hamburguesaActionPerformed

    private void btn_hotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hotdogActionPerformed
        contadorHot --;
        if(contadorHot <= -1){
        JOptionPane.showMessageDialog(rootPane, "No hay más Hotdogs, rehabastece tu inventario, porfavor.");  
        btn_hotdog.setEnabled(false);
        } else {
        String numero = String.valueOf(contadorHot);
        lbl_hotDog.setText(numero);
        }
    }//GEN-LAST:event_btn_hotdogActionPerformed

    private void btn_refrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescosActionPerformed
         contadorRef --;
        if(contadorRef <= -1){
        JOptionPane.showMessageDialog(rootPane, "No hay más refrescos, rehabastece tu inventario, porfavor.");  
        btn_refrescos.setEnabled(false);
        } else {
        String numero = String.valueOf(contadorRef);
        lbl_refrescos.setText(numero);
        }
    }//GEN-LAST:event_btn_refrescosActionPerformed

    private void btn_papasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_papasActionPerformed
        contadorPap --;
        if(contadorPap <= -1){
        JOptionPane.showMessageDialog(rootPane, "No hay más papas, rehabastece tu inventario, porfavor.");  
        btn_papas.setEnabled(false);
        } else {
        String numero = String.valueOf(contadorPap);
        lbl_papas.setText(numero);
        }
    }//GEN-LAST:event_btn_papasActionPerformed

    private void btn_rehabastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rehabastecerActionPerformed
        btn_aumentarHamburguesa.setEnabled(true);
        btn_aumentarhotDog.setEnabled(true);
        btn_aumentarRefrescos.setEnabled(true);
        btn_aumentarPapas.setEnabled(true);
        btn_hamburguesa.setEnabled(false);
        btn_hotdog.setEnabled(false);
        btn_refrescos.setEnabled(false);
        btn_papas.setEnabled(false);
        btn_contPedidos.setEnabled(true);
        
    }//GEN-LAST:event_btn_rehabastecerActionPerformed

    private void btn_contPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contPedidosActionPerformed
        btn_aumentarHamburguesa.setEnabled(false);
        btn_aumentarhotDog.setEnabled(false);
        btn_aumentarRefrescos.setEnabled(false);
        btn_aumentarPapas.setEnabled(false);
        btn_hamburguesa.setEnabled(true);
        btn_hotdog.setEnabled(true);
        btn_refrescos.setEnabled(true);
        btn_papas.setEnabled(true);
        btn_rehabastecer.setEnabled(true);
    }//GEN-LAST:event_btn_contPedidosActionPerformed

    private void btn_aumentarHamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aumentarHamburguesaActionPerformed
       contadorHam ++;
       String numero = String.valueOf(contadorHam);
       lbl_hamburguesa.setText(numero);
    }//GEN-LAST:event_btn_aumentarHamburguesaActionPerformed

    private void btn_aumentarhotDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aumentarhotDogActionPerformed
        contadorHot ++;
       String numero = String.valueOf(contadorHot);
       lbl_hotDog.setText(numero);
    }//GEN-LAST:event_btn_aumentarhotDogActionPerformed

    private void btn_aumentarRefrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aumentarRefrescosActionPerformed
        contadorRef ++;
       String numero = String.valueOf(contadorRef);
       lbl_refrescos.setText(numero);
    }//GEN-LAST:event_btn_aumentarRefrescosActionPerformed

    private void btn_aumentarPapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aumentarPapasActionPerformed
        contadorPap ++;
       String numero = String.valueOf(contadorPap);
       lbl_papas.setText(numero);
    }//GEN-LAST:event_btn_aumentarPapasActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aumentarHamburguesa;
    private javax.swing.JButton btn_aumentarPapas;
    private javax.swing.JButton btn_aumentarRefrescos;
    private javax.swing.JButton btn_aumentarhotDog;
    private javax.swing.JButton btn_contPedidos;
    private javax.swing.JButton btn_hamburguesa;
    private javax.swing.JButton btn_hotdog;
    private javax.swing.JButton btn_papas;
    private javax.swing.JButton btn_refrescos;
    private javax.swing.JButton btn_rehabastecer;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_hamburguesa;
    private javax.swing.JLabel lbl_hotDog;
    private javax.swing.JLabel lbl_papas;
    private javax.swing.JLabel lbl_refrescos;
    private javax.swing.JLabel marco_menu;
    // End of variables declaration//GEN-END:variables


}
