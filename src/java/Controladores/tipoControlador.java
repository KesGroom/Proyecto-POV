/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Tipos;
import Facade.TiposFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "tipoControlador")
@SessionScoped
public class tipoControlador implements Serializable {

    /**
     * Creates a new instance of tipoControlador
     */
    public tipoControlador() {
        tipo = new Tipos();
        tipoFacade = new TiposFacade();
    }
     private Tipos tipo;
     
     @EJB
     TiposFacade tipoFacade;
     
     public List<Tipos> consultarTipo(){
         return tipoFacade.findAll();
     }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
     
     
}
