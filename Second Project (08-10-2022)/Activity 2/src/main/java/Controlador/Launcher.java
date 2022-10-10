/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.Vista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import javax.swing.JFileChooser;

public class Launcher {

    

    public static void main(String[] args) {
        Persona modelo = new Persona();
        Vista vista = new Vista();
        Controlador control = new Controlador(modelo, vista);
        control.iniciar();
        vista.setVisible(true);

        
    } //fin del main
} //fin de la clase
