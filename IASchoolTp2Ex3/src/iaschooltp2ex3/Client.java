/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2ex3;

/**
 *
 * @author yassi
 */
public class Client {
    String id ;
    String nom;
    String prenom;
    compteBancaire compte ;

    public Client(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client(String id, String nom, String prenom, compteBancaire compte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    public Client() {
    }

    public Client(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public compteBancaire getCompte() {
        return compte;
    }

    public void setCompte(compteBancaire compte) {
        this.compte = compte;
    }
    
    
    public void deposer(double montant){
        this.compte.solde += montant;
        
    }
    
    public void retirer(double montant){
        this.compte.solde -= montant;
    }
    



    public void afficherClient(){
        System.out.println("Client{" + "id= " + id + ", nom= " + nom + ", prenom= " + prenom + ", compte= " + compte.toString() + '}');
    }
    
    
}
