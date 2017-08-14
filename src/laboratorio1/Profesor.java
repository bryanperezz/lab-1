/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Profesor extends Persona {
    //Atributos:
    private Persona persona;
    //protected ArrayList<Alumno> alumno = new ArrayList<Alumno>();
    
    //Métodos:

    public Profesor(Persona persona, String cedula, String nombre, int telefono, String email) {
        super(cedula, nombre, telefono, email);
        this.persona = persona;
    }

    public Profesor(Persona persona) {
        this.persona = persona;
    }

    public Profesor() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
