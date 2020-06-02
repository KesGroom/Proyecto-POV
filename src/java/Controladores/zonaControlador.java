/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.ZonaServicioSocial;
import Facade.ZonaServicioSocialFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "zonaControlador")
@SessionScoped
public class zonaControlador implements Serializable {

    /**
     * Creates a new instance of zonaControlador
     */
    public zonaControlador() {
        zona = new ZonaServicioSocial();
        zonaFacade = new ZonaServicioSocialFacade();
    }
    
    private ZonaServicioSocial zona;
    
    @EJB
    ZonaServicioSocialFacade zonaFacade;
    
    public String registrar(){
        zonaFacade.create(zona);
        zona = new ZonaServicioSocial();
        return "ZonasSS.xhtml";
    }
    public void preActualizar(ZonaServicioSocial zonaActualizar){
        zonaActualizar=zona;
    }
    public void actualizar(){
        zonaFacade.edit(zona);
    }
    public String eliminar(){
        zonaFacade.remove(zona);
        return "ZonasSS.xhtml";
    }
    public List<ZonaServicioSocial> consultarZona(){
        return zonaFacade.findAll();
    }

    public ZonaServicioSocial getZona() {
        return zona;
    }

    public void setZona(ZonaServicioSocial zona) {
        this.zona = zona;
    }
    
}
