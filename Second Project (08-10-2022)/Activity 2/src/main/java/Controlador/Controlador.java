/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionListener;
import Modelo.Persona;
import Vista.Vista;
import java.awt.event.ActionEvent;

/**
 *
 * @author Mauricio
 */
public class Controlador implements ActionListener {

    //se enlaza la vista y el control para servir de intermediario //entre los dos componentes
    private Persona modelo;
    private Vista vista;

    public Controlador(Persona modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        //le envia la referencia del listener al boton de la vista
        this.vista.jButton1.addActionListener(this);
        this.vista.jButton2.addActionListener(this);
    }

    public Controlador() {
        
    }

    public void iniciar() {
        //colocarle un titulo a la ventana
        this.vista.setTitle("Registro");
        //Se le indica la posicion --> null para que la ventana inicie en //la posicion 0 es decir en el centro de la pantalla
        this.vista.setLocationRelativeTo(null);
    }

    //funcion que realiza el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.jButton1) {
            this.modelo.setCedula(Integer.parseInt(this.vista.jTextField1.getText()));
            this.modelo.setNombreCompleto(this.vista.jTextField2.getText());
            String prueba = this.vista.buttonGroup1.getSelection().getActionCommand();
            ArchivoDirecto ad = new ArchivoDirecto();
            ad.escribir();
        }
    }

} //fin de la clase

