/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3tp1para;

/**
 *
 * @author yassi
 */
public class Ex3tp1para {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ObjetEntier Compteur = new ObjetEntier(); 
	PetitJob objex1= new PetitJob(Compteur, 1);
	PetitJob objex2= new PetitJob(Compteur, -1);
	Thread tache1 = new Thread(objex1 ,"incrementeur");
	Thread tache2 = new Thread(objex2, "decrementeur");

	tache1.start();
	tache2.start();
        
        try{
            tache1.join();
            tache2.join();
        }catch(Exception e){
            System.out.println(e);
        }
	
	System.out.format("Le compteur vaut %s\n" , Compteur);
	System.out.format("Le compteur vaut %s\n" , Compteur);
    
    }
    
}
