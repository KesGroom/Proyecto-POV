/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Entidades.Rol;
import Entidades.RolHasPermiso;
import Entidades.Usuario;
import Facade.RolFacade;

import Facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author kesgr
 */
@Named(value = "sesionControlador")
@SessionScoped
public class SesionControlador implements Serializable {

    /**
     * Creates a new instance of SesionControlador
     */
    public SesionControlador() {
        FacesContext fc = FacesContext.getCurrentInstance();
        rolFacade = new RolFacade();
        usuarioFacade = new UsuarioFacade();
    }

    @EJB
    UsuarioFacade usuarioFacade;

    @EJB
    RolFacade rolFacade;
    

    private String documento;
    private String clave;
    private Rol rolSeleccionado;
    private Usuario usuario;
    

    public String iniciarSesion() {
        FacesContext fc = FacesContext.getCurrentInstance();
        usuario = usuarioFacade.UserLog(documento, clave);
        if (usuario != null) {
            rolSeleccionado = usuario.getIdRoles();

            return "Resources/Pages/Dashboard?faces-redirect=true";
        } else {
            return "index";
        }
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        this.usuario = null;
        this.documento = null;
        this.clave = "";
        return "../../index.xhtml?faces-redirect=true";
    }

    public Boolean inicioSesion() {
        return (usuario != null);
    }

    public Boolean validarPermiso() {
        FacesContext fc = FacesContext.getCurrentInstance();
        String urlRecurso = fc.getExternalContext().getRequestPathInfo();
        for (RolHasPermiso p : rolSeleccionado.getRolHasPermisoList()) {
            if (p.getPermiso().getUrl() != null && (p.getPermiso().getUrl().equals(urlRecurso)
                    || p.getPermiso().getUrl().equals("index.xhtml"))) {
                return true;
            }
        }
        return false;
    }

    public String obtenerMenu() {
        String strHTML = "";
        for (RolHasPermiso p : rolSeleccionado.getRolHasPermisoList()) {
            strHTML += "<li>";
            strHTML += "<a><ion-icon name='" + p.getPermiso().getIcon() + "'></ion-icon>" + p.getPermiso().getNombre() + "</a>";
            strHTML += "</li>";

        }
        return strHTML;
    }

    public Rol getRolSeleccionado() {
        return rolSeleccionado;
    }

    public void setRolSeleccionado(Rol rolSeleccionado) {
        System.out.println("Rol - " + rolSeleccionado.getRol());
        this.rolSeleccionado = rolSeleccionado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
