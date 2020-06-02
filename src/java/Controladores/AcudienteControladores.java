/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Acudiente;
import Facade.AcudienteFacade;
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
@Named(value = "acudienteControladores")
@SessionScoped
public class AcudienteControladores implements Serializable {

    /**
     * Creates a new instance of AcudienteControladores
     */
    public AcudienteControladores() {
    }
    Acudiente acudiente;
    @EJB
    AcudienteFacade acudienteFacade;

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }
    @PostConstruct
    public void init(){
        acudiente = new Acudiente();
       
    }
    public List<Acudiente> consultarAcudiente(){
        return acudienteFacade.findAll();
    }
    
}
