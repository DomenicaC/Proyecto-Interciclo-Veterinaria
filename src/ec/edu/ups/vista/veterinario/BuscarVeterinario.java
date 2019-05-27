/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.veterinario;

import ec.edu.ups.Modelo.Veterinario;
import ec.edu.ups.controladores.ControladorVeterinario;

/**
 *
 * @author Carlos
 */
public class BuscarVeterinario extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarVeterinario
     */
    private ControladorVeterinario controladorveterinario;
    public BuscarVeterinario(ControladorVeterinario controladorveterinario) {
        initComponents();
        this.controladorveterinario = controladorveterinario;
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
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        labelcodigo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        labelnombre = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        labelcedula = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        labeledad = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        labeldireccion = new javax.swing.JLabel();
        labelgenero = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        Aceptar1 = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("BUSCAR VETERINARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 162, 28));

        labelcodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelcodigo.setText("Código:");
        jPanel1.add(labelcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 30));

        txtnombre.setToolTipText("");
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.setEnabled(false);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 31));

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelnombre.setText("Nombre:");
        jPanel1.add(labelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        labelapellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelapellido.setText("Apellido:");
        jPanel1.add(labelapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));

        txtapellido.setToolTipText("");
        txtapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtapellido.setEnabled(false);
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 203, 29));

        txtcedula.setToolTipText("");
        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcedula.setEnabled(false);
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 196, 30));

        labelcedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelcedula.setText("Cedula:");
        jPanel1.add(labelcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        txtedad.setToolTipText("");
        txtedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedad.setEnabled(false);
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 61, 29));

        labeledad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labeledad.setText("Edad:");
        jPanel1.add(labeledad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 30));

        txtsueldo.setToolTipText("");
        txtsueldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtsueldo.setEnabled(false);
        jPanel1.add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 196, 30));

        labeldireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labeldireccion.setText("Sueldo:");
        jPanel1.add(labeldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        labelgenero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelgenero.setText("Titulo:");
        jPanel1.add(labelgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 30));

        txttitulo.setToolTipText("");
        txttitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txttitulo.setEnabled(false);
        jPanel1.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 196, 31));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 255, 204));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 150, 40));

        Aceptar1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Aceptar1.setForeground(new java.awt.Color(0, 255, 204));
        Aceptar1.setText("Buscar");
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtcodigo.getText());
        Veterinario buscarv = controladorveterinario.read(codigo);
        txtnombre.setText(buscarv.getNombre());
        txtapellido.setText(buscarv.getApellido());
        txtcedula.setText(buscarv.getCedula());
        txtedad.setText(String.valueOf(buscarv.getEdad()));
        txtsueldo.setText(String.valueOf(buscarv.getSueldo()));
        txttitulo.setText(buscarv.getTitulo());
    }//GEN-LAST:event_Aceptar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labelcedula;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labeledad;
    private javax.swing.JLabel labelgenero;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
