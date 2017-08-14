/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import laboratorio1.Usuario;

/**
 *
 * @author Estudiantes
 */
public class Matriculador {
    //Atributos:
    private Usuario usuario;
    
    //Métodos:

    public Matriculador(Usuario usuario) {
        this.usuario = usuario;
    }

    public Matriculador() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
