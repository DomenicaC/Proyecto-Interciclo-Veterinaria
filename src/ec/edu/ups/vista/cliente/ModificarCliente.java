/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.cliente;

import ec.edu.ups.Modelo.Cliente;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.vista.VistaPrincipal;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author erics
 */
public class ModificarCliente extends javax.swing.JInternalFrame {
    
     private ControladorCliente controladorCliente;
     public static String x ;
     private ResourceBundle mensajes;

    /**
     * Creates new form ModificarCliente
     */
    public ModificarCliente(ControladorCliente controladorCliente,ResourceBundle mensajes) {
        initComponents();
        this.controladorCliente = controladorCliente;
        int a = VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        x = "x";
        setLocation(a/2, b/2);
        setVisible(true);
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }
    public void cambiarIdioma(ResourceBundle mensajes){
        
        modifcartitulo.setText(mensajes.getString("modificar.cliente.titulo"));
        labelcodigo.setText(mensajes.getString("cliente.codigo"));
        labelnombre.setText(mensajes.getString("cliente.nombre"));
        labelapellido.setText(mensajes.getString("cliente.apellido"));
        labelcedula.setText(mensajes.getString("cliente.cedula"));
        labeledad.setText(mensajes.getString("cliente.edad"));
        labeldireccion.setText(mensajes.getString("cliente.direccion"));
        labeltelefono.setText(mensajes.getString("cliente.telefono"));
        labelgenero.setText(mensajes.getString("cliente.genero"));
        botonactualizar.setText(mensajes.getString("boton.modificar"));
        botoncancelar.setText(mensajes.getString("boton.cancelar"));
        botonbuscar.setText(mensajes.getString("boton.buscar"));
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modifcartitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelcodigo = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        labeledad = new javax.swing.JLabel();
        labelgenero = new javax.swing.JLabel();
        botoncancelar = new javax.swing.JButton();
        labeltelefono = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        labelcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        botonbuscar = new javax.swing.JButton();
        botonactualizar = new javax.swing.JButton();

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

        modifcartitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        modifcartitulo.setText("Modificar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        labelcodigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelcodigo.setText("Código:");

        labelnombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelnombre.setText("Nombre:");

        labeldireccion.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeldireccion.setText("Dirección:");

        labeledad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeledad.setText("Edad:");

        labelgenero.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelgenero.setText("Género:");

        botoncancelar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        labeltelefono.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labeltelefono.setText("Teléfono:");

        labelapellido.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelapellido.setText("Apellido:");

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnombre.setToolTipText("");
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtapellido.setToolTipText("");
        txtapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtdireccion.setToolTipText("");
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtedad.setToolTipText("");
        txtedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtgenero.setToolTipText("");
        txtgenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttelefono.setToolTipText("");
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelcedula.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        labelcedula.setText("Cedula:");

        txtcedula.setToolTipText("");
        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonbuscar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        botonactualizar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botonactualizar.setText("Actualizar");
        botonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelnombre)
                                    .addComponent(labelgenero)
                                    .addComponent(labelcedula)
                                    .addComponent(labeldireccion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labeltelefono)
                                                    .addComponent(labelapellido))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(labeledad)
                                        .addGap(48, 48, 48)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(botonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(botoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(labelcodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonbuscar)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonbuscar)
                    .addComponent(labelcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelcedula)
                    .addComponent(labeledad)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltelefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgenero)
                    .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonactualizar)
                    .addComponent(botoncancelar))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(modifcartitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(modifcartitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        x = null;
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = controladorCliente.read(Integer.parseInt(txtcodigo.getText()));
        cliente= controladorCliente.read(Integer.parseInt(txtcodigo.getText()));
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "El cliente no existe");

        }else{
            txtcedula.setText(cliente.getCedula());
            txtnombre.setText(cliente.getNombre());
            txtapellido.setText(cliente.getApellido());
            txtdireccion.setText(cliente.getDireccion());
            txttelefono.setText(cliente.getTelefono());
            txtedad.setText(Integer.toString(cliente.getEdad()));
            txtgenero.setText(cliente.getGenero());
            
        }

    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setCedula(txtcedula.getText());
        cliente.setNombre(txtnombre.getText());
        cliente.setDireccion(txtdireccion.getText());
        cliente.setTelefono(txttelefono.getText());
        cliente.setCodigo(Integer.parseInt(txtcodigo.getText()));
        cliente.setApellido(txtapellido.getText());
        cliente.setGenero(txtgenero.getText());
        cliente.setEdad(Integer.parseInt(txtedad.getText()));
        
        controladorCliente.update(cliente);

        JOptionPane.showMessageDialog(null, "El cliente se ha actualizado");

        txtnombre.setText("");
        txtdireccion.setText("");
        txtcedula.setText("");
        txttelefono.setText("");
        txtcodigo.setText("");
        txtedad.setText("");
        txtgenero.setText("");
        txtapellido.setText("");
    }//GEN-LAST:event_botonactualizarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        x = null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizar;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labeledad;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JLabel modifcartitulo;
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
