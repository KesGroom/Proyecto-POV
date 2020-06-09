/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Docente;
import Facade.DocenteFacade;
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
@Named(value = "docenteControlador")
@SessionScoped
public class DocenteControlador implements Serializable {

    /**
     * Creates a new instance of DocenteControlador
     */
    public DocenteControlador() {
    }
    Docente docente;
    @EJB
    DocenteFacade docenteFacade;

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    @PostConstruct
    public void init(){
        docente = new Docente();
    }
    public List<Docente> consultarDocente(){
        return docenteFacade.findAll();
    }
}
