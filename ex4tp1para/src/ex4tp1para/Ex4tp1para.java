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
public class Ex4tp1para {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread Sylvie = new Thread(new JobSylvieEtBruno(),"Bruno ");
	Thread Bruno = new Thread(new JobSylvieEtBruno(),"Sylvie ");

	Sylvie.start();
	Bruno.start();
        
        try{
            Bruno.join();
            Sylvie.join();
        }catch(Exception e){
            System.out.println(e);
        }
	       System.out.println("Fin d'execution");
    }
    
}
