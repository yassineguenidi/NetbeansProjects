/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib2;

import java.util.Objects;

/**
 *
 * @author yassi
 */
public class Livre extends Document{
    protected String Auteur;
    protected int NbrPages;
    
    public String getAuteur() {
        return Auteur;
    }
    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }
    public int getNbrPages() {
        return NbrPages;
    }
    public void setNbrPages(int NbrPages) {
        this.NbrPages = NbrPages;
    }

    public Livre(int Num,String T,String Auteur, int NbrPages) {
        super(Num,T);
        this.Auteur = Auteur;
        this.NbrPages = NbrPages;
    }
    
    public String toString() {
        return super.toString()+"Livre{" + "Auteur=" + Auteur + ", NbrPages=" + NbrPages + '}';
    }   

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livre other = (Livre) obj;
        if (this.NbrPages != other.NbrPages) {
            return false;
        }
        if (!Objects.equals(this.Auteur, other.Auteur)) {
            return false;
        }
        return true;
    }
    
}
