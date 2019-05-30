/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.veterinario;

import ec.edu.ups.Modelo.Veterinario;
import ec.edu.ups.controladores.ControladorVeterinario;
import ec.edu.ups.vista.VistaPrincipal;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Carlos
 */
public class ListaVeterinario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaVeterinario
     */
    private ControladorVeterinario controladorveterinario;
    public static String x;
    private ResourceBundle mensajes;

    public ListaVeterinario(ControladorVeterinario controladorveterinario, ResourceBundle mensajes) {
        initComponents();
        x = "x";
        int a = VistaPrincipal.DesktopPane.getWidth() - this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
        setVisible(true);
        this.controladorveterinario = controladorveterinario;
        llenarDatos();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);

    }

    public void llenarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaveterinario.getModel();
        Set<Veterinario> lista = controladorveterinario.getLista();
        for (Veterinario veterinario : lista) {
            Object[] datos = {veterinario.getCodigo(),
                veterinario.getNombre(),
                veterinario.getApellido(),
                veterinario.getCedula(),
                veterinario.getEdad(),
                veterinario.getSueldo(),
                veterinario.getTitulo()};
            modelo.addRow(datos);
        }

    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        labell.setText(mensajes.getString("titulov.lista"));
        JTableHeader tableHeader = tablaveterinario.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.nombre"));
        tableColumn = tableColumnModel.getColumn(2);

        tableColumn.setHeaderValue(mensajes.getString("veterinario.apellido"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.cedula"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.edad"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.sueldo"));
        tableColumn = tableColumnModel.getColumn(6);
        tableColumn.setHeaderValue(mensajes.getString("veterinario.titulo"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaveterinario = new javax.swing.JTable();
        labell = new javax.swing.JLabel();

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

        tablaveterinario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tablaveterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "CEDULA", "EDAD", "SUELDO", "TITULO"
            }
        ));
        tablaveterinario.setEnabled(false);
        jScrollPane1.setViewportView(tablaveterinario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 860, -1));

        labell.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        labell.setForeground(new java.awt.Color(51, 51, 51));
        labell.setText("LISTA DE VETERINARIOS");
        getContentPane().add(labell, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 590, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        x = null;
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labell;
    private javax.swing.JTable tablaveterinario;
    // End of variables declaration//GEN-END:variables
}
