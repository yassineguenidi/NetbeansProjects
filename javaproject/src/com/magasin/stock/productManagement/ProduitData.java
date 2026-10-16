/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.productManagement;

import com.magasin.stock.categorisManagement.Categorie;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class ProduitData {
  public  Map<Integer,Produit> data = new HashMap<Integer,Produit>();
  
   public void initData(){
      data.put(1,new Produit(1,"Redmi note 8",699,50,new Categorie(1,"smartphone")));
      data.put(2,new Produit(2,"Galaxy s9",999,5,new Categorie(1,"smartphone")));
      data.put(3,new Produit(3,"Iphone X",1699,45,new Categorie(1,"smartphone")));
      data.put(4,new Produit(4,"Oppo",799,10,new Categorie(1,"smartphone")));
      data.put(5,new Produit(5,"32 pouce", 520,10,new Categorie(3,"television")));
      data.put(6,new Produit(6,"40 pouce", 720,5,new Categorie(3,"television")));
      data.put(7,new Produit(7,"ASUS", 1759,15,new Categorie(2,"ordinateur")));
      data.put(8,new Produit(8,"LENOVO", 2359,15,new Categorie(2,"ordinateur")));
    }
    public ProduitData(){
        initData(); 
    }
}
