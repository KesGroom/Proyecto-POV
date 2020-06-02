/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Curso;
import Entidades.Grado;
import Facade.CursoFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author kesgr
 */
@Named(value = "cursoController")
@SessionScoped
public class CursoController implements Serializable {

    /**
     * Creates a new instance of CursoController
     */
    public CursoController() {
    curso = new Curso();
    grado = new Grado();
    cursoFacade = new CursoFacade();
    }
    
    Curso curso;
    Grado grado;
    
    @EJB
    CursoFacade cursoFacade; 
    
    public void registrar(){
        curso.setGrado(grado);
        cursoFacade.create(curso);
    }
    
    public void preActualizar(Curso cursoActualizar){
        grado = cursoActualizar.getGrado();
        curso = cursoActualizar;
    }
    
    public void actualizar(){
        curso.setGrado(grado);
        cursoFacade.edit(curso);
    }
    
    public void eliminar(Curso cursoEliminar){
        cursoFacade.remove(cursoEliminar);
    }
    
    public List<Curso> consultarTodos(){
        return cursoFacade.findAll();
    }
    
    
}
