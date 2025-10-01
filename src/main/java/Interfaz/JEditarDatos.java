package Interfaz;

import Logica.Cliente;
import Logica.Direccion;
import Logica.Sistema;
import Logica.TarjetaCredito;
import java.text.ParseException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class JEditarDatos extends javax.swing.JDialog {
    
    Cliente cli;
    String correoInicial;
    /**
     * 
     * @param parent
     * @param modal
     * @param cliente 
     */
    public JEditarDatos(java.awt.Dialog parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        this.cli = cliente;
        this.correoInicial = cli.getCorreoElectronico();
        initComponents();
        Sistema.centrarContainer(this);
        setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCalle = new javax.swing.JTextField(cli.getDireccion().getCalle());
        textNumero = new javax.swing.JTextField(cli.getDireccion().getNumero());
        textCiudad = new javax.swing.JTextField(cli.getDireccion().getCiudad());
        textCp = new javax.swing.JTextField(cli.getDireccion().getCp());
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNombreTitular = new javax.swing.JTextField(cli.getTarjetaCredito().getNombreTitular());
        textNumTarjeta = new javax.swing.JTextField(cli.getTarjetaCredito().getNumeroTarjeta());
        try{
            MaskFormatter dateFormatter = new MaskFormatter("####/##/##");
            dateFormatter.setPlaceholderCharacter('_');
            textFechaCad = new javax.swing.JFormattedTextField(dateFormatter);
        }catch(ParseException pe){
            System.out.println(pe.getMessage());
        }
        textNombre = new javax.swing.JTextField(cli.getNombre());
        textTelefono = new javax.swing.JTextField(cli.getTelefono());
        textCorreo = new javax.swing.JTextField(cli.getCorreoElectronico());
        botonHecho = new javax.swing.JButton();
        botonCambiarClave = new javax.swing.JButton();
        cbDireccion = new javax.swing.JCheckBox();
        cbTarjetaCredito = new javax.swing.JCheckBox();
        logo1 = new Interfaz.Logo();
        jLabel3 = new javax.swing.JLabel();
        panelContra = new javax.swing.JPanel();
        textContraseña = new javax.swing.JPasswordField(cli.getClave());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Correo Electrónico");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setText("Teléfono");

        jPanel3.setVisible(false);
        jPanel3.setBackground(new java.awt.Color(255, 235, 169));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero");

        jLabel12.setText("Ciudad");

        jLabel22.setText("Codigo postal");

        jLabel8.setText("Calle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel22)
                    .addComponent(jLabel12))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(textCiudad)
                    .addComponent(textCp)
                    .addComponent(textNumero))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(textCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setVisible(false);
        jPanel2.setBackground(new java.awt.Color(255, 235, 169));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de la tarjeta");

        jLabel11.setText("Fecha de caducidad");

        jLabel5.setText(" Nombre del titular");

        textFechaCad.setText(cli.getTarjetaCredito().getFechaCaducidad().toString());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        botonHecho.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        botonHecho.setForeground(new java.awt.Color(252, 209, 109));
        botonHecho.setText("HECHO");
        botonHecho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botonHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHechoActionPerformed(evt);
            }
        });

        botonCambiarClave.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        botonCambiarClave.setText("CLAVE");
        botonCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarClaveActionPerformed(evt);
            }
        });

        cbDireccion.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        cbDireccion.setText("Direccion");
        cbDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDireccionActionPerformed(evt);
            }
        });

        cbTarjetaCredito.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        cbTarjetaCredito.setText("Tarjeta de Credito");
        cbTarjetaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarjetaCreditoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Edite sus datos:");

        panelContra.setVisible(false);
        panelContra.setBackground(new java.awt.Color(255, 255, 255));

        textContraseña.setVisible(true);

        javax.swing.GroupLayout panelContraLayout = new javax.swing.GroupLayout(panelContra);
        panelContra.setLayout(panelContraLayout);
        panelContraLayout.setHorizontalGroup(
            panelContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        panelContraLayout.setVerticalGroup(
            panelContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textContraseña))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(cbTarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(cbDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(botonHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCambiarClave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(panelContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTelefono)
                                    .addComponent(textCorreo)
                                    .addComponent(textNombre))
                                .addGap(45, 45, 45))))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCambiarClave)
                    .addComponent(panelContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(cbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbTarjetaCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonHecho)
                .addGap(54, 54, 54))
        );

        jScrollPane1.setViewportView(panelPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Sistema.guardarDatosClientes();
        getParent().setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    /**
     * cambia el formato del String introducido para que esté en un formato 
     * que se pueda castear a LocalDate
     * @param fecha
     * @return String fecha formato valido
     */
    private String formatoFecha(String fecha){//2007-12-03 entra 2007/12/03
        String[]partes = fecha.split("/");
        
        return partes[0]+'-'+partes[1]+'-'+partes[2];
    }
    
    /**
     * comprueba validez de los datos y edita los datos del cliente
     * @param evt 
     */
    private void botonHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHechoActionPerformed
        String nombre = textNombre.getText();
        String correo= textCorreo.getText();
        String telefono= textTelefono.getText();
        String calle= textCalle.getText();
        String num= textNumero.getText();
        String ciudad = textCiudad.getText();
        String cp= textCp.getText();
        String nombreTit= textNombreTitular.getText();
        String numTarjeta= textNumTarjeta.getText();
        String clave = String.valueOf(textContraseña.getPassword());
        String fechaCad = formatoFecha(textFechaCad.getText());
        String error="";
         if(nombre.isEmpty()|| correo.isEmpty()|| telefono.isEmpty()|| calle.isEmpty()|| num.isEmpty()|| ciudad.isEmpty()||
                cp.isEmpty()||nombreTit.isEmpty()||numTarjeta.isEmpty()||clave.isEmpty()) error +="No puede haber campos vacíos\n";
        if (telefono.length()!= 9)error+="numero de telefono debe tener 9 numeros\n";
        if (cp.length()!=5) error+="codigo postal debe tener 5 numeros\n";
        try{
            Integer.parseInt(telefono);
        }catch(NumberFormatException nfe){ error+="el telefono debe contener solo numeros\n";}
        try{
            Integer.parseInt(cp);
        }catch(NumberFormatException nfe){ error+="el codigo postal debe contener solo numeros\n";}
   
        if (cbTarjetaCredito.isSelected()){
            try{
            Integer.parseInt(numTarjeta);
            }catch(NumberFormatException nfe){ error+="el numero de la tarjeta debe contener solo numeros\n";}
            try{
            LocalDate.parse(fechaCad);
            }catch ( Exception e){
            error += "Fecha mal introducida\n";    
            }
        }
        if (!error.isBlank())JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
        else{
            if(cbDireccion.isSelected())cli.setDireccion( new Direccion(calle, num, ciudad, cp));
            if (cbTarjetaCredito.isSelected())cli.setTarjetaCredito(new TarjetaCredito(nombreTit, numTarjeta, LocalDate.parse(fechaCad)));
            cli.setClave(clave);
            cli.setTelefono(telefono);
            cli.setNombre(nombre);
            cli.setCorreoElectronico(correo);
            Sistema.getClientes().remove(correoInicial);
            Sistema.getClientes().put(correo, cli);           
            JOptionPane.showMessageDialog(this, "Datos cambiados correctamente","EDITAR DATOS",JOptionPane.INFORMATION_MESSAGE);
            Sistema.guardarDatosClientes();
            dispose();
        }
    }//GEN-LAST:event_botonHechoActionPerformed

    private void botonCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarClaveActionPerformed
       String claveAntigua=JOptionPane.showInputDialog(this, "introduzca la contraseña antigua", "cambio de clave", JOptionPane.WARNING_MESSAGE);
       if ( claveAntigua.equals(cli.getClave())){
           panelContra.setVisible(true);
       }else JOptionPane.showMessageDialog(this, "contraseña incorrecta", "cambio de clave" , JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botonCambiarClaveActionPerformed

    private void cbDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDireccionActionPerformed
        if (cbDireccion.isSelected()){
            jPanel3.setVisible(true);
        }
        else {
            textCalle.setText(cli.getDireccion().getCalle());
            textNumero.setText(cli.getDireccion().getNumero());
            textCiudad.setText(cli.getDireccion().getCiudad());
            textCp.setText(cli.getDireccion().getCp());
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_cbDireccionActionPerformed

    private void cbTarjetaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarjetaCreditoActionPerformed
        if (cbTarjetaCredito.isSelected()){
            jPanel2.setVisible(true);
        }else{
            textNumTarjeta.setText(cli.getTarjetaCredito().getNumeroTarjeta());
            textNombreTitular.setText(cli.getTarjetaCredito().getNombreTitular());
            textFechaCad.setText(cli.getTarjetaCredito().getFechaCaducidad().toString());
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_cbTarjetaCreditoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarClave;
    private javax.swing.JButton botonHecho;
    private javax.swing.JCheckBox cbDireccion;
    private javax.swing.JCheckBox cbTarjetaCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private Interfaz.Logo logo1;
    private javax.swing.JPanel panelContra;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textCalle;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textCp;
    private javax.swing.JFormattedTextField textFechaCad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNombreTitular;
    private javax.swing.JTextField textNumTarjeta;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
