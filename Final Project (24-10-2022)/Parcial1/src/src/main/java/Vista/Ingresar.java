/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.main.java.Vista;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.main.java.Controlador.Controlador;
import src.main.java.Controlador.DAO;
import src.main.java.Modelo.Queso;

/**
 *
 * @author Mauricio
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Insertar
     */
    
    public Ingresar() {
        initComponents();
        setLocationRelativeTo(null);
        LimpiarCampos();
        rellenarCombobox();
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/QUESO-INGRESO.png"));
        return retValue;
    }
    public final void LimpiarCampos(){
        maduracion.setSelectedIndex(0);
        textura.setSelectedIndex(0);
        gusto.setSelectedIndex(0);
        tratamiento.setSelectedIndex(0);
        tipo_queso.setSelectedIndex(0);
        tipo_leche.setSelectedIndex(0);
        contenido_graso.setSelectedIndex(0);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IngresarBTN = new javax.swing.JButton();
        limpiarBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textura = new javax.swing.JComboBox<>();
        gusto = new javax.swing.JComboBox<>();
        tratamiento = new javax.swing.JComboBox<>();
        tipo_queso = new javax.swing.JComboBox<>();
        tipo_leche = new javax.swing.JComboBox<>();
        contenido_graso = new javax.swing.JComboBox<>();
        maduracion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESO");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setText("INGRESAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de queso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de leche:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Contenido graso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Maduración:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Textura:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Gusto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Tratamiento de la leche:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        IngresarBTN.setBackground(new java.awt.Color(0, 0, 0));
        IngresarBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IngresarBTN.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBTN.setText("Ingresar");
        IngresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        limpiarBTN.setBackground(new java.awt.Color(0, 0, 0));
        limpiarBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limpiarBTN.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBTN.setText("Limpiar");
        limpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(limpiarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 110, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Átras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 90, -1));

        textura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(textura, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 150, -1));

        gusto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(gusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, -1));

        tratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 150, -1));

        tipo_queso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        tipo_queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_quesoActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_queso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        tipo_leche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        tipo_leche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_lecheActionPerformed(evt);
            }
        });
        jPanel1.add(tipo_leche, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        contenido_graso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        contenido_graso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenido_grasoActionPerformed(evt);
            }
        });
        jPanel1.add(contenido_graso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        maduracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        maduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maduracionActionPerformed(evt);
            }
        });
        jPanel1.add(maduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu menuPrincipal = new Menu();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void limpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTNActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
    }//GEN-LAST:event_limpiarBTNActionPerformed

    private void tipo_quesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_quesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_quesoActionPerformed

    private void tipo_lecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_lecheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_lecheActionPerformed

    private void contenido_grasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenido_grasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contenido_grasoActionPerformed

    private void maduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maduracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maduracionActionPerformed

    private void IngresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBTNActionPerformed

            String tipo_quesoS, tipo_lecheS, contenido_grasoS, maduracionS, texturaS,
                    gustoS, tratamientoS;
            
            tipo_quesoS = (String) this.tipo_queso.getSelectedItem();
            tipo_lecheS = (String) this.tipo_leche.getSelectedItem();
            contenido_grasoS = (String) this.contenido_graso.getSelectedItem();
            maduracionS = (String) this.maduracion.getSelectedItem();
            texturaS = (String) this.textura.getSelectedItem();
            gustoS = (String) this.gusto.getSelectedItem();
            tratamientoS = (String) this.tratamiento.getSelectedItem();
            
            
            try {
                Controlador control;
                control = new Controlador();
                control.crearQueso(tipo_quesoS, tipo_lecheS, contenido_grasoS, maduracionS, texturaS, gustoS, tratamientoS);
                JOptionPane.showMessageDialog(null,"El queso se ha guardado correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"No se pudo guardar el queso");
            }


    }//GEN-LAST:event_IngresarBTNActionPerformed

    public void rellenarCombobox(){
        Controlador control;
        try {
            control = new Controlador();
            Object [] tipo_queso = control.TipoQuesoArray();
            Object [] tipo_leche = control.TipoLecheArray();
            Object [] contenido_grasa = control.materiaGrasaArray();
            Object [] maduraciont = control.TipoMaduracionArray();
            Object [] texturat = control.TipoTexturaArray();
            Object [] gustot = control.TipoIntensidadArray();
            Object [] tratamientot = control.TipoTratamientoArray();
            
            for (int i = 0; i < tipo_queso.length; i++) {
                String nameOfOption = tipo_queso[i].toString();
                this.tipo_queso.addItem(nameOfOption);
            }
            
            for (int i = 0; i < tipo_leche.length; i++) {
                String nameOfOption = tipo_leche[i].toString();
                this.tipo_leche.addItem(nameOfOption);
            }
            
            for (int i = 0; i < contenido_grasa.length; i++) {
                String nameOfOption = contenido_grasa[i].toString();
                this.contenido_graso.addItem(nameOfOption);
            }
            
            for (int i = 0; i < maduraciont.length; i++) {
                String nameOfOption = maduraciont[i].toString();
                this.maduracion.addItem(nameOfOption);
            }
            
            for (int i = 0; i < texturat.length; i++) {
                String nameOfOption = texturat[i].toString();
                this.textura.addItem(nameOfOption);
            }
            
            for (int i = 0; i < gustot.length; i++) {
                String nameOfOption = gustot[i].toString();
                this.gusto.addItem(nameOfOption);
            }
            
            for (int i = 0; i < tratamientot.length; i++) {
                String nameOfOption = tratamientot[i].toString();
                this.tratamiento.addItem(nameOfOption);
            }
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"No se pudieron rellenar los combobox");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton IngresarBTN;
    public javax.swing.JComboBox<String> contenido_graso;
    public javax.swing.JComboBox<String> gusto;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton limpiarBTN;
    public javax.swing.JComboBox<String> maduracion;
    public javax.swing.JComboBox<String> textura;
    public javax.swing.JComboBox<String> tipo_leche;
    public javax.swing.JComboBox<String> tipo_queso;
    public javax.swing.JComboBox<String> tratamiento;
    // End of variables declaration//GEN-END:variables
}
