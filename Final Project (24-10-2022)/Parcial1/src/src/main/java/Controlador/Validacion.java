/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;

import Vista.Menu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Validacion {

    public void validarUsuario(String username_form, String password_form) throws FileNotFoundException, IOException {
        
        try(InputStream lectura = new FileInputStream("properties.properties")) {
            
            Properties propiedades = new Properties();
            propiedades.load(lectura);
            String username = propiedades.getProperty("USER_NAME");
            String password = propiedades.getProperty("PASSWORD");

            if(username_form.equals(username) && password_form.equals(password)){
                Menu menuPrincipal = new Menu();
                menuPrincipal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario incorrecto, el programa se cerrará");
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo hacer la validacion de usuario");
        }
    }
}
