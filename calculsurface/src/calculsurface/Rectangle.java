/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculsurface;

/**
 *
 * @author yassi
 */
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


