/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Controlador;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class DAO {
    
    private Statement consulta = null;
    private String db = "quesos";
    private String url = "jdbc:mysql://localhost/";
    private String user="root";
    private String password="";
    private String driver="com.mysql.cj.jdbc.Driver";
    private Connection cx;
    
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
    
    public DefaultTableModel mostrarTodosLosQuesos(){
        
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

    public void guardarQuesos(String tipo_queso, String tipo_leche, String materia_grasa, String maduracion, String textura, String gusto, String tratamiento) {
        String SQL = "INSERT INTO quesos (tipo_queso, tipo_leche, contenido_materia_grasa, maduracion, textura, gusto, tratamiento_leche) "
                + "VALUES ('"+tipo_queso+"', '"+tipo_leche+"', '"+materia_grasa+"', '"+maduracion+"', '"+textura+"', '"+gusto+"', '"+tratamiento+"')";
        conectar();
        try {
            java.sql.Statement consulta = cx.createStatement();
            consulta.executeUpdate(SQL);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un error al guardar el queso" + ex);
        }
    }

    public void eliminarQueso(String idParaEliminar) {
        
        int id = Integer.parseInt(idParaEliminar);
        String SQL = "DELETE FROM quesos WHERE id = '"+id+"'";
        conectar();
        try {
            java.sql.Statement consulta = cx.createStatement();
            consulta.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null,"El queso se ha borrado correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un error al borrar el queso");
        }
    }
    
    
    public DefaultTableModel filtrarQuesos(String option, String type){
        
        String []  nombresColumnas = {"Id","Tipo de queso","Tipo de leche", 
                "Contenido materia grasa", "Maduracion", "Textura", "Gusto"
                , "Tratamiento de la leche"};
        
        String [] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM quesos WHERE "+option+" = '"+ type +"'";
        

        
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
            
            JOptionPane.showMessageDialog(null,"Se ha presentado un error" + e);
            
        }finally{
            try{
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Se ha presentado un error" + e);
            }
        }
        
        // Devuelve el modelo con el que se rellenaran las tablas
        return modelo;
    }

    public void actualizarQueso(String idParaModificar, String tipoQueso,
            String tipoLeche, String contenido, String maduracion, 
            String textura, String gusto, String tratamiento) {
        
        int id = Integer.parseInt(idParaModificar);
        String SQL = "UPDATE quesos SET tipo_queso='"+ tipoQueso +"' ,"
                                + "tipo_leche='"+ tipoLeche +"' ,"
                                + "contenido_materia_grasa='"+ contenido +"' ,"
                                + "maduracion='"+ maduracion +"' ,"
                                + "textura='"+ textura +"' ,"
                                + "gusto='"+ gusto +"' ,"
                                + "tratamiento_leche='"+ tratamiento +"'"
                                + "WHERE id="+idParaModificar+"";
        
        conectar();
        try {
            java.sql.Statement consulta = cx.createStatement();
            consulta.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null,"El queso se ha actualizado correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un error al actualizar el queso");
        }
        
    }

    public void borrarDB() {
        
        String SQL = "DELETE FROM quesos";
        conectar();
        try {
            java.sql.Statement consulta = cx.createStatement();
            consulta.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null,"La base de datos se ha limpiado correctamente. Gracias por usar CATIRA");
            System.exit(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Hubo un error al limpiar la base de datos");
        }
        
        
    }
    
    
}
