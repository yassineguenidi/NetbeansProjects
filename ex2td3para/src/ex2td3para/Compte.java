/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2td3para;

/**
 *
 * @author yassi
 */
public class Compte {
    
    private int solde ;

    public Compte(int solde) {
        this.solde = solde;
    }
    
    public void afficher(){
        System.out.println("le solde est "+ this.solde);
    }

    public int getSolde() {
        return solde;
    }
    
    public synchronized void  ajouter(int solde){
        
        this.solde += solde ;
    }
    
     public synchronized void retirer(int solde){
         if(this.solde>= solde){
             this.solde -= solde ;
         }
         else{
             System.out.println(" retrait impossible");
         }
        
    }
    
     
}
