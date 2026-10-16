/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4tp1paranew;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yassi
 */
public class JobSylvieEtBruno implements Runnable  {

    private Compte compte = new Compte() ;
    
    
    @Override
    public void run() {
      for(int i=0 ; i<= 10 ; i++){
          try{
              effectuerRetrait(10);
          }
          catch (InterruptedException ex) {
                System.err.println("There is An exception");
      }
    }
    }
    
    public void effectuerRetrait(int montant) throws InterruptedException{
       if(compte.getSolde()>= montant){
           System.out.println("endormir "+ Thread.currentThread().getName());
           Thread.sleep(500);
            System.out.println("se reveiller "+ Thread.currentThread().getName());
            compte.compSemaphore.acquire();
           compte.retirer(montant);
           System.out.println("operation faite " + Thread.currentThread().getName()+"\t"+ compte.getSolde());
           compte.compSemaphore.release();
       }
        
    }
    
    
}
