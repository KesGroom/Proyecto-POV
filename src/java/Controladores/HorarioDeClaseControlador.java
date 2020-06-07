/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.CursoDocente;
import Entidades.DocenteMateria;
import Entidades.HorarioDeClase;
import Facade.HorarioDeClaseFacade;
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
@Named(value = "horarioDeClaseControlador")
@SessionScoped
public class HorarioDeClaseControlador implements Serializable {

    /**
     * Creates a new instance of HorarioDeClaseControlador
     */
    public HorarioDeClaseControlador() {
    }
    HorarioDeClase horarioDeClase;
    CursoDocente cursoDocente;
    DocenteMateria docenteMateria;
    @EJB
    HorarioDeClaseFacade horarioDeClaseFacade;

    public HorarioDeClase getHorarioDeClase() {
        return horarioDeClase;
    }

    public void setHorarioDeClase(HorarioDeClase horarioDeClase) {
        this.horarioDeClase = horarioDeClase;
    }

    public CursoDocente getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(CursoDocente cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }
    @PostConstruct
    public void init(){
        horarioDeClase = new HorarioDeClase();
        cursoDocente = new CursoDocente();
        docenteMateria = new DocenteMateria();
    }
    public List<HorarioDeClase> consultarHorariodeclase(){
        return horarioDeClaseFacade.findAll();
    }
    public void registrarHorariodeclase(){
        horarioDeClase.setDocenteMateria(docenteMateria);
        horarioDeClase.setDocenteCurso(cursoDocente);
        horarioDeClaseFacade.create(horarioDeClase);
    }
}
