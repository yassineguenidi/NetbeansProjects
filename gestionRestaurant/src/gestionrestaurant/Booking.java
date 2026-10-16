/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrestaurant;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class Booking {

private LocalTime arrivalTime ;    
private Client client ;
private int numberOfPeople ;
private List<Item> orderedItems ; 

    public Booking(LocalTime arrivalTime, Client client, int numberOfPeople, String name, int prix) {
        this.arrivalTime = arrivalTime;
        this.client = client;
        this.numberOfPeople = numberOfPeople;
        orderedItems = new ArrayList<>();
    }

    Booking(Client client, int numberOfSeat, LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.client = client;
        this.numberOfPeople = numberOfPeople;
    }


    public void addOrder(Item item ){
        orderedItems.add(item);
    }
    public double billAmount (){
       double somme = 0 ;
        for(Item item : orderedItems){
            somme = somme + item.getPrix();
        }
        return somme ;
    }


}
