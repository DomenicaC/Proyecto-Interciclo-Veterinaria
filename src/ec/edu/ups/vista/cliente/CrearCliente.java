/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.cliente;

import ec.edu.ups.Modelo.Cliente;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.vista.VistaPrincipal;
import static ec.edu.ups.vista.mascota.CrearMascota.x;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author erics
 */
public class CrearCliente extends javax.swing.JInternalFrame {
    private ControladorCliente controladorCliente;
    
   // private ResourceBundle mensajes;

    /**
     * Creates new form CrearCliente
     */
    public CrearCliente(ControladorCliente ControladorCliente) {
        initComponents();
        this.controladorCliente=ControladorCliente;
       txtcodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
       
     //  this.mensajes = mensajes;
      // cambiarIdioma(mensajes);
      
      int a = VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        
        setLocation(a/2, b/2);
        setVisible(true);
     
    }
    /*
    public void cambiarIdioma(ResourceBundle mensajes){
        
        labelcodigo.setText(mensajes.getString("cliente.codigo"));
        labelnombre.setText(mensajes.getString("cliente.nombre"));
        labelcedula.setText(mensajes.getString("cliente.cedula"));
        labeldireccion.setText(mensajes.getString("cliente.direccion"));
        labeltelefono.setText(mensajes.getString("cliente.telefono"));
        botoncrearcliente.setText(mensajes.getString("boton.crear"));
        
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        clientetitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelcodigo = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        labelcedula = new javax.swing.JLabel();
        labeledad = new javax.swing.JLabel();
        labelgenero = new javax.swing.JLabel();
        botoncrearcliente = new javax.swing.JButton();
        labeltelefono = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextField7.setToolTipText("");

        setClosable(true);
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

        clientetitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        clientetitulo.setText("Crear Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        labelcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelcodigo.setText("Código:");

        labelnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelnombre.setText("Nombre:");

        labeldireccion.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeldireccion.setText("Dirección:");

        labelcedula.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelcedula.setText("Cedula:");

        labeledad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeledad.setText("Edad:");

        labelgenero.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelgenero.setText("Género:");

        botoncrearcliente.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botoncrearcliente.setText("Crear ");
        botoncrearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncrearclienteActionPerformed(evt);
            }
        });

        labeltelefono.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeltelefono.setText("Teléfono:");

        labelapellido.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelapellido.setText("Apellido:");

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcodigo.setEnabled(false);

        txtnombre.setToolTipText("");
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtapellido.setToolTipText("");
        txtapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtdireccion.setToolTipText("");
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtedad.setToolTipText("");
        txtedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcedula.setToolTipText("");
        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtgenero.setToolTipText("");
        txtgenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttelefono.setToolTipText("");
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelgenero)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(labelcodigo)
                        .addGap(38, 38, 38)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botoncrearcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labeldireccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtdireccion))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelnombre)
                                        .addComponent(labelcedula))
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelapellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labeledad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labeltelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton1)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labeledad)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelcedula)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labeldireccion)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labeltelefono)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelgenero)
                    .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botoncrearcliente))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clientetitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientetitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoncrearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncrearclienteActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setNombre(txtnombre.getText());
        cliente.setDireccion(txtdireccion.getText());
        cliente.setCedula(txtcedula.getText());
        cliente.setTelefono(txttelefono.getText());
        cliente.setApellido(txtapellido.getText());
        cliente.setGenero(txtgenero.getText());
        cliente.setEdad(Integer.parseInt(txtedad.getText()));
        txtnombre.setText("");
        txtdireccion.setText("");
        txtcedula.setText("");
        txttelefono.setText("");
        txtapellido.setText("");
        txtgenero.setText("");
        txtedad.setText("");
        controladorCliente.create(cliente);
        txtcodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
        JOptionPane.showMessageDialog(this, "Cliente creado exitosamente", "Crear cliente", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_botoncrearclienteActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncrearcliente;
    private javax.swing.JLabel clientetitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labeledad;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
