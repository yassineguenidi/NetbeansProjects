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
import java.math.* ;
public class Calculsurface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Rectangle r1 =new Rectangle(1,2);
     Rectangle r2 =new Rectangle(3,4);
     Rectangle r3 =new Rectangle(5,6);
     
     Cercle c1 = new Cercle (7);
     Cercle c2 = new Cercle (8);
     Cercle c3 = new Cercle (9);
     
     Terrain t = new Terrain(r1,r2,r3,c1,c2,c3);
     
     System.out.println( r1.calculerSurface());
     System.out.println( r2.calculerSurface());
     System.out.println( r3.calculerSurface());
     System.out.println( c1.calculerSurface());
     System.out.println( c2.calculerSurface());
     t.calculerSurfaceTotale();
     t.afficherSurfaceTotale();
     
    }
    
}

