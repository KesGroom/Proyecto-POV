/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Tipo;
import Facade.TipoFacade;
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
        tipo = new Tipo();
        tipoFacade = new TipoFacade();
    }
     private Tipo tipo;
     
     @EJB
     TipoFacade tipoFacade;
     
     public List<Tipo> consultarTipo(){
         return tipoFacade.findAll();
     }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
     
     
}
