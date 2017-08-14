/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import laboratorio1.Historial;

/**
 *
 * @author Estudiantes
 */
public class Alumno {
    //Atributos:
    private String nacimiento;
    private String carrera;
    private Historial historial;
    
    //Métodos:

    public Alumno(String nacimiento, String carrera, Historial historial) {
        this.nacimiento = nacimiento;
        this.carrera = carrera;
        this.historial = historial;
    }

    public Alumno() {
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
    
}
