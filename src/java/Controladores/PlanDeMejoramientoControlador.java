/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.DocenteMateria;
import Entidades.PlanMejoramiento;
import Facade.PlanMejoramientoFacade;
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
@Named(value = "planDeMejoramientoControlador")
@SessionScoped
public class PlanDeMejoramientoControlador implements Serializable {

    /**
     * Creates a new instance of PlanDeMejoramientoControlador
     */
    public PlanDeMejoramientoControlador() {
    }
    PlanMejoramiento planMejoramiento;
    DocenteMateria docenteMateria;
    @EJB    
    PlanMejoramientoFacade planMejoramientoFacade;

    public PlanMejoramiento getPlanMejoramiento() {
        return planMejoramiento;
    }

    public void setPlanMejoramiento(PlanMejoramiento planMejoramiento) {
        this.planMejoramiento = planMejoramiento;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }
    @PostConstruct
    public void init(){
        planMejoramiento = new PlanMejoramiento();
        docenteMateria = new DocenteMateria();
        
    }
    public List<PlanMejoramiento> consultarPlanMejoramiento(){
        return planMejoramientoFacade.findAll();
    }
    public void registrarPlanMejoramiento(){
        planMejoramiento.setDocenteAsigna(docenteMateria);
        planMejoramientoFacade.create(planMejoramiento);
    }
}
