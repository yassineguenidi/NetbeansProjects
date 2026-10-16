/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.ventes;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public interface VenteDao {
   
    public void add(Vente vente);
    public void update(Vente vente);
    public Vente getOne(int id);
    public Collection<Vente> getAll();
    public void delete(int id);
}
