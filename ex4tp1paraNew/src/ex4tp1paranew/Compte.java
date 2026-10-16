/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4tp1paranew;

import java.util.concurrent.Semaphore;

/**
 *
 * @author yassi
 */
public class Compte {
    private float solde = 100;
    
    Semaphore compSemaphore ; 
    public void retirer(int montant) throws InterruptedException{
       
        solde -= montant ;
    }
    
   /* public synchronized void deposer(int montant){
        solde += montant ;
    }
    public synchronized void consulter(){
        
    }
*/
    public Compte() {
        
        compSemaphore = new Semaphore(1);
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    
}
