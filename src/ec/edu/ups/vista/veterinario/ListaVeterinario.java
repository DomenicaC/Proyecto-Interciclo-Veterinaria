/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.veterinario;

import ec.edu.ups.Modelo.Veterinario;
import ec.edu.ups.controladores.ControladorVeterinario;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class ListaVeterinario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaVeterinario
     */
    private ControladorVeterinario controladorveterinario;
    
    public ListaVeterinario(ControladorVeterinario controladorveterinario) {
        initComponents();
        this.controladorveterinario = controladorveterinario;
        llenarDatos();
    }
public void llenarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaveterinario.getModel();
        Set<Veterinario> lista = controladorveterinario.getLista();
        for (Veterinario veterinario : lista){
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

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaveterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "CEDULA", "EDAD", "SUELDO", "TITULO"
            }
        ));
        jScrollPane1.setViewportView(tablaveterinario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaveterinario;
    // End of variables declaration//GEN-END:variables
}