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
import javax.ejb.EJB;

/**
 *
 * @author kesgr
 */
@Named(value = "areaControlador")
@SessionScoped
public class areaControlador implements Serializable {

    /**
     * Creates a new instance of areaControlador
     */
    public areaControlador() {
        area = new Area();
        grado = new Grado();
        areaFacade = new AreaFacade();
    }
    
    Area area;
    Grado grado;
    
    @EJB
    AreaFacade areaFacade;
    
    public void registrar(){
        area.setGrado(grado);
        areaFacade.create(area);
    }
    
}
