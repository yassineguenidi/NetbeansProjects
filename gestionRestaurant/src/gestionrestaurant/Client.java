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
public class Client {
 private String name ;

    public Client(String name) {
        this.name = name;
    }
    
   
 @Override
    public String toString(){
        return this.name ;   
    }
}
