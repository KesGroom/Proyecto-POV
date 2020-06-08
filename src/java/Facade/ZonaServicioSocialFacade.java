/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.ZonaServicioSocial;
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
public class ZonaServicioSocialFacade extends AbstractFacade<ZonaServicioSocial> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZonaServicioSocialFacade() {
        super(ZonaServicioSocial.class);
    }
     public List<ZonaServicioSocial> consultarZonaServicioSocial(int estado){
        Query q = em.createQuery("SELECT z FROM ZonaServicioSocial z WHERE z.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
