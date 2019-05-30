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
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author erics
 */
public class ListarCliente extends javax.swing.JInternalFrame {
     private ControladorCliente controladorCliente;
     public static String x;
     private ResourceBundle mensajes;

    /**
     * Creates new form ListarCliente
     */
    public ListarCliente(ControladorCliente ControladorCliente,ResourceBundle mensajes) {
        initComponents();
        this.controladorCliente = ControladorCliente;
        llenarDatos();
        int a = VistaPrincipal.DesktopPane.getWidth()-this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight()-this.getHeight();
        x = "x";
        setLocation(a/2, b/2);
        setVisible(true);
        this.mensajes = mensajes;
       cambiarIdioma(mensajes);
    }
    public void llenarDatos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tablacliente.getModel();
        Set<Cliente> lista = controladorCliente.getLista();
        for (Cliente cliente : lista) {
            Object[] datos = {cliente.getCodigo(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getCedula(),
                cliente.getTelefono(),
                cliente.getDireccion(),
                cliente.getEdad(),
                cliente.getGenero() };
            modelo.addRow(datos);
        }
        
    }
    public void cambiarIdioma(ResourceBundle mensajes){
        
        listartitulo.setText(mensajes.getString("listar.cliente.titulo"));
        JTableHeader tableHeader = tablacliente.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("cliente.nombre"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("cliente.apellido"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("cliente.cedula"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("cliente.telefono"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("cliente.direccion"));
        tableColumn = tableColumnModel.getColumn(6);
        tableColumn.setHeaderValue(mensajes.getString("cliente.edad"));
        tableColumn = tableColumnModel.getColumn(7);
        tableColumn.setHeaderValue(mensajes.getString("cliente.genero"));
        tableHeader.repaint();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        listartitulo = new javax.swing.JLabel();
        botoncancelar = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablacliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellido", "Cedula", "Teléfono", "Dirección", "Edad", "Género"
            }
        ));
        tablacliente.setEnabled(false);
        jScrollPane1.setViewportView(tablacliente);

        listartitulo.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        listartitulo.setText("Listar Cliente");

        botoncancelar.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 366, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botoncancelar)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(listartitulo)
                                .addGap(320, 320, 320))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listartitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botoncancelar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
x = null;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        x = null;
    }//GEN-LAST:event_botoncancelarActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listartitulo;
    private javax.swing.JTable tablacliente;
    // End of variables declaration//GEN-END:variables
}
