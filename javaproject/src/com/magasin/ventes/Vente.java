/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.ventes;

import com.magasin.stock.categorisManagement.Categorie;
import com.magasin.stock.productManagement.Produit;

/**
 *
 * @author yassi
 */
public class Vente extends Produit{
    private int idv ;
    private double prixVente ;
    private double gain ;

    public Vente(int idv, double prixVente, double gain, int id, String designation, double prix, int quantite, Categorie categorie) {
        super(id, designation, prix, quantite, categorie);
        this.idv = idv;
        this.prixVente = prixVente;
        this.gain =this.prixVente-super.getPrix();
    }

    public Vente(int idv, double prixVente, double gain) {
        this.idv = idv;
        this.prixVente = prixVente;
        this.gain = gain;
    }

    public Vente(int id, double prixVente, String designation, double prix, int quantite, Categorie categorie) {
        super(id, designation, prix, quantite, categorie);
        this.idv = id;
        this.prixVente = prixVente;
        this.gain =this.prixVente-super.getPrix();
    }

   

    public Vente(int id, double prixVente) {
        this.idv = id;
        this.prixVente = prixVente;
        this.gain =this.prixVente-super.getPrix();
    }

    public Vente() {
    }
   
    
   
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public int getIdv() {
        return idv;
    }
    public void setIdv(int idv) {
        this.idv = idv;
    }
}
