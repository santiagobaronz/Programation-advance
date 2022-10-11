/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mauricio Sanchez, Santiago Baron y Sebastian Yepes
 */
public class Participante extends Persona{
    //declaramos atributos
    private String conferencia;
    //metodo constructor
    public Participante(String nombreCompleto, String cedula, String conferencia) {
        super(cedula, nombreCompleto);
        this.conferencia = conferencia;
    }
    //get y set
    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    

    
    
}
