/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Actividad;
import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.Periodo;
import Entidades.PlanMejoramiento;
import Entidades.RegistroNota;
import Facade.RegistroNotaFacade;
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
@Named(value = "registroNotaControlador")
@SessionScoped
public class RegistroNotaControlador implements Serializable {

    /**
     * Creates a new instance of RegistroNotaControlador
     */
    public RegistroNotaControlador() {
    }
    RegistroNota registroNota;
    Actividad actividad;
    PlanMejoramiento planMejoramiento;
    Estudiante estudiante;
    DocenteMateria docenteMateria;
    Periodo periodo;
    @EJB
    RegistroNotaFacade registroNotaFacade;

    public RegistroNota getRegistroNota() {
        return registroNota;
    }

    public void setRegistroNota(RegistroNota registroNota) {
        this.registroNota = registroNota;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public PlanMejoramiento getPlanMejoramiento() {
        return planMejoramiento;
    }

    public void setPlanMejoramiento(PlanMejoramiento planMejoramiento) {
        this.planMejoramiento = planMejoramiento;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    @PostConstruct
    public void init(){
        registroNota = new RegistroNota();
        actividad = new Actividad();
        planMejoramiento = new PlanMejoramiento();
        estudiante = new Estudiante();
        docenteMateria = new DocenteMateria();
        periodo = new Periodo();
    }
    public List<RegistroNota> consultarRegistroNota(){
        return registroNotaFacade.findAll();
    }
    public void registrarNota(){
        registroNota.setActividad(actividad);
        registroNota.setPlanMejoramiento(planMejoramiento);
        registroNota.setEstudiante(estudiante);
        registroNota.setDocenteMateria(docenteMateria);
        registroNota.setPeriodo(periodo);
        registroNotaFacade.create(registroNota);
    }
}
