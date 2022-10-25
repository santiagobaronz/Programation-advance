/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.Modelo;

/**
 *
 * @author Mauricio
 */
public class Queso {
    
    private String tipoDeQueso;
    private String tipoDeLeche;
    private String grasa;
    private String maduracion;
    private String textura;
    private String gusto;
    private String tratamiento;
    
    private String[] tipo_queso;
    private String[] tipo_leche;
    private String[] materia_grasa;
    private String[] maduracionA;
    private String[] texturaA;
    private String[] intensidad;
    private String[] filtrado;
    
    // CONTRUCTOR
    public Queso(String tipoDeQueso, String tipoDeLeche, String grasa, String maduracion, String textura, String gusto, String tratamiento) {
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

    public String getGrasa() {
        return grasa;
    }

    public void setGrasa(String grasa) {
        this.grasa = grasa;
    }

    public String getMaduracion() {
        return maduracion;
    }

    public void setMaduracion(String maduracion) {
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

    public String[] getTipo_queso() {
        return tipo_queso;
    }

    public void setTipo_queso(String[] tipo_queso) {
        this.tipo_queso = tipo_queso;
    }

    public String[] getTipo_leche() {
        return tipo_leche;
    }

    public void setTipo_leche(String[] tipo_leche) {
        this.tipo_leche = tipo_leche;
    }

    public String[] getMateria_grasa() {
        return materia_grasa;
    }

    public void setMateria_grasa(String[] materia_grasa) {
        this.materia_grasa = materia_grasa;
    }

    public String[] getMaduracionA() {
        return maduracionA;
    }

    public void setMaduracionA(String[] maduracionA) {
        this.maduracionA = maduracionA;
    }

    public String[] getTexturaA() {
        return texturaA;
    }

    public void setTexturaA(String[] texturaA) {
        this.texturaA = texturaA;
    }

    public String[] getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String[] intensidad) {
        this.intensidad = intensidad;
    }

    public String[] getFiltrado() {
        return filtrado;
    }

    public void setFiltrado(String[] filtrado) {
        this.filtrado = filtrado;
    }
    
    
}
