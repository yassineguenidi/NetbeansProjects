/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4tp1para;

/**
 *
 * @author yassi
 */
public class Compte {
    
    private int solde =100 ;
    public synchronized void retirer(int montant){
        this.solde-= montant ;
    }
     public int getSolde(){
         return this.solde;
     }
}
