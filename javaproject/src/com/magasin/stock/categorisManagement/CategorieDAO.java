/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.categorisManagement;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public interface CategorieDAO {
   
    public void add(Categorie categorie);
    public void update(Categorie categorie);
    public Categorie getOne(int id);
    public Collection<Categorie> getAll();
    public void delete(int id);
  
}
