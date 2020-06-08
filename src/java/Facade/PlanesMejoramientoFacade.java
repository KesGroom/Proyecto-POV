/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

<<<<<<< HEAD:src/java/Facade/PlanesMejoramientoFacade.java
import Entidades.PlanesMejoramiento;
=======
import Entidades.PlanMejoramiento;
import java.util.List;
>>>>>>> 29c006b257c9ac6ede6135119a6c1ff6fedcc0bf:src/java/Facade/PlanMejoramientoFacade.java
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jusag
 */
@Stateless
public class PlanesMejoramientoFacade extends AbstractFacade<PlanesMejoramiento> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanesMejoramientoFacade() {
        super(PlanesMejoramiento.class);
    }
     public List<PlanMejoramiento> consultarPlanMejoramiento(int estado){
        Query q = em.createQuery("SELECT p FROM PlanMejoramiento p WHERE p.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
