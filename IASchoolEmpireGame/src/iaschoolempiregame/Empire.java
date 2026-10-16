/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschoolempiregame;

/**
 *
 * @author yassi
 */
public class Empire {
    private int or ;
    private int quantite;
    private int soldats ;

    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }
    
    public void addOr(int or) {
        this.or += or;
    }
    public void souOr(int or) {
        this.or -= or;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void addQuantite(int quantite) {
        this.quantite += quantite;
    }
    
    public void souQuantite(int quantite) {
        this.quantite -= quantite;
    }

    public int getSoldats() {
        return soldats;
    }

    public void setSoldats(int soldats) {
        this.soldats = soldats;
    }

    public void addSoldats(int soldats) {
        this.soldats += soldats;
    }
    
    public void souSoldats(int soldats) {
        this.soldats -= soldats;
    }
    
    
    public Empire(int soldats, int quantite, int or) {
        this.or = or;
        this.quantite = quantite;
        this.soldats = soldats;
    }

    public Empire() {
    }
    
    public void afficherEtat(){
        System.out.println(" " + toString() );
    }

    @Override
    public String toString() {
        return "Empire{" + "or=" + or + ", quantite=" + quantite + ", soldats=" + soldats + '}';
    }
    
    
}
