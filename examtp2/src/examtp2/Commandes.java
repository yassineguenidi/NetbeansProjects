/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtp2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yassi
 */
public class Commandes {
    
    
    private HashMap<String,ArrayList<Produit>> cmds ;
    private int n ;
    
    public int getN(){
        return n;
    }
    public Commandes(){
        cmds= new HashMap<>();
        n=0;
    }
    public void ajouterCommand(){
        n++;
        cmds.put("commande n "+n,new ArrayList<>());
    }
    
    public void ajouterProduit(String x, Produit p){
        cmds.get(x).add(p);
    }
    public void afficher(){
        for(String key: cmds.keySet()){
            System.out.println(key);
            for(Produit p : cmds.get(key)){
                System.out.println(p);
            }
        }
    }
    
}
