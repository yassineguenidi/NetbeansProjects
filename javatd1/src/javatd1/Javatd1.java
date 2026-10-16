/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatd1;

import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author yassi
 */
public class Javatd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread A = new Thread (new RunnableClass(),"A");
        Thread B = new Thread (new RunnableClass(),"B");
        Thread C = new Thread (new RunnableClass(),"C");
        Thread D = new Thread (new RunnableClass(),"D");
        
        A.start();
        B.start();
        C.start();
        D.start();
        
        try{
            A.join();
            B.join();
            C.join();
            D.join();
            
        }
         catch(InterruptedException e){
              printStackTrace(e);
          }
        
        System.out.println("Fin d'execution");
    }
    
}
