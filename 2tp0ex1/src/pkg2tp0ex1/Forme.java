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
public abstract class Forme {
    abstract float perimetre();
    abstract float surface();
    void contenantCarre(float surf){
        if (surf<=this.surface())
			System.out.println("cette forme peut contenir un carre de surface surf");
		else
			System.out.println("cette forme ne peut pas contenir un carre de surface surf");
    }
}
