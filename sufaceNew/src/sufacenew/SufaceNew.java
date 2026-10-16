/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sufacenew;

/**
 *
 * @author yassi
 */
public class SufaceNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
abstract class Forme{

    public abstract double calculeSurface();
}

class Rectangle extends Forme {
    private double largeur ;
    private  double  hauteur ;

    
    @Override
    public double calculeSurface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
