/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionproject;

/**
 *
 * @author yassi
 */
import java.util.*;
import java.io.*;
public class Fractionproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fraction fracmult =new fraction();
        fraction fracsomme =new fraction();
        fraction f = new fraction(10,2);
        fraction f1 = new fraction(25,5);
        
        f.afficher();
        f.simplifier();
        f.afficher();
        System.out.println(f.toString());
        
        f1.afficher();
        f1.simplifier();
        f1.afficher();
      
        System.out.println(f1.toString());
       
        fracmult=f.mult(f1);
        fracmult.afficher();
        System.out.println( "la multiplication est :" + fracmult.toString());
        
        fracsomme=f.somme(f1);
        fracsomme.afficher();
        //System.out.println( fracsomme.toString()); 
        if(f.equals(f1))
        
            System.out.println("les deux fractions sont egaux");
        else
            System.out.println("les deux fractions ne sont pas egaux");
        
        
    }
    
}
class fraction  {
    int num ;
    int denum ;
    fraction(){};
    fraction(int num, int denum) {
        this.num = num ;
        this.denum = denum ;
    }
    
    void afficher (){
        System.out.println(num+"/"+denum);
    }

    @Override
    public String toString(){
     return  this.num+"I"+this.denum ;  
    }
    fraction mult(fraction b){
        fraction frac = new fraction()  ;
  
               
        frac.num=this.num*b.num ;
        frac.denum=this.denum*b.denum ;
        return frac ;
    }
   
   fraction somme(fraction b){
        fraction frac = new fraction()  ;
  
               
        frac.num=this.num*b.denum +b.num*this.denum ;
        frac.denum=this.denum*b.denum ;
        return frac ;
    }
   
  /* boolean equal(fraction f1,fraction f2){
       f1.simplifier();
       f2.simplifier();
        return (f1.num==f2.num)&&(f1.denum==f2.denum);
   }*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.num;
        hash = 59 * hash + this.denum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final fraction other = (fraction) obj;
        if (this.num != other.num) {
            return false;
        }
        if (this.denum != other.denum) {
            return false;
        }
        return true;
    }
   
        static int pgcd(int a, int b){
        if (b == 0) {
          return a;}
          return pgcd(b, a% b);
    }
   
        void simplifier() {
        int g = pgcd(this.num, this.denum);
        this.num = this.num / g;
        this.denum= this.denum / g;
    }
        
   void somme2(fraction b){
         
        this.num=this.num*b.denum +b.num*this.denum ;
        this.denum=this.denum*b.denum ;
       
    }
}
