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
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author PC
 */
@Named(value = "estudianteControladores")
@SessionScoped
public class EstudianteControladores implements Serializable {

    /**
     * Creates a new instance of EstudianteControladores
     */
    public EstudianteControladores() {
    }
    Estudiante estudiante;
    @PostConstruct
    public void init(){
        estudiante = new Estudiante();
    }
    @EJB
    EstudianteFacade estudianteFacade;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public List<Estudiante> consultarEstudiante(){
        return estudianteFacade.findAll();
    }
    
}
