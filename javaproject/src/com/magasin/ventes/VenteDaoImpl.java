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
public class VenteDaoImpl implements VenteDao{
    VenteData data_access = new VenteData();
    @Override
    public void add(Vente vente) {
        data_access.data.put(vente.getId(), vente);
    }

    @Override
    public void update(Vente vente) {
       data_access.data.put(vente.getId(), vente);
    }

    @Override
    public Vente getOne(int id) {
        return data_access.data.get(id);
    }

    @Override
    public Collection<Vente> getAll() {
       return data_access.data.values();
    }

    @Override
    public void delete(int id) {
       data_access.data.remove(id);
    }
}
