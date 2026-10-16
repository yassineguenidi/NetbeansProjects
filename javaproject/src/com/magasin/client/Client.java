/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.client;

/**
 *
 * @author yassi
 */
public class Client {
    private int id ;
    private String nom ;
    private String prenom ;
    private String N_Tel ;
  

    public Client(int id, String nom, String prenom, String N_Tel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.N_Tel = N_Tel;
    }

    public Client() {
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

    public String getN_Tel() {
        return N_Tel;
    }

    public void setN_Tel(String N_Tel) {
        this.N_Tel = N_Tel;
    }

    
    
    
}
