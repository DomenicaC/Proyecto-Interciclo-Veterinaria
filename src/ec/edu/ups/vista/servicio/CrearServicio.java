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

/**
 *
 * @author Carlos
 */
public class CrearServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private ControladorServicio controladorservicio;
    public static String x;
    private ResourceBundle mensajes;
    public String msgs[];
    public ImageIcon imgs[];

    public CrearServicio(ControladorServicio controladorservicio, ResourceBundle mensajes) {
        initComponents();
        msgs= new String[5];
        imgs = new ImageIcon[6];
        this.controladorservicio = controladorservicio;
        txtcp.setText(Integer.toString(this.controladorservicio.getCodigo()));
        x = "x";
        int a = VistaPrincipal.DesktopPane.getWidth() - this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
        setVisible(true);
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        
        msgs[0] = "baño".toUpperCase();
        msgs[1] = "limpieza dental".toUpperCase();
        msgs[2] = "corte de pelo".toUpperCase();
        msgs[3] = "corte de uñas".toUpperCase();       
        msgs[4] = "comprar alimento".toUpperCase();
        
         
        imgs[0]= new ImageIcon("src/ec/edu/ups/imagenes/1.png");
        imgs[1]= new ImageIcon("src/ec/edu/ups/imagenes/22.png");
        imgs[2]= new ImageIcon("src/ec/edu/ups/imagenes/3.png");
        imgs[3]= new ImageIcon("src/ec/edu/ups/imagenes/333.png");
        imgs[4]= new ImageIcon("src/ec/edu/ups/imagenes/44.png");
        imgs[5]= new ImageIcon("src/ec/edu/ups/imagenes/5555.png");
        
        jButton1.setIcon(imgs[0]);
    }
    
    

    public void cambiarIdioma(ResourceBundle mensajes) {
        labels.setText(mensajes.getString("titulos.crear"));
        labelc.setText(mensajes.getString("servicio.codigo"));
        labeln.setText(mensajes.getString("servicio.nombre"));
        labelp.setText(mensajes.getString("servicio.precio"));
        label.setText(mensajes.getString("titulos.ingrese"));
        bc.setText(mensajes.getString("servicio.bcrear"));
        bca.setText(mensajes.getString("servicio.bcancelar"));

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
        bca = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        txtp = new javax.swing.JTextField();
        labelp = new javax.swing.JLabel();
        txtnp = new javax.swing.JTextField();
        labeln = new javax.swing.JLabel();
        labelc = new javax.swing.JLabel();
        txtcp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        labels = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        bca.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bca.setText("Cancelar");
        bca.setBorder(null);
        bca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcaActionPerformed(evt);
            }
        });
        jPanel1.add(bca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, 40));

        bc.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        bc.setText("Crear");
        bc.setBorder(null);
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        jPanel1.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 40));

        txtp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpActionPerformed(evt);
            }
        });
        jPanel1.add(txtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 40));

        labelp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelp.setText("PRECIO:");
        labelp.setToolTipText("");
        jPanel1.add(labelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 40));

        txtnp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtnp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnpActionPerformed(evt);
            }
        });
        txtnp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnpKeyPressed(evt);
            }
        });
        jPanel1.add(txtnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, 40));

        labeln.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeln.setText("NOMBRE:");
        jPanel1.add(labeln, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 40));

        labelc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelc.setText("CODIGO:");
        jPanel1.add(labelc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        txtcp.setEditable(false);
        txtcp.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtcp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 160, 40));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 220, 250));

        label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Ingrese su servicio");
        label.setToolTipText("");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 320));

        labels.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        labels.setText("CREAR SERVICIO");
        labels.setToolTipText("");
        getContentPane().add(labels, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_bcaActionPerformed
public void checar(){
    if("baño".equals(txtnp.getText())){
        jButton1.setIcon(imgs[1]);
    }
    if("limpieza dental".equals(txtnp.getText())){
        jButton1.setIcon(imgs[2]);
    }
    if("corte de pelo".equals(txtnp.getText())){
        jButton1.setIcon(imgs[3]);
    }
    if("corte de uñas".equals(txtnp.getText())){
        jButton1.setIcon(imgs[4]);
    }
    if("comprar alimento".equals(txtnp.getText())){
        jButton1.setIcon(imgs[5]);
    }
}
    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:
        
        Servicio servicio = new Servicio();
        System.out.println(servicio.getCodigo());
        servicio.setCodigo(Integer.parseInt(txtcp.getText()));
        servicio.setNombreservicio(txtnp.getText());
        servicio.setPrecio(Double.parseDouble(txtp.getText()));
        
        controladorservicio.create(servicio);

        ////////limpiar
        jButton1.setIcon(imgs[0]);
        txtnp.setText("");
        txtp.setText("");
        txtcp.setText(String.valueOf(this.controladorservicio.getCodigo()));
        JOptionPane.showMessageDialog(this, "Servicio creado exitosamente!!", "Crear servicio", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_bcActionPerformed

    private void txtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpActionPerformed

    private void txtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        x = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtnpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnpKeyPressed
        // TODO add your handling code here:
        checar();
    }//GEN-LAST:event_txtnpKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bc;
    private javax.swing.JButton bca;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelc;
    private javax.swing.JLabel labeln;
    private javax.swing.JLabel labelp;
    private javax.swing.JLabel labels;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtnp;
    private javax.swing.JTextField txtp;
    // End of variables declaration//GEN-END:variables
}
