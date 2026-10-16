/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp0ex2;

/**
 *
 * @author yassi
 */
public class Personne implements Homme{
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    

    @Override
    public void identite() {
        System.out.println("Le nom: "+ nom+" le prenom : "+ prenom);
           }
    
}
