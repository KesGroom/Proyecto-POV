/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Acudiente;
import Entidades.Coordinador;
import Entidades.Docente;
import Entidades.Pqrs;
import Facade.PqrsFacade;
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
@Named(value = "pqrsControladores")
@SessionScoped
public class pqrsControladores implements Serializable {

    /**
     * Creates a new instance of pqrsControladores
     */
    public pqrsControladores() {
        pqrs = new Pqrs();
        coordinador = new Coordinador();
        acudiente = new Acudiente();    
    }
    Pqrs pqrs;
    Coordinador coordinador;
    Acudiente acudiente;
    
    @EJB
    PqrsFacade pqrsFacade;

    public Pqrs getPqrs() {
        return pqrs;
    }

    public void setPqrs(Pqrs pqrs) {
        this.pqrs = pqrs;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

   
   
    public void registrarPqrs(){
        pqrs.setIdCoordinador(coordinador);
        pqrs.setIdAcudiente(acudiente);
        pqrsFacade.create(pqrs);
        pqrs = new Pqrs();
    }
    public List<Pqrs> consultarPqrs(){
        return pqrsFacade.findAll();
    }
    public String preActualizar(Pqrs pqrsActualizar){
        pqrs = pqrsActualizar;
        coordinador = pqrsActualizar.getIdCoordinador();
        acudiente = pqrsActualizar.getIdAcudiente();
        return "ResponderPqrs";
                
    }
    public String actualizarPqrs(){
        pqrs.setIdCoordinador(coordinador);
        pqrs.setIdAcudiente(acudiente);
        pqrsFacade.edit(pqrs);
        return "PQRS";
    }
   
    public void eliminarPqrs(Pqrs eliminarPqrs){
        pqrsFacade.remove(pqrs);
    }
     
}
