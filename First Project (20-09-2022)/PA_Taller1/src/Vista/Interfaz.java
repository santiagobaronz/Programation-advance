/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.Controlador;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Interfaz {
    
    private Scanner lector;
    
    public Interfaz(){
        lector = new Scanner(System.in);
    }
    
    public void capturarDatosCliente(Controlador control){
        String nombre;
        int edad, codigo;
        String correo;

        System.out.print("\nIngresar el codigo: ");
        codigo = lector.nextInt();

        System.out.print("Ingrese el nombre: ");
        nombre = lector.next();

        System.out.print("Ingrese la edad: ");
        edad = lector.nextInt();

        System.out.print("Ingrese el correo electronico: ");
        correo = lector.next();

        control.crearCliente(nombre,edad,correo,codigo);
    }
    
    public void buscarCliente(Controlador control){
        int codigo;
        boolean existenClientes;
        
        existenClientes = control.confirmarExistencia();
        
        if(existenClientes){
            System.out.print("\nIngresar el codigo a buscar: ");
            codigo = lector.nextInt();
            control.buscarCliente(codigo);
        }else{
            System.out.print("\nNo hay clientes registrados\n");
        }
        
    }
        
    public void menu(Controlador control){
    
    int opcion = 0;
    
        do{
            
            System.out.println("\n***** Clientes *******");
            System.out.println("1). Crear cliente");
            System.out.println("2). Buscar cliente");
            System.out.println("3). Cerrar programa");
            System.out.print("Escoja una opcion: ");
            
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1 -> capturarDatosCliente(control);
                case 2 -> buscarCliente(control);
                case 3 -> {
                    System.out.println("Gracias por usar nuestro programa!");
                    System.exit(0);
            }
            }
            
            System.out.println("Si desea continuar escriba 1, de lo contrario 0");
            System.out.println("***************************************************");
            System.out.print("Seleccione su opcion: ");
            opcion = lector.nextInt();
            System.out.flush();
            
        }while(opcion != 0);
   
    }
        
    public void imprimirDatosCliente(String nombre, int edad, String correo, int codigo){
        System.out.println("\n ***** DATOS DEL CLIENTE *******");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electronico: " + correo + "\n");
        System.out.println("***************************************************");
    }
    
    public void imprimirError(String error){
        System.out.println("\nHa ocurrido un error: " + error + "\n");
                
    }
}
