package Vista;

import Vista.Index.FrmMenu;
import Controlador.Ctrl_usuario;
import dataContext.Messages;
import modelo.Usuario;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Login extends javax.swing.JFrame {

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMAS DE VENTAS");
        this.setSize(new Dimension(1000, 550));
    }

    public Image getIconImge() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/ventas.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel3ComponentAdded(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DPAGE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204,0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 236));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 135, 25));
        jLabel4.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user2.png"))); // NOI18N
        jLabel4.setText("USUARIO:");
        jLabel4.setIconTextGap(5);
        jLabel4.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel4.setName(""); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 40));

        txt_usuario.setBackground(new java.awt.Color(0, 0, 0));
        txt_usuario.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setToolTipText("");
        txt_usuario.setActionCommand("<Not Set>");
        txt_usuario.setAlignmentX(0.0F);
        txt_usuario.setAlignmentY(0.0F);
        txt_usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 1));
        txt_usuario.setMargin(new java.awt.Insets(10, 0, 0, 0));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 40));

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/password.png"))); // NOI18N
        jLabel6.setText("CONTRASEÑA:");
        jLabel6.setAlignmentY(0.0F);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, 40));

        txt_password.setBackground(new java.awt.Color(0, 0, 0));
        txt_password.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_password.setToolTipText("");
        txt_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 1));
        txt_password.setMargin(new java.awt.Insets(10, 0, 0, 0));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 255, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnIniciarSesion.setText("INGRESAR");
        btnIniciarSesion.setAlignmentY(0.0F);
        btnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIniciarSesion.setIconTextGap(0);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user1.png"))); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIconTextGap(8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 176, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 300, 420));

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/117300855_1852775574898508_4093713126664909466_n.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        this.Login();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Recordatorios();
            this.Login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void jPanel3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel3ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3ComponentAdded

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    //Funcion para conectar credenciales
    private void Login() {
        Messages datacontext = new Messages();
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            Ctrl_usuario controlUsuario = new Ctrl_usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());
            if (controlUsuario.loginUser(usuario)) {
                if (datacontext.mensageDeBienvenida() == true) {
                    FrmMenu menu = new FrmMenu();
                    menu.setVisible(true);
                    this.dispose();
                }
            } else {
                datacontext.userDataIncorrect();
            }
        } else {
            datacontext.dataEmty();
        }
    }

    private void Recordatorios() {
        //   Ctrl_recordatorios  = new Ctrl_recordatorios();
        // Recordatorio recordatorio = new Recordatorio();
        //String motivo_activi = null;
        //String msnfecha = null;
        //recordatorio.setMotivo_actividad(motivo_activi);
        //recordatorio.setFecha(msnfecha);
        //System.out.println(motivo_activi);
        //if (controlRecordatorio.recordatorio(recordatorio)) {
        //  System.out.println(motivo_activi);
        //JOptionPane.showMessageDialog(null, msnfecha);
        //JOptionPane.showMessageDialog(null, "ALERTA SOBRE EL NEGOCIO, POR SI QUEDA ALUNA ACTIVIDAD PENDIENTE");
        //Intanciamineto de la vista MENU
        // }
    }

}
