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
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "coordinadorControlador")
@SessionScoped
public class coordinadorControlador implements Serializable {

    /**
     * Creates a new instance of coordinadorControlador
     */
    public coordinadorControlador() {
        coordinador = new Coordinador();
        coordinadorFacade = new CoordinadorFacade();
    }
    
    private Coordinador coordinador;
    
    @EJB
    CoordinadorFacade coordinadorFacade;
    
    public List<Coordinador> consultarTodos(){
        return coordinadorFacade.findAll();
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }
    
}
