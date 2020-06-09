/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Area;
import Entidades.Grado;
import Facade.AreaFacade;
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
@Named(value = "areaControlador")
@SessionScoped
public class AreaControlador implements Serializable {

    /**
     * Creates a new instance of AreaControlador
     */
    public AreaControlador() {
    }
    Area area;
    Grado grado;
    @EJB
    AreaFacade areaFacade;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
    @PostConstruct
    public void init(){
        area = new Area();
        grado = new Grado();
    }
    public List<Area> consultarArea(){
        return areaFacade.findAll();
    }
    public void registrarArea(){
        area.setGrado(grado);
        areaFacade.create(area);
    }
    
}
