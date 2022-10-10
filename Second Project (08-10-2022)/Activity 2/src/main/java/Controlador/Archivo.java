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

/**
 *
 * @author Mauricio
 */


public class Archivo{

   
    private int indice;
    private long tamreg;
    private long canreg;
    private File fl;
    private static RandomAccessFile archivo = null;
    private static byte []array = null;
    private static ByteArrayOutputStream escribir = null;
    private static ObjectOutputStream salida = null;
    private static ByteArrayInputStream leer = null;
    private static ObjectInputStream entrada = null;

    public Archivo() {
    
    }
        
    public void EscribirEnArchivo() throws FileNotFoundException, IOException{
        Controlador control = new Controlador();
        ArrayList<Persona> array = control.listaInscritos;
        
        System.out.println(array.get(0).getNombreCompleto());
        
        

        
        
        try{
            
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));   
            fc.showOpenDialog(fc);
            File archivo1 = fc.getSelectedFile();
            
            System.out.print(archivo1.getAbsolutePath());
        
            archivo = new RandomAccessFile(archivo1, "rw");
            
            for (int i = 0; i < array.size(); i++) {
                if(archivo.length()!= 0){
                    archivo.seek(archivo.length());
                }
                archivo.writeInt(i);
                archivo.writeChars(array.get(i).getNombreCompleto());
                archivo.writeChars(array.get(i).getCedula());
                
            }
            salida.close();
             
        }catch(Exception e){
            System.out.println("No se encuentra el archivo");
        }
        
        
        
        
        
    }
        


    public void cerrar() {
        try {
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Archivo arch = new Archivo();
//        arch.escribir();
        /*arch.leerTodo();*/
        arch.cerrar();
    } //fin del main

}  //fin de la clase