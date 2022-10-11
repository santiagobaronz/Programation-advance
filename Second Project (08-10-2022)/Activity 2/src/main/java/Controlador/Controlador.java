/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Participante;
import java.awt.event.*;
import Modelo.Persona;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Controlador implements ActionListener {

    private Persona modelo;
    private Vista vista;

 
    public Controlador(Persona modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        //le envia la referencia del listener al boton de la vista
        this.vista.jButton1.addActionListener(this);
        this.vista.jButton2.addActionListener(this);
    }

    Controlador() {
        
    }

    public void iniciar() {
        //colocarle un titulo a la ventana
        this.vista.setTitle("Aplicativo para el registro de eventos (Programación Avanzada)");
        //Se le indica la posicion --> null para que la ventana inicie en //la posicion 0 es decir en el centro de la pantalla
        this.vista.setLocationRelativeTo(null);
    }
    
    
    public static ArrayList<Participante> listaInscritos = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.jButton1) {
            String name = this.vista.nombre.getText();
            String user_id = this.vista.cedula.getText();
            
            String option = "";
            
            if(this.vista.jRadioButton1.isSelected()){
                option = this.vista.jRadioButton1.getText();
            }
            if(this.vista.jRadioButton2.isSelected()){
                option = this.vista.jRadioButton2.getText();
            }
            
            if(this.vista.jRadioButton3.isSelected()){
                option = this.vista.jRadioButton3.getText();
            }
            
            if(this.vista.jRadioButton4.isSelected()){
                option = this.vista.jRadioButton4.getText();
            }
            
            if(this.vista.jRadioButton5.isSelected()){
                option = this.vista.jRadioButton5.getText();
            }
            
            if(this.vista.jRadioButton6.isSelected()){
                option = this.vista.jRadioButton6.getText();
            }
            
            Participante participante = new Participante(name, user_id, option);
            listaInscritos.add(participante);
        }
        
        
        if (e.getSource() == this.vista.jButton2){
            try {
                Archivo archivo = new Archivo();
                archivo.EscribirEnArchivo();
                JOptionPane.showMessageDialog(null, "Los datos se han guardado en el archivo de texto. Gracias por usar el aplicativo!");
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
} //fin de la clase

