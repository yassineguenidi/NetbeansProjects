/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadapplication;

/**
 *
 * @author yassi
 */
public class ThreadApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        MonThread monthread1 = new MonThread("Java2");
        MonThread monthread2 = new MonThread("Thread");
        monthread1.start();
        monthread2.start();
        
        try{
            monthread1.join();
            monthread2.sleep(300);
            monthread2.join();
            monthread1.sleep(150);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("fin");
    }
    
}
