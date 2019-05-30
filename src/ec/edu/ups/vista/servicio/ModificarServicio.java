/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.servicio;

import ec.edu.ups.Modelo.Servicio;
import ec.edu.ups.controladores.ControladorServicio;
import ec.edu.ups.vista.VistaPrincipal;
import static ec.edu.ups.vista.cliente.CrearCliente.x;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ModificarServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarServicio
     */
    private ControladorServicio controladorservicio;
    public static String x;
    private ResourceBundle mensajes;

    public ModificarServicio(ControladorServicio controladorservicio, ResourceBundle mensajes) {
        initComponents();
        this.controladorservicio = controladorservicio;
        x = "x";
        int a = VistaPrincipal.DesktopPane.getWidth() - this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
        setVisible(true);
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        lm.setText(mensajes.getString("titulos.modificar"));
        labelc.setText(mensajes.getString("servicio.codigo"));
        labeln.setText(mensajes.getString("servicio.nombre"));
        labelp.setText(mensajes.getString("servicio.precio"));

        bb.setText(mensajes.getString("servicio.bbuscar"));
        bc.setText(mensajes.getString("servicio.bcancelar"));
        bm.setText(mensajes.getString("servicio.bmodificar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bc = new javax.swing.JButton();
        bb = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        labelp = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        labeln = new javax.swing.JLabel();
        labelc = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        bm = new javax.swing.JButton();
        lm = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bc.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bc.setText("Cancelar");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        jPanel1.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, 40));

        bb.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bb.setText("Buscar");
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        jPanel1.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 40));

        txtprecio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, 40));

        labelp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelp.setText("PRECIO:");
        labelp.setToolTipText("");
        jPanel1.add(labelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, 40));

        txtnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 220, 40));

        labeln.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeln.setText("NOMBRE:");
        jPanel1.add(labeln, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 40));

        labelc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelc.setText("CODIGO:");
        jPanel1.add(labelc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 40));

        txtcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 40));

        bm.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bm.setText("Modificar");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });
        jPanel1.add(bm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 330));

        lm.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        lm.setText("MODIFICAR SERVICIO");
        getContentPane().add(lm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_bcActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtcodigo.getText());
        Servicio buscarProducto = controladorservicio.read(codigo);
        txtnombre.setText(buscarProducto.getNombreservicio());
        txtprecio.setText(String.valueOf(buscarProducto.getPrecio()));
    }//GEN-LAST:event_bbActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
        // TODO add your handling code here:
        Servicio modificar = controladorservicio.read(Integer.parseInt(txtcodigo.getText()));
        modificar.setNombreservicio(txtnombre.getText());
        modificar.setPrecio(Double.parseDouble(txtprecio.getText()));
        controladorservicio.update(modificar);

        JOptionPane.showMessageDialog(this, "Producto Actualizado exitosamente", "Actualizar producto", JOptionPane.OK_OPTION);
        txtnombre.setText("");
        txtprecio.setText("");
    }//GEN-LAST:event_bmActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x = null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bb;
    private javax.swing.JButton bc;
    private javax.swing.JButton bm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelc;
    private javax.swing.JLabel labeln;
    private javax.swing.JLabel labelp;
    private javax.swing.JLabel lm;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
