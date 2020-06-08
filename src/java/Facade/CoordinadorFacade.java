/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Coordinador;
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
public class CoordinadorFacade extends AbstractFacade<Coordinador> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoordinadorFacade() {
        super(Coordinador.class);
    }
     public List<Coordinador> consultarCoordinador(int estado){
        Query q = em.createQuery("SELECT c FROM Coordinador c WHERE c.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
