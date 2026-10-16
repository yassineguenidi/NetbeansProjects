/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex1tp1para;

import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread A = new Thread (new RunnableClass(1,10),"A");
        Thread B = new Thread (new RunnableClass2(1,10),"B");
        
        
        A.start();
        B.start();
        
        
        try{
            A.join();
            B.join();
           
            
        }
         catch(InterruptedException e){
              printStackTrace(e);
          }
        
        System.out.println("Fin d'execution");
    }
    
}
