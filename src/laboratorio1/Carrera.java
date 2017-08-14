/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import laboratorio1.Curso;

/**
 *
 * @author Estudiantes
 */
public class Carrera {
    //Atributos:
    private String codigoCarrera;
    private String nombreCarrera;
    private String titulo;
    protected ArrayList<Curso> curso = new ArrayList<Curso>();
    
    //Métodos:

    public Carrera(String codigoCarrera, String nombreCarrera, String titulo) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.titulo = titulo;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }
    
    public Carrera(){
    }
    
    /*return public Buscar(nombreCarrera, codigoCarrera){
        
    }*/
}
