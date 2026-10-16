/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex1tp2;

/**
 *
 * @author yassi
 */
public class Produit {
    private int id ;
    private String libelle ;
    private int prix ;

    public Produit() {
    }

    public Produit(int id, String libelle, int prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit {" + " id= " + id + " , libelle= " + libelle + " , prix= " + prix + '}';
    }
    
    
}
