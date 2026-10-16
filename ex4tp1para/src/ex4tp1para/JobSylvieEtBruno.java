/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4tp1para;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yassi
 */
public class JobSylvieEtBruno implements Runnable{

    Compte compte =new Compte();
    
    public synchronized void effectuerRetrait(int montant) throws InterruptedException{
            Thread.sleep(500);
            compte.retirer(montant); 
            System.out.println(Thread.currentThread().getName() +"\t"+ compte.getSolde());
        /*if(montant>=compte.getSolde()){
            Thread.sleep(500);
            compte.retirer(montant);
           // Thread.currentThread().getName();
            System.out.println("this thread" + Thread.currentThread().getName() + compte.getSolde());
        }*/
        
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                effectuerRetrait(10);
                //System.out.println(Thread.currentThread().getName() +"\t"+ compte.getSolde());
            } catch (InterruptedException ex) {
                Logger.getLogger(JobSylvieEtBruno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
