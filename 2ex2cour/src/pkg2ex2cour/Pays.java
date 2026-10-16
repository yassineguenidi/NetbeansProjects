/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex2cour;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class Pays {
    String nomP ;
    public Map<String,Object> villes=new HashMap();
    
    public void ajouterVille(String nomVille ,Ville ville ){
        villes.put(nomVille, ville);
    }
    public void supprimerVille(String nomDel){
        villes.remove(nomDel);
    }
    
    public int calculerNbHabitantTot(){
        int somme=0 ;
        Iterator iterator = villes.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          somme+= (int) mapentry.getValue();
        } 
        System.out.println("la somme totale des habitants du pays : "+somme);
        return somme ;
    }
    public void afficherVilles(){
        Iterator iterator = villes.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          System.out.println("ville: "+mapentry.getKey() );
          
        } 
    }
    public void rechercherVille(String ville){
        
        if (villes.containsKey(ville))
            System.out.println(ville + " existe !");
        else {
            System.out.println(ville + " n'existe pas dans ce pays!");
        }
        
    }
    
}
