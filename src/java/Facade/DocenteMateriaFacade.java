/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.DocenteMateria;
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
public class DocenteMateriaFacade extends AbstractFacade<DocenteMateria> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocenteMateriaFacade() {
        super(DocenteMateria.class);
    }
     public List<DocenteMateria> consultarDocenteMateria(int estado){
        Query q = em.createQuery("SELECT d FROM DocenteMateria d WHERE d.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
