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
public class Revue extends Document{
    private int mois;
    private int annee;
 public Revue(int mois, int annee, int NumEnreg, String titre) {
        super(NumEnreg, titre);
        this.mois = mois;
        this.annee = annee;
    }
   public String toString() {
        return super.toString()+"Revue{" + "mois=" + mois + ", annee=" + annee + '}';
}
}
