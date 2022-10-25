/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import src.main.java.Modelo.Queso;

/**
 *
 * @author Mauricio
 */
public class Archivo {
    
    //definimos nuestros atributos
    private static RandomAccessFile archivo = null;
    
    //metodo constructor vacio
    public Archivo() {
    
    }

    public void escribirDatos() throws IOException {
        //Traemos el array desde el controlador
        Controlador control = new Controlador();
        ArrayList<Queso> array = control.listaQuesos;
        
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

                    StringBuffer sb_tipo_queso = new StringBuffer(array.get(i).getTipoDeQueso());
                    sb_tipo_queso.setLength(25);
                    archivo.writeChars(sb_tipo_queso.toString() + "/");

                    StringBuffer sb_tipo_leche = new StringBuffer(array.get(i).getTipoDeLeche());
                    sb_tipo_leche.setLength(25);
                    archivo.writeChars(sb_tipo_leche.toString()  + "/");

                    StringBuffer sb_grasa = new StringBuffer(array.get(i).getGrasa());
                    sb_grasa.setLength(25);
                    archivo.writeChars(sb_grasa.toString()  + "/");
                    
                    StringBuffer sb_maduracion = new StringBuffer(array.get(i).getMaduracion());
                    sb_maduracion.setLength(25);
                    archivo.writeChars(sb_maduracion.toString()  + "/");
                    
                    StringBuffer sb_textura = new StringBuffer(array.get(i).getTextura());
                    sb_textura.setLength(25);
                    archivo.writeChars(sb_textura.toString()  + "/");
                    
                    StringBuffer sb_gusto = new StringBuffer(array.get(i).getGusto());
                    sb_gusto.setLength(25);
                    archivo.writeChars(sb_gusto.toString()  + "/");
                    
                    StringBuffer sb_tratamiento = new StringBuffer(array.get(i).getTratamiento());
                    sb_tratamiento.setLength(25);
                    archivo.writeChars(sb_tratamiento.toString() + "\r");
                }

                archivo.writeChars(" --------------------------------------------------------- \r");
                JOptionPane.showMessageDialog(null, "Los datos se han guardado en el archivo de texto. Gracias por usar el aplicativo!");
                
                DAO borrarDB = new DAO();
                borrarDB.borrarDB();

            }catch(Exception e){
                //Muestra del posible error
                JOptionPane.showMessageDialog(null, "Hay un error que no permite escribir los datos");
            }
        }catch(Exception e){
            //Muestra del posible error
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo de texto, intente de nuevo.");
        }
        
    }

    public void cargarDatos() {
        String[] listaQuesosDB = {};
        
        try{
            JOptionPane.showMessageDialog(null, "Seleccione el fichero para gestionar los datos");
            JFileChooser url = new JFileChooser(System.getProperty("user.dir"));
            url.showOpenDialog(url);
            String selectPath = url.getSelectedFile().getPath();
            

            FileReader fr;
            fr = new FileReader(selectPath);
            BufferedReader archivoLectura = new BufferedReader(fr);
            String cadenaLeida = "";
            String[] datosQueso;
            
            while(true){
                cadenaLeida = archivoLectura.readLine();
                if(cadenaLeida==null){
                    break;
                }else{
                    String[] resultado = cadenaLeida.split("/");
                    Controlador control = new Controlador();
                    control.crearQueso(resultado[0], resultado[1], resultado[2], resultado[3], resultado[4], resultado[5], resultado[6]);
                }
            }
        
        }catch(Exception e){
            
        }
    }
    
}
