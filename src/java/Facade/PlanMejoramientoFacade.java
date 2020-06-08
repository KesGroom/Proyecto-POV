/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.PlanMejoramiento;
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
public class PlanMejoramientoFacade extends AbstractFacade<PlanMejoramiento> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanMejoramientoFacade() {
        super(PlanMejoramiento.class);
    }
     public List<PlanMejoramiento> consultarPlanMejoramiento(int estado){
        Query q = em.createQuery("SELECT p FROM PlanMejoramiento p WHERE p.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
