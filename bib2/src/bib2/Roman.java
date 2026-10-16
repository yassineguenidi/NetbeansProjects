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
public class Roman extends Livre{
        private double prixLitt;
        
 public Roman(double prixLitt, int Num, String T, String Auteur, int NbrPages) {
        super(Num, T, Auteur, NbrPages);
        this.prixLitt = prixLitt;
    }
    public double getPrixLitt() {
        return prixLitt;
    }
    public void setPrixLitt(double prixLitt) {
        this.prixLitt = prixLitt;
    }
    public String toString() {
        return super.toString()+"Roman{" + "prixLitt=" + prixLitt + '}'; }

}
