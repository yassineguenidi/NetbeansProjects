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