/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facture;

/**
 *
 * @author yassi
 */
public class Facture {
    private int id ;
    private String nom ;
    private String prenom ;
    private double montantPayer ;
    private double montantVerser ;
    private double montantReste ;

    public Facture(int id, String nom, String prenom, double montantPayer, double montantVerser, double montantReste) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.montantPayer = montantPayer;
        this.montantVerser = montantVerser;
        this.montantReste = montantReste;
    }

    public Facture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(double montantPayer) {
        this.montantPayer = montantPayer;
    }

    public double getMontantVerser() {
        return montantVerser;
    }

    public void setMontantVerser(double montantVerser) {
        this.montantVerser = montantVerser;
    }

    public double getMontantReste() {
        return montantReste;
    }

    public void setMontantReste(double montantReste) {
        this.montantReste = montantReste;
    }
    
    
}
