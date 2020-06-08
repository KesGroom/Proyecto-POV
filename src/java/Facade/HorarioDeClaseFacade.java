/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.HorarioDeClase;
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
public class HorarioDeClaseFacade extends AbstractFacade<HorarioDeClase> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HorarioDeClaseFacade() {
        super(HorarioDeClase.class);
    }
     public List<HorarioDeClase> consultarHorarioClase(int estado){
        Query q = em.createQuery("SELECT h FROM HorarioDeClase h WHERE h.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
