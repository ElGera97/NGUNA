package MVC.Vista.Categoria;

import MVC.Controlador.Ctrl_Categoria;
import javax.swing.JOptionPane;
import MVC.modelo.Categoria;

public class newCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterCategoria
     */
    public newCategoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerToolbar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        containerForm = new javax.swing.JPanel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAlignmentX(130.0F);
        setAlignmentY(60.0F);
        setDoubleBuffered(true);
        setOpaque(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerToolbar.setBackground(new java.awt.Color(0, 0, 0));
        containerToolbar.setForeground(new java.awt.Color(0, 0, 0));
        containerToolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUEVA CATEGORIA");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        containerToolbar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 600, 40));

        getContentPane().add(containerToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        containerForm.setBackground(new java.awt.Color(255, 255, 255));
        containerForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        containerForm.setForeground(new java.awt.Color(255, 51, 51));
        containerForm.setToolTipText("");
        containerForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_descripcion.setBackground(new java.awt.Color(0, 0, 0));
        txt_descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        containerForm.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 300, 35));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESCRIPCIÓN:");
        containerForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 35));

        getContentPane().add(containerForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 500, 55));

        btn_guardar.setBackground(new java.awt.Color(51, 255, 51));
        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("GUARDAR");
        btn_guardar.setFocusPainted(false);
        btn_guardar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_guardar.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_guardar.setMinimumSize(new java.awt.Dimension(0, 0));
        btn_guardar.setVerifyInputWhenFocusTarget(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 30));
        btn_guardar.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoForm400-600.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        //Se manda a crear la CATEGORIA y El CONTROLADOR
        Categoria categoria = new Categoria();
        Ctrl_Categoria ctrl_Categoria = new Ctrl_Categoria();

        //VALIDACION DE CAMPOS       
        if (txt_descripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR ALGUN NOMBRE DE LA CATEGORIA");
        } else {
            if (!ctrl_Categoria.comprobarExistente(txt_descripcion.getText().trim())) {
                categoria.setDescripcion(txt_descripcion.getText().trim());
                categoria.setEstado(1);
                if (ctrl_Categoria.guardarCategoria(categoria)) {
                    JOptionPane.showMessageDialog(null, "CATEGORIA REGISTRADA EXTISOAMENTE");
                } else {
                    JOptionPane.showMessageDialog(null, "ALGO SALIO MAL AL MOMENTO DE REGISTRAR LA CATEGORIA");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ALGO SALIO MAL, AL PARECER LA CATEGORIA YA EXISTE");
            }
        }
        txt_descripcion.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JPanel containerForm;
    private javax.swing.JPanel containerToolbar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

    
}
