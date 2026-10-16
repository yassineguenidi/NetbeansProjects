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
public class Cercle extends Forme{
    float rayon; 
    public Cercle(float rayon) throws MathException{
	if(rayon<0)  throw new MathException();
	else
		this.rayon = rayon;
	}

    @Override
    float perimetre() {
        return (float) (2*Math.PI*rayon);
    }

    @Override
    float surface() {
        return (float) (Math.PI*Math.pow(rayon,2));
    }


    
    
}
