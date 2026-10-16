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
public interface ProduitDao {
    
    public void add(Produit produit);
    public void update(Produit produit);
    public Produit getOne(int id);
    public Collection<Produit> getAll();
    public void delete(int id);
}
