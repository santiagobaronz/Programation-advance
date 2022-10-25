/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mauricio
 */
public class Queso {
    
    private String tipoDeQueso;
    private String tipoDeLeche;
    private int grasa;
    private int maduracion;
    private String textura;
    private String gusto;
    private String tratamiento;
    
    
    // CONTRUCTOR
    public Queso(String tipoDeQueso, String tipoDeLeche, int grasa, int maduracion, String textura, String gusto, String tratamiento) {
        this.tipoDeQueso = tipoDeQueso;
        this.tipoDeLeche = tipoDeLeche;
        this.grasa = grasa;
        this.maduracion = maduracion;
        this.textura = textura;
        this.gusto = gusto;
        this.tratamiento = tratamiento;
    }

    public Queso() {
       
    }

    // GETTERS AND SETTERS
    public String getTipoDeQueso() {
        return tipoDeQueso;
    }

    public void setTipoDeQueso(String tipoDeQueso) {
        this.tipoDeQueso = tipoDeQueso;
    }

    public String getTipoDeLeche() {
        return tipoDeLeche;
    }

    public void setTipoDeLeche(String tipoDeLeche) {
        this.tipoDeLeche = tipoDeLeche;
    }

    public int getGrasa() {
        return grasa;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    public int getMaduracion() {
        return maduracion;
    }

    public void setMaduracion(int maduracion) {
        this.maduracion = maduracion;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getGusto() {
        return gusto;
    }

    public void setGusto(String gusto) {
        this.gusto = gusto;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
