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
public class PetitJob implements Runnable {
    private ObjetEntier notre_entier ;
    private int increment;
    PetitJob(ObjetEntier notre_entier , int increment){
	this.increment=increment; 
	this.notre_entier = notre_entier;
    }
    public void run() {
	for (int i = 0; i < 1e8; i++)
	    {
		notre_entier.add(increment);
	    }  
	System.out.format("Thread faisant %d - termine, compteur= %s\n" , increment,notre_entier);

    }

}

