/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.Controlador.listaInscritos;
import Modelo.Participante;
import Modelo.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio Sanchez, Santiago Baron y Sebastian Yepes
 */


public class Archivo{

    //definimos nuestros atributos
    private int indice = 0;
    private static RandomAccessFile archivo = null;
    
    //metodo constructor vacio
    public Archivo() {
    
    }
    
    // Metodo que nos permite escribir en el archivo
    public void EscribirEnArchivo() throws FileNotFoundException, IOException{
        
        //Traemos el array desde el controlador
        Controlador control = new Controlador();
        ArrayList<Participante> array = control.listaInscritos;
        
        // Permitir seleccionar la ubicación de nuestro archivo (No se hace necesario usar 
        // el acrhivo.close() debido a que el try catch lo hace por defecto)
        
        try{
            JOptionPane.showMessageDialog(null, "A continuación seleccione el archivo txt en el que desea guardar la infomación (database.txt)");
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));   
            fc.showOpenDialog(fc);
            String archivo1 = fc.getSelectedFile().getAbsolutePath();

            // Manejo de excepcion al momento de escribir en el archivo
            try(RandomAccessFile archivo = new RandomAccessFile(archivo1, "rw")){
                for (int i = 0; i < array.size(); i++) {
                    if(archivo.length() != 0){
                        archivo.seek(archivo.length());
                    }

                    String id = String.valueOf(i);


                    StringBuffer sb_id = new StringBuffer(id);
                    sb_id.setLength(2);
                    archivo.writeChars(sb_id.toString());

                    StringBuffer sb_nombre = new StringBuffer(array.get(i).getNombreCompleto());
                    sb_nombre.setLength(25);
                    archivo.writeChars(sb_nombre.toString());

                    StringBuffer sb_cedula = new StringBuffer(array.get(i).getCedula());
                    sb_cedula.setLength(15);
                    archivo.writeChars(sb_cedula.toString());

                    StringBuffer sb_conferencia = new StringBuffer(array.get(i).getConferencia());
                    sb_conferencia.setLength(25);
                    archivo.writeChars(sb_conferencia + "\r");
                    indice++;
                }

                archivo.writeChars(" --------------------------------------------------------- \r");
                JOptionPane.showMessageDialog(null, "Los datos se han guardado en el archivo de texto. Gracias por usar el aplicativo!");
                System.exit(0);

            }catch(Exception e){
                //Muestra del posible error
                JOptionPane.showMessageDialog(null, "Hay un error que no permite escribir los datos");
            }
        }catch(Exception e){
            //Muestra del posible error
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo de texto, intente de nuevo.");
        }
    }
        
}  //fin de la clase