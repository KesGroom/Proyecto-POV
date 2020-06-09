/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

<<<<<<< HEAD
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kesgr
=======
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
>>>>>>> b0e1afe0e1326d6077b54b40603120d7598c6427
 */
@Named(value = "materiaControlador")
@SessionScoped
public class MateriaControlador implements Serializable {

    /**
     * Creates a new instance of MateriaControlador
     */
    public MateriaControlador() {
    }
<<<<<<< HEAD
=======
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
    
>>>>>>> b0e1afe0e1326d6077b54b40603120d7598c6427
    
}
