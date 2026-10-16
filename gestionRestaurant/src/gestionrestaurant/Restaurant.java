/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrestaurant;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class Restaurant {
    public  List<Table> tables = new ArrayList<>();
    public Map<Table,Booking> bookedTables = new HashMap<>();

    public Restaurant() {
    }
    public void addTable(int capacity){
        tables.add(new Table(capacity));
        
    }
    public boolean tableIsBooked(Table table){
       return (bookedTables.containsKey(table));
    }
    private Table findAppropriateTable(int numberOfPeople){
        Table appropriateTable =  null;
        for(Table table: tables){
            
            if (! tableIsBooked(table)&& table.getCapacity() >= numberOfPeople&&
                    (appropriateTable == null || appropriateTable.getCapacity() > table.getCapacity())){
        
                appropriateTable = table;}
            
        }
        return appropriateTable;
    } 
    public Table book(Client client ,int numberOfSeat ,LocalTime arrivalTime){
        Table appropriateTable = findAppropriateTable(numberOfSeat);
        bookedTables.put(appropriateTable, new Booking (client, numberOfSeat , arrivalTime));
        return appropriateTable;
    }
    public void addOder(Dish dish ,int quantity ,Table table){
        bookedTables.get(table).addOrder(dish);
    }
}
