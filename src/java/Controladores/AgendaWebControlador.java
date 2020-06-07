/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Acudiente;
import Entidades.AgendaWeb;
import Entidades.Docente;
import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Facade.AgendaWebFacade;
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
@Named(value = "agendaWebControlador")
@SessionScoped
public class AgendaWebControlador implements Serializable {

    /**
     * Creates a new instance of AgendaWebControlador
     */
    public AgendaWebControlador() {
    }
    AgendaWeb agendaWeb;
    DocenteMateria docenteMateria;
    Estudiante estudiante;
    @EJB   
    AgendaWebFacade agendaWebFacade;

    public AgendaWeb getAgendaWeb() {
        return agendaWeb;
    }

    public void setAgendaWeb(AgendaWeb agendaWeb) {
        this.agendaWeb = agendaWeb;
    }



    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }



    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    @PostConstruct
    public void init(){
        agendaWeb = new AgendaWeb();
        docenteMateria = new DocenteMateria();
        estudiante = new Estudiante();
    }
    public List<AgendaWeb> consultarAgendaWeb(){
        return agendaWebFacade.findAll();
    }
    public void registrarAgendaWeb(){
        agendaWeb.setEstudiante(estudiante);
        agendaWeb.setDocenteMateria(docenteMateria);
        agendaWebFacade.create(agendaWeb);
    }
    
}
