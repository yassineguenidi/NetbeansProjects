/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp2swing2;

/**
 *
 * @author yassi
 */


public class Produit{
    int id;
    String libelle;
    int prix;

    public Produit(int id, String libelle, int prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit() {
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
    
}