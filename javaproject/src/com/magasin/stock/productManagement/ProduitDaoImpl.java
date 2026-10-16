/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.productManagement;

import com.magasin.stock.categorisManagement.Categorie;
import java.util.Collection;

/**
 *
 * @author yassi
 */
public class ProduitDaoImpl implements ProduitDao{
 ProduitData produit_data_access =new ProduitData();
    @Override
    public void add(Produit produit) {
     produit_data_access.data.put(produit.getId(), produit);
    }

    @Override
    public void update(Produit produit) {
       produit_data_access.data.put(produit.getId(), produit);
    }

    @Override
    public Produit getOne(int id) {
        
        return produit_data_access.data.get(id);
    }

    @Override
    public Collection<Produit> getAll() {
      return produit_data_access.data.values();
    }

    @Override
    public void delete(int id) {
      produit_data_access.data.remove(id);
    }
    
}
