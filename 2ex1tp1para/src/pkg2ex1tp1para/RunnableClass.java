/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ex1tp1para;

/**
 *
 * @author yassi
 */
public class RunnableClass  implements Runnable{

    private int debut ;
    private int fin ;

    public RunnableClass(int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
    }
    
    @Override
    public void run() {
        for(int i=debut; i<fin; i++){
            System.out.println(Thread.currentThread().getName() + "\t "+i);
        }
    }
}
