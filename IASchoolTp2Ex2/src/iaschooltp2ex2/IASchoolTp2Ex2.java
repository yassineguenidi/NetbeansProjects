/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2ex2;

/**
 *
 * @author yassi
 */
public class IASchoolTp2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicule monVehicule = new Vehicule("Audi", 400,0);
        monVehicule.eteindre();
        monVehicule.demarrer(20);
        monVehicule.afficher();
        
        Vehicule tonVehicule = new Vehicule("BMW", 350,50);
        
        if(tonVehicule.getVitesseCour()>0){
            tonVehicule.eteindre();
        }
        else {
            tonVehicule.demarrer(50);
            
        }
        
        tonVehicule.afficher();
        
        System.out.println("le nombre de voitures est " + Vehicule.nombre);
        
    }
    
}
