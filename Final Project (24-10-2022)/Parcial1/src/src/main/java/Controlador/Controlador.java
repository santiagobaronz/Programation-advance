/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Queso;
import Modelo.Usuario;
import Vista.Consultar;
import Vista.Eliminar;
import Vista.Ingresar;
import Vista.Login;
import Vista.Menu;
import Vista.Modificar;
import java.awt.event.ActionListener;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.main.java.Controlador.Validacion;

/**
 *
 * @author Mauricio
 */
public class Controlador implements ActionListener {
    //declaramos los atributos
    private Usuario modelo1;
    private Queso modelo2;
    
    private Login vista1;
    private Menu vista2;
    private Ingresar vista3;
    private Consultar vista4;
    private Modificar vista5;
    private Eliminar vista6;
    
    // CONSTRUCTOR
    public Controlador(Usuario modelo1, Queso modelo2, Login vista1, Menu vista2, Ingresar vista3, Consultar vista4, Modificar vista5, Eliminar vista6) {
        
        this.modelo1 = modelo1;
        this.modelo2 = modelo2;
        
        this.vista1 = vista1;
        this.vista2 = vista2;
        this.vista3 = vista3;
        this.vista4 = vista4;
        this.vista5 = vista5;
        this.vista6 = vista6;
        
        // ENVIAMOS LA REFERENCIA A LA VISTA
        // LOGIN
        this.vista1.jButton1.addActionListener(this);
        this.vista1.jButton2.addActionListener(this);
        // MENÚ
        this.vista2.jButton1.addActionListener(this);
        this.vista2.jButton2.addActionListener(this);
        this.vista2.jButton3.addActionListener(this);
        this.vista2.jButton4.addActionListener(this);
        this.vista2.jButton5.addActionListener(this);
        // INGRESAR
        this.vista3.jButton1.addActionListener(this);
        this.vista3.jButton2.addActionListener(this);
        this.vista3.jButton3.addActionListener(this);
        // CONSULTA
        this.vista4.jButton1.addActionListener(this);
        this.vista4.jButton2.addActionListener(this);
        this.vista4.jButton3.addActionListener(this);
        // MODIFICAR
        this.vista5.jButton1.addActionListener(this);
        this.vista5.jButton2.addActionListener(this);
        this.vista5.jButton3.addActionListener(this);
        this.vista5.jButton4.addActionListener(this);
        // ELIMINAR
        this.vista6.jButton1.addActionListener(this);
        this.vista6.jButton2.addActionListener(this);
        this.vista6.jButton3.addActionListener(this);
        this.vista6.jButton4.addActionListener(this);
        
    }
    
    // CONSTRUCTOR VACIO
    public Controlador() {
    }
    
    // metodo iniciar ventana
    public void iniciar() {
        // colocarle un titulo a la ventana
        this.vista1.setTitle("Aplicativo PARCIAL");
        // Se le indica la posicion --> null para que la ventana inicie en //la posicion 0 es decir en el centro de la pantalla
        this.vista1.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.vista1.jButton1){
            try {
                String username = this.vista1.jTextField1.getText();
                String password = this.vista1.jTextField2.getText();
                Validacion validacion = new Validacion();
                validacion.validarUsuario(username, password);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo hacer la validacion de usuario");
            }

        }
        
    }
    
    
    
    
}
