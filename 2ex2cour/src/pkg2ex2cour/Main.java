/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex2cour;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pays tunisie = new Pays();
        
        Ville tataouin = new Ville();
        Ville medenine = new Ville();    
        Ville sfax = new Ville();       
        Ville tunis = new Ville();    
        Ville monastir = new Ville();
                
                
                
        tunisie.ajouterVille("tataouin", tataouin);
        tunisie.ajouterVille("medenine", medenine);
        tunisie.ajouterVille("sfax", sfax);
        tunisie.ajouterVille("tunis", tunis);
        tunisie.ajouterVille("monastir", monastir);
        
        
        tunisie.rechercherVille("medenine");
        tunisie.rechercherVille("tataouin");
        tunisie.rechercherVille("gafsa");
        
        tataouin.ajouterDelegation("remada", 17220);
        tataouin.ajouterDelegation("dhehiba", 20020);
        tataouin.ajouterDelegation("bir lahmer", 15000);
        tataouin.ajouterDelegation("ghomrassen", 47000);
        tataouin.ajouterDelegation("smar", 35000);
        
        medenine.ajouterDelegation("djerba", 171220);
        medenine.ajouterDelegation("zarzis", 200020);
        medenine.ajouterDelegation("benguerdane", 154000);
        medenine.ajouterDelegation("medninine sud", 140000);
  
        
        tataouin.rechercherDelegation("remada");
        
        tataouin.afficherVille();
        tataouin.calculerNbHabitant();
        tataouin.supprimerDelegation("smar");
        medenine.afficherVille();
        medenine.calculerNbHabitant();
        medenine.rechercherMax();
        
        
        
    }
    
}
