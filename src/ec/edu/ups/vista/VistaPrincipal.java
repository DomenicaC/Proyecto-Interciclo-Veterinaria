/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFactura;
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
import ec.edu.ups.vista.mascota.ActualizarMascota;
import ec.edu.ups.vista.mascota.BorrarMascota;
import ec.edu.ups.vista.mascota.BuscarMascota;
import ec.edu.ups.vista.mascota.CrearMascota;
import ec.edu.ups.vista.mascota.ListarMascota;
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
import java.util.Locale;
import java.util.ResourceBundle;
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
    private ActualizarMascota actualizarMascota;
    private BorrarMascota borrarMascota;
    private ListarMascota listarMascota;
    private CrearCliente crearCliente;
    private BuscarCliente buscarCliente;
    private EliminarCliente eliminarCliente;
    private ModificarCliente modificarCliente;
    private ListarCliente listarCliente;
    private CrearVeterinario crearveterinario;
    private BuscarVeterinario buscarveterinario;
    private ModificarVeterinario modificarveterinario;
    private EliminarVeterinario eliminarveterinario;
    private ListaVeterinario listaveterinario;
    private CrearServicio crearservicio;
    private BuscarServicio buscarservicio;
    private ModificarServicio modificarservicio;
    private EliminarServicio eliminarservicio;
    private ListaServicio listaservicio;
    /**
     * Creates new form VistaPrincipal
     */

    private ControladorMascota controladorMascota;
    private ControladorServicio controladorServicio;
    private ControladorCliente controladorCliente;
    private ControladorVeterinario controladorVeterinario;
    private ControladorFactura controladorFactura;
    private Locale localizacion;
    private ResourceBundle mensajes;

    public VistaPrincipal() {
        //Titulo
        this.setTitle("BABA´S VETERINARIA");
        //Declaramos un icono nuevo para la veterinaria
        setIconImage(new ImageIcon(("src/ec/edu/ups/vista/veterinari.png")).getImage());
        initComponents();
        DesktopPane.setBorder(new Fondo());
        this.setExtendedState(VistaPrincipal.MAXIMIZED_BOTH);

        controladorServicio = new ControladorServicio();
        controladorCliente = new ControladorCliente();
        controladorVeterinario = new ControladorVeterinario();
        controladorMascota = new ControladorMascota();
        controladorFactura = new ControladorFactura();

        ////////intenracionalizacion
        setLocationRelativeTo(null);
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiaridioma();

    }

    public void cambiaridioma() {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", Locale.getDefault());
        veterinario.setText(mensajes.getString("veterinario"));

        vc.setText(mensajes.getString("veterinario.crear"));
        vb.setText(mensajes.getString("veterinario.buscar"));
        va.setText(mensajes.getString("veterinario.modificar"));
        ve.setText(mensajes.getString("veterinario.eliminar"));
        vl.setText(mensajes.getString("veterinario.lista"));
        
        servicio.setText(mensajes.getString("servicio"));
        sc.setText(mensajes.getString("servicio.crear"));
        sb.setText(mensajes.getString("servicio.buscar"));
        sa.setText(mensajes.getString("servicio.modificar"));
        se.setText(mensajes.getString("servicio.eliminar"));
        sl.setText(mensajes.getString("servicio.lista"));
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
        jButton1 = new javax.swing.JButton();
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
        veterinario = new javax.swing.JMenu();
        vc = new javax.swing.JMenuItem();
        vb = new javax.swing.JMenuItem();
        va = new javax.swing.JMenuItem();
        ve = new javax.swing.JMenuItem();
        vl = new javax.swing.JMenuItem();
        servicio = new javax.swing.JMenu();
        sc = new javax.swing.JMenuItem();
        sb = new javax.swing.JMenuItem();
        sa = new javax.swing.JMenuItem();
        se = new javax.swing.JMenuItem();
        sl = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CrearFMenuItem = new javax.swing.JMenuItem();
        BuscarFMenuItem = new javax.swing.JMenuItem();
        EliFMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/Login_37128.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DesktopPane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/clienteicono.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        openMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/crearcliente.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Crear");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/busacar2.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Buscar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/modificarcliente.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Actualizar");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/eliminarcliente.png"))); // NOI18N
        jMenuItem1.setText("Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listarcliente.png"))); // NOI18N
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
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Eliminar");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem3);

        menuBar.add(editMenu);

        veterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/veterinario.png"))); // NOI18N
        veterinario.setMnemonic('h');
        veterinario.setText("Veterinario");

        vc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/veterinarioo.png"))); // NOI18N
        vc.setMnemonic('c');
        vc.setText("Crear");
        vc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcActionPerformed(evt);
            }
        });
        veterinario.add(vc);

        vb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/gato2.png"))); // NOI18N
        vb.setMnemonic('a');
        vb.setText("Buscar");
        vb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbActionPerformed(evt);
            }
        });
        veterinario.add(vb);

        va.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        va.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar2.png"))); // NOI18N
        va.setText("Actualizar");
        va.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaActionPerformed(evt);
            }
        });
        veterinario.add(va);

        ve.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listarr.png"))); // NOI18N
        ve.setText("Eliminar");
        ve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veActionPerformed(evt);
            }
        });
        veterinario.add(ve);

        vl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listarrrr.png"))); // NOI18N
        vl.setText("Listar");
        vl.setToolTipText("");
        vl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vlActionPerformed(evt);
            }
        });
        veterinario.add(vl);

        menuBar.add(veterinario);

        servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/servicio.png"))); // NOI18N
        servicio.setText("Servicio");

        sc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/servicios.png"))); // NOI18N
        sc.setText("Crear");
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });
        servicio.add(sc);

        sb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscarservicio.png"))); // NOI18N
        sb.setText("Buscar");
        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });
        servicio.add(sb);

        sa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizarservicio.png"))); // NOI18N
        sa.setText("Actualizar");
        sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saActionPerformed(evt);
            }
        });
        servicio.add(sa);

        se.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        se.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/elimarservicio.png"))); // NOI18N
        se.setText("Eliminar");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        servicio.add(se);

        sl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listarfac.png"))); // NOI18N
        sl.setText("Listar");
        sl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slActionPerformed(evt);
            }
        });
        servicio.add(sl);

        menuBar.add(servicio);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/factura.png"))); // NOI18N
        jMenu2.setText("Factura");

        CrearFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CrearFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/facturacrear.png"))); // NOI18N
        CrearFMenuItem.setText("Crear");
        CrearFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearFMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(CrearFMenuItem);

        BuscarFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscarFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscarfactura.png"))); // NOI18N
        BuscarFMenuItem.setText("Buscar");
        BuscarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(BuscarFMenuItem);

        EliFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EliFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/deleteffac.png"))); // NOI18N
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

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setText("Español");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem16.setText("Ingles");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        String x = ModificarCliente.x;
        try {
            if (x == null) {
                if (modificarCliente == null || modificarCliente.isVisible() == false) {
                    modificarCliente = new ModificarCliente(controladorCliente);
                    DesktopPane.add(modificarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        String x = CrearCliente.x;
        try {
            if (x == null) {
                if (crearCliente == null || crearCliente.isVisible() == false) {
                    crearCliente = new CrearCliente(controladorCliente);
                    DesktopPane.add(crearCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void vcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcActionPerformed
        // TODO add your handling code here:
        String x = CrearVeterinario.x;
        try {
            if (x == null) {
                if (crearveterinario == null || crearveterinario.isVisible() == false) {
                    crearveterinario = new CrearVeterinario(controladorVeterinario, mensajes);
                    DesktopPane.add(crearveterinario);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_vcActionPerformed

    private void vbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbActionPerformed
        // TODO add your handling code here:
        String x = BuscarVeterinario.x;
        try {
            if (x == null) {
                if (buscarveterinario == null || buscarveterinario.isVisible() == false) {
                    buscarveterinario = new BuscarVeterinario(controladorVeterinario,mensajes);
                    DesktopPane.add(buscarveterinario);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_vbActionPerformed

    private void vaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaActionPerformed
        // TODO add your handling code here:
        String x = ModificarVeterinario.x;
        try {
            if (x == null) {
                if (modificarveterinario == null || modificarveterinario.isVisible() == false) {
                    modificarveterinario = new ModificarVeterinario(controladorVeterinario, mensajes);
                    DesktopPane.add(modificarveterinario);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_vaActionPerformed

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        // TODO add your handling code here:
        String x = CrearServicio.x;
        try {
            if (x == null) {
                if (crearservicio == null || crearservicio.isVisible() == false) {
                    crearservicio = new CrearServicio(controladorServicio,mensajes);
                    DesktopPane.add(crearservicio);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_scActionPerformed

    private void EliFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliFMenuItemActionPerformed
        String x = eliF.x;
        try {
            if (x == null) {
                if (eliF == null || eliF.isVisible() == false) {
                    eliF = new EliminarFactura(controladorFactura);
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

        String x = BuscarCliente.x;
        try {
            if (x == null) {
                if (buscarCliente == null || buscarCliente.isVisible() == false) {
                    buscarCliente = new BuscarCliente(controladorCliente);
                    DesktopPane.add(buscarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        String x = CrearMascota.x;
        try {
            if (x == null) {
                if (crearMascota == null || crearMascota.isVisible() == false) {
                    crearMascota = new CrearMascota(controladorMascota);
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
        String x = buscarMascota.x;
        try {
            if (x == null) {
                if (buscarMascota == null || buscarMascota.isVisible() == false) {
                    buscarMascota = new BuscarMascota(controladorMascota);
                    buscarMascota.setVisible(true);
                    DesktopPane.add(buscarMascota);
                    DesktopPane.moveToFront(buscarMascota);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void CrearFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearFMenuItemActionPerformed
        String x = crearF.x;
        try {
            if (x == null) {
                if (crearF == null || crearF.isVisible() == false) {
                    crearF = new CrearFactura(controladorFactura, controladorVeterinario, controladorCliente, controladorMascota, controladorServicio);
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
                    buscarF = new BuscarFactura(controladorFactura);
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
        String x = ListarCliente.x;
        try {
            if (x == null) {
                if (listarCliente == null || listarCliente.isVisible() == false) {
                    listarCliente = new ListarCliente(controladorCliente);
                    DesktopPane.add(listarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String x = EliminarCliente.x;
        try {
            if (x == null) {
                if (eliminarCliente == null || eliminarCliente.isVisible() == false) {
                    eliminarCliente = new EliminarCliente(controladorCliente);
                    DesktopPane.add(eliminarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saActionPerformed
        // TODO add your handling code here:
        String x = ModificarServicio.x;
        try {
            if (x == null) {
                if (modificarservicio == null || modificarservicio.isVisible() == false) {
                    modificarservicio = new ModificarServicio(controladorServicio,mensajes);
                    DesktopPane.add(modificarservicio);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saActionPerformed

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        // TODO add your handling code here:
        String x = BuscarServicio.x;
        try {
            if (x == null) {
                if (buscarservicio == null || buscarservicio.isVisible() == false) {
                    buscarservicio = new BuscarServicio(controladorServicio, mensajes);
                    DesktopPane.add(buscarservicio);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sbActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
        String x = EliminarServicio.x;
        try {
            if (x == null) {
                if (eliminarservicio == null || eliminarservicio.isVisible() == false) {
                    eliminarservicio = new EliminarServicio(controladorServicio,mensajes);
                    DesktopPane.add(eliminarservicio);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_seActionPerformed

    private void slActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slActionPerformed
        // TODO add your handling code here:
        String x = ListaServicio.x;
        try {
            if (x == null) {
                if (listaservicio == null || listaservicio.isVisible() == false) {
                    listaservicio = new ListaServicio(controladorServicio, mensajes);
                    DesktopPane.add(listaservicio);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_slActionPerformed

    private void vlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlActionPerformed
        // TODO add your handling code here:
        String x = ListaVeterinario.x;
        try {
            if (x == null) {
                if (listaveterinario == null || listaveterinario.isVisible() == false) {
                    listaveterinario = new ListaVeterinario(controladorVeterinario,mensajes);
                    DesktopPane.add(listaveterinario);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_vlActionPerformed

    private void veActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veActionPerformed
        // TODO add your handling code here:
        String x = EliminarVeterinario.x;
        try {
            if (x == null) {
                if (eliminarveterinario == null || eliminarveterinario.isVisible() == false) {
                    eliminarveterinario = new EliminarVeterinario(controladorVeterinario,mensajes);
                    DesktopPane.add(eliminarveterinario);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_veActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiaridioma();
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        // TODO add your handling code here:
        String x = actualizarMascota.x;
        try {
            if (x == null) {
                if (actualizarMascota == null || actualizarMascota.isVisible() == false) {
                    actualizarMascota = new ActualizarMascota(controladorMascota);
                    DesktopPane.add(actualizarMascota);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
        String x = borrarMascota.x;
        try {
            if (x == null) {
                if (borrarMascota == null || borrarMascota.isVisible() == false) {
                    borrarMascota = new BorrarMascota(controladorMascota);
                    DesktopPane.add(borrarMascota);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String x = listarMascota.x;
        try {
            if (x == null) {
                if (listarMascota == null || listarMascota.isVisible() == false) {
                    listarMascota = new ListarMascota(controladorMascota);
                    listarMascota.setVisible(true);
                    DesktopPane.add(listarMascota);
                    DesktopPane.moveToFront(listarMascota);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiaridioma();
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

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
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem sa;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem sb;
    private javax.swing.JMenuItem sc;
    private javax.swing.JMenuItem se;
    private javax.swing.JMenu servicio;
    private javax.swing.JMenuItem sl;
    private javax.swing.JMenuItem va;
    private javax.swing.JMenuItem vb;
    private javax.swing.JMenuItem vc;
    private javax.swing.JMenuItem ve;
    private javax.swing.JMenu veterinario;
    private javax.swing.JMenuItem vl;
    // End of variables declaration//GEN-END:variables

}
