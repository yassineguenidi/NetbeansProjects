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
public class EnemyEmpire {
    String nom ;
    int nbrSoldats ;

    public EnemyEmpire(String nom, int nbrSoldats) {
        this.nom = nom;
        this.nbrSoldats = nbrSoldats;
    }

    public EnemyEmpire() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrSoldats() {
        return nbrSoldats;
    }

    public void setNbrSoldats(int nbrSoldats) {
        this.nbrSoldats = nbrSoldats;
    }
    
    
}
