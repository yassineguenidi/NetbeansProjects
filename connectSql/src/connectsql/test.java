/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsql;
/**
 *
 * @author yassi
 */
public class test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GererProduit gp = new GererProduit();
        System.out.println("Ajout");
        //gp.AjouterProduit(4, "tele", "occasion", 1450);
        gp.AjouterProduit(55, "AntiCasse", "plast", 20);
        gp.AfficherPoduits();
        System.out.println("Suppression");
        //gp.supprimerProduit(44);
        //gp.AfficherPoduits();
        System.out.println("recherche");
        gp.rechercherProduit(12);
        System.out.println("update");
        gp.modifierProduit(12, "smart phone", "nouvelle generation" , 785);
        gp.AfficherPoduits();
        
    }
    
}
