/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.ventes;

import com.magasin.stock.categorisManagement.Categorie;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class VenteData {
     public  Map<Integer,Vente> data = new HashMap<Integer,Vente>();
  
   public void initData(){
       
     data.put(1,new Vente(1, 450, "redmi",370,10,new Categorie(1,"smartphone")));
     data.put(2,new Vente(2, 799, "Iphone",710,10,new Categorie(1,"smartphone")));
     data.put(3,new Vente(3, 599, "nokia",550,10,new Categorie(1,"smartphone")));
     data.put(4,new Vente(4, 520, "32 pouce",600,10,new Categorie(3,"television")));
     data.put(6,new Vente(5, 920, "40 pouce",850,10,new Categorie(3,"television")));
     data.put(7,new Vente(6, 1889, "LENOVO",1669,10,new Categorie(2,"ordinateur")));
     data.put(8,new Vente(7, 2959, "ASUS",2759,10,new Categorie(2,"ordinateur")));
    }
    public VenteData(){
        initData(); 
    }
}
