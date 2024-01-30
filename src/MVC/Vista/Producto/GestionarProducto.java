package MVC.Vista.Producto;

import MVC.Controlador.Ctrl_Productos;
import MVC.Vista.Usuarios.GestionarUsers;
import static MVC.Vista.Usuarios.GestionarUsers.jtListUser;
import MVC.modelo.Producto;
import dataContext.Messages;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class GestionarProducto extends javax.swing.JInternalFrame {

    Messages dataContext = new Messages();

    public int idProducto;
    int getIdCategoriaCambo = 0;

    public GestionarProducto() {
        initComponents();
        this.LoadListProduct();
        this.LoadCategorias();
        this.unShowSaveChange();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);

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
        panelForm = new javax.swing.JPanel();
        NOMBRE = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        CANTIDAD = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        PRECIO = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        DESCRIPCION = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        IVA = new javax.swing.JLabel();
        cbxIva = new javax.swing.JComboBox<>();
        CATEGORIA = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        wallpaper = new javax.swing.JLabel();

        setBorder(null);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 5, 40, 40));

        TITLE.setBackground(new java.awt.Color(0, 0, 0));
        TITLE.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("GESTIONAR PRODUCTOS DEL ALMACEN");
        TITLE.setOpaque(true);
        getContentPane().add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 1200, 40));

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

        JPanelList.add(jScrollPaneListProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 350));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelList.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 80));

        getContentPane().add(JPanelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 950, 350));

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
        ELIMINAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ELIMINAR.setText("ELIMINAR PRODUCTO");
        panelButtons.add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, -1));

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
        panelButtons.add(btnEditProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 100));

        EDITAR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        EDITAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EDITAR.setText("EDITAR PRODUCTO");
        panelButtons.add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, -1));

        btnAddProdcut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/addProduct.png"))); // NOI18N
        btnAddProdcut.setBorderPainted(false);
        btnAddProdcut.setContentAreaFilled(false);
        btnAddProdcut.setFocusPainted(false);
        btnAddProdcut.setFocusable(false);
        btnAddProdcut.setRequestFocusEnabled(false);
        btnAddProdcut.setVerifyInputWhenFocusTarget(false);
        panelButtons.add(btnAddProdcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        AGREGAR.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        AGREGAR.setText("AGREGAR PRODUCTO");
        panelButtons.add(AGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 200, 350));

        panelForm.setBackground(new java.awt.Color(255, 255, 255));
        panelForm.setForeground(new java.awt.Color(255, 255, 255));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NOMBRE.setBackground(new java.awt.Color(255, 255, 255));
        NOMBRE.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(0, 153, 255));
        NOMBRE.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        NOMBRE.setText("NOMBRE(S)");
        NOMBRE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        txtNombre.setBackground(new java.awt.Color(255, 153, 51));
        txtNombre.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelForm.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 30));

        CANTIDAD.setBackground(new java.awt.Color(255, 255, 255));
        CANTIDAD.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        CANTIDAD.setForeground(new java.awt.Color(0, 153, 255));
        CANTIDAD.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        CANTIDAD.setText("CANTIDAD");
        CANTIDAD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(CANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 20));

        txtCantidad.setBackground(new java.awt.Color(255, 153, 51));
        txtCantidad.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        panelForm.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 230, 30));

        PRECIO.setBackground(new java.awt.Color(255, 255, 255));
        PRECIO.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        PRECIO.setForeground(new java.awt.Color(0, 153, 255));
        PRECIO.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PRECIO.setText("PRECIO");
        PRECIO.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, 20));

        txtPrecio.setBackground(new java.awt.Color(255, 153, 51));
        txtPrecio.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        panelForm.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 230, 30));

        DESCRIPCION.setBackground(new java.awt.Color(255, 255, 255));
        DESCRIPCION.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DESCRIPCION.setForeground(new java.awt.Color(0, 153, 255));
        DESCRIPCION.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        DESCRIPCION.setText("DESCRIPCION");
        DESCRIPCION.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(DESCRIPCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, -1, 20));

        txtDescripcion.setBackground(new java.awt.Color(255, 153, 51));
        txtDescripcion.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        panelForm.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 230, 30));

        IVA.setBackground(new java.awt.Color(255, 255, 255));
        IVA.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        IVA.setForeground(new java.awt.Color(0, 153, 255));
        IVA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        IVA.setText("IVA");
        IVA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 20));

        cbxIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", "12%", "I14%" }));
        cbxIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIvaActionPerformed(evt);
            }
        });
        panelForm.add(cbxIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 30));

        CATEGORIA.setBackground(new java.awt.Color(255, 255, 255));
        CATEGORIA.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        CATEGORIA.setForeground(new java.awt.Color(0, 153, 255));
        CATEGORIA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        CATEGORIA.setText("CATEGORIA");
        CATEGORIA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelForm.add(CATEGORIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 20));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        panelForm.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 230, 30));

        getContentPane().add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1140, -1));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hola1200X400.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletProductActionPerformed
        Connection cn = conexion.Conexion.conectar();
        if (!txtNombre.getText().isEmpty()
                || !txtCantidad.getText().isEmpty()
                || !txtPrecio.getText().isEmpty()
                || !txtPrecio.getText().isEmpty()
                || !txtDescripcion.getText().isEmpty()) {
            Producto producto = new Producto();
            Ctrl_Productos ctrl_Productos = new Ctrl_Productos();
            producto.setNombre(txtNombre.getText().trim());
            producto.setCantidad(txtCantidad.getText().trim());
            //producto.setPrecio(Integer.parseInt(txtPrecio.getText().trim()));
            producto.setDescripcion(txtDescripcion.getText().trim());
            if (!ctrl_Productos.DeletProduc(idProducto)) {
                unShowSaveChange();
                dataContext.successfullDeleted();
            }
        } else {
        }

        LoadListProduct();
    }//GEN-LAST:event_btnDeletProductActionPerformed

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cbxIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIvaActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGREGAR;
    private javax.swing.JLabel CANTIDAD;
    private javax.swing.JLabel CATEGORIA;
    private javax.swing.JLabel DESCRIPCION;
    private javax.swing.JLabel EDITAR;
    private javax.swing.JLabel ELIMINAR;
    private javax.swing.JLabel IVA;
    private javax.swing.JPanel JPanelList;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel PRECIO;
    private javax.swing.JLabel TITLE;
    private javax.swing.JButton btnAddProdcut;
    private javax.swing.JButton btnDeletProduct;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxIva;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPaneListProduct;
    public static javax.swing.JTable jtListProduct;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelForm;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    private void LoadListProduct() {
        Connection cn = conexion.Conexion.conectar();
//        DefaultTableModel tblModel = new DefaultTableModel(null, null) {
//            @Override
//            public boolean isCellEditable(int filas, int columnas) {
//                // return super.isCellEditable(row, column);
//                if (columnas == 5) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } 
DefaultTableModel tblModel = new DefaultTableModel();
        String sql = "SELECT * FROM tb_producto;";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            GestionarProducto.jtListProduct = new JTable(tblModel);
            GestionarProducto.jScrollPaneListProduct.setViewportView(GestionarProducto.jtListProduct);
                        tblModel.addColumn("idProducto");
            tblModel.addColumn("nombre");
            tblModel.addColumn("cantidad");
            tblModel.addColumn("precio");
            tblModel.addColumn("descripcion");
            tblModel.addColumn("porcentajeIva");
            tblModel.addColumn("idCategoria");
            tblModel.addColumn("estado");
            System.out.println(rs);
            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tblModel.addRow(fila);
                System.out.println(fila);
                //   JOptionPane.showMessageDialog(null, fila[1]);
            }
            cn.close();
            GestionarProducto.jtListProduct.removeColumn(jtListProduct.getColumnModel().getColumn(0));
            GestionarProducto.jtListProduct.setGridColor(new java.awt.Color(51, 0, 204));
            GestionarProducto.jtListProduct.setRowHeight(32);
            GestionarProducto.jScrollPaneListProduct.setViewportView(jtListProduct);
            jtListProduct.setBackground(new java.awt.Color(235, 235, 192));
        } catch (SQLException e) {
        }
        jtListProduct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnDeletProduct.setEnabled(true);
                btnEditProduct.setEnabled(true);
                int fila_point = jtListProduct.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) tblModel.getValueAt(fila_point, columna_point);
                    // int dataT = (int) tblModel.getValueAt(0, 0);
                    sendProductSelect(idProducto);
                    //  System.out.println("la dataT ES: "+dataT);
//                    if (columna_point ==dataT) {
//                    JOptionPane.showMessageDialog(null, "PULSASRE LA FILA 1");
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null, "NO PULSASRE LA FILA 1");
//                            }
                } else {
                }
            }

            private void sendProductSelect(int idProducto) {
                try {
                    Connection cn = conexion.Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM tb_producto where idProducto = '" + idProducto + "'");
                    ResultSet rs = pst.executeQuery();
                    System.out.println(rs);

                    if (rs.next()) {
                        txtNombre.setText(rs.getString("nombre"));
                        txtCantidad.setText(rs.getString("cantidad"));
                        txtPrecio.setText(rs.getString("precio"));
                        txtDescripcion.setText(rs.getString("descripcion"));
                        //cbxIv.setText(rs.getString("telefono"));
                        //txtTipoUser.setText(rs.getString("estado"));
                    }
                    cn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL SELECCIONAR EL REGISTRO: " + e);
                }

            }
        });
        
        
        //jtListProduct.isCellEditable(null, tblModel){
        //        DefaultTableModel tblModel = new DefaultTableModel(null, null) {
//            @Override
//            public boolean isCellEditable(int filas, int columnas) {
//                // return super.isCellEditable(row, column);
//                if (columnas == 5) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } 
   // }
    }
//    private void LoadListProduct() {
//        Connection cn = conexion.Conexion.conectar();
//        DefaultTableModel listProduct = new DefaultTableModel();
//        String sentencia = "SELECT * FROM tb_producto";
//        Statement st;
//
//        try {
//            st = cn.createStatement();
//            ResultSet rst = st.executeQuery(sentencia);
//            GestionarProducto.jtListProduct = new JTable(listProduct);
//            GestionarProducto.jScrollPaneListProduct.setViewportView(GestionarProducto.jtListProduct);
//            listProduct.addColumn("nombre");
//            listProduct.addColumn("cantidad");
//            listProduct.addColumn("precio");
//            listProduct.addColumn("descripcion");
//            listProduct.addColumn("porcentajeIva");
//            listProduct.addColumn("estado");
//            while (rst.next()) {
//                Object fila[] = new Object[8];
//                for (int i = 0; i < 8; i++) {
//                    fila[i] = rst.getObject(i + 1);
//                }
//                listProduct.addRow(fila);
//            }
//            cn.close();
//            GestionarProducto.jtListProduct.setGridColor(new java.awt.Color(51, 0, 204));
//            GestionarProducto.jtListProduct.setRowHeight(32);
//            GestionarProducto.jScrollPaneListProduct.setViewportView(JPanelList);
//            jtListProduct.setBackground(new java.awt.Color(235, 235, 192));
//
//        } catch (SQLException ex) {
//            Logger.getLogger(GestionarProducto.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    private void LoadCategorias() {
        Connection cn = conexion.Conexion.conectar();
        String consulta = "SELECT * FROM tb_categoria";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            cbxCategoria.removeAllItems();
            cbxCategoria.addItem("SELECCIONE CATEGORIA");
            while (rs.next()) {

                cbxCategoria.addItem(rs.getString("descripcion"));
            }

            cn.close();

        } catch (SQLException ex) {

        }

    }

    private void unShowSaveChange() {
        btnDeletProduct.setEnabled(false);
        btnEditProduct.setEnabled(false);

    }
}
