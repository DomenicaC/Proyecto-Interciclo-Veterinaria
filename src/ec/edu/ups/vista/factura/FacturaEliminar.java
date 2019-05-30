/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import ec.edu.ups.Modelo.Cliente;
import ec.edu.ups.Modelo.FDetalle;
import ec.edu.ups.Modelo.FFactura;
import ec.edu.ups.Modelo.Mascota;
import ec.edu.ups.Modelo.Servicio;
import ec.edu.ups.Modelo.Veterinario;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFacDetalle;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorMascota;
import ec.edu.ups.controladores.ControladorServicio;
import ec.edu.ups.controladores.ControladorVeterinario;
import ec.edu.ups.vista.VistaPrincipal;
import static ec.edu.ups.vista.factura.FacturaBuscar.x;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Domenica Cañizares
 */
public class FacturaEliminar extends javax.swing.JInternalFrame {

    /**
     * Creates new form FacturaEliminar
     */
    public static String x;

    private ControladorFactura controladorFactura;
    private ControladorCliente controladorCliente;
    private ControladorVeterinario controladorVeterinario;
    private ControladorMascota controladorMascota;
    private ControladorServicio controladorServicio;
    private ControladorFacDetalle controladorFDetalle;

    private FFactura factura;
    private Servicio servicio;
    private FDetalle facDet;
    private Mascota mascota;
    private Cliente cliente;
    private Veterinario veterinario;

    private ResourceBundle mensajes;

    public FacturaEliminar(ResourceBundle mensajes, ControladorFactura controladorFactura) {
        initComponents();
        this.controladorFactura = controladorFactura;

        this.mensajes = mensajes;
        cambiarIdioma(mensajes);

        x = "x";

        //centrar pantalla
        int a = VistaPrincipal.DesktopPane.getWidth() - this.getWidth();
        int b = VistaPrincipal.DesktopPane.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
        setVisible(true);
    }

    public void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblServF.getModel();
        List<FDetalle> lista = factura.getDetalle();

        for (int i = 0; i < lista.size(); i++) {
            Object[] datos3 = {lista.get(i).getServ().getCodigo(),
                lista.get(i).getCantidad(),
                lista.get(i).getServ().getNombreservicio(),
                lista.get(i).getServ().getPrecio(),
                lista.get(i).getTotalCP()
            };
            modelo.addRow(datos3);
        }
        /*
         txtSub.setText(Double.toString(factura.getSubtotal()));
         txtTot.setText(Double.toString(factura.getTotal()));*/
    }

    public void vaciarDatos() {

        txtApeC.setText("");
        txtApeV.setText("");
        txtCedC.setText("");
        txtCedV.setText("");
        txtCodC.setText("");
        txtCodM.setText("");
        txtCodV.setText("");
        txtDirC.setText("");
        txtEdadM.setText("");
        txtFecha.setText("");
        txtIva.setText("");
        txtNomC.setText("");
        txtNomM.setText("");
        txtNomV.setText("");
        txtPesoM.setText("");
        txtRuc.setText("");
        txtSubtotal.setText("");
        txtTelC.setText("");
        txtTotal.setText("");

    }

    public void vaciarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tblServF.getModel();
        int filas = tblServF.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }

    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        //titulo
        lblTitulo.setText(mensajes.getString("tituloF.eliminar"));

        //Veterinario
        lblCedV.setText(mensajes.getString("labelF.cedV"));
        lblCodV.setText(mensajes.getString("labelF.codV"));
        lblNomV.setText(mensajes.getString("labelF.nomV"));
        lblApeV.setText(mensajes.getString("labelF.apeV"));

        //Cliente
        lblCedC.setText(mensajes.getString("labelF.cedC"));
        lblCodC.setText(mensajes.getString("labelF.codC"));
        lblNomC.setText(mensajes.getString("labelF.nomC"));
        lblApeC.setText(mensajes.getString("labelF.apeC"));
        lblDirC.setText(mensajes.getString("labelF.dirC"));
        lblTelC.setText(mensajes.getString("labelF.telC"));

        //Mascota
        lblCodM.setText(mensajes.getString("labelF.codM"));
        lblNomM.setText(mensajes.getString("labelF.nomM"));
        lblEdadM.setText(mensajes.getString("labelF.edadM"));
        lblPesoM.setText(mensajes.getString("labelF.pesoM"));

        //Tabla
        JTableHeader tableHeader = tblServF.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();

        TableColumn tableColum;

        tableColum = tableColumnModel.getColumn(0);
        tableColum.setHeaderValue(mensajes.getString("label.codigo"));

        tableColum = tableColumnModel.getColumn(1);
        tableColum.setHeaderValue(mensajes.getString("labelFD.cant"));

        tableColum = tableColumnModel.getColumn(2);
        tableColum.setHeaderValue(mensajes.getString("servicio.nombre"));

        tableColum = tableColumnModel.getColumn(3);
        tableColum.setHeaderValue(mensajes.getString("labelF.precio"));

        tableColum = tableColumnModel.getColumn(4);
        tableColum.setHeaderValue(mensajes.getString("labelF.tot"));

        //factura
        lblSub.setText(mensajes.getString("labelF.sub"));
        lblIva.setText(mensajes.getString("labelF.iva"));
        lblTot.setText(mensajes.getString("labelF.tot"));

        //boton
        btnBuscarRF.setText(mensajes.getString("boton.buscar"));
        btnEliminar.setText(mensajes.getString("boton.eliminar"));
        btnCancelarF.setText(mensajes.getString("boton.cancelar"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRuc = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        lblIva = new javax.swing.JLabel();
        btnBuscarRF = new javax.swing.JButton();
        txtIva = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNomV = new javax.swing.JLabel();
        txtNomV = new javax.swing.JTextField();
        lblApeV = new javax.swing.JLabel();
        txtApeV = new javax.swing.JTextField();
        lblCedV = new javax.swing.JLabel();
        txtCedV = new javax.swing.JTextField();
        lblCodV = new javax.swing.JLabel();
        txtCodV = new javax.swing.JTextField();
        lblTot = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblCodM = new javax.swing.JLabel();
        txtCodM = new javax.swing.JTextField();
        txtNomM = new javax.swing.JTextField();
        lblNomM = new javax.swing.JLabel();
        txtEdadM = new javax.swing.JTextField();
        lblEdadM = new javax.swing.JLabel();
        lblPesoM = new javax.swing.JLabel();
        txtPesoM = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblSub = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCedC = new javax.swing.JLabel();
        txtCedC = new javax.swing.JTextField();
        lblCodC = new javax.swing.JLabel();
        txtCodC = new javax.swing.JTextField();
        lblNomC = new javax.swing.JLabel();
        txtNomC = new javax.swing.JTextField();
        lblTelC = new javax.swing.JLabel();
        txtTelC = new javax.swing.JTextField();
        txtApeC = new javax.swing.JTextField();
        lblApeC = new javax.swing.JLabel();
        lblDirC = new javax.swing.JLabel();
        txtDirC = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCancelarF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServF = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        lblRuc.setBackground(new java.awt.Color(255, 255, 255));
        lblRuc.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblRuc.setText("RUC Factura");

        txtRuc.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        lblIva.setBackground(new java.awt.Color(255, 255, 255));
        lblIva.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblIva.setText("I.V.A");

        btnBuscarRF.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        btnBuscarRF.setText("Buscar");
        btnBuscarRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRFActionPerformed(evt);
            }
        });

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtIva.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNomV.setBackground(new java.awt.Color(255, 255, 255));
        lblNomV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomV.setText("Nombre Veterinario");

        txtNomV.setEditable(false);
        txtNomV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomV.setEnabled(false);

        lblApeV.setBackground(new java.awt.Color(255, 255, 255));
        lblApeV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeV.setText("Apellido Veterinario");

        txtApeV.setEditable(false);
        txtApeV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeV.setEnabled(false);

        lblCedV.setBackground(new java.awt.Color(255, 255, 255));
        lblCedV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCedV.setText("Cedula Veterinario");

        txtCedV.setEditable(false);
        txtCedV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCedV.setEnabled(false);

        lblCodV.setBackground(new java.awt.Color(255, 255, 255));
        lblCodV.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodV.setText("Codigo Veterinario");

        txtCodV.setEditable(false);
        txtCodV.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCodV.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNomV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lblApeV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApeV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCedV)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(lblCodV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodV)
                        .addComponent(txtCodV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCedV)
                        .addComponent(txtCedV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomV)
                    .addComponent(txtNomV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApeV)
                    .addComponent(txtApeV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTot.setBackground(new java.awt.Color(255, 255, 255));
        lblTot.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTot.setText("Total");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblFecha.setText("Fecha");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTotal.setEnabled(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCodM.setBackground(new java.awt.Color(255, 255, 255));
        lblCodM.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodM.setText("Codigo Mascota");

        txtCodM.setEditable(false);
        txtCodM.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCodM.setEnabled(false);

        txtNomM.setEditable(false);
        txtNomM.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomM.setEnabled(false);

        lblNomM.setBackground(new java.awt.Color(255, 255, 255));
        lblNomM.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomM.setText("Nombre Mascota");

        txtEdadM.setEditable(false);
        txtEdadM.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtEdadM.setEnabled(false);

        lblEdadM.setBackground(new java.awt.Color(255, 255, 255));
        lblEdadM.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblEdadM.setText("Edad Mascota");

        lblPesoM.setBackground(new java.awt.Color(255, 255, 255));
        lblPesoM.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblPesoM.setText("Peso Mascota");

        txtPesoM.setEditable(false);
        txtPesoM.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtPesoM.setEnabled(false);

        lblEspecie.setBackground(new java.awt.Color(255, 255, 255));
        lblEspecie.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblEspecie.setText("Especie Mascota");

        txtEspecie.setEditable(false);
        txtEspecie.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtEspecie.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblNomM)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCodM)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblEdadM)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPesoM)
                                .addGap(18, 18, 18)
                                .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lblEspecie)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEdadM)
                        .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodM)
                        .addComponent(txtCodM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPesoM)
                        .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomM)
                        .addComponent(txtNomM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecie)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblSub.setBackground(new java.awt.Color(255, 255, 255));
        lblSub.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblSub.setText("Subtotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtSubtotal.setEnabled(false);

        lblTitulo.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblTitulo.setText("Eliminar Factura");
        lblTitulo.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCedC.setBackground(new java.awt.Color(255, 255, 255));
        lblCedC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCedC.setText("Cedula Cliente");

        txtCedC.setEditable(false);
        txtCedC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCedC.setEnabled(false);

        lblCodC.setBackground(new java.awt.Color(255, 255, 255));
        lblCodC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCodC.setText("Codigo Cliente");

        txtCodC.setEditable(false);
        txtCodC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtCodC.setEnabled(false);

        lblNomC.setBackground(new java.awt.Color(255, 255, 255));
        lblNomC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomC.setText("Nombre Cliente");

        txtNomC.setEditable(false);
        txtNomC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtNomC.setEnabled(false);

        lblTelC.setBackground(new java.awt.Color(255, 255, 255));
        lblTelC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTelC.setText("Telefono Cliente");

        txtTelC.setEditable(false);
        txtTelC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtTelC.setEnabled(false);

        txtApeC.setEditable(false);
        txtApeC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtApeC.setEnabled(false);

        lblApeC.setBackground(new java.awt.Color(255, 255, 255));
        lblApeC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblApeC.setText("Apellido Cliente");

        lblDirC.setBackground(new java.awt.Color(255, 255, 255));
        lblDirC.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblDirC.setText("Direccion Cliente");

        txtDirC.setEditable(false);
        txtDirC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtDirC.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTelC)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomC)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCedC)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodC)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblApeC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDirC)
                            .addGap(18, 18, 18)
                            .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedC)
                    .addComponent(txtCedC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodC)
                    .addComponent(txtCodC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApeC)
                        .addComponent(txtApeC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomC)
                        .addComponent(txtNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDirC)
                        .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelC)
                        .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtFecha.setEnabled(false);

        btnCancelarF.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        btnCancelarF.setText("Cancelar");
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });

        tblServF.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tblServF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "0", null, null, null}
            },
            new String [] {
                "codigo", "cantidad", "nombre", "precio u", "totalCP"
            }
        ));
        tblServF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServFKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblServF);

        btnEliminar.setFont(new java.awt.Font("Elephant", 3, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarF)
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSub)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblIva)))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTot)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(lblRuc)
                            .addGap(18, 18, 18)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscarRF)
                            .addGap(18, 18, 18)
                            .addComponent(lblFecha)
                            .addGap(18, 18, 18)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(122, 122, 122))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarRF))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRuc)
                            .addComponent(lblFecha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSub)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIva)
                            .addComponent(btnCancelarF)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTot)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRFActionPerformed
        int ruc = Integer.parseInt(txtRuc.getText());
        factura = controladorFactura.read(ruc);

        vaciarDatos();
        if (factura == null) {
            JOptionPane.showMessageDialog(this, "RUC no existe");
        } else {
            //factura
            txtFecha.setText(factura.getFecha());
            txtSubtotal.setText(String.valueOf(factura.getSubtotal()));
            txtIva.setText(Double.toString(factura.getIva()));
            txtTotal.setText(String.valueOf(factura.getTotal()));

            //cliente
            cliente = factura.getCli();
            txtCodC.setText(Integer.toString(cliente.getCodigo()));
            txtNomC.setText(cliente.getNombre());
            txtApeC.setText(cliente.getApellido());
            txtDirC.setText(cliente.getDireccion());
            txtTelC.setText(cliente.getTelefono());
            txtCedC.setText(cliente.getCedula());

            //veterinario
            veterinario = factura.getVet();
            txtCodV.setText(Integer.toString(veterinario.getCodigo()));
            txtNomV.setText(veterinario.getNombre());
            txtApeV.setText(veterinario.getApellido());
            txtCedV.setText(veterinario.getCedula());
            //mascota
            mascota = factura.getMasc();
            txtCodM.setText(Integer.toString(mascota.getCodigo()));
            txtEdadM.setText(Integer.toString(mascota.getEdad()));
            txtNomM.setText(mascota.getNombre());
            txtPesoM.setText(Double.toString(mascota.getPeso()));
            txtEspecie.setText(mascota.getEspecie());

            //datos tabla
            vaciarTabla();
            llenarTabla();

        }

    }//GEN-LAST:event_btnBuscarRFActionPerformed

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        // TODO add your handling code here:
        x = null;
        this.dispose();
    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void tblServFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServFKeyReleased

    }//GEN-LAST:event_tblServFKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JPasswordField admin = new JPasswordField();

        if (JOptionPane.showConfirmDialog(null, admin, "Ingrese su contraseña", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            int codi = Integer.parseInt(txtRuc.getText());
            factura = controladorFactura.read(codi);
            if (factura == null) {
                JOptionPane.showMessageDialog(this, "RUC no Existe");
            } else {
                JOptionPane.showMessageDialog(this, "Factura Eliminada");
                controladorFactura.delete(codi);
                vaciarDatos();
                vaciarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede eliminar");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRF;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApeC;
    private javax.swing.JLabel lblApeV;
    private javax.swing.JLabel lblCedC;
    private javax.swing.JLabel lblCedV;
    private javax.swing.JLabel lblCodC;
    private javax.swing.JLabel lblCodM;
    private javax.swing.JLabel lblCodV;
    private javax.swing.JLabel lblDirC;
    private javax.swing.JLabel lblEdadM;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblNomC;
    private javax.swing.JLabel lblNomM;
    private javax.swing.JLabel lblNomV;
    private javax.swing.JLabel lblPesoM;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTot;
    private javax.swing.JTable tblServF;
    private javax.swing.JTextField txtApeC;
    private javax.swing.JTextField txtApeV;
    private javax.swing.JTextField txtCedC;
    private javax.swing.JTextField txtCedV;
    private javax.swing.JTextField txtCodC;
    private javax.swing.JTextField txtCodM;
    private javax.swing.JTextField txtCodV;
    private javax.swing.JTextField txtDirC;
    private javax.swing.JTextField txtEdadM;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNomC;
    private javax.swing.JTextField txtNomM;
    private javax.swing.JTextField txtNomV;
    private javax.swing.JTextField txtPesoM;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelC;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
