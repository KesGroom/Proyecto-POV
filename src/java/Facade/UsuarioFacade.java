/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kesgr
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public List<Usuario> busquedaRol(int rol) {

        Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.idRoles=:rol");
        q.setParameter("rol", rol);

        return q.getResultList();
    }

    public Usuario UserLog(String documento, String contrasenna) {
        Usuario usuario = new Usuario();
        try {
            Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.numerodeDocumento=:Doc AND u.contrasenna=:Pass");
            q.setParameter("Doc", documento);
            q.setParameter("Pass", contrasenna);
            usuario = (Usuario) q.getSingleResult();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return usuario;
    }
}
