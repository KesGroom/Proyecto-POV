/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Cita;
import Entidades.Docente;
import Entidades.DocenteCita;
import Facade.DocenteCitaFacade;
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
@Named(value = "docenteCitas")
@SessionScoped
public class DocenteCitas implements Serializable {

    /**
     * Creates a new instance of DocenteCitas
     */
    public DocenteCitas() {
    }
    Docente docente;
    Cita cita;
    DocenteCita docenteCita;
    @EJB
    DocenteCitaFacade docenteCitaFacade;

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public DocenteCita getDocenteCita() {
        return docenteCita;
    }

    public void setDocenteCita(DocenteCita docenteCita) {
        this.docenteCita = docenteCita;
    }
    @PostConstruct
    public void init(){
        docente = new Docente();
        cita = new Cita();
        docenteCita = new DocenteCita();
    }
    public List<DocenteCita> consultarDocenteCita(){
        return docenteCitaFacade.findAll();
    }
    public void registrarDocenteCita(){
        docenteCita.setIdCita(cita);
        docenteCita.setIdDocente(docente);
        docenteCitaFacade.create(docenteCita);
    }
    
}
