/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPaqInterfazMenuAdmin;

import jPaqDiseno.Diseno;
import jPaqInterfazLogin.GuiLogin;
import jPaqParqueadero.GlobalUser;
import java.awt.Image;
import java.awt.Toolkit;


public class GuiMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenuAdmin
     */
    public GuiMenuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setContentPane(jpFondo);
        jLUsuarioLogin.setText("ADMINISTRADOR: "+GlobalUser.getVarNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new  Diseno();
        jTPMenuAdmin = new javax.swing.JTabbedPane();
        jTPArchivo = new Diseno();
        jBTRegistrarUsuario = new javax.swing.JButton();
        jBTRegistrarTarifa = new javax.swing.JButton();
        jBTRegistrarTipoVehiculo = new javax.swing.JButton();
        jPSalir = new Diseno();
        jBTCerrarSesionAdmin = new javax.swing.JButton();
        jLUsuarioLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jpFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU-ADMINISTRADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 18))); // NOI18N
        jpFondo.setToolTipText("");

        jTPMenuAdmin.setBackground(new java.awt.Color(246, 246, 246));
        jTPMenuAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTPArchivo.setBackground(new java.awt.Color(246, 246, 246));
        jTPArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTPArchivo.setToolTipText("");
        jTPArchivo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jBTRegistrarUsuario.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/userC.png"))); // NOI18N
        jBTRegistrarUsuario.setText("REGISTRAR USUARIO");
        jBTRegistrarUsuario.setToolTipText("");
        jBTRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTRegistrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarUsuario.setIconTextGap(40);
        jBTRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarUsuarioActionPerformed(evt);
            }
        });

        jBTRegistrarTarifa.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarTarifa.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarTarifa.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarTarifa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/donero.png"))); // NOI18N
        jBTRegistrarTarifa.setText("REGISTRAR TARIFA");
        jBTRegistrarTarifa.setToolTipText("");
        jBTRegistrarTarifa.setHideActionText(true);
        jBTRegistrarTarifa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarTarifa.setIconTextGap(40);
        jBTRegistrarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarTarifaActionPerformed(evt);
            }
        });

        jBTRegistrarTipoVehiculo.setBackground(new java.awt.Color(246, 246, 246));
        jBTRegistrarTipoVehiculo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTRegistrarTipoVehiculo.setForeground(new java.awt.Color(102, 102, 102));
        jBTRegistrarTipoVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/carC.png"))); // NOI18N
        jBTRegistrarTipoVehiculo.setText("REGISTRAR VEHICULO");
        jBTRegistrarTipoVehiculo.setToolTipText("");
        jBTRegistrarTipoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTRegistrarTipoVehiculo.setIconTextGap(40);
        jBTRegistrarTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTRegistrarTipoVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTPArchivoLayout = new javax.swing.GroupLayout(jTPArchivo);
        jTPArchivo.setLayout(jTPArchivoLayout);
        jTPArchivoLayout.setHorizontalGroup(
            jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTPArchivoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBTRegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTRegistrarTipoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(jBTRegistrarTarifa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jTPArchivoLayout.setVerticalGroup(
            jTPArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTPArchivoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jBTRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jBTRegistrarTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jBTRegistrarTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTPMenuAdmin.addTab("ARCHIVOS", jTPArchivo);

        jBTCerrarSesionAdmin.setBackground(new java.awt.Color(255, 51, 51));
        jBTCerrarSesionAdmin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jBTCerrarSesionAdmin.setForeground(new java.awt.Color(102, 102, 102));
        jBTCerrarSesionAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jPaqImagenes/salir.png"))); // NOI18N
        jBTCerrarSesionAdmin.setText("CERRAR SESION");
        jBTCerrarSesionAdmin.setToolTipText("");
        jBTCerrarSesionAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBTCerrarSesionAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBTCerrarSesionAdmin.setIconTextGap(40);
        jBTCerrarSesionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCerrarSesionAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSalirLayout = new javax.swing.GroupLayout(jPSalir);
        jPSalir.setLayout(jPSalirLayout);
        jPSalirLayout.setHorizontalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jBTCerrarSesionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPSalirLayout.setVerticalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalirLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jBTCerrarSesionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTPMenuAdmin.addTab("SALIR", jPSalir);

        jLUsuarioLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLUsuarioLogin.setForeground(new java.awt.Color(153, 0, 0));
        jLUsuarioLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUsuarioLogin.setText("ADMINISTRADOR: JHEISON GOMEZ M. ");
        jLUsuarioLogin.setFocusable(false);
        jLUsuarioLogin.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTPMenuAdmin))
                .addContainerGap())
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUsuarioLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTPMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarUsuarioActionPerformed
         GuiRegistrarUsuario objRegistrarUsuario = new GuiRegistrarUsuario();
         objRegistrarUsuario.show();
    }//GEN-LAST:event_jBTRegistrarUsuarioActionPerformed

    private void jBTRegistrarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarTarifaActionPerformed
       GuiRegistrarTarifa objRegistrarTarifa = new  GuiRegistrarTarifa();
       objRegistrarTarifa.show();
    }//GEN-LAST:event_jBTRegistrarTarifaActionPerformed

    private void jBTRegistrarTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTRegistrarTipoVehiculoActionPerformed
       GuiRegistarVehiculo objRegistarVehiculo = new GuiRegistarVehiculo();
       objRegistarVehiculo.show();
    }//GEN-LAST:event_jBTRegistrarTipoVehiculoActionPerformed

    private void jBTCerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCerrarSesionAdminActionPerformed
        GuiLogin objLogin = new GuiLogin();
        objLogin.show();
        dispose();
    }//GEN-LAST:event_jBTCerrarSesionAdminActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCerrarSesionAdmin;
    private javax.swing.JButton jBTRegistrarTarifa;
    private javax.swing.JButton jBTRegistrarTipoVehiculo;
    private javax.swing.JButton jBTRegistrarUsuario;
    private javax.swing.JLabel jLUsuarioLogin;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jTPArchivo;
    private javax.swing.JTabbedPane jTPMenuAdmin;
    private javax.swing.JPanel jpFondo;
    // End of variables declaration//GEN-END:variables

   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("jPaqImagenes/coche.png"));
        return retValue;
    }
}
