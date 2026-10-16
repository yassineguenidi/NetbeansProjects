/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.fournisseur;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public class FournisseurDaoImpl implements FournisseurDao{
     FournisseurData data_access = new FournisseurData(); 
    @Override
    public void add(Fournisseur fournisseur) {
     data_access.data.put(fournisseur.getId(), fournisseur);
    }

    @Override
    public void update(Fournisseur fournisseur) {
     data_access.data.put(fournisseur.getId(), fournisseur);
    }

    @Override
    public Fournisseur getOne(int id) {
      return data_access.data.get(id) ;
    }

    @Override
    public Collection<Fournisseur> getAll() {
        return data_access.data.values();
    }

    @Override
    public void delete(int id) {
          data_access.data.remove(id);
    }

    public FournisseurDaoImpl() {
         data_access.initData();
    }
    
}
