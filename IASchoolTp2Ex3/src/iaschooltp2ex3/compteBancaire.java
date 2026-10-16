/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2ex3;

/**
 *
 * @author yassi
 */
public class compteBancaire {
    String numeroCompte ;
    Double solde ;
    float taux=(float) 0.05 ;

    public compteBancaire(String numeroCompte, Double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public compteBancaire(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
    
    
    public void changerTauxInteret(float taux){
        this.taux=taux;
        
    }
    
    public void ajouterInteret(){
        solde+= solde*taux ;
    }
    
    
    
    public void afficheSolde(){
        System.out.println(this.getSolde());
        
    }

    @Override
    public String toString() {
        return "compteBancaire{" + "numeroCompte= " + numeroCompte + ", solde= " + solde + ", taux= " + taux + '}';
    }
    
}
