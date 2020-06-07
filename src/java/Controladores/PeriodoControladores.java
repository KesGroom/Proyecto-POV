/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Periodo;
import Facade.PeriodoFacade;
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
@Named(value = "periodoControladores")
@SessionScoped
public class PeriodoControladores implements Serializable {

    /**
     * Creates a new instance of PeriodoControladores
     */
    public PeriodoControladores() {
    }
    Periodo periodo;
    @PostConstruct
    public void init(){
        periodo = new Periodo();
    }
    @EJB
    PeriodoFacade periodoFacade;

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    public List<Periodo> consultarPeriodo(){
        return periodoFacade.findAll();
    }
    public void registrarPeriodo(){
        periodoFacade.create(periodo);
    }
    
}
