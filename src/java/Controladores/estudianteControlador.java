/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Estudiante;
import Facade.EstudianteFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "estudianteControlador")
@SessionScoped
public class estudianteControlador implements Serializable {

    /**
     * Creates a new instance of estudianteControlador
     */
    public estudianteControlador() {
        estudiante = new Estudiante();
        estudianteFacade = new EstudianteFacade();
    }
    
    private Estudiante estudiante;
    
    @EJB
    EstudianteFacade estudianteFacade;
    
    public List<Estudiante> consultarTodos(){
       return estudianteFacade.findAll();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
}
