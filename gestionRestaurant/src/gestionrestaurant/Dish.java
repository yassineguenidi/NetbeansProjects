/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrestaurant;

/**
 *
 * @author yassi
 */
public class Dish implements Item {
    private String name ;
    public int prix ;

    public Dish(String name, int prix) {
        this.name = name;
        this.prix = prix;
    }
    @Override
    public String toString (){
        return this.name + " " + this.prix ;
    }

    @Override
    public double getPrix() {
       return prix ;
    }
}
