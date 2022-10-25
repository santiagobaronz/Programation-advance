/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;

import src.main.java.Modelo.Queso;
import src.main.java.Modelo.Usuario;
import src.main.java.Vista.Consultar;
import src.main.java.Vista.Ingresar;
import src.main.java.Vista.Login;
import src.main.java.Vista.Menu;
import src.main.java.Vista.Modificar;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import src.main.java.Controlador.Validacion;
import src.main.java.Vista.Eliminar;

/**
 *
 * @author Mauricio
 */
public class Controlador implements ActionListener {
    //declaramos los atributos
    private Usuario modelo1;
    private Queso modelo2;
    
    private Login vista1;
    private Menu vista2;
    private Ingresar vista3;
    private Consultar vista4;
    private Modificar vista5;
    private Eliminar vista6;
    
    // CONSTRUCTOR
    public Controlador(Usuario modelo1, Queso modelo2, Login vista1, Menu vista2, Ingresar vista3, Consultar vista4, Modificar vista5, Eliminar vista6) {
        
        this.modelo1 = modelo1;
        this.modelo2 = modelo2;
        
        this.vista1 = vista1;
        this.vista2 = vista2;
        this.vista3 = vista3;
        this.vista4 = vista4;
        this.vista5 = vista5;
        this.vista6 = vista6;
        
        // ENVIAMOS LA REFERENCIA A LA VISTA
        // LOGIN
        this.vista1.jButton1.addActionListener(this);
        this.vista1.jButton2.addActionListener(this);
        // MENÚ
        this.vista2.ingresarBTN.addActionListener(this);
        this.vista2.consultarBTN.addActionListener(this);
        this.vista2.modificarBTN.addActionListener(this);
        this.vista2.eliminarBTN.addActionListener(this);
        this.vista2.cerrarBTN.addActionListener(this);
        // INGRESAR
        this.vista3.IngresarBTN.addActionListener(this);
        this.vista3.limpiarBTN.addActionListener(this);
        this.vista3.jButton3.addActionListener(this);
        // CONSULTA
        this.vista4.jButton1.addActionListener(this);
        this.vista4.jButton2.addActionListener(this);
        this.vista4.jButton3.addActionListener(this);
        // MODIFICAR
        this.vista5.jButton1.addActionListener(this);
        this.vista5.jButton2.addActionListener(this);
        this.vista5.jButton3.addActionListener(this);
        this.vista5.jButton4.addActionListener(this);
        // ELIMINAR
        this.vista6.jButton1.addActionListener(this);
        this.vista6.jButton2.addActionListener(this);
        this.vista6.jButton3.addActionListener(this);
        this.vista6.jButton4.addActionListener(this);
        
    }
    
    // CONSTRUCTOR VACIO
    public Controlador() {
    }
    
    // metodo iniciar ventana
    public void iniciar() {
        // colocarle un titulo a la ventana
        this.vista1.setTitle("Aplicativo PARCIAL");
        // Se le indica la posicion --> null para que la ventana inicie en //la posicion 0 es decir en el centro de la pantalla
        this.vista1.setLocationRelativeTo(null);
    }
    
    public void TipoQuesoArray(String tq1, String tq2, String tq3, String tq4, 
            String tq5, String tq6, String tq7, String tq8, String tq9, String tq10, 
            String tq11, String tq12, String tq13, String tq14, String tq15, String tq16, 
            String tq17, String tq18, String tq19, String tq20, String tq21, String tq22, 
            String tq23, String tq24, String tq25, String tq26, String tq27, String tq28, 
            String tq29, String tq30, String tq31, String tq32, String tq33, String tq34, 
            String tq35, String tq36) throws FileNotFoundException, IOException {
        
        try(InputStream lectura = new FileInputStream("properties.properties")) {
            
            Properties propiedades = new Properties();
            propiedades.load(lectura);
            String tipoq1 = propiedades.getProperty("TIPO_DE_QUESO_1");
            String tipoq2 = propiedades.getProperty("TIPO_DE_QUESO_2");
            String tipoq3 = propiedades.getProperty("TIPO_DE_QUESO_3");
            String tipoq4 = propiedades.getProperty("TIPO_DE_QUESO_4");
            String tipoq5 = propiedades.getProperty("TIPO_DE_QUESO_5");
            String tipoq6 = propiedades.getProperty("TIPO_DE_QUESO_6");
            String tipoq7 = propiedades.getProperty("TIPO_DE_QUESO_7");
            String tipoq8 = propiedades.getProperty("TIPO_DE_QUESO_8");
            String tipoq9 = propiedades.getProperty("TIPO_DE_QUESO_9");
            String tipoq10 = propiedades.getProperty("TIPO_DE_QUESO_10");
            String tipoq11 = propiedades.getProperty("TIPO_DE_QUESO_11");
            String tipoq12 = propiedades.getProperty("TIPO_DE_QUESO_12");
            String tipoq13 = propiedades.getProperty("TIPO_DE_QUESO_13");
            String tipoq14 = propiedades.getProperty("TIPO_DE_QUESO_14");
            String tipoq15 = propiedades.getProperty("TIPO_DE_QUESO_15");
            String tipoq16 = propiedades.getProperty("TIPO_DE_QUESO_16");
            String tipoq17 = propiedades.getProperty("TIPO_DE_QUESO_17");
            String tipoq18 = propiedades.getProperty("TIPO_DE_QUESO_18");
            String tipoq19 = propiedades.getProperty("TIPO_DE_QUESO_19");
            String tipoq20 = propiedades.getProperty("TIPO_DE_QUESO_20");
            String tipoq21 = propiedades.getProperty("TIPO_DE_QUESO_21");
            String tipoq22 = propiedades.getProperty("TIPO_DE_QUESO_22");
            String tipoq23 = propiedades.getProperty("TIPO_DE_QUESO_23");
            String tipoq24 = propiedades.getProperty("TIPO_DE_QUESO_24");
            String tipoq25 = propiedades.getProperty("TIPO_DE_QUESO_25");
            String tipoq26 = propiedades.getProperty("TIPO_DE_QUESO_26");
            String tipoq27 = propiedades.getProperty("TIPO_DE_QUESO_27");
            String tipoq28 = propiedades.getProperty("TIPO_DE_QUESO_28");
            String tipoq29 = propiedades.getProperty("TIPO_DE_QUESO_29");
            String tipoq30 = propiedades.getProperty("TIPO_DE_QUESO_30");
            String tipoq31 = propiedades.getProperty("TIPO_DE_QUESO_31");
            String tipoq32 = propiedades.getProperty("TIPO_DE_QUESO_32");
            String tipoq33 = propiedades.getProperty("TIPO_DE_QUESO_33");
            String tipoq34 = propiedades.getProperty("TIPO_DE_QUESO_34");
            String tipoq35 = propiedades.getProperty("TIPO_DE_QUESO_35");
            String tipoq36 = propiedades.getProperty("TIPO_DE_QUESO_36");
            
            
            String[] arrayTipoQueso = {tipoq1, tipoq2, tipoq3, tipoq4, tipoq5, 
                tipoq6, tipoq7, tipoq8, tipoq9, tipoq10, tipoq11, tipoq12, tipoq13, 
                tipoq14, tipoq15, tipoq16, tipoq17, tipoq18, tipoq19, tipoq20, tipoq21, 
                tipoq22, tipoq23, tipoq24, tipoq25, tipoq26, tipoq27, tipoq28, tipoq29, 
                tipoq30, tipoq31, tipoq32, tipoq33, tipoq34, tipoq35, tipoq36};
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.vista1.jButton1){
            try {
                String username = this.vista1.jTextField1.getText();
                String password = this.vista1.jTextField2.getText();
                Validacion validacion = new Validacion();
                validacion.validarUsuario(username, password);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo hacer la validacion de usuario");
            }
        }
    }
}
