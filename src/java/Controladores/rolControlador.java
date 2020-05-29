/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Roles;
import Facade.RolesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "rolControlador")
@SessionScoped
public class rolControlador implements Serializable {

    /**
     * Creates a new instance of rolControlador
     */
    public rolControlador() {
        rol = new Roles();
        rolFacade = new RolesFacade();
    }
    private Roles rol;
    
    @EJB 
    RolesFacade rolFacade;
    
   
    public List<Roles> consultarRol(){
        return rolFacade.findAll();
    }
    
    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }
    
}
