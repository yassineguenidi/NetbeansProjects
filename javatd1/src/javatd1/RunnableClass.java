/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatd1;

import java.util.Random;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author yassi
 */
public class RunnableClass implements Runnable {
    private static final Random random = new Random() ;
    
    
    @Override
    public void run() {
      for( int i =0 ; i<= 10 ; i++){
          try{
              Thread.sleep(random.nextInt(1000));
              System.out.println(Thread.currentThread().getName());
          }
          catch(InterruptedException e){
              printStackTrace(e);
          }
      }
    }
    
}
