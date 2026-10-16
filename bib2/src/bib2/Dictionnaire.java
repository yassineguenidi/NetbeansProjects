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
public class Dictionnaire extends Document{
    private langue Langue;

    public Dictionnaire(langue Langue, int NumEnreg, String titre) {
        super(NumEnreg, titre);
        this.Langue = Langue;
    }

    public langue getLangue() {
        return Langue;
    }

    public void setLangue(langue Langue) {
        this.Langue = Langue;
    }
    
   
    public String toString() {
        return super.toString()+"Dictionnaire{" + "Langue=" + Langue + '}';
    }   
    
}
