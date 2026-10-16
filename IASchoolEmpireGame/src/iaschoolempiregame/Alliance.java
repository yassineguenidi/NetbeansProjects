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
public class Alliance {
    String nomEmpire ;
    boolean active = true ;

    public Alliance() {
    }

    public Alliance(String nomEmpire, String statut) {
        this.nomEmpire = nomEmpire;
        this.active = false;
    }

    public String getNomEmpire() {
        return nomEmpire;
    }

    public void setNomEmpire(String nomEmpire) {
        this.nomEmpire = nomEmpire;
    }

    public boolean getStatut() {
        return active;
    }

    public void setStatut(boolean statut) {
        this.active = statut;
    }
    
    public void former(){
        this.active= true;
        System.out.println("Alliance formée avec " + nomEmpire + " !");
        
    }
    public void rompre(){
        this.active= false;
        System.out.println("Alliance rompue avec " + nomEmpire + " !");
    }
}
