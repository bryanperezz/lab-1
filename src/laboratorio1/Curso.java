/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import laboratorio1.Ciclo;

/**
 *
 * @author Estudiantes
 */
public class Curso {
    //Atributos:
    private String codigoCurso;
    private String nombreCurso;
    private int credito;
    private int horasSemanales;
    private Ciclo ciclo;
    
    //Métodos:
    public Curso(String codigoCurso, String nombreCurso, int credito, int horasSemanales, Ciclo ciclo){
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.credito = credito;
        this.horasSemanales = horasSemanales;
        this.ciclo = ciclo;
    }

    public Curso() {
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
