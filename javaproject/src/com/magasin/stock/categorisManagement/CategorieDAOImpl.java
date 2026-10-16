/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.categorisManagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author yassi
 */
public class CategorieDAOImpl implements CategorieDAO{
    DataCategories data_access = new DataCategories();   
    @Override
       public void add(Categorie categorie){
            data_access.data.put(categorie.getId(), categorie);
       }
       
       @Override
    public void update(Categorie categorie){
       data_access.data.put(categorie.getId(), categorie); 
         
    }
    
       @Override
    public Categorie getOne(int id){
       
        return data_access.data.get(id) ;
    }
       @Override
    public Collection<Categorie> getAll(){
       return data_access.data.values();
                
    }
       @Override
    public void delete(int id){
        data_access.data.remove(id);
    }

    public CategorieDAOImpl() {
        data_access.initData();
    }

}