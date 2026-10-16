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
public class Manuel extends Livre{
      private String niveau;
 public String getNiveau() {
        return niveau;
    }
  public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
  
    public Manuel(String niveau, int Num, String T, String Auteur, int NbrPages) {
        super(Num, T, Auteur, NbrPages);
        this.niveau = niveau;
    }
    public String toString() {
        return super.toString()+"Manuel{" + "niveau=" + niveau + '}';
    }
}
