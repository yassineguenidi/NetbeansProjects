/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.fournisseur;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class FournisseurData {
     public Map<Integer,Fournisseur> data = new HashMap<Integer,Fournisseur>() ;

    public void initData(){
   
    data.put(1,new Fournisseur(1,"sami", "sami", "22345897","Gabes"));
    data.put(2,new Fournisseur(2,"firas", "firas", "25478452","Sousse"));
    data.put(3,new Fournisseur(3,"ahmed", "ahmed", "54525687","ariana"));
    data.put(4,new Fournisseur(4,"mariem", "mariem", "53254154","tunis"));
    data.put(5,new Fournisseur(5,"sihem", "sihem", "98457954","mahdia"));
    data.put(6,new Fournisseur(6,"amor", "amor", "55684789","bizerte"));
    data.put(7,new Fournisseur(7,"fedi", "fedi", "21547995","Tataouine"));
    data.put(8,new Fournisseur(8,"iheb", "iheb", "22357854","Ksar hellal"));
    data.put(9,new Fournisseur(9,"amin", "amin", "22548795","Djreba"));
    }
    public FournisseurData(){
        initData();             
    }
}
