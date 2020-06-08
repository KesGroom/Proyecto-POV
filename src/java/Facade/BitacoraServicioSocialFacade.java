/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.BitacoraServicioSocial;
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
public class BitacoraServicioSocialFacade extends AbstractFacade<BitacoraServicioSocial> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BitacoraServicioSocialFacade() {
        super(BitacoraServicioSocial.class);
    }
     public List<BitacoraServicioSocial> consultarBitacoraServicioSocial(int estado){
        Query q = em.createQuery("SELECT b FROM BitacoraServicioSocial b WHERE b.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
