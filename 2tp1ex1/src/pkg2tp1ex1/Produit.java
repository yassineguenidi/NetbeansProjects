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
public class Produit {
    private String libelle ; 
    private String designation ;
    private int numProd ;
    private float prixProd ;

    public Produit(String libelle, String designation, int numProd, float prixProd) {
        this.libelle = libelle;
        this.designation = designation;
        this.numProd = numProd;
        this.prixProd = prixProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getNumProd() {
        return numProd;
    }

    public void setNumProd(int numProd) {
        this.numProd = numProd;
    }
    
    public float getPrixProd() {
        return prixProd;
    }

    public void setPrixProd(float prixProd) {
        this.prixProd = prixProd;
    }

    @Override
    public String toString() {
        return "Produit { " + "libelle= " + libelle + ", designation= " + designation + ", numProd= " + numProd + ", prixProd= " + prixProd + '}'+'\n';
        
    }
    
    
}
