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
     
     public String registrar(){
         
         tipoFacade.create(tipo);
         
         return "si/Coordinador/Tipos";
     }
     
     public String preActualizar(Tipo tipoActualizar){
         tipo = tipoActualizar;
         
         return "si/Coordinador/TipoActualizar";
     }
     
     public String actualizar(){
         tipoFacade.edit(tipo);
         
         return "si/Coordinador/Tipos";
     }
     
     public void eliminar(Tipo tipoEliminar){
         tipoFacade.remove(tipoEliminar);
     }
     
     public void consultarId(int id){
         tipoFacade.find(id);
     }
     
     public List<Tipo> consultarTodos(){
         return tipoFacade.findAll();
     }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
     
     
}
