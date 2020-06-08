/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Atencioncurso;
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
public class AtencioncursoFacade extends AbstractFacade<Atencioncurso> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AtencioncursoFacade() {
        super(Atencioncurso.class);
    }
     public List<Atencioncurso> consultarAtencionCurso(int estado){
        Query q = em.createQuery("SELECT a FROM Atencioncurso a WHERE a.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
