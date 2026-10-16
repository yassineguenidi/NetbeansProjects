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
public class Puissance4 {
    private final Grille grille = new Grille();
    private final Joueur joueur0 = new Joueur(0, Jeton.X);
    private final Joueur joueur1 = new Joueur(1, Jeton.O);
    
    private int tourActuel =0;
        
    private Joueur joueurActuel = joueur0 ;
    
    public Puissance4(){
    }    
    
    public Grille getGrille(){
        return grille;
    }
        
    public void incrementTourActuel() {
        tourActuel++;
        joueurActuel = (tourActuel % 2 == 0) ? joueur0 : joueur1;
    }

    public Joueur getJoueurActuel() {
        return joueurActuel;
    }
    
    public boolean gagnerHorizontal() {
        for (int i = 0; i < Grille.LIGNES; i++) {
            int count = 0;
            for (int j = 0; j < Grille.COLONNES; j++) {
                if (grille.getIndiceByIndex(i, j).getJeton() == joueurActuel.getJetonJoueur()) {
                    count++;
                    if (count == 4) return true;
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }
    
    public boolean gagnerVertical() {
        for (int j = 0; j < Grille.COLONNES; j++) {
            int count = 0;
            for (int i = 0; i < Grille.LIGNES; i++) {
                if (grille.getIndiceByIndex(i, j).getJeton() == joueurActuel.getJetonJoueur()) {
                    count++;
                    if (count == 4) return true;
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }
    
    public boolean gagnerDiagonalInverse() {
        for (int i = 3; i < Grille.LIGNES; i++) {
            for (int j = 0; j < Grille.COLONNES - 3; j++) {
                if (grille.getIndiceByIndex(i, j).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i - 1, j + 1).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i - 2, j + 2).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i - 3, j + 3).getJeton() == joueurActuel.getJetonJoueur()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean gagnerDiagonal() {
        for (int i = 0; i < Grille.LIGNES - 3; i++) {
            for (int j = 0; j < Grille.COLONNES - 3; j++) {
                if (grille.getIndiceByIndex(i, j).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i + 1, j + 1).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i + 2, j + 2).getJeton() == joueurActuel.getJetonJoueur() &&
                    grille.getIndiceByIndex(i + 3, j + 3).getJeton() == joueurActuel.getJetonJoueur()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean gagner() {
        return gagnerHorizontal() || gagnerVertical() || gagnerDiagonal() || gagnerDiagonalInverse();
    }
    
    public boolean estEgalite(){
        return grille.estRempli() && !gagner();
    }
   
}
