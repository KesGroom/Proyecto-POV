/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.BitacoraServicioSocial;
import Entidades.Coordinador;
import Entidades.Estudiante;
import Entidades.ZonaServicioSocial;
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
        zona = new ZonaServicioSocial();
        bitacora = new BitacoraServicioSocial();
        bitacoraFacade = new BitacoraServicioSocialFacade();
    }
    
    private BitacoraServicioSocial bitacora;
    private Coordinador coordinador;
    private Estudiante estudiante;
    private ZonaServicioSocial zona;
    
    @EJB
    BitacoraServicioSocialFacade bitacoraFacade;
    
    
    
    public String registrar(){
        bitacora.setCoordinador(coordinador);
        bitacora.setEstudiante(estudiante);
        bitacora.setZonadeServicio(zona);
        bitacoraFacade.create(bitacora);
        bitacora = new BitacoraServicioSocial();// nose olvide d esscjnxs jv xjvn cxnsjv dsnvj ds
        return "bitacora";
    }
    
    public String preActualizar(BitacoraServicioSocial bitacoraActualizar){
        coordinador = bitacoraActualizar.getCoordinador();
        estudiante = bitacoraActualizar.getEstudiante();
        zona = bitacoraActualizar.getZonadeServicio();
        bitacora = bitacoraActualizar;
        return "bitacora";
    }
    
    public String actualizar(){
        bitacora.setCoordinador(coordinador);
        bitacora.setEstudiante(estudiante);
        bitacora.setZonadeServicio(zona);
        bitacoraFacade.edit(bitacora);
        return "bitacora";
    }
    
     public String Remover(BitacoraServicioSocial bitacoraRemover) {
        bitacora = bitacoraRemover;
        bitacora.setEstado(2);
        bitacoraFacade.edit(bitacora);
        return "/si/Coordinador/bitacora.xhtml";
    }
    
    public List<BitacoraServicioSocial> consultarBitacora(){
        return bitacoraFacade.consultarBitacoraServicioSocial(1);
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

    public ZonaServicioSocial getZona() {
        return zona;
    }

    public void setZona(ZonaServicioSocial zona) {
        this.zona = zona;
    }
    
}
