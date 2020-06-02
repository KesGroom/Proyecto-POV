/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.BitacoraServicioSocial;
import Entidades.Coordinador;
import Entidades.Estudiante;
import Facade.BitacoraServicioSocialFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "bitacoraControlador")
@SessionScoped
public class bitacoraControlador implements Serializable {

    /**
     * Creates a new instance of bitacoraControlador
     */
    public bitacoraControlador() {
        coordinador = new Coordinador();
        estudiante = new Estudiante();
        bitacora = new BitacoraServicioSocial();
        bitacoraFacade = new BitacoraServicioSocialFacade();
    }
    
    BitacoraServicioSocial bitacora;
    Coordinador coordinador;
    Estudiante estudiante;
    
    @EJB
    BitacoraServicioSocialFacade bitacoraFacade;
    
    
    
    public String registrar(){
        bitacora.setCoordinador(coordinador);
        bitacora.setEstudiante(estudiante);
        bitacoraFacade.create(bitacora);
        bitacora = new BitacoraServicioSocial();// nose olvide d esscjnxs jv xjvn cxnsjv dsnvj ds
        return "bitacora";
    }
    
    public String preActualizar(BitacoraServicioSocial bitacoraActualizar){
        coordinador = bitacoraActualizar.getCoordinador();
        estudiante = bitacoraActualizar.getEstudiante();
        bitacora = bitacoraActualizar;
        return "bitacora";
    }
    
    public String actualizar(){
        bitacora.setCoordinador(coordinador);
        bitacora.setEstudiante(estudiante);
        bitacoraFacade.edit(bitacora);
        return "bitacora";
    }
    
    public String eliminar(){
        bitacoraFacade.remove(bitacora);
        return "bitacora";
    }
    
    public List<BitacoraServicioSocial> consultarBitacora(){
        return bitacoraFacade.findAll();
    }

    public BitacoraServicioSocial getBitacora() {
        return bitacora;
    }

    public void setBitacora(BitacoraServicioSocial bitacora) {
        this.bitacora = bitacora;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
}
