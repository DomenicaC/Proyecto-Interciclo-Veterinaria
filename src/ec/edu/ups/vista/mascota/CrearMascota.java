/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.mascota;

import ec.edu.ups.Modelo.Mascota;
import ec.edu.ups.controladores.ControladorMascota;
import ec.edu.ups.vista.VistaPrincipal;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron PC
 */
public class CrearMascota extends javax.swing.JInternalFrame {
public static String x;
private ControladorMascota controladorMascota;
private CrearMascota crearmas;
private ResourceBundle mensajes;
      
    /**
     * Creates new form CrearMascota
     */
    public CrearMascota(ControladorMascota controladorMascota, ResourceBundle mensajes) {
        initComponents();
        this.mensajes= mensajes;
        x="x";
        int a=VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b=VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        setLocation(a/2,b/2);
        setVisible(true);
        cambiaridioma(mensajes);
        this.controladorMascota= controladorMascota;
        txtcodigo2.setText(Integer.toString(this.controladorMascota.getCodigo()));
    }
    public void cambiaridioma(ResourceBundle mensajes){
        jtitulo.setText(mensajes.getString("tituloM.crear"));
        jnombre.setText(mensajes.getString("servicio.nombre"));
        jcodigo.setText(mensajes.getString("servicio.codigo"));
        jpeso.setText(mensajes.getString("item.peso"));
        jedad.setText(mensajes.getString("label.edad"));
        jespecie.setText(mensajes.getString("label.especie"));
        btncrear.setText(mensajes.getString("item.crear"));
        btncancelar.setText(mensajes.getString("boton.cancelar"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jnombre = new javax.swing.JLabel();
        jcodigo = new javax.swing.JLabel();
        jedad = new javax.swing.JLabel();
        jpeso = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcodigo2 = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jespecie = new javax.swing.JLabel();
        txtspecie = new javax.swing.JTextField();

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

        jtitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        jtitulo.setText("Crear Mascota");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jnombre.setText("Nombre:");

        jcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jcodigo.setText("Codigo");

        jedad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jedad.setText("Edad:");

        jpeso.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jpeso.setText("Peso:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtcodigo2.setEditable(false);
        txtcodigo2.setEnabled(false);

        btncrear.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jespecie.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jespecie.setText("Especie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jedad)
                                    .addComponent(jnombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jespecie)
                                    .addComponent(jpeso))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtspecie))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jcodigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(txtcodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jnombre)
                        .addComponent(jcodigo)
                        .addComponent(txtcodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jedad)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpeso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jespecie)
                    .addComponent(txtspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(btncancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jtitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x=null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // Obtenemos los valores ingresados en las cajas de etxto y las guardamos
        Mascota mascota = new Mascota();
        mascota.setEdad(Integer.parseInt(txtedad.getText()));
        mascota.setNombre(txtnombre.getText());
        mascota.setPeso(Double.parseDouble(txtpeso.getText()));
        mascota.setEspecie(txtspecie.getText());
        //Limpiamos las cajas de texto para una nueva mascota
        txtedad.setText("");
        txtpeso.setText("");
        txtnombre.setText("");
        txtspecie.setText("");
        //Llamamos al controlador para crear la mascota
        controladorMascota.create(mascota);
        //Enviamos el codigo
        txtcodigo2.setText(Integer.toString(this.controladorMascota.getCodigo()));
        //Mostramos un cuadro de dialogo
        JOptionPane.showMessageDialog(null, "Se ha creado a su mascota :3");
    }//GEN-LAST:event_btncrearActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
    // TODO add your handling code here:
   this.dispose();
   this.setVisible(false);
   x=null;
    }//GEN-LAST:event_btncancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jcodigo;
    private javax.swing.JLabel jedad;
    private javax.swing.JLabel jespecie;
    private javax.swing.JLabel jnombre;
    private javax.swing.JLabel jpeso;
    private javax.swing.JLabel jtitulo;
    private javax.swing.JTextField txtcodigo2;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtspecie;
    // End of variables declaration//GEN-END:variables
}
