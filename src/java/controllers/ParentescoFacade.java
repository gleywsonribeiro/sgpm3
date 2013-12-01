/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Parentesco;

/**
 *
 * @author Gleywson
 */
@Stateless
public class ParentescoFacade extends AbstractFacade<Parentesco> {
    @PersistenceContext(unitName = "sgpmPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParentescoFacade() {
        super(Parentesco.class);
    }
    
}
