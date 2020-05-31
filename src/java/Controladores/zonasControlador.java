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
 * @author JSAntiago
 */
@Named(value = "zonasControlador")
@SessionScoped
public class zonasControlador implements Serializable {

    /**
     * Creates a new instance of zonasControlador
     */
    public zonasControlador() {
        zona = new ZonaServicioSocial();
        zonaFacade = new ZonaServicioSocialFacade();   
    }
    private ZonaServicioSocial zona;
    
    @EJB
    ZonaServicioSocialFacade zonaFacade;
    
    public void registrar(){
        zonaFacade.create(zona);
    }
    public void preActualizar(ZonaServicioSocial zonaActualizar){
        zona=zonaActualizar;
    }
    public void actualizar(){
        zonaFacade.edit(zona);
    }
    public void eliminar(){
        zonaFacade.remove(zona);
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
