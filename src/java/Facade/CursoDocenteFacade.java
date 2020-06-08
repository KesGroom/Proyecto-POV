/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.CursoDocente;
import Entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jusag
 */
@Stateless
public class CursoDocenteFacade extends AbstractFacade<CursoDocente> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoDocenteFacade() {
        super(CursoDocente.class);
    }
     public List<CursoDocente> consultarCursoDocente(int estado){
        Query q = em.createQuery("SELECT c FROM CursoDocente c WHERE c.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
