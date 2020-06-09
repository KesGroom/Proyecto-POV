/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Area;
import Entidades.Atencionarea;
import Entidades.Curso;
import Entidades.Docente;
import Facade.AtencionareaFacade;
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
@Named(value = "antecionAreaControlador")
@SessionScoped
public class AntecionAreaControlador implements Serializable {

    /**
     * Creates a new instance of AntecionAreaControlador
     */
    public AntecionAreaControlador() {
    }
    Atencionarea atencionarea;
    Area area;
    Docente docente;
    @EJB
    AtencionareaFacade atencionAreaFacade;

    public Atencionarea getAtencionarea() {
        return atencionarea;
    }

    public void setAtencionarea(Atencionarea atencionarea) {
        this.atencionarea = atencionarea;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    @PostConstruct
    public void init(){
        atencionarea = new Atencionarea();
        area = new Area();
        docente = new Docente();
        
    }
    public List<Atencionarea> consultarAtencionarea(){
        return atencionAreaFacade.findAll();
    }
    public void registrarAtencionArea(){
        atencionarea.setDocenteACargo(docente);
        atencionarea.setArea(area);
        atencionAreaFacade.create(atencionarea);
    }
}
