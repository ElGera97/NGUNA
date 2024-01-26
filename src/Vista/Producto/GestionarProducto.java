package Vista.Producto;

public class GestionarProducto extends javax.swing.JInternalFrame {

    public GestionarProducto() {
        initComponents();
        this.LoadListProduct();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TITLE = new javax.swing.JLabel();
        JPanelList = new javax.swing.JPanel();
        jScrollPaneListProduct = new javax.swing.JScrollPane();
        jtListProduct = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        btnDeletProduct = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JLabel();
        btnEditProduct = new javax.swing.JButton();
        EDITAR = new javax.swing.JLabel();
        btnAddProdcut = new javax.swing.JButton();
        AGREGAR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCantidaqwd = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtGr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        wallpaper = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 40, 40));

        TITLE.setBackground(new java.awt.Color(0, 0, 0));
        TITLE.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("GESTIONAR PRODUCTOS DEL ALMACEN");
        TITLE.setOpaque(true);
        getContentPane().add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        JPanelList.setOpaque(false);
        JPanelList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneListProduct.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPaneListProduct.setForeground(new java.awt.Color(255, 255, 255));

        jtListProduct.setBackground(new java.awt.Color(0, 0, 0));
        jtListProduct.setForeground(new java.awt.Color(255, 255, 255));
        jtListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtListProduct.setGridColor(new java.awt.Color(51, 0, 204));
        jtListProduct.setRowHeight(32);
        jScrollPaneListProduct.setViewportView(jtListProduct);

        JPanelList.add(jScrollPaneListProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 290));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelList.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 80));

        getContentPane().add(JPanelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 600, 310));

        panelButtons.setBackground(new java.awt.Color(0, 0, 0));
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeletProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/deletProduct.png"))); // NOI18N
        btnDeletProduct.setBorderPainted(false);
        btnDeletProduct.setContentAreaFilled(false);
        btnDeletProduct.setDefaultCapable(false);
        btnDeletProduct.setFocusPainted(false);
        btnDeletProduct.setFocusable(false);
        btnDeletProduct.setRequestFocusEnabled(false);
        btnDeletProduct.setVerifyInputWhenFocusTarget(false);
        btnDeletProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletProductActionPerformed(evt);
            }
        });
        panelButtons.add(btnDeletProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 110, 90));

        ELIMINAR.setBackground(new java.awt.Color(0, 0, 0));
        ELIMINAR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        ELIMINAR.setText("ELIMINAR PRODUCTO");
        panelButtons.add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        btnEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editProduct.png"))); // NOI18N
        btnEditProduct.setBorderPainted(false);
        btnEditProduct.setContentAreaFilled(false);
        btnEditProduct.setDefaultCapable(false);
        btnEditProduct.setFocusPainted(false);
        btnEditProduct.setFocusable(false);
        btnEditProduct.setRequestFocusEnabled(false);
        btnEditProduct.setVerifyInputWhenFocusTarget(false);
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });
        panelButtons.add(btnEditProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 130, 100));

        EDITAR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        EDITAR.setText("EDITAR PRODUCTO");
        panelButtons.add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        btnAddProdcut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addProduct.png"))); // NOI18N
        btnAddProdcut.setBorderPainted(false);
        btnAddProdcut.setContentAreaFilled(false);
        btnAddProdcut.setFocusPainted(false);
        btnAddProdcut.setFocusable(false);
        btnAddProdcut.setRequestFocusEnabled(false);
        btnAddProdcut.setVerifyInputWhenFocusTarget(false);
        panelButtons.add(btnAddProdcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        AGREGAR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        AGREGAR.setText("AGREGAR PRODUCTO");
        panelButtons.add(AGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 65, 560, 120));

        jPanel2.setBackground(new java.awt.Color(204, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(255, 153, 51));
        txtNombre.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 30));

        txtCantidaqwd.setBackground(new java.awt.Color(255, 153, 51));
        txtCantidaqwd.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtCantidaqwd.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtCantidaqwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 230, 80));

        txtCantidad.setBackground(new java.awt.Color(255, 153, 51));
        txtCantidad.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        txtGr.setBackground(new java.awt.Color(255, 153, 51));
        txtGr.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtGr.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, 30));

        jTextArea1.setBackground(new java.awt.Color(255, 153, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 560, 170));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hola1200X400.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletProductActionPerformed

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGREGAR;
    private javax.swing.JLabel EDITAR;
    private javax.swing.JLabel ELIMINAR;
    private javax.swing.JPanel JPanelList;
    private javax.swing.JLabel TITLE;
    private javax.swing.JButton btnAddProdcut;
    private javax.swing.JButton btnDeletProduct;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPaneListProduct;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTable jtListProduct;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidaqwd;
    private javax.swing.JTextField txtGr;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    private void LoadListProduct() {
        
    }
}
