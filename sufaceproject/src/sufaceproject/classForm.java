/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sufaceproject;

/**
 *
 * @author yassi
 */
abstract class Forme{
    
    public abstract double calculerSurface();
}




class Rectangle extends Forme {

    private double largeur;
    private double hauteur;

    public Rectangle (double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void setLargeur (double largeur) {
        this.largeur = largeur;
    }

    public double getLargeur () {
        return largeur;
    }

    public void setHauteur (double hauteur) {
        this.hauteur = hauteur;
    }

    public double getHauteur () {
        return hauteur;
    }

    public double calculerSurface () {
        return (largeur * hauteur);
    }
}





class Cercle extends Forme {

    private double rayon;

    public Cercle (double rayon) {
        this.rayon = rayon;
    }

    public void setRayon (double rayon) {
        this.rayon = rayon;
    }

    public double getRayon () {
        return rayon;
    }

    public double calculerSurface () {
        return (Math.PI * rayon * rayon);
    }
}




class Terrain {
  
    // Tableau contenant les formes de ce terrain
     Forme[] liste;
    // Cette variable indique combien il y a d'éléments dans le tableau
     int nbFormes = 0;

    public Terrain () {
       Forme[] list = new Forme[10];
    }

   
    public boolean ajouterForme(Forme forme) {
        
        if (nbFormes < liste.length) {
            liste[nbFormes] = forme;
            nbFormes++; 
            return true;
        } else {
            return false;
        }
    }

   
    private double calculerSurfaceTotale () {
        double somme = 0.0;
        for (int i = 0; i < nbFormes; i++) {
            somme += liste[i].calculerSurface();
        }
        return somme;
    }

    public void afficherSurfaceTotale () {
        double surfaceTotale = calculerSurfaceTotale();
        System.out.println("La surface totale est " + surfaceTotale);
    }
}
