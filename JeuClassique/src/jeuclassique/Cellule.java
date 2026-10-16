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
public class Cellule {
    private Jeton jeton ;

    public Cellule() {
    }

    public Cellule(Jeton jeton) {
        this.jeton = jeton;
    }

    public Jeton getJeton() {
        return jeton;
    }

    public void setJeton(Jeton jeton) {
        this.jeton = jeton;
    }
    
    public boolean estVide(){
        return jeton==null;
    }
    
    public String afficherJeton() {
        return jeton == null ? " " : (jeton == Jeton.X ? "X" : "O");
    }
}
