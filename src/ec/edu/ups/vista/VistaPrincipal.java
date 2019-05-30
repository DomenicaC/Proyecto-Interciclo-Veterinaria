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
import java.awt.Desktop;
import java.net.URI;
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
        menucliente.setText(mensajes.getString("menu.cliente"));
        menufactura.setText(mensajes.getString("menu.factura"));

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
        
        menumascota.setText(mensajes.getString("menu.mascota"));
        itemcrear.setText(mensajes.getString("item.crear"));
        itembuscar.setText(mensajes.getString("servicio.buscar"));
        itemactualizar.setText(mensajes.getString("servicio.modificar"));
        itemeliminar.setText(mensajes.getString("servicio.eliminar"));
        itemlistar.setText(mensajes.getString("servicio.lista"));
        menuidioma.setText(mensajes.getString("menu.idioma"));
        itemespañol.setText(mensajes.getString("item.español"));
        itemingles.setText(mensajes.getString("item.ingles"));
        
        menucliente.setText(mensajes.getString("menu.cliente"));
        itemcrearcliente.setText(mensajes.getString("menu.item.crear"));
        itembuscarcliente.setText(mensajes.getString("menu.item.buscar"));
        itemactualizarcliente.setText(mensajes.getString("menu.item.modificar"));
        itemborrarcliente.setText(mensajes.getString("menu.item.eliminar"));
        itemlistarcliente.setText(mensajes.getString("menu.item.lista"));
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
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menucliente = new javax.swing.JMenu();
        itemcrearcliente = new javax.swing.JMenuItem();
        itembuscarcliente = new javax.swing.JMenuItem();
        itemactualizarcliente = new javax.swing.JMenuItem();
        itemborrarcliente = new javax.swing.JMenuItem();
        itemlistarcliente = new javax.swing.JMenuItem();
        menumascota = new javax.swing.JMenu();
        itemcrear = new javax.swing.JMenuItem();
        itembuscar = new javax.swing.JMenuItem();
        itemactualizar = new javax.swing.JMenuItem();
        itemeliminar = new javax.swing.JMenuItem();
        itemlistar = new javax.swing.JMenuItem();
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
        menufactura = new javax.swing.JMenu();
        CrearFMenuItem = new javax.swing.JMenuItem();
        BuscarFMenuItem = new javax.swing.JMenuItem();
        EliFMenuItem = new javax.swing.JMenuItem();
        menuidioma = new javax.swing.JMenu();
        itemespañol = new javax.swing.JMenuItem();
        itemingles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/Login_37128.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("Link Proyecto");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/mascota.png"))); // NOI18N
        jButton2.setText("GitHub");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/logo-ups-home.png"))); // NOI18N

        DesktopPane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopPaneLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menucliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/clienteicono.png"))); // NOI18N
        menucliente.setMnemonic('f');
        menucliente.setText("Cliente");

        itemcrearcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemcrearcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/crearcliente.png"))); // NOI18N
        itemcrearcliente.setMnemonic('o');
        itemcrearcliente.setText("Crear");
        itemcrearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcrearclienteActionPerformed(evt);
            }
        });
        menucliente.add(itemcrearcliente);

        itembuscarcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itembuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/busacar2.png"))); // NOI18N
        itembuscarcliente.setMnemonic('a');
        itembuscarcliente.setText("Buscar");
        itembuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itembuscarclienteActionPerformed(evt);
            }
        });
        menucliente.add(itembuscarcliente);

        itemactualizarcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemactualizarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/modificarcliente.png"))); // NOI18N
        itemactualizarcliente.setMnemonic('x');
        itemactualizarcliente.setText("Actualizar");
        itemactualizarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemactualizarclienteActionPerformed(evt);
            }
        });
        menucliente.add(itemactualizarcliente);

        itemborrarcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemborrarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/eliminarcliente.png"))); // NOI18N
        itemborrarcliente.setText("Borrar");
        itemborrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemborrarclienteActionPerformed(evt);
            }
        });
        menucliente.add(itemborrarcliente);

        itemlistarcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemlistarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listarcliente.png"))); // NOI18N
        itemlistarcliente.setText("Listar");
        itemlistarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistarclienteActionPerformed(evt);
            }
        });
        menucliente.add(itemlistarcliente);

        menuBar.add(menucliente);

        menumascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/mascota.png"))); // NOI18N
        menumascota.setMnemonic('e');
        menumascota.setText("Mascota");

        itemcrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemcrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/crearmascota.png"))); // NOI18N
        itemcrear.setMnemonic('t');
        itemcrear.setText("Crear");
        itemcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcrearActionPerformed(evt);
            }
        });
        menumascota.add(itemcrear);

        itembuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itembuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscar.png"))); // NOI18N
        itembuscar.setMnemonic('y');
        itembuscar.setText("Buscar");
        itembuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itembuscarActionPerformed(evt);
            }
        });
        menumascota.add(itembuscar);

        itemactualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/actualizar.png"))); // NOI18N
        itemactualizar.setMnemonic('p');
        itemactualizar.setText("Actualizar");
        itemactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemactualizarActionPerformed(evt);
            }
        });
        menumascota.add(itemactualizar);

        itemeliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/borrar.png"))); // NOI18N
        itemeliminar.setMnemonic('d');
        itemeliminar.setText("Eliminar");
        itemeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemeliminarActionPerformed(evt);
            }
        });
        menumascota.add(itemeliminar);

        itemlistar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        itemlistar.setText("Listar");
        itemlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistarActionPerformed(evt);
            }
        });
        menumascota.add(itemlistar);

        menuBar.add(menumascota);

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

        menufactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/factura.png"))); // NOI18N
        menufactura.setText("Factura");

        CrearFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CrearFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/facturacrear.png"))); // NOI18N
        CrearFMenuItem.setText("Crear");
        CrearFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearFMenuItemActionPerformed(evt);
            }
        });
        menufactura.add(CrearFMenuItem);

        BuscarFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscarFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/buscarfactura.png"))); // NOI18N
        BuscarFMenuItem.setText("Buscar");
        BuscarFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFMenuItemActionPerformed(evt);
            }
        });
        menufactura.add(BuscarFMenuItem);

        EliFMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EliFMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/deleteffac.png"))); // NOI18N
        EliFMenuItem.setText("Eliminar");
        EliFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliFMenuItemActionPerformed(evt);
            }
        });
        menufactura.add(EliFMenuItem);

        menuBar.add(menufactura);

        menuidioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/idioma.png"))); // NOI18N
        menuidioma.setText("Idioma");

        itemespañol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemespañol.setText("Español");
        itemespañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemespañolActionPerformed(evt);
            }
        });
        menuidioma.add(itemespañol);

        itemingles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemingles.setText("Ingles");
        itemingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteminglesActionPerformed(evt);
            }
        });
        menuidioma.add(itemingles);

        menuBar.add(menuidioma);

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

    private void itemactualizarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemactualizarclienteActionPerformed
        String x = ModificarCliente.x;
        try {
            if (x == null) {
                if (modificarCliente == null || modificarCliente.isVisible() == false) {
                    modificarCliente = new ModificarCliente(controladorCliente,mensajes);
                    DesktopPane.add(modificarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemactualizarclienteActionPerformed

    private void itemcrearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcrearclienteActionPerformed
        // TODO add your handling code here:
        String x = CrearCliente.x;
        try {
            if (x == null) {
                if (crearCliente == null || crearCliente.isVisible() == false) {
                    crearCliente = new CrearCliente(controladorCliente,mensajes);
                    DesktopPane.add(crearCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemcrearclienteActionPerformed

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

    private void itembuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itembuscarclienteActionPerformed
        // TODO add your handling code here:

        String x = BuscarCliente.x;
        try {
            if (x == null) {
                if (buscarCliente == null || buscarCliente.isVisible() == false) {
                    buscarCliente = new BuscarCliente(controladorCliente,mensajes);
                    DesktopPane.add(buscarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itembuscarclienteActionPerformed

    private void itemcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcrearActionPerformed
        // TODO add your handling code here:
        String x = CrearMascota.x;
        try {
            if (x == null) {
                if (crearMascota == null || crearMascota.isVisible() == false) {
                    crearMascota = new CrearMascota(controladorMascota, mensajes);
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
    }//GEN-LAST:event_itemcrearActionPerformed

    private void itembuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itembuscarActionPerformed
        String x = buscarMascota.x;
        try {
            if (x == null) {
                if (buscarMascota == null || buscarMascota.isVisible() == false) {
                    buscarMascota = new BuscarMascota(controladorMascota, mensajes);
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
    }//GEN-LAST:event_itembuscarActionPerformed

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

    private void itemlistarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistarclienteActionPerformed
        // TODO add your handling code here:
        String x = ListarCliente.x;
        try {
            if (x == null) {
                if (listarCliente == null || listarCliente.isVisible() == false) {
                    listarCliente = new ListarCliente(controladorCliente,mensajes);
                    DesktopPane.add(listarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_itemlistarclienteActionPerformed

    private void itemborrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemborrarclienteActionPerformed
        // TODO add your handling code here:
        String x = EliminarCliente.x;
        try {
            if (x == null) {
                if (eliminarCliente == null || eliminarCliente.isVisible() == false) {
                    eliminarCliente = new EliminarCliente(controladorCliente,mensajes);
                    DesktopPane.add(eliminarCliente);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemborrarclienteActionPerformed

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

    private void itemespañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemespañolActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiaridioma();
        System.out.println("Localizacion Forzada: " + Locale.getDefault().getLanguage());
        comprobar();
    }//GEN-LAST:event_itemespañolActionPerformed

    private void itemactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemactualizarActionPerformed
        // TODO add your handling code here:
        String x = actualizarMascota.x;
        try {
            if (x == null) {
                if (actualizarMascota == null || actualizarMascota.isVisible() == false) {
                    actualizarMascota = new ActualizarMascota(controladorMascota, mensajes);
                    DesktopPane.add(actualizarMascota);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemactualizarActionPerformed

    private void itemeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemeliminarActionPerformed
        // TODO add your handling code here:
        String x = borrarMascota.x;
        try {
            if (x == null) {
                if (borrarMascota == null || borrarMascota.isVisible() == false) {
                    borrarMascota = new BorrarMascota(controladorMascota, mensajes);
                    DesktopPane.add(borrarMascota);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemeliminarActionPerformed

    private void itemlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistarActionPerformed
        // TODO add your handling code here:
        String x = listarMascota.x;
        try {
            if (x == null) {
                if (listarMascota == null || listarMascota.isVisible() == false) {
                    listarMascota = new ListarMascota(controladorMascota, mensajes);
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
    }//GEN-LAST:event_itemlistarActionPerformed

    private void iteminglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteminglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiaridioma();        
        comprobar();
    }//GEN-LAST:event_iteminglesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
            Desktop.getDesktop().browse(new URI("https://github.com/DomenicaC/Proyecto-Interciclo-Veterinaria"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error el URL no existe");
        } try{
            Desktop.getDesktop().browse(new URI("https://github.com/DomenicaC/Proyecto-Interciclo-Veterinaria"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error el URL no existe");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comprobar(){
        //Comprobacion mascota
        if(crearMascota != null && crearMascota.isVisible()){
            crearMascota.cambiaridioma(mensajes);
        }
        if(buscarMascota != null && buscarMascota.isVisible()){
            buscarMascota.cambiaridioma(mensajes);
        }
        if(actualizarMascota != null && actualizarMascota.isVisible()){
            actualizarMascota.cambiaridioma(mensajes);
        }
        if(borrarMascota != null && borrarMascota.isVisible()){
            borrarMascota.cambiaridioma(mensajes);
        }
        if(listarMascota != null && listarMascota.isVisible()){
            listarMascota.cambiaridioma(mensajes);
        }
        if (crearCliente != null && crearCliente.isVisible()){
            crearCliente.cambiarIdioma(mensajes);
        }
        if(buscarCliente != null && buscarCliente.isVisible()){
            buscarCliente.cambiarIdioma(mensajes);
        }
        if(modificarCliente != null && modificarCliente.isVisible()){
            modificarCliente.cambiarIdioma(mensajes);
        }
        if(eliminarCliente != null && eliminarCliente.isVisible()){
            eliminarCliente.cambiarIdioma(mensajes);
        }
        if(listarCliente != null && listarCliente.isVisible()){
            listarCliente.cambiarIdioma(mensajes);
        }

    }
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
    private javax.swing.JMenuItem itemactualizar;
    private javax.swing.JMenuItem itemactualizarcliente;
    private javax.swing.JMenuItem itemborrarcliente;
    private javax.swing.JMenuItem itembuscar;
    private javax.swing.JMenuItem itembuscarcliente;
    private javax.swing.JMenuItem itemcrear;
    private javax.swing.JMenuItem itemcrearcliente;
    private javax.swing.JMenuItem itemeliminar;
    private javax.swing.JMenuItem itemespañol;
    private javax.swing.JMenuItem itemingles;
    private javax.swing.JMenuItem itemlistar;
    private javax.swing.JMenuItem itemlistarcliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menucliente;
    private javax.swing.JMenu menufactura;
    private javax.swing.JMenu menuidioma;
    private javax.swing.JMenu menumascota;
    private javax.swing.JMenuItem sa;
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
