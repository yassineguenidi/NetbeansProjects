/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadapplication;

import static java.lang.Thread.sleep;

/**
 *
 * @author yassi
 */
public class MonThread extends Thread{
    private String message ; 
    public MonThread(String message){
        this.message = message;
        
    }
    public void run(){
        for(int i =0;i<20;i++){
            System.out.println(message);
            try{
                //sleep(100);
                //Thread.sleep(100);
                Thread.currentThread().sleep(100);
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
}
