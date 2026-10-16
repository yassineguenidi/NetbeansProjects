/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp0ex1;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) throws MathException{
        try{
            Rectangle rect = new Rectangle(2,1);
	    rect.contenantCarre(20);
	    Cercle cer= new Cercle(1);
	    cer.contenantCarre(1);
	}
		
	catch(MathException e){
            e.printStackTrace();
		}
		
	}
    
}
