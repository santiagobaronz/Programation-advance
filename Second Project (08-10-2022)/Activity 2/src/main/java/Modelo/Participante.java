/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mauricio
 */
public class Participante extends Persona{

    private String conferencia;
    
    public Participante(String nombreCompleto, String cedula, String conferencia) {
        super(cedula, nombreCompleto);
        this.conferencia = conferencia;
    }

    

    
    
}
