/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Edgardo Rivero
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form IngresarUsuario
     */
    public Menu() {
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

        background = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jButtonNuevoBanco = new javax.swing.JButton();
        jButtonNuevoCheque = new javax.swing.JButton();
        jButtonNuevoProveedor = new javax.swing.JButton();
        jButtonCuentasProveedor = new javax.swing.JButton();
        jButtonAdministrarCuentas1 = new javax.swing.JButton();
        jButtonNuevoCheque1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setToolTipText("");
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu Principal");
        Titulo.setToolTipText("");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Titulo.setOpaque(true);
        background.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 430, 53));

        jButtonNuevoBanco.setBackground(new java.awt.Color(0, 51, 255));
        jButtonNuevoBanco.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonNuevoBanco.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoBanco.setText("Ingresar Banco");
        jButtonNuevoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoBancoActionPerformed(evt);
            }
        });
        background.add(jButtonNuevoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 160, 40));

        jButtonNuevoCheque.setBackground(new java.awt.Color(0, 51, 255));
        jButtonNuevoCheque.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonNuevoCheque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoCheque.setText("Generar Cheque");
        jButtonNuevoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoChequeActionPerformed(evt);
            }
        });
        background.add(jButtonNuevoCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 160, 40));

        jButtonNuevoProveedor.setBackground(new java.awt.Color(0, 51, 255));
        jButtonNuevoProveedor.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonNuevoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoProveedor.setText("Ingresar Proveedor");
        jButtonNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoProveedorActionPerformed(evt);
            }
        });
        background.add(jButtonNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, 40));

        jButtonCuentasProveedor.setBackground(new java.awt.Color(0, 51, 255));
        jButtonCuentasProveedor.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonCuentasProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCuentasProveedor.setText("Cuentas Proveedores");
        jButtonCuentasProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuentasProveedorActionPerformed(evt);
            }
        });
        background.add(jButtonCuentasProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, 40));

        jButtonAdministrarCuentas1.setBackground(new java.awt.Color(0, 51, 255));
        jButtonAdministrarCuentas1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonAdministrarCuentas1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdministrarCuentas1.setText("Administrar Cuentas");
        jButtonAdministrarCuentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrarCuentas1ActionPerformed(evt);
            }
        });
        background.add(jButtonAdministrarCuentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 160, 40));

        jButtonNuevoCheque1.setBackground(new java.awt.Color(0, 51, 255));
        jButtonNuevoCheque1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonNuevoCheque1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoCheque1.setText("Generar Cheque");
        jButtonNuevoCheque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoCheque1ActionPerformed(evt);
            }
        });
        background.add(jButtonNuevoCheque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoBancoActionPerformed

    private void jButtonNuevoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoChequeActionPerformed
        GenerarCheque generarCheque = new GenerarCheque();
        generarCheque.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNuevoChequeActionPerformed

    private void jButtonNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoProveedorActionPerformed

    private void jButtonCuentasProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuentasProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCuentasProveedorActionPerformed

    private void jButtonAdministrarCuentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarCuentas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdministrarCuentas1ActionPerformed

    private void jButtonNuevoCheque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoCheque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoCheque1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButtonAdministrarCuentas1;
    private javax.swing.JButton jButtonCuentasProveedor;
    private javax.swing.JButton jButtonNuevoBanco;
    private javax.swing.JButton jButtonNuevoCheque;
    private javax.swing.JButton jButtonNuevoCheque1;
    private javax.swing.JButton jButtonNuevoProveedor;
    // End of variables declaration//GEN-END:variables
}