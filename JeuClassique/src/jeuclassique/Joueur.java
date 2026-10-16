/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuclassique;

/**
 *
 * @author yassi
 */
public class Joueur {
    private final int id ;
    private final Jeton jetonJoueur ;
    
    public Joueur(int id, Jeton jetonJoueur){
        this.id =id;
        this.jetonJoueur = jetonJoueur ;
    }
    
    public Jeton getJetonJoueur() {
        return jetonJoueur;
    }

    public int getId() {
        return id;
    }
    
    
    
    public boolean placerJeton(int colonne, Grille grille){
        if(colonne <0 || colonne >= Grille.COLONNES ) return false;
        
        for (int i =Grille.LIGNES-1 ; i>= 0;i--){
            if(grille.getIndiceByIndex(i, colonne).estVide()){
                grille.setCelluleByndex(i, colonne, jetonJoueur);
                return true ;
            }
        }
        return false ;
    }
    
    
}
