/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp1ex1;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produit p1 = new Produit("electro", "refregirateur", 123, 1000);
        Produit p2 = new Produit("telephone", "samsung", 444, 2000);
        Produit p3 = new Produit("ordinateur", "asus", 122, 5000);
        Produit p4 = new Produit("voiture", "kia rio", 458, 50000);
        Produit p5 = new Produit("ordinateur", "hp", 4442, 4000);
        Produit p6 = new Produit("telehone", "redmi note 8", 1111, 1000);
        
        //System.out.println(p1.toString());
        
        Commande c1 = new Commande();
        c1.ajouterProduit(p1);
        c1.ajouterProduit(p2);
        c1.ajouterProduit(p3);
        
        System.out.println("le nombre de produit dans c1 est : "+ c1.nombreProduit());
        //System.out.println(c1.toString());
        
        Commande c2 = new Commande();
        c2.ajouterProduit(p4);
        c2.ajouterProduit(p5);
        c2.ajouterProduit(p6);
        
        //System.out.println(c2.estPresent(p6));
        //System.out.println(c2.estPresent(p1));
        //c1.retirerProduit(123);
        //System.out.println("le nombre de produit dans c1 est : "+ c1.nombreProduit());
        //System.out.println(c1.toString());
        
        Commandes comm = new Commandes();
        
        comm.ajouterCommande("ahmed", c1);
        //comm.AjouterProduit("ahmed", p6);
        //System.out.println("pkg2tp1ex1.Main.main()");
        comm.ajouterCommande("med", c2);
        
        System.out.println("le nombre de produit dans c2 est : "+ c2.nombreProduit());
        //System.out.println(c2.toString());
        System.out.println("la recette est : "+ comm.calculerRecette());
        
        //comm.afficher();
        

    }
    
}
