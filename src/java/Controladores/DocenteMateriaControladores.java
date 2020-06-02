/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.DocenteMateria;
import Facade.DocenteMateriaFacade;
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
@Named(value = "docenteMateriaControladores")
@SessionScoped
public class DocenteMateriaControladores implements Serializable {

    /**
     * Creates a new instance of DocenteMateriaControladores
     */
    public DocenteMateriaControladores() {
    }
    DocenteMateria docenteMateria;
    @PostConstruct
    public void init(){
        docenteMateria = new DocenteMateria();
        
    }
    @EJB
    DocenteMateriaFacade docenteMateriaFacade;

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }
    public List<DocenteMateria> consultarDocenteMateria(){
    return docenteMateriaFacade.findAll();
}
}
