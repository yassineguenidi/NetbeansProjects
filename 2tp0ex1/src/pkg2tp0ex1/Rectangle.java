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
public class Rectangle extends Forme{
    float a,b;

    public Rectangle(float a, float b) throws MathException{
		if(a<0||b<0)throw new MathException();
		else
		{
			this.a = a;
			this.b = b;
		}
		
	}
    

    @Override
    float perimetre() {
        return  (a+b)*2;
    }

    @Override
    float surface() {
        return a*b;
    }
    
}
