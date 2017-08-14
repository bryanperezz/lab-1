/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author Estudiantes
 */
public class Historial {
    //Atributos:
    private int[] nota;
    private int promedio;
    private Curso curso;
    
    //Métodos:

    public Historial(int[] nota, int promedio, Curso curso) {
        this.nota = nota;
        this.promedio = promedio;
        this.curso = curso;
    }

    public Historial() {
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
