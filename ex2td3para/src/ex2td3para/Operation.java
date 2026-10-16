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
public class Operation extends Thread{
    
    Compte compte ;
    
    String nom ="";
    
    Operation(String nom, Compte compte) {
        this.nom = nom ;
        this.compte = compte;
    }
    @Override
    public void run(){
        while(true){
            int i = (int) (Math.random() *1000);
            synchronized(compte){
                if(nom.equals("retrait")) compte.retirer(i);
                else if (nom.equals("depot")) compte.ajouter(i);
            }
            
            int solde = compte.getSolde();
            System.out.println("nom" + solde);
            try{
                Thread.sleep((int) (100* Math.random()));
            }catch(InterruptedException e){
                System.err.println(e);
                
            }
                    
        }
        
    }
    
}
