/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.ZonasServicioSocial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JSAntiago
 */
@Stateless
public class ZonasServicioSocialFacade extends AbstractFacade<ZonasServicioSocial> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZonasServicioSocialFacade() {
        super(ZonasServicioSocial.class);
    }
    
}
