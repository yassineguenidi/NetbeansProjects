/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sufaceproject;

/**
 *
 * @author yassi
 */
public class Sufaceproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Construction d'un terrain:
        Terrain t = new Terrain();

        t.ajouterForme(new Rectangle(100, 100));
        t.ajouterForme(new Cercle(5));

        t.afficherSurfaceTotale();
    }   
}