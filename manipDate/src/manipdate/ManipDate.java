/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipdate;

/**
 *
 * @author yassi
 */

import java.lang.System ;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import sun.java2d.pipe.SpanShapeRenderer;
public class ManipDate {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
    //Q1
      long se=  System.currentTimeMillis();  
      se=se/100;
      System.out.println("la nbre du secondes depuis 1 janvier 1970 est "+ se);
    //Q2
      Date t=new Date();  
      System.out.println(t);
    //Q3
    
      Calendar calendar = Calendar.getInstance();
       if ( calendar.get( Calendar.MONTH )==Calendar.DECEMBER ) { 
          System.out.println("la date courante est EN decembre"); 
       }
       
    //Q4     
      String[] mois = { "janvier", "fevrier","fevrier","avril","mai","juin","juillet","aout","septembre","octobre","novembre", "decembre" };
      String[] jSem = { "lundi", "mardi","mercredi","jeudi","vendredi","samedi","dimanche" };
      System.out.println("le mois est "+mois[0]+" le jour du semaine est "+jSem[0]);
     
   //Q5
      Date d =new Date();
      SimpleDateFormat f = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
      System.out.println( " maintenant "+ f.format(d)) ;
    
    }

}
