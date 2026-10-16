/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devtp;

/**
 *
 * @author yassi
 */
public class Organise {
 public Film[]  tabfilm ;   
 public int nbfilm ;
 public int maxfilm ;
 public static int nb  ;

    public Organise(int maxfilm) {
        this.maxfilm = maxfilm;
        tabfilm =new Film[15]; 
        nb=0;
    }
 
    public void ajouter(Film film){
        if(nbfilm<maxfilm){
            this.tabfilm[nb]=film ;
            nb++;
        }
    }
     public void afficherTous(){
        for(int i=0;i<tabfilm.length;i++){                                             
            System.out.println(tabfilm[i].getTitre()+" "+tabfilm[i].getGenre()+" "+tabfilm[i].getId());
        } 
     }
     public void rechercheFilm(String titre){
      for(int i=0;i<tabfilm.length;i++)     {
          if(tabfilm[i].titre== titre){
            System.out.println(tabfilm[i].titre +" "+tabfilm[i].getGenre() +" "+tabfilm[i].getId() );
            break ;
            }           
          else{
              System.out.print("le film n'existe pas !");}    
      }   
     }
}
