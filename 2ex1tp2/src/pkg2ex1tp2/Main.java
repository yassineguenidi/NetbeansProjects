/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex1tp2;

import java.util.List;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Traitement tr = new Traitement();
        System.out.println("Ajout");
        //gp.AjouterProduit(4, "tele", "occasion", 1450);
        //Produit p1 = new Produit(1, "telephone", 550);
        Produit p2 = new Produit(2, "pc", 2550);
        Produit p3 = new Produit(3, "casque", 50);
        
        //tr.AjouterProduit(p1);
        tr.AjouterProduit(p2);
        tr.AjouterProduit(p3);
        System.out.println(tr.rechercherProduit(1).toString());
        List l =tr.produitParMC("pc");
        
        
        
        //System.out.println("Suppression");
        //gp.supprimerProduit(44);
        //gp.AfficherPoduits();
        //System.out.println("recherche");
        //gp.rechercherProduit(12);
        //System.out.println("update");
        //gp.modifierProduit(12, "smart phone", "nouvelle generation" , 785);
        //gp.AfficherPoduits();
    }
    
}
