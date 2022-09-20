/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Vista.Interfaz;

/**
 *
 * @author Estudiantes
 */
public class Launcher {
    
    public static void main(String[] args){
        Interfaz vista = new Interfaz();
        Controlador controlador = new Controlador(vista);
    }
}
