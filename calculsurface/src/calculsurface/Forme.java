/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculsurface;

/**
 *
 * @author yassi
 */
abstract class Forme {
    /**
     * Cette méthode calcule la surface d'une forme géométrique. La responsabilité
     * de l'implémentation est laissée aux sous-classes.
     * @return  La surface de la forme
     */
    public abstract double calculerSurface();
}
