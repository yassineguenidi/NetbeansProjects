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
public class Bib2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
       /* Bibliotheque bib=new Bibliotheque(10);
  
        bib.ajouter(new Document(1,"Base_de_donnee"));
        
        bib.ajouter(new Document(2,"JAVA"));
       
        bib.ajouter(new Livre(3,"livre","livre", 10));
        
        bib.ajouter(new Manuel("4", 4,"manuel", "manuel", 70));
       
        bib.ajouter(new Revue(5, 1999, 5, "revue"));
       
        bib.ajouter(new Roman(4, 6, "roman","roman", 156)); 
       
        bib.ajouter(new Dictionnaire(langue.AR, 4,"larousse"));
        
        bib.afficherDoc();
        
        Livre l1 =new Livre(5, "livre", "livre", 50);
        Livre l2 =new Livre(5, "livre", "livre", 50);
        System.out.println(l1.equals(l2));
       
        */
      
        
        Livre l = new Livre(2,"livre1","livre1", 50);
        Livre l2 = new Livre(2,"livre2","livre2", 50);
        Livre l3 = new Livre(2,"livre3","livres3", 50);
        Bibliotheque bib =new Bibliotheque();
       
        bib.liste.add(l);
        bib.liste.add(l2);
        bib.liste.add(l3);
        System.out.println(bib.liste.size());
        
        for(int i =0;i<bib.liste.size();i++){
        System.out.println(bib.liste.elementAt(i));
        }
        
      
     /*
      bib.ajouter(new Document(1,"MATHS"));
      bib.ajouter(new Document(2,"FRANCAIS"));
      bib.ajouter(new Document(62,"ENGLISH"));
      bib.ajouter(new Document(22,"ARABE"));
     
      bib.afficherDoc();
      System.out.println();
      System.out.println(bib.document(2));
      System.out.println(bib.supprimer(d2));
      System.out.println();
      bib.afficherDoc();*/
    }
    
}
