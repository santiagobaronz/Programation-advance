/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;
import src.main.java.Modelo.Queso;
import src.main.java.Modelo.Usuario;
import src.main.java.Vista.Login;
import src.main.java.Vista.Consultar;
import src.main.java.Vista.Eliminar;
import src.main.java.Vista.Ingresar;
import src.main.java.Vista.Menu;
import src.main.java.Vista.Modificar;

/**
 *
 * @author Mauricio
 */
public class Launcher {

    //Definimos metodo main 
    public static void main(String[] args) {
        //creación de objetos
        Usuario usuario = new Usuario();
        Queso queso = new Queso();

        Login vista1 = new Login();
        Menu vista2 = new Menu();
        Ingresar vista3 = new Ingresar();
        Consultar vista4 = new Consultar();
        Modificar vista5 = new Modificar();
        Eliminar vista6 = new Eliminar();
        Controlador control = new Controlador(usuario, queso, vista1, vista2, vista3, vista4, vista5, vista6);
        control.iniciar();
        //mostramos nuestra ventana
        vista1.setVisible(true);

    } //fin del main
} //fin de la clase
