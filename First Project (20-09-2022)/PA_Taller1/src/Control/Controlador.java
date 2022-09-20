/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Control;
import Modelos.Cliente;
import Vista.Interfaz;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Controlador {
    
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    private Interfaz vista;
    private Cliente cliente;

    public Controlador(Interfaz vista){
        this.vista = vista;
        this.vista.menu(this);
    }
    
    public void crearCliente(String nombre, int edad, String correo, int codigo){
        
        int checkStatus= 0;
        
        for(int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getCodigo() == codigo){
                checkStatus++;
            }
        }
        
        if(checkStatus == 0){
            cliente = new Cliente();
            cliente.setCodigo(codigo);
            cliente.setNombre(nombre);
            cliente.setEdad(edad);
            cliente.setCorreo(correo);

            listaClientes.add(cliente);
            actualizarVista(listaClientes.size() - 1);
        }else{
            vistaError("El codigo ingresado esta repetido");
        }
    }
    
    public void buscarCliente(int codigo){
        
        int checkStatus = 0;
          
        for(int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getCodigo() == codigo){
                actualizarVista(i);
                checkStatus = 0;
                break;
            }else{
                checkStatus++;
            }
        }
        
        if(checkStatus != 0){
            vistaError("No se encuentra este cliente");
        }
    }
    
    public void actualizarVista(int ultimoRegistro){
        vista.imprimirDatosCliente(listaClientes.get(ultimoRegistro).getNombre(),
                                listaClientes.get(ultimoRegistro).getEdad(),
                                listaClientes.get(ultimoRegistro).getCorreo(),
                                listaClientes.get(ultimoRegistro).getCodigo());
    }
    
    public void vistaError(String error){
        vista.imprimirError(error);
    }

    public boolean confirmarExistencia() {
        if(listaClientes.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
