/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Materia;
import Facade.MateriaFacade;
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
@Named(value = "materiaControlador")
@SessionScoped
public class MateriaControlador implements Serializable {

    /**
     * Creates a new instance of MateriaControlador
     */
    public MateriaControlador() {
    }
    Materia materia;
    @EJB
    MateriaFacade materiaFacade;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    @PostConstruct
    public void init(){
        materia = new Materia();
    }
    public List<Materia>consultarMateria(){
        return materiaFacade.findAll();
    }
    public void registrarMateria(){
       
    }
    
    
}
