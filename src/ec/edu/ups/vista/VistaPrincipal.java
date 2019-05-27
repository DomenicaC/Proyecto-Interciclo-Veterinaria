/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorMascota;
import ec.edu.ups.controladores.ControladorServicio;
import ec.edu.ups.controladores.ControladorVeterinario;
import ec.edu.ups.vista.cliente.BuscarCliente;
import ec.edu.ups.vista.cliente.CrearCliente;
import ec.edu.ups.vista.cliente.EliminarCliente;
import ec.edu.ups.vista.cliente.ListarCliente;
import ec.edu.ups.vista.cliente.ModificarCliente;
import ec.edu.ups.vista.factura.BuscarFactura;
import ec.edu.ups.vista.factura.CrearFactura;
import ec.edu.ups.vista.factura.EliminarFactura;
import ec.edu.ups.vista.mascota.BuscarMascota;
import ec.edu.ups.vista.mascota.CrearMascota;
import ec.edu.ups.vista.servicio.BuscarServicio;
import ec.edu.ups.vista.servicio.CrearServicio;
import ec.edu.ups.vista.servicio.EliminarServicio;
import ec.edu.ups.vista.servicio.ListaServicio;
import ec.edu.ups.vista.servicio.ModificarServicio;
import ec.edu.ups.vista.veterinario.BuscarVeterinario;
import ec.edu.ups.vista.veterinario.CrearVeterinario;
import ec.edu.ups.vista.veterinario.EliminarVeterinario;
import ec.edu.ups.vista.veterinario.ListaVeterinario;
import ec.edu.ups.vista.veterinario.ModificarVeterinario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron PC
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private CrearMascota crearMascota;

    private CrearFactura crearF;
    private BuscarFactura buscarF;
    private EliminarFactura eliF;
    private BuscarMascota buscarMascota;
    /**
     * Creates new form VistaPrincipal
     */

    private ControladorMascota controladormascota;
    private ControladorServicio controladorservicio;
    private ControladorCliente controladorcliente;
    private ControladorVeterinario controladorveterinario;
    public VistaPrincipal() {
        //Titulo
        this.setTitle("BABA´S VETERINARIA");
        //Declaramos un icono nuevo para la veterinaria
        setIconImage(new ImageIcon(("src/ec/edu/ups/vista/veterinari.png")).getImage());
        initComponents();
        DesktopPane.setBorder(new Fondo());
        this.setExtendedState(VistaPrincipal.MAXIMIZED_BOTH);

        controladorservicio = new ControladorServicio();
        controladorcliente = new ControladorCliente();
        controladorveterinario =new ControladorVeterinario();
        controladormascota = new ControladorMascota();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CrearFMenuItem = new javax.swing.JMenuItem();
        BuscarFMenuItem = new javax.swing.JMenuItem();
        EliFMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/clienteicono.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/crearcliente.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Crear");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Buscar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Actualizar");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        jMenuItem1.setText("Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/mascota.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Mascota");

        cutMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/crearmascota.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Crear");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Buscar");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar.png"))); // NOI18N
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Actualizar");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Eliminar");
        editMenu.add(deleteMenuItem);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        jMenuItem3.setText("Listar");
        editMenu.add(jMenuItem3);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/veterinario.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Veterinario");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Crear");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentsMenuItem);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        buscar.setMnemonic('a');
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        helpMenu.add(buscar);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar.png"))); // NOI18N
        jMenuItem4.setText("Actualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        jMenuItem6.setText("Listar");
        jMenuItem6.setToolTipText("");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem6);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/servicio.png"))); // NOI18N
        jMenu1.setText("Servicio");

        jMenuItem7.setText("Crear");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        jMenuItem11.setText("Buscar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar.png"))); // NOI18N
        jMenuItem10.setText("Actualizar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        jMenuItem9.setText("Eliminar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        jMenuItem8.setText("Listar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/factura.png"))); // NOI18N
        jMenu2.setText("Factura");

        CrearFMenuItem.setText("Crear");
        CrearFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearFMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(CrearFMenuItem);

        BuscarFMenuItem.setText("Buscar");
        BuscarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(BuscarFMenuItem);

        EliFMenuItem.setText("Eliminar");
        EliFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliFMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(EliFMenuItem);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/idioma.png"))); // NOI18N
        jMenu3.setText("Idioma");

        jMenuItem15.setText("Español");
        jMenu3.add(jMenuItem15);

        jMenuItem16.setText("Ingles");
        jMenu3.add(jMenuItem16);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        ModificarCliente crear = new ModificarCliente(controladorcliente);
        crear.setVisible(true);
        DesktopPane.add(crear);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
       
        
        CrearCliente crear = new CrearCliente(controladorcliente);
        crear.setVisible(true);
        DesktopPane.add(crear);

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed
        // TODO add your handling code here:
        CrearVeterinario crearv = new CrearVeterinario(controladorveterinario);
        crearv.setVisible(true);
        DesktopPane.add(crearv);
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        BuscarVeterinario crear = new BuscarVeterinario(controladorveterinario);
        crear.setVisible(true);
        DesktopPane.add(crear);
    }//GEN-LAST:event_buscarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
       ModificarVeterinario modificarv = new ModificarVeterinario(controladorveterinario);
       modificarv.setVisible(true);
       DesktopPane.add(modificarv);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        CrearServicio crear = new CrearServicio(controladorservicio);
        crear.setVisible(true);
        DesktopPane.add(crear);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void EliFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliFMenuItemActionPerformed
        String x = eliF.x;
        try {
            if (x == null) {
                if (eliF == null || eliF.isVisible() == false) {
                    eliF = new EliminarFactura();
                    DesktopPane.add(eliF);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EliFMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        BuscarCliente crear = new BuscarCliente(controladorcliente);
        crear.setVisible(true);
        DesktopPane.add(crear);


    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        String x = CrearMascota.x;
        try {
            if (x == null) {
                if (crearMascota == null || crearMascota.isVisible() == false) {
                    crearMascota = new CrearMascota(controladormascota);
                    crearMascota.setVisible(true);
                    DesktopPane.add(crearMascota);
                    DesktopPane.moveToFront(crearMascota);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
    String x= buscarMascota.x;
    try{
        if(x==null){
            if (buscarMascota == null || buscarMascota.isVisible() == false) {
                    buscarMascota = new BuscarMascota(controladormascota);
                    buscarMascota.setVisible(true);
                    DesktopPane.add(buscarMascota);
                    DesktopPane.moveToFront(buscarMascota);
                }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void CrearFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearFMenuItemActionPerformed
        String x = crearF.x;
        try {
            if (x == null) {
                if (crearF == null || crearF.isVisible() == false) {
                    crearF = new CrearFactura();
                    DesktopPane.add(crearF);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_CrearFMenuItemActionPerformed

    private void BuscarFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFMenuItemActionPerformed
        String x = buscarF.x;
        try {
            if (x == null) {
                if (buscarF == null || buscarF.isVisible() == false) {
                    buscarF = new BuscarFactura();
                    DesktopPane.add(buscarF);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BuscarFMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ListarCliente crear = new ListarCliente(controladorcliente);
        crear.setVisible(true);
        DesktopPane.add(crear);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        EliminarCliente crear = new EliminarCliente(controladorcliente);
        crear.setVisible(true);
        DesktopPane.add(crear);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
     ModificarServicio eliminars= new ModificarServicio(controladorservicio);
     eliminars.setVisible(true);
    DesktopPane.add(eliminars);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        BuscarServicio buscars = new BuscarServicio(controladorservicio);
        buscars.setVisible(true);
        DesktopPane.add(buscars);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        EliminarServicio eliminars= new EliminarServicio(controladorservicio);
     eliminars.setVisible(true);
    DesktopPane.add(eliminars);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ListaServicio listas = new ListaServicio(controladorservicio);
        listas.setVisible(true);
        DesktopPane.add(listas);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ListaVeterinario listav = new ListaVeterinario(controladorveterinario);
        listav.setVisible(true);
        DesktopPane.add(listav);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        EliminarVeterinario eliminarv = new EliminarVeterinario(controladorveterinario);
        eliminarv.setVisible(true);
        DesktopPane.add(eliminarv);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarFMenuItem;
    private javax.swing.JMenuItem CrearFMenuItem;
    public static javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem EliFMenuItem;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    // End of variables declaration//GEN-END:variables

}
