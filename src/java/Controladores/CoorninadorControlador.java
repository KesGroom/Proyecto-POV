/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Coordinador;
import Facade.CoordinadorFacade;
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
@Named(value = "coorninadorControlador")
@SessionScoped
public class CoorninadorControlador implements Serializable {

    /**
     * Creates a new instance of CoorninadorControlador
     */
    public CoorninadorControlador() {
    }
    Coordinador coordinador;
    @PostConstruct
    public void init(){
        coordinador = new Coordinador();
    }
    @EJB
    CoordinadorFacade coordinadorFacade;

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }
    public List<Coordinador> consultarCoordinador(){
        return coordinadorFacade.findAll();
    }
    
}
