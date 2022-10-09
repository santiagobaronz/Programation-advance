/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Participante;
import Modelo.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 *
 * @author Mauricio
 */
public class ArchivoDirecto {

    private int indice;
    private int cedula;
    private String nombreCompleto;
    private String conferencia;
    private long tamreg;
    private long canreg;
    private File fl;
    RandomAccessFile archivo;

    public ArchivoDirecto() {
        this.indice = 0;
        this.cedula = 0;
        this.nombreCompleto = "";
        this.conferencia = "";
        this.tamreg = 60;
        this.canreg = 0;
        try {
            fl = new File("C://prueba.dat");
            archivo = new RandomAccessFile(fl, "rw");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public void escribir() {
        try {
                indice++;
                Persona p = new Participante();
                cedula = p.getCedula();
                nombreCompleto = p.getNombreCompleto();
                if (nombreCompleto.length() < 25) {
                    for (int i = nombreCompleto.length(); i < 25; i++) {
                        nombreCompleto = nombreCompleto + " ";
                    }
                } else {
                    nombreCompleto = nombreCompleto.substring(0, 25);
                }
                conferencia = p.getConferencia();
                if (archivo.length() != 0) {
                    archivo.seek(archivo.length());
                }
                archivo.writeInt(cedula);
                archivo.writeChars(nombreCompleto);
                archivo.writeChars(conferencia);
            
        } catch (FileNotFoundException fnfe) 
        { fnfe.printStackTrace();
        } catch (IOException ioe) {
          ioe.printStackTrace();
        }
    

 /*   public void leerTodo() {
        System.out.println("\nMostrando todos los Registros");
        try {
            archivo.seek(0);
            nombreCompleto = "";
            canreg = archivo.length() / tamreg;
            for (int r = 0; r < canreg; r++) {
                indice = archivo.readInt();
                cedula = archivo.readInt();
                for (int i = 0; i < 25; ++i) {
                    nombreCompleto += archivo.readChar();
                }
                conferencia = archivo.readLine();
                System.out.println(" Registro No: " + indice + "Nombre: "
                        + nombre + " Edad: " + edad);
                nombre = "";
            }
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
        }
    }
*/


    public void cerrar() {
        try {
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArchivoDirecto arch = new ArchivoDirecto();
        arch.escribir();
        /*arch.leerTodo();*/
        arch.cerrar();
    } //fin del main

}  //fin de la clase

