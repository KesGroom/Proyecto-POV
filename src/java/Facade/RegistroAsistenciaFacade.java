/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.RegistroAsistencia;
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
public class RegistroAsistenciaFacade extends AbstractFacade<RegistroAsistencia> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroAsistenciaFacade() {
        super(RegistroAsistencia.class);
    }
     public List<RegistroAsistencia> consultarRegistroAsistencia(int estado){
        Query q = em.createQuery("SELECT r FROM RegistroAsistencia r WHERE r.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
