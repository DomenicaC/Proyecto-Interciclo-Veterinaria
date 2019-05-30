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
    public ModificarServicio(ControladorServicio controladorservicio) {
        initComponents();
        this.controladorservicio = controladorservicio;
        x="x";
         int a=VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
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
        cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        JCE = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        JN = new javax.swing.JLabel();
        LCODIGO = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        cancelar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, 40));

        Aceptar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        Aceptar.setText("Buscar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 40));

        txtprecio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 220, 40));

        JCE.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        JCE.setText("PRECIO:");
        JCE.setToolTipText("");
        jPanel1.add(JCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, 40));

        txtnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 220, 40));

        JN.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        JN.setText("NOMBRE:");
        jPanel1.add(JN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 40));

        LCODIGO.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        LCODIGO.setText("CODIGO:");
        jPanel1.add(LCODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 40));

        txtcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 40));

        jButton1.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 330));

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("MODIFICAR SERVICIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:

     this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_cancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
         int codigo = Integer.parseInt(txtcodigo.getText());
        Servicio buscarProducto = controladorservicio.read(codigo);
        txtnombre.setText(buscarProducto.getNombreservicio());
        txtprecio.setText(String.valueOf(buscarProducto.getPrecio()));
    }//GEN-LAST:event_AceptarActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Servicio modificar = controladorservicio.read(Integer.parseInt(txtcodigo.getText()));
        modificar.setNombreservicio(txtnombre.getText());
        modificar.setPrecio(Double.parseDouble(txtprecio.getText()));
        controladorservicio.update(modificar);

        JOptionPane.showMessageDialog(this, "Producto Actualizado exitosamente", "Actualizar producto", JOptionPane.OK_OPTION);
        txtnombre.setText("");
        txtprecio.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel JCE;
    private javax.swing.JLabel JN;
    private javax.swing.JLabel LCODIGO;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
