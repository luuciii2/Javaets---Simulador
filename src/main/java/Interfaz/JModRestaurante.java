package Interfaz;

import Logica.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JModRestaurante extends javax.swing.JDialog {
    private Restaurante res;

    public Restaurante getRes() {
        return res;
    }
    
    
    private Catering catering= null;

    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    
    
    private ArrayList<Comida> comidasNuevasRest = new ArrayList<>();
    public ArrayList<Comida> getComidasNuevasRest() {
        return comidasNuevasRest;
    }


    public JModRestaurante(Restaurante res, javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        this.res = res;
        initComponents();
        Sistema.centrarContainer(this);
        jPanelNombre.setVisible(false);
        jPanelEspecialidad.setVisible(false);
        jPanelDireccion.setVisible(false);
        jPanelQuitComida.setVisible(false);
        String nombreEsp = res.getEspecialidad().name();
        jComboBoxEspecialidad.setSelectedItem(nombreEsp);
        spinTenvio.setVisible(false);
        spinGenvio.setVisible(false);
        if (res.isServicioCatering()){buttonAddCatering.setVisible(false);
        cbElimCatering.setVisible(true);
            cbEditCatering.setVisible(true);}
        else {
            cbElimCatering.setVisible(false);
            cbEditCatering.setVisible(false);
            buttonAddCatering.setVisible(true);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();
        jCheckBoxNombre = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxDireccion = new javax.swing.JCheckBox();
        jPanelNombre = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNuevoNombre = new javax.swing.JTextField();
        jPanelDireccion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldCp = new javax.swing.JTextField();
        jCheckBoxEspecialidad = new javax.swing.JCheckBox();
        jCheckBoxQuitComida = new javax.swing.JCheckBox();
        jPanelEspecialidad = new javax.swing.JPanel();
        jComboBoxEspecialidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanelQuitComida = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DefaultListModel model = new DefaultListModel();
        ArrayList<String> nombres = new ArrayList<>();
        for (String nombre: res.nombresComidas()){
            nombres.add(nombre);
        }
        model.addAll(nombres);
        listaComidas = new javax.swing.JList<>(model);
        jButtonCambiosRealizados = new javax.swing.JButton();
        cbGenvio = new javax.swing.JCheckBox();
        cbTenvio = new javax.swing.JCheckBox();
        botonAddComida = new javax.swing.JButton();
        spinGenvio = new javax.swing.JSpinner();
        spinTenvio = new javax.swing.JSpinner();
        cbElimCatering = new javax.swing.JCheckBox();
        cbEditCatering = new javax.swing.JCheckBox();
        buttonAddCatering = new javax.swing.JButton();
        logo1 = new Interfaz.Logo();
        labelTituloRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBoxNombre.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jCheckBoxNombre.setText("Nombre");
        jCheckBoxNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("¿QUÉ CARACTERÍSTICAS DESEA MODIFICAR?");

        jCheckBoxDireccion.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jCheckBoxDireccion.setText("Direccion");
        jCheckBoxDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDireccionActionPerformed(evt);
            }
        });

        jPanelNombre.setBackground(new java.awt.Color(255, 235, 169));

        jLabel2.setBackground(new java.awt.Color(255, 235, 169));
        jLabel2.setText("Introduzca el nuevo nombre:");

        jTextFieldNuevoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelNombreLayout = new javax.swing.GroupLayout(jPanelNombre);
        jPanelNombre.setLayout(jPanelNombreLayout);
        jPanelNombreLayout.setHorizontalGroup(
            jPanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jTextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNombreLayout.setVerticalGroup(
            jPanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreLayout.createSequentialGroup()
                .addGroup(jPanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelNombreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDireccion.setBackground(new java.awt.Color(255, 235, 169));

        jLabel4.setText("Introduzca la nueva direccion:");

        jTextFieldCalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("calle");

        jLabel6.setText("numero");

        jLabel7.setText("ciudad");

        jLabel8.setText("codigo postal");

        jTextFieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldCp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelDireccionLayout = new javax.swing.GroupLayout(jPanelDireccion);
        jPanelDireccion.setLayout(jPanelDireccionLayout);
        jPanelDireccionLayout.setHorizontalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireccionLayout.createSequentialGroup()
                        .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(47, 47, 47)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDireccionLayout.setVerticalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBoxEspecialidad.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jCheckBoxEspecialidad.setText("Especialidad");
        jCheckBoxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEspecialidadActionPerformed(evt);
            }
        });

        jCheckBoxQuitComida.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jCheckBoxQuitComida.setText("Quitar Comida");
        jCheckBoxQuitComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxQuitComidaActionPerformed(evt);
            }
        });

        jPanelEspecialidad.setBackground(new java.awt.Color(255, 235, 169));

        jComboBoxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(Restaurante.especString()));
        jComboBoxEspecialidad.setBorder(null);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Escoja la nueva especialidad:");

        javax.swing.GroupLayout jPanelEspecialidadLayout = new javax.swing.GroupLayout(jPanelEspecialidad);
        jPanelEspecialidad.setLayout(jPanelEspecialidadLayout);
        jPanelEspecialidadLayout.setHorizontalGroup(
            jPanelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEspecialidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEspecialidadLayout.setVerticalGroup(
            jPanelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEspecialidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelQuitComida.setBackground(new java.awt.Color(255, 235, 169));

        jLabel11.setText("Escoja la comida que desea quitar:");

        listaComidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(listaComidas);

        javax.swing.GroupLayout jPanelQuitComidaLayout = new javax.swing.GroupLayout(jPanelQuitComida);
        jPanelQuitComida.setLayout(jPanelQuitComidaLayout);
        jPanelQuitComidaLayout.setHorizontalGroup(
            jPanelQuitComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuitComidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelQuitComidaLayout.setVerticalGroup(
            jPanelQuitComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuitComidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuitComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCambiosRealizados.setBackground(new java.awt.Color(255, 210, 136));
        jButtonCambiosRealizados.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jButtonCambiosRealizados.setText("CAMBIOS REALIZADOS");
        jButtonCambiosRealizados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCambiosRealizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiosRealizadosActionPerformed(evt);
            }
        });

        cbGenvio.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        cbGenvio.setText("gastos de envío");
        cbGenvio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbGenvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenvioActionPerformed(evt);
            }
        });

        cbTenvio.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        cbTenvio.setText("tiempo de envio");
        cbTenvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenvioActionPerformed(evt);
            }
        });

        botonAddComida.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        botonAddComida.setText("añadir comida");
        botonAddComida.setBorder(null);
        botonAddComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddComidaActionPerformed(evt);
            }
        });

        spinGenvio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.5d));

        spinTenvio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        buttonGroup1.add(cbElimCatering);
        cbElimCatering.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        cbElimCatering.setText("eliminar Catering");

        buttonGroup1.add(cbEditCatering);
        cbEditCatering.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        cbEditCatering.setText("editar Catering");
        cbEditCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditCateringActionPerformed(evt);
            }
        });

        buttonAddCatering.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        buttonAddCatering.setText("añadir catering");
        buttonAddCatering.setBorder(null);
        buttonAddCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCateringActionPerformed(evt);
            }
        });

        labelTituloRes.setText(res.getNombre());
        labelTituloRes.setFont(new java.awt.Font("Bodoni MT", 0, 16)); // NOI18N
        labelTituloRes.setMaximumSize(new java.awt.Dimension(500, 25));
        labelTituloRes.setPreferredSize(new java.awt.Dimension(480, 23));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbElimCatering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(buttonAddCatering)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanelEspecialidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cbEditCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(cbGenvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(52, 52, 52)
                                    .addComponent(spinGenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                    .addComponent(cbTenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(spinTenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCambiosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxQuitComida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(botonAddComida)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanelQuitComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(labelTituloRes, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
                                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTituloRes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxNombre)
                    .addComponent(jPanelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jCheckBoxDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbElimCatering)
                            .addComponent(cbEditCatering)))
                    .addComponent(jPanelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAddCatering)
                .addGap(7, 7, 7)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEspecialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenvio)
                    .addComponent(spinGenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTenvio)
                    .addComponent(spinTenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanelQuitComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonAddComida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxQuitComida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCambiosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * valida los datos introducidos y edita los datos del restaurante
     * @param evt 
     */
    private void jButtonCambiosRealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiosRealizadosActionPerformed
        
        if(!jTextFieldNuevoNombre.getText().isBlank()){
            res.setNombre(jTextFieldNuevoNombre.getText());
        }
        if(!jTextFieldCalle.getText().isBlank()){
            res.getDireccion().setCalle(jTextFieldCalle.getText());
        }
        if(!jTextFieldNumero.getText().isBlank()){
            try{
                Integer.parseInt(jTextFieldNumero.getText());
                res.getDireccion().setNumero(jTextFieldNumero.getText());
            }catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "numero no válido", "NUMERO", JOptionPane.ERROR_MESSAGE);}
            
        }
        if(!jTextFieldCp.getText().isBlank()){
            try{
                Integer.parseInt(jTextFieldCp.getText());
                res.getDireccion().setCp(jTextFieldCp.getText());
            }catch(NumberFormatException nfe){JOptionPane.showMessageDialog(this, "codigo postal no válido", "NUMERO", JOptionPane.ERROR_MESSAGE);}
        }
        if(!jTextFieldCiudad.getText().isBlank()){
            res.getDireccion().setCiudad(jTextFieldCiudad.getText());
        }
        res.setEspecialidad(Restaurante.especialidades.valueOf((String)jComboBoxEspecialidad.getSelectedItem()));
        if (!listaComidas.isSelectionEmpty()){
            int[] indices = listaComidas.getSelectedIndices();
            for (int indice: indices){
                res.getComidas().remove(indice);
            }
        }
        if ((Integer)spinTenvio.getValue()!=0)res.setTiempoEnvio((Integer)spinTenvio.getValue());
        if ((Double)spinGenvio.getValue()!=0) res.setGastosEnvio((Double)spinGenvio.getValue());
        

        if (!comidasNuevasRest.isEmpty()){
            for (Comida com: comidasNuevasRest){
                if (!res.addComida(com))JOptionPane.showMessageDialog(this, com.getTitulo()+" ya estaba añadida");
            }
        }
        System.out.println(res.toString());
        JOptionPane.showMessageDialog(this, "Cambios realizados");
    }//GEN-LAST:event_jButtonCambiosRealizadosActionPerformed

    private void jCheckBoxQuitComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxQuitComidaActionPerformed
        if (jCheckBoxQuitComida.isSelected()){jPanelQuitComida.setVisible(true);}
        else{jPanelQuitComida.setVisible(false);}
    }//GEN-LAST:event_jCheckBoxQuitComidaActionPerformed

    private void jCheckBoxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEspecialidadActionPerformed
        if (jCheckBoxEspecialidad.isSelected()){jPanelEspecialidad.setVisible(true);}
        else{jPanelEspecialidad.setVisible(false);}
    }//GEN-LAST:event_jCheckBoxEspecialidadActionPerformed

    private void jCheckBoxDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDireccionActionPerformed
        if (jCheckBoxDireccion.isSelected()){jPanelDireccion.setVisible(true);}
        else{jPanelDireccion.setVisible(false);}
    }//GEN-LAST:event_jCheckBoxDireccionActionPerformed

    private void jCheckBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNombreActionPerformed
        if (jCheckBoxNombre.isSelected()){jPanelNombre.setVisible(true);}
        else{jPanelNombre.setVisible(false);}
    }//GEN-LAST:event_jCheckBoxNombreActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Sistema.guardarDatosRestaurantes();
    }//GEN-LAST:event_formWindowClosing

    private void botonAddComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddComidaActionPerformed
        new JCrearComida(this, true).setVisible(true);
    }//GEN-LAST:event_botonAddComidaActionPerformed

    private void cbGenvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenvioActionPerformed
    if (cbGenvio.isSelected())spinGenvio.setVisible(true);
    else spinGenvio.setVisible(false);
    }//GEN-LAST:event_cbGenvioActionPerformed

    private void cbTenvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenvioActionPerformed
    if (cbTenvio.isSelected())spinTenvio.setVisible(true);
    else spinTenvio.setVisible(false);    }//GEN-LAST:event_cbTenvioActionPerformed

    private void buttonAddCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCateringActionPerformed
        new JCrearCatering(this, true, res.getComidas()).setVisible(true);
    }//GEN-LAST:event_buttonAddCateringActionPerformed

    private void cbEditCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditCateringActionPerformed
        new JModCatering(this, true, res).setVisible(true);
    }//GEN-LAST:event_cbEditCateringActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddComida;
    private javax.swing.JButton buttonAddCatering;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbEditCatering;
    private javax.swing.JCheckBox cbElimCatering;
    private javax.swing.JCheckBox cbGenvio;
    private javax.swing.JCheckBox cbTenvio;
    private javax.swing.JButton jButtonCambiosRealizados;
    private javax.swing.JCheckBox jCheckBoxDireccion;
    private javax.swing.JCheckBox jCheckBoxEspecialidad;
    private javax.swing.JCheckBox jCheckBoxNombre;
    private javax.swing.JCheckBox jCheckBoxQuitComida;
    private javax.swing.JComboBox<String> jComboBoxEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelDireccion;
    private javax.swing.JPanel jPanelEspecialidad;
    private javax.swing.JPanel jPanelNombre;
    private javax.swing.JPanel jPanelQuitComida;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCp;
    private javax.swing.JTextField jTextFieldNuevoNombre;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JLabel labelTituloRes;
    private javax.swing.JList<String> listaComidas;
    private Interfaz.Logo logo1;
    private javax.swing.JSpinner spinGenvio;
    private javax.swing.JSpinner spinTenvio;
    // End of variables declaration//GEN-END:variables
}
