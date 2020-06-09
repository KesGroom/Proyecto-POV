/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Docente;
import Entidades.DocenteMateria;
import Entidades.Materia;
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
    Materia materia;
    Docente docente;
    @EJB
    DocenteMateriaFacade docenteMateriaFacade;

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }
    @PostConstruct
    public void init(){
        docenteMateria = new DocenteMateria();
        docente = new Docente();
        materia = new Materia();
        
    }
    public List<DocenteMateria> consultarDocenteMateria(){
    return docenteMateriaFacade.findAll();
}
    public void registrarDocenteMateria(){
        docenteMateria.setIdDocente(docente);
        docenteMateria.setIdMateria(materia);
        docenteMateriaFacade.create(docenteMateria);
    }
}
