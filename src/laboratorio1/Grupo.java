/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import laboratorio1.Ciclo;
import laboratorio1.Curso;
import laboratorio1.Profesor;
import laboratorio1.Alumno;

/**
 *
 * @author Estudiantes
 */
public class Grupo {
    //Atributos:
    private Ciclo ciclo;
    private Curso curso;
    private int numeroGrupo;
    private int horario;
    private Profesor profesor;
    private Alumno estudianteMatriculado;
    private int nota;
    
    //Métodos:

    public Grupo(Ciclo ciclo, Curso curso, int numeroGrupo, int horario, Profesor profesor, Alumno estudianteMatriculado, int nota) {
        this.ciclo = ciclo;
        this.curso = curso;
        this.numeroGrupo = numeroGrupo;
        this.horario = horario;
        this.profesor = profesor;
        this.estudianteMatriculado = estudianteMatriculado;
        this.nota = nota;
    }

    public Grupo() {
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno getEstudianteMatriculado() {
        return estudianteMatriculado;
    }

    public void setEstudianteMatriculado(Alumno estudianteMatriculado) {
        this.estudianteMatriculado = estudianteMatriculado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
