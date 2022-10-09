/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mauricio
 */
public class Persona {
    
    // Declaramos variables
    private int cedula;
    private String nombreCompleto;
    private String Conferencia;
    
    // Constructor

    public Persona() {
    }
    
    public Persona(int cedula, String nombreCompleto, String Conferencia) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.Conferencia = Conferencia;
    }

    
    
    
    // Getters and setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getConferencia() {
        return Conferencia;
    }

    public void setConferencia(String Conferencia) {
        this.Conferencia = Conferencia;
    }
    
    
}
