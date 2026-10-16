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
public class Grille {
    public static int LIGNES=6;
    public static int COLONNES=7;
    
    private Cellule[][] plateaux = new Cellule[LIGNES][COLONNES];
    
    public Grille (){
        for(int i=0;i< LIGNES; i++){
            for(int j=0;j< COLONNES; j++){
                plateaux[i][j]= new Cellule();
            }
        }
    }
    
    public Cellule getIndiceByIndex(int ligne, int colonne){
        return plateaux[ligne][colonne];
    }
    
    
    public void setCelluleByndex( int ligne, int colonne, Jeton jeton){
        plateaux[ligne][colonne].setJeton(jeton);
    }
    
    public boolean estRempli(){
        for(int i=0; i<=LIGNES;i++){
            for(int j=0 ; j<=COLONNES;j++){
                if(plateaux[i][j].estVide()){
                    return false ;
                }
            }
        }
        return true ;
    }
    
    public void afficherPlateaux(){
        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                System.out.print("|" + plateaux[i][j].afficherJeton());
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }
}
