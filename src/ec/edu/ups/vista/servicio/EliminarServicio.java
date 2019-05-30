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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Carlos
 */
public class EliminarServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form EliminarServicio
     */
    private ControladorServicio controladorservicio;
        public static String x;
        
        private ResourceBundle mensajes;
         public ImageIcon imgs[];
    public EliminarServicio(ControladorServicio controladorservicio,ResourceBundle mensajes) {
        initComponents();
        imgs = new ImageIcon[6];
        imgs[1]= new ImageIcon("src/ec/edu/ups/imagenes/22.png");
        imgs[2]= new ImageIcon("src/ec/edu/ups/imagenes/3.png");
        imgs[3]= new ImageIcon("src/ec/edu/ups/imagenes/333.png");
        imgs[4]= new ImageIcon("src/ec/edu/ups/imagenes/44.png");
        imgs[5]= new ImageIcon("src/ec/edu/ups/imagenes/5555.png");
        this.controladorservicio = controladorservicio;
        x="x";
         int a=VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
     this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        le.setText(mensajes.getString("titulos.eliminar"));
        labelc.setText(mensajes.getString("servicio.codigo"));
        labeln.setText(mensajes.getString("servicio.nombre"));
        labelp.setText(mensajes.getString("servicio.precio"));

        bb.setText(mensajes.getString("servicio.bbuscar"));
        bc.setText(mensajes.getString("servicio.bcancelar"));
        be.setText(mensajes.getString("servicio.beliminar"));
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
        be = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        le = new javax.swing.JLabel();

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
        jPanel1.setAutoscrolls(true);
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bc.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bc.setText("Cancelar");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        jPanel1.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 40));

        bb.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bb.setText("Buscar");
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        jPanel1.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, 40));

        txtprecio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtprecio.setEnabled(false);
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, 40));

        labelp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelp.setText("PRECIO:");
        labelp.setToolTipText("");
        jPanel1.add(labelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        txtnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.setEnabled(false);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 40));

        labeln.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeln.setText("NOMBRE:");
        jPanel1.add(labeln, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        labelc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelc.setText("CODIGO:");
        jPanel1.add(labelc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        txtcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 210, 40));

        be.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        be.setText("Eliminar");
        be.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beActionPerformed(evt);
            }
        });
        jPanel1.add(be, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 40));

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 180, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, 320));

        le.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        le.setText("ELIMINAR SERVICIO");
        getContentPane().add(le, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 500, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:
  this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_bcActionPerformed
 public void checar(){
    if("baño".equals(txtnombre.getText())){
        imagen.setIcon(imgs[1]);
    }
    if("limpieza dental".equals(txtnombre.getText())){
        imagen.setIcon(imgs[2]);
    }
    if("corte de pelo".equals(txtnombre.getText())){
        imagen.setIcon(imgs[3]);
    }
    if("corte de uñas".equals(txtnombre.getText())){
        imagen.setIcon(imgs[4]);
    }
    if("comprar alimento".equals(txtnombre.getText())){
        imagen.setIcon(imgs[5]);
    }
 }
    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        // TODO add your handling code here:
      
        int codigo = Integer.parseInt(txtcodigo.getText());
        Servicio bservicio = controladorservicio.read(codigo);
        if (bservicio == null) {
            JOptionPane.showMessageDialog(null, "El servicio no existe");
        } else {
        txtnombre.setText(bservicio.getNombreservicio());
        txtprecio.setText(String.valueOf(bservicio.getPrecio()));
        }
        checar();
    }//GEN-LAST:event_bbActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void beActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beActionPerformed
        // TODO add your handling code here:
         JPasswordField admin = new JPasswordField();
         
if(JOptionPane.showConfirmDialog(null, admin, "Ingrese contraseña para eliminar",JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
    
}
        int codigo = Integer.parseInt(txtcodigo.getText());
        controladorservicio.delete(codigo);
        JOptionPane.showMessageDialog(this, "Servicio eliminado exitosamente!!", "Eliminar servicio" , JOptionPane.OK_OPTION);
       txtcodigo.setText("");
        txtnombre.setText("");
        txtprecio.setText("");
        checar();
      
        imagen.setIcon(null);
    }//GEN-LAST:event_beActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bb;
    private javax.swing.JButton bc;
    private javax.swing.JButton be;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelc;
    private javax.swing.JLabel labeln;
    private javax.swing.JLabel labelp;
    private javax.swing.JLabel le;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
