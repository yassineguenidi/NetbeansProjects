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
public class Table {
    private int  totalNumberOfTables = 0;
    private int id ;
    private int capacity ;

    public Table(int capacity) {
        this.id = totalNumberOfTables ++ ;
        this.capacity = capacity;
    }
    public int getCapacity (){
        return this.capacity ;
    }
    public String toString(){
        return "Table" + this.id + this.capacity ;
    }
}
