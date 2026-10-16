/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.categorisManagement;

/**
 *
 * @author yassi
 */
public class Categorie {
    private int id ;
    private String designation ;

    public Categorie(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Categorie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}
