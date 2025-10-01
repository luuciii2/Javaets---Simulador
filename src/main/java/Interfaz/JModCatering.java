package Interfaz;
import Logica.Catering;
import Logica.Comida;
import Logica.Restaurante;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class JModCatering extends javax.swing.JDialog {

Restaurante res;   
    public JModCatering(javax.swing.JDialog parent, boolean modal, Restaurante res) {
        super(parent, modal);
        this.res = res;
        initComponents();
        Logica.Sistema.centrarContainer(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        DefaultListModel model = new DefaultListModel();
        ArrayList<String> nombres = new ArrayList<>();
        for (Comida com: res.getCatering().getComidasElegidas()){
            nombres.add(com.getTitulo());
        }
        model.addAll(nombres);
        listaComidas = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        cbCamareros = new javax.swing.JCheckBox();
        cbCocineros = new javax.swing.JCheckBox();
        cbDecoracion = new javax.swing.JCheckBox();
        cbEspacio = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        DefaultListModel model1 = new DefaultListModel();
        ArrayList<String> nombres1 = new ArrayList<>();
        for (Comida com: res.getComidas()){
            if (!res.getCatering().getComidasElegidas().contains(com)){
                nombres1.add(com.getTitulo());}
        }
        model1.addAll(nombres1);
        comidasSinCat = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo1 = new Interfaz.Logo();

        listaComidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaComidas.setModel(model);
        listaComidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaComidasValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaComidas);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbCamareros.setText("camareros");

        cbCocineros.setText("cocineros");

        cbDecoracion.setText("decoracion");

        cbEspacio.setText("espacio");

        comidasSinCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comidasSinCat.setModel(model1);
        comidasSinCat.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                comidasSinCatValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(comidasSinCat);

        jLabel1.setText("Pulsa para añadir");

        jLabel2.setText("Pulsa para eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCamareros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCocineros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCamareros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbCocineros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDecoracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEspacio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comidasSinCatValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_comidasSinCatValueChanged
        // lista de comidas que se pueden añadir
       if (!comidasSinCat.isSelectionEmpty()){

       int i = comidasSinCat.getSelectedIndex();
       String nombre = comidasSinCat.getModel().getElementAt(i);
        Comida comida=null;
        for (Comida com : res.getComidas()){
           if (nombre.equals(com.getTitulo())){
            comida=com;           
            break;}
        }
        
        res.getCatering().getComidasElegidas().add(comida);
  
         DefaultListModel<String> model = (DefaultListModel<String>) comidasSinCat.getModel();
          model.removeElement(comida.getTitulo());
         DefaultListModel<String> model1 = (DefaultListModel<String>) listaComidas.getModel();
          model1.addElement(comida.getTitulo());
        
        JOptionPane.showMessageDialog(this, "Se ha añadido" + comida.getTitulo(), "Comidas eliminadas", JOptionPane.INFORMATION_MESSAGE);       
       }
    }//GEN-LAST:event_comidasSinCatValueChanged

    private void listaComidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaComidasValueChanged
        //lista de comidas que se pueden eliminar
        if (!listaComidas.isSelectionEmpty()){

         int i = listaComidas.getSelectedIndex();
         String nombre = listaComidas.getModel().getElementAt(i);
         Comida comida = null;
         for (Comida com : res.getCatering().getComidasElegidas()){
              if (com.getTitulo().equals(nombre)){
                  comida=com;
                  break;}
         }
         
         res.getCatering().getComidasElegidas().remove(comida);
         DefaultListModel<String> model = (DefaultListModel<String>) listaComidas.getModel();
          model.removeElement(comida.getTitulo());
         DefaultListModel<String> model1 = (DefaultListModel<String>) comidasSinCat.getModel();
          model1.addElement(comida.getTitulo());
   
         JOptionPane.showMessageDialog(this, "Se ha eliminado " + comida.getTitulo(), "Comidas eliminadas", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_listaComidasValueChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbCamareros;
    private javax.swing.JCheckBox cbCocineros;
    private javax.swing.JCheckBox cbDecoracion;
    private javax.swing.JCheckBox cbEspacio;
    private javax.swing.JList<String> comidasSinCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaComidas;
    private Interfaz.Logo logo1;
    // End of variables declaration//GEN-END:variables
}
