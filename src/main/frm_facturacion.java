
package main;

import connection.conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


public class frm_facturacion extends javax.swing.JFrame {

    int ultimoid;
    Statement st;
    ResultSet rs;
 
    public frm_facturacion() {
        initComponents();
        txf_fecha.setText(fecha());
        
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fondoa = new javax.swing.JPanel();
        pnl_fondob = new javax.swing.JPanel();
        txt_titulo = new javax.swing.JLabel();
        txt_codigop = new javax.swing.JLabel();
        txf_numfactura = new javax.swing.JTextField();
        txt_cajera = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JLabel();
        txf_fecha = new javax.swing.JTextField();
        txf_cajera = new javax.swing.JTextField();
        txt_formapago = new javax.swing.JLabel();
        cmb_formapago = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        txt_cliente = new javax.swing.JLabel();
        txf_cliente = new javax.swing.JTextField();
        jb_buscarproducto = new javax.swing.JButton();
        txt_numfactura = new javax.swing.JLabel();
        txt_producto = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        txt_precio = new javax.swing.JLabel();
        txf_codigop = new javax.swing.JTextField();
        txf_precio = new javax.swing.JTextField();
        txf_producto = new javax.swing.JTextField();
        txf_cantidad = new javax.swing.JTextField();
        jb_añadir = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_imprimir = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        txt_total = new javax.swing.JLabel();
        txf_total = new javax.swing.JTextField();
        pnl_fondon = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_fondoa.setBackground(new java.awt.Color(10, 103, 193));
        pnl_fondoa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fondob.setBackground(new java.awt.Color(255, 255, 255));

        txt_titulo.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        txt_titulo.setText("FACTURACION");

        txt_codigop.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_codigop.setText("Codigo");

        txf_numfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_cajera.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_cajera.setText("Cajera");

        txt_fecha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_fecha.setText("Fecha");

        txt_formapago.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_formapago.setText("Forma Pago");

        cmb_formapago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));
        cmb_formapago.setBorder(null);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_productos);

        txt_cliente.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_cliente.setText("Cliente");

        jb_buscarproducto.setText("Buscar Producto");

        txt_numfactura.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_numfactura.setText("No.Factura");

        txt_producto.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_producto.setText("Producto");

        txt_cantidad.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_cantidad.setText("Cantidad");

        txt_precio.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_precio.setText("Precio");

        txf_codigop.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txf_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jb_añadir.setText("Añadir");

        jb_eliminar.setText("Eliminar");

        jb_guardar.setText("GUARDAR");

        jb_imprimir.setText("IMPRIMIR");

        jb_limpiar.setText("LIMPIAR");

        txt_total.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_total.setText("Total");

        txf_total.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout pnl_fondobLayout = new javax.swing.GroupLayout(pnl_fondob);
        pnl_fondob.setLayout(pnl_fondobLayout);
        pnl_fondobLayout.setHorizontalGroup(
            pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondobLayout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(txt_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_fondobLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_fondobLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jb_añadir)
                            .addGap(51, 51, 51)
                            .addComponent(jb_eliminar))
                        .addComponent(txt_precio)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_imprimir)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_fondobLayout.createSequentialGroup()
                                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_producto)
                                    .addComponent(txt_codigop)
                                    .addComponent(txt_cantidad))
                                .addGap(32, 32, 32)
                                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_codigop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addComponent(txt_numfactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_fondobLayout.createSequentialGroup()
                                .addComponent(txf_numfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha))
                            .addGroup(pnl_fondobLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jb_buscarproducto))))
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addComponent(jb_guardar)
                        .addGap(129, 129, 129)))
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cajera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_cajera, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txt_formapago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(txt_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondobLayout.createSequentialGroup()
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_fondobLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jb_limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_total)
                                .addGap(18, 18, 18)
                                .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_fondobLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        pnl_fondobLayout.setVerticalGroup(
            pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondobLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txt_titulo)
                .addGap(31, 31, 31)
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_numfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cajera)
                    .addComponent(txt_fecha)
                    .addComponent(txf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cajera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_formapago)
                    .addComponent(cmb_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numfactura)
                    .addComponent(txt_cliente)
                    .addComponent(txf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addComponent(jb_buscarproducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigop)
                            .addComponent(txf_codigop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_producto)
                            .addComponent(txf_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_precio)
                            .addComponent(txf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad)
                            .addComponent(txf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_añadir)
                            .addComponent(jb_eliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_guardar)
                            .addComponent(jb_imprimir)
                            .addComponent(jb_limpiar))
                        .addGap(37, 37, 37))
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total))
                        .addContainerGap(58, Short.MAX_VALUE))))
        );

        pnl_fondoa.add(pnl_fondob, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 950, 570));

        pnl_fondon.setBackground(new java.awt.Color(232, 122, 20));

        javax.swing.GroupLayout pnl_fondonLayout = new javax.swing.GroupLayout(pnl_fondon);
        pnl_fondon.setLayout(pnl_fondonLayout);
        pnl_fondonLayout.setHorizontalGroup(
            pnl_fondonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        pnl_fondonLayout.setVerticalGroup(
            pnl_fondonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        pnl_fondoa.add(pnl_fondon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fondoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      // Función que pone la fecha automática
     public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
     
      // Función que genera el id de la factura automático
       private void ObtenerUltimoId() throws SQLException {
        try {
            Connection con = conn.getConnection();
            String sql = "select max(id_ventas) from ventas";
            st = con.createStatement();
            
            rs = st.executeQuery(sql);
            if (rs.next()) {
                ultimoid = rs.getInt(1);
                ultimoid++;
                frm_facturacion.txf_numfactura.setText(Integer.toString(ultimoid));
            } else { 
            }  
           
             } catch (SQLException ex) { 
        }
    }

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
            java.util.logging.Logger.getLogger(frm_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_formapago;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_añadir;
    private javax.swing.JButton jb_buscarproducto;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_imprimir;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JPanel pnl_fondoa;
    private javax.swing.JPanel pnl_fondob;
    private javax.swing.JPanel pnl_fondon;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txf_cajera;
    private javax.swing.JTextField txf_cantidad;
    private javax.swing.JTextField txf_cliente;
    private javax.swing.JTextField txf_codigop;
    private javax.swing.JTextField txf_fecha;
    public static javax.swing.JTextField txf_numfactura;
    private javax.swing.JTextField txf_precio;
    private javax.swing.JTextField txf_producto;
    private javax.swing.JTextField txf_total;
    private javax.swing.JLabel txt_cajera;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_cliente;
    private javax.swing.JLabel txt_codigop;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_formapago;
    private javax.swing.JLabel txt_numfactura;
    private javax.swing.JLabel txt_precio;
    private javax.swing.JLabel txt_producto;
    private javax.swing.JLabel txt_titulo;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables
}
