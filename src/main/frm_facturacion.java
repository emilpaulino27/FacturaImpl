
package main;

import connection.conn;
import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.jfree.util.Log.info;
import static org.jfree.util.Log.info;


public final class frm_facturacion extends javax.swing.JFrame {

   /* String info = frm_insert_clients.txt_usuario.getText();
    frm_facturacion.txf_cajera.setText(info);*/
    
    
    int ultimoid;
    Statement st;
    ResultSet rs;
 
    DefaultTableModel dtm;
//    Object[] objeto = new Object[6];
    
    
    public frm_facturacion() throws SQLException {
        initComponents();
        txf_fecha.setText(fecha());
        ObtenerUltimoId();
        
        dtm = new DefaultTableModel();
        dtm.addColumn("COD");
        dtm.addColumn("Nombre");
        dtm.addColumn("Precio");
        dtm.addColumn("Cantidad");
        dtm.addColumn("Total");
        
        this.tbl_productos.setModel(dtm);
       
        
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
        lbl_total = new javax.swing.JLabel();
        txf_subtotal = new javax.swing.JTextField();
        lbl_subtotal = new javax.swing.JLabel();
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

        txf_numfactura.setEditable(false);
        txf_numfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_cajera.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_cajera.setText("Cajera");

        txt_fecha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_fecha.setText("Fecha");

        txf_fecha.setEditable(false);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_productos);

        txt_cliente.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_cliente.setText("Cliente");

        jb_buscarproducto.setText("Buscar Producto");

        txt_numfactura.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txt_numfactura.setText("No. Factura");

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
        jb_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_añadirActionPerformed(evt);
            }
        });

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        jb_guardar.setText("GUARDAR");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jb_imprimir.setText("IMPRIMIR");

        lbl_total.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lbl_total.setText("Total");

        txf_subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbl_subtotal.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lbl_subtotal.setText("Subtotal");

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
                            .addComponent(txf_numfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_fondobLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jb_buscarproducto)))
                        .addGap(32, 32, 32))
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addComponent(jb_guardar)
                        .addGap(129, 129, 129)))
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fondobLayout.createSequentialGroup()
                        .addComponent(txt_fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txt_cajera)
                        .addGap(18, 18, 18)
                        .addComponent(txf_cajera, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txt_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(txf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondobLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondobLayout.createSequentialGroup()
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_subtotal)
                            .addComponent(lbl_total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_subtotal)
                    .addComponent(txf_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_fondobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_imprimir)
                    .addComponent(lbl_total)
                    .addComponent(txf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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

    
    // Función para sumar los totales
    
    public void SumarTotales() {
        
        float subtotal = 0;
        float fila = 0;
        float resultado = 0;
        float total = 0;
        
        try {
            for (int i = 0; i < tbl_productos.getRowCount(); i++) {
                fila =+ Float.parseFloat(dtm.getValueAt(i,4).toString());
                subtotal += fila;
                resultado = (float) (subtotal * 0.18);
                total = resultado + subtotal;
                
                
            } txf_subtotal.setText(Float.toString(subtotal));
//              txt_itbis.setText(Float.toString(resultado));
              txf_total.setText(Float.toString(total));
                
        } catch (NumberFormatException e) {

        }
    }
    
     // Función para restar un subtotal eliminado
      public void RestarSubTotales() {
          
        float total = 0;
        float fila = 0;
        
        try {
            for (int i = 0; i < tbl_productos.getRowCount(); i++) {
                fila =- Float.parseFloat(dtm.getValueAt(i,4).toString());
                total -= fila;
                
            } txf_subtotal.setText(Float.toString(total));
        } catch (NumberFormatException e) {
        }
      }
      
           // Función para restar un subtotal eliminado
      public void RestarTotales() {
          
        float total = 0;
        float fila = 0;
        
        try {
            for (int i = 0; i < tbl_productos.getRowCount(); i++) {
                fila =- Float.parseFloat(dtm.getValueAt(i,4).toString());
                total -= fila;
                
            }
             String subtotalstr = txf_subtotal.getText();
             float subtotal = Float.valueOf(subtotalstr);
            float totalf = (float) (total * 0.18);
            float totalreal = subtotal + totalf;
                
            txf_total.setText(Float.toString(totalreal));
        } catch (NumberFormatException e) {
        }
      }
    
    private void jb_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_añadirActionPerformed
        
        String []info = new String[5];
        info[0] = txf_codigop.getText();
        info[1] = txf_producto.getText();
        info[2] = txf_precio.getText();
        info[3] = txf_cantidad.getText();
        
        String precio = txf_precio.getText();
        String cantidad = txf_cantidad.getText();
       
        float total = Float.parseFloat(txf_precio.getText()) * Float.parseFloat(txf_cantidad.getText());
        info[4] = String.valueOf(total);
        
        
         dtm.addRow(info);
        
         txf_codigop.setText("");
         txf_producto.setText("");
         txf_precio.setText("");
         txf_cantidad.setText("");
         SumarTotales();
              
    }//GEN-LAST:event_jb_añadirActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed

        int fila = tbl_productos.getSelectedRow();
        
        if(fila>=0) {
            
            dtm.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null,"Selección no válida");
            
        } 
         RestarSubTotales();
         RestarTotales();
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        // TODO add your handling code here:
        
        String No_factura = txf_numfactura.getText();
        String Cliente = txf_cliente.getText();
        String Cajera = txf_cajera.getText();
        String Fecha = txf_fecha.getText();
        String monto_total = txf_total.getText();
        
        
        
         if(No_factura.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrega el numero de la factura");
        }
         
         else if(Cliente.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrega el nombre del cliente");
        }
         
         else if(Cajera.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrega el nombre de la cajera");
        } 
        
        else if(Fecha.equals("-"))
        {
            JOptionPane.showMessageDialog(null, "Agrega la fecha de la factura");
        } 
        
        else if(monto_total.equals("-"))
        {
            JOptionPane.showMessageDialog(null, "Agrega el monto total de la factura");
        } 
        
        else{
        PreparedStatement ps;
        String query = "INSERT INTO `ventas`(`id_venta`,`id_cliente`, `id_user`, `fecha_hora`, `monto_total`) VALUES (?,?,?,?,?)";
        try{
            ps = conn.getConnection().prepareStatement(query);
            
            ps.setString(1, No_factura);
            ps.setString(2, Cliente);
            ps.setString(3, Cajera);
            ps.setString(4, Fecha);
            ps.setString(5, monto_total);
               if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Nueva venta agregada");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_insert_clients.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }  
        }
        
     
                                               
            
            
    }//GEN-LAST:event_jb_guardarActionPerformed

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
            String sql = "select max(id_venta) from ventas";
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
                try {
                    new frm_facturacion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_facturacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_añadir;
    private javax.swing.JButton jb_buscarproducto;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_imprimir;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_total;
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
    private javax.swing.JTextField txf_subtotal;
    private javax.swing.JTextField txf_total;
    private javax.swing.JLabel txt_cajera;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_cliente;
    private javax.swing.JLabel txt_codigop;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_numfactura;
    private javax.swing.JLabel txt_precio;
    private javax.swing.JLabel txt_producto;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
