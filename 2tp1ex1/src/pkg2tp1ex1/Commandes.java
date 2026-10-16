/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp1ex1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author yassi
 */
public class Commandes {
    Map<String, Commande> Cmde = new TreeMap<String, Commande>();

    public Commandes() {
    }
    
    
    public void ajouterCommande(String code, Commande c){
        Cmde.put(code, c);
    }
    public void retirerCommande(String code){
        Cmde.remove(code);
    }
    
    public void AjouterProduit(String code , Produit p){
        
        Cmde.get(code).list.add(p);
    }
    public void retirerProduit(String code, Produit p){
        Cmde.get(code).list.remove(p);
    }
    
    public float calculerRecette(){
        float recette =0;
        Set<String> ks =Cmde.keySet();
        int i=0;
        for(String x : ks){
            recette += Cmde.get(x).getPrixTotal();
            i++;
        }
        return recette;
    }
    
    public void afficher(){
        Set<String> ks =Cmde.keySet();
        for(String x: ks){
            System.out.println(Cmde.get(x).toString()+"\n"); 
        }
    }
}
