

package eleve;

import java.util.*;
import static java.lang.Integer.parseInt;
public class Eleve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    note n=new note();
    etudiant e=new etudiant();
    String r = e.test(n.calculNote());
    String nom = e.lectureNom();
    System.out.println("l'etudiant " + nom +" a une mention "+ r);
    
    }
    
  
}

 class  note {
     double note1;
     double note2;
     double note3;
     note(){
         this.note1=note1;
         this.note2=note2 ;
         this.note3=note3; 
     }
     double calculNote(){
            System.out.println("donner note 1");
            Scanner note1 = new Scanner(System.in);
            double n1 =parseInt(note1.nextLine());
            
            System.out.println("donner note 2");
            Scanner note2 = new Scanner(System.in);
            double n2 =parseInt(note2.nextLine());
            
            System.out.println("donner note 3");
            Scanner note3 = new Scanner(System.in);
            double n3 =parseInt(note3.nextLine());
            return ((n1 + n2 + n3)/3);

        }
 }    
 
 class etudiant extends note {
     String nom;
     double moy ;
     etudiant(){
     this.moy=moy ;
     this.nom=nom ;
 } 
     public etudiant(String nom, double moy) {
            this.nom = nom;
            this.moy = moy;
        }
     String lectureNom(){
            System.out.println("donner nom");
            Scanner nom = new Scanner(System.in);
            String name1 =(nom.nextLine());
            return name1 ;
    }
     String test(double m){
    
        if(m<10.0){
             return "Redoublant";
        }
           else if(m>=10.0 && m<12) {        
                return "Passable";
                }
                else if(m>=12 && m<15){
                     return "Bien" ;
                     }         
                     else if (m>=15 && m<18){
                          return "trés Bien";
                          }
                          else{
                               return "exelent";
                               }
    }
 }
 
