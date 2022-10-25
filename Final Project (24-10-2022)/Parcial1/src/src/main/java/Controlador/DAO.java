/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class DAO {
    
    
    String db = "quesos";
    String url = "jdbc:mysql://localhost/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    
    public DAO(){
        
    }
    
    public Connection conectar(){
        
        try {
            Class.forName(driver);
            cx= DriverManager.getConnection(url+db,user,password);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se conecto a base de datos");
        }
        
        return cx;
       
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar");
        }
    }
    
    public DefaultTableModel mostrarQuesos(){
        
        String []  nombresColumnas = {"Id","Tipo de queso","Tipo de leche", 
                "Contenido materia grasa", "Maduracion", "Textura", "Gusto"
                , "Tratamiento de la leche"};
        
        String [] registros = new String[8];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM quesos";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try{
            cn = this.conectar();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("tipo_queso");
                registros[2] = rs.getString("tipo_leche");
                registros[3] = rs.getString("contenido_materia_grasa");
                registros[4] = rs.getString("maduracion");
                registros[5] = rs.getString("textura");
                registros[6] = rs.getString("gusto");
                registros[7] = rs.getString("tratamiento_leche");
                
                modelo.addRow(registros);
            }

        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Se ha presentado un error");
            
        }finally{
            try{
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Se ha presentado un error");
            }
        }
        
        // Devuelve el modelo con el que se rellenaran las tablas
        return modelo;
    }
    
    
}
