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
public class Ville {
    Map<String, Integer> delegations = new HashMap<>();
    
    
    public void ajouterDelegation(String nomDel, int nbHa ){
        delegations.putIfAbsent(nomDel, nbHa);
    }
    public void supprimerDelegation(String nomDel){
        delegations.remove(nomDel);
    }
    public int calculerNbHabitant(){
        int somme=0 ;
        Iterator iterator = delegations.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          somme+= (int) mapentry.getValue();
          
        } 
        System.out.println("la somme totale est "+somme);
        return somme ;
    }
    
    public void rechercherDelegation(String delegation){
        
        if (delegations.containsKey(delegation))
            System.out.println("Cette delegation existe !");
        else {
            System.out.println("Cette delegation n'existe pas !");
        }
        
    }
    
    public void afficherVille(){
        Iterator iterator = delegations.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          System.out.println( "delegation : "+mapentry.getKey()
                            + " | nbHabitants: " + mapentry.getValue());
        } 
    }
    
    public void rechercherMax(){
        int max=0;
        String name="";
        Iterator iterator = delegations.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          if((int) mapentry.getValue()>max){
              max=(int) mapentry.getValue();
              name= (String) mapentry.getKey();
          }
        } 
        System.out.println("la delegation qui a max habtitant est " + name + " du nombre"+max);
    }
}
