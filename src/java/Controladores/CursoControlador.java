/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Curso;
import Facade.CursoFacade;
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
@Named(value = "cursoControlador")
@SessionScoped
public class CursoControlador implements Serializable {

    /**
     * Creates a new instance of CursoControlador
     */
    public CursoControlador() {
    }
    Curso curso;
    @EJB
    CursoFacade cursoFacade;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
    @PostConstruct
    public void init(){
        curso = new Curso();
    }
    public List<Curso> consultarCurso(){
        return cursoFacade.findAll();
    }
    
}
