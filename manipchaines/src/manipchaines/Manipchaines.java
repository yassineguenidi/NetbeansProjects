/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipchaines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.String.valueOf;
import java.util.*;
import java.lang.String.*;
import static java.lang.System.in;

/**
 *
 * @author yassi
 */
public class Manipchaines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader in = new BufferedReader(isr);
     //Q1
       int num=1234555 ;
       System.out.println(num);
       String ch = valueOf(num);
       System.out.println(ch);
       System.out.println(ch.length());
     //Q2
       String nbre="1000";
       System.out.println(nbre+5);
       int nbreConverti=Integer.parseInt(nbre);
       System.out.println(nbreConverti+5);
      
     //Q4
         String chaine  = "   bonjour   ";
         System.out.println(chaine);
         System.out.println("la longueur du chaine est " + chaine.length());
         chaine = chaine.trim();
         chaine=chaine.toUpperCase();
         System.out.println(chaine);
         System.out.println("la longueur du chaine devient "+ chaine.length());
          
     //Q5
        
         System.out.println("donnez une chaine");
         String s1 = in.readLine();
         System.out.println("donnez une chaine");
         String s2=  in.readLine();
         if ((s1.charAt(0))==s2.charAt(0))
                 {
                  System.out.println("les deux chaines commencent par le meme caractere qui est " + s1.charAt(0));
                 }
         else{
               System.out.println("les deux chaines ne commencent pas par le meme caractere ");
         }
           
           System.out.println("donnez une chaine");
           String s3 = in.readLine();
           
           System.out.println("donnez une chaine");
           String s4=  in.readLine();
           
           System.out.println("utilisation du s1.equals(s2)");
           if ( s3.equals(s4) )
                 {
                  System.out.println("les deux chaines sont egaux !");
                 }
           else{
               System.out.println("les deux chaines ne sont pas egaux !");
         }
           
           
           System.out.println("utilisation du sl.compareTo(s2)");
             int comp= s3.compareTo(s4); 
             if(comp==0){
                 System.out.println("les deux chaines sont egaux !");
             }
          else{
               System.out.println("les deux chaines ne sont pas egaux !");
         }
             
     //Q6
          
             
             
             System.out.println("utilisation du sl.compareTolgnoreCase(s2"); 
             comp = s3.compareToIgnoreCase(s4);
             if ( comp==0 )
                 {
                  System.out.println("les deux chaines sont egaux !");
                 }
         else{
               System.out.println("les deux chaines ne sont pas egaux !");
         }
          
     
     //Q7        
         System.out.println("donnez une chaine");
         String s5 = in.readLine();
         System.out.println("donnez une chaine");
         String s6=  in.readLine();
          
         if ((s5.startsWith(s6)))
                 {
                  System.out.println("la 1ere chaine commence par la 2eme chaine donnée");
                 }
         else{
               System.out.println("la 1ere chaine ne commence pas par la 2eme chaine !");
         }
        
          boolean compar=s5.contains(s6);
           if (compar)
                 {
                  System.out.println("la 1ere chaine contient la 2eme chaine donnée");
                 }
         else{
               System.out.println("la 1ere chaine ne contient pas la 2eme chaine !");
         }
          
         if ((s5.endsWith(s6)))
                 {
                  System.out.println("la 1ere chaine termine par la 2eme chaine donnée");
                 }
         else{
               System.out.println("la 1ere chaine ne termine pas par la 2eme chaine !");
         } 
         
     //Q8
         System.out.println("donnez une chaine"); 
         String s7 = in.readLine();
         System.out.println("donnez une chaine");
         String s8=  in.readLine();
          if ((s7.startsWith(s8)))
                 {
                  s7=s7.substring(s8.length(),s7.length());
                  System.out.println(s7);
                 }
         else{
               System.out.println(s7);
         }
    }
}