/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
abstract class Employe extends Date{
    private String nom ;
    private String prenom ;
    int age ;
    Date  d=new Date();

    public Employe(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    abstract double calculSalaire();
    
    String getNom(){
      return ("l'employee "+this.nom+" "+this.prenom) ;  
    } 
    
}



class employeVente extends Employe{
    
   java.util.Scanner entree =   new java.util.Scanner(System.in);

    public employeVente(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
     double calculSalaire() {
         System.out.println("donner le chiffre d'affaire");
         int s=entree.nextInt();
     
       return (s*0.2+400);
     }
}



class employeRepresentation extends Employe{
    
        java.util.Scanner entree =   new java.util.Scanner(System.in);
       
        public employeRepresentation(String nom, String prenom, int age) {
            super(nom, prenom, age);
        
        }
        
     @Override
     double calculSalaire() {
        System.out.println("donner le chiffre d'affaire");
         int s=entree.nextInt();
     
       return (s*0.2+800);
    
      }
}
   

     
     
     
class employeProduction extends Employe{
java.util.Scanner entree =   new java.util.Scanner(System.in);
        public employeProduction(String nom, String prenom, int age) {
            super(nom, prenom, age);
        }

    @Override
     double calculSalaire() {
   System.out.println("donner le nbre d'unités produits");
         int s=entree.nextInt();
     
       return (s*5);
     
    }
    
}

class employeProductionRisque extends employeProduction{
    
    public employeProductionRisque(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
     @Override
       double calculSalaire() {
         System.out.println("donner le nbre d'unités produits");
         int s=entree.nextInt();
     
         return (s*5 + 200);
     
    }
    
}


  
class employeManutention extends Employe{
      java.util.Scanner entree =   new java.util.Scanner(System.in);
      
      public employeManutention(String nom, String prenom, int age) {
                super(nom, prenom, age);
            }

    @Override
     double calculSalaire() {
         System.out.println("donner le nbre d'heures");
         int s=entree.nextInt();
     
         return (s*65);
    
     }
}    


class employeManutationRisque extends employeManutention{
    
    public employeManutationRisque(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
     @Override
     double calculSalaire() {
         System.out.println("donner le nbre d'heures");
         int s=entree.nextInt();
     
         return (s*65 + 200);
    
     }
}
     
class Personnel {
    
    
     // Tableau contenant les formes de ce terrain
     Employe[] liste;
    // Cette variable indique combien il y a d'éléments dans le tableau
     int nbEmpl = 0;

    public Personnel () {
      // Employe[] liste = new Employe[50];
    }

   
    public boolean ajouterEmploye(Employe employe) {
        
        if (nbEmpl < liste.length) {
            liste[nbEmpl] = employe;
            nbEmpl++; 
            return true;
        } else {
            return false;
        }
        
    }
    
}
 class Date{
     
    int j;
    int m;
    int a;

    public Date(int j, int m, int a) {
        this.j = j;
        this.m = m;
        this.a = a;
    }

    public Date() {
    }
    
    @Override
    public String toString(){
        return  (this.j+"/"+this.m+"/"+this.a+")");
    } 
 }
