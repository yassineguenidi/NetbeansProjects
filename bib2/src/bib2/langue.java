/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib2;

/**
 *
 * @author yassi
 */
public enum langue {
    FRA ( "français" ),
    AR ( "arabe" ) ,
    AL ( "allemand" ) ,
    ESP( "espagnol" ) ;
    
    private String name=" " ;

   langue(String name){
   this.name= name;}

      
   public String toString( ){
     return name;
       
}
}
