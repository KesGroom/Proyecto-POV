/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Acudiente;
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
public class AcudienteFacade extends AbstractFacade<Acudiente> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcudienteFacade() {
        super(Acudiente.class);
    }
     public List<Acudiente> consultarAcudiente(int estado){
        Query q = em.createQuery("SELECT a FROM Acudiente a WHERE a.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
