/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.categorisManagement;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author yassi
 */
public class DataCategories {
    public Map<Integer,Categorie> data = new HashMap<Integer,Categorie>() ;

    public void initData(){
    
        data.put(2,new Categorie(1,"smartphone"));
        data.put(1,new Categorie(2,"ordinateur"));
        data.put(3,new Categorie(2,"ordinateur"));
        data.put(4,new Categorie(3,"television"));
        data.put(5,new Categorie(4,"recepteur"));
        data.put(6,new Categorie(5,"ventulataire"));
        data.put(7,new Categorie(6,"chargeur"));
        data.put(8,new Categorie(7,"clavier"));
        data.put(9,new Categorie(8,"souris"));
    }
    public DataCategories(){
        initData();             
    }
}
