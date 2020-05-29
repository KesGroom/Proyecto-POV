/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Roles;
import Entidades.Tipos;
import Entidades.Usuarios;
import Facade.UsuariosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author jusag
 */
@Named(value = "usuarioControlador")
@SessionScoped
public class usuarioControlador implements Serializable {

    /**
     * Creates a new instance of usuarioControlador
     */
    public usuarioControlador() {
        rol = new Roles();
        tipo = new Tipos();
        usuario = new Usuarios();
        usuarioFacade = new UsuariosFacade();
    }

    private Usuarios usuario;
    private Roles rol;
    private Tipos tipo;

    @EJB
    UsuariosFacade usuarioFacade;

    public void registrarUsu() {
        usuario.setIdRoles(rol);
        usuario.setIdTipo(tipo);
        usuarioFacade.create(usuario);
    }

    public void preActualizar(Usuarios usuarioActualizar) {
        rol = usuarioActualizar.getIdRoles();
        tipo = usuarioActualizar.getIdTipo();
        usuario = usuarioActualizar;
    }

    public void Actualizar() {
        usuario.setIdRoles(rol);
        usuario.setIdTipo(tipo);
        usuarioFacade.edit(usuario);
    }

    public void Eliminar() {
        usuarioFacade.remove(usuario);
    }

    public List<Usuarios> consultarUsuarios() {
        return usuarioFacade.findAll();
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    
}
