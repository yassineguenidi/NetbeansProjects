/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2ex3;

/**
 *
 * @author yassi
 */
public class IASchoolTp2Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        compteBancaire compte = new compteBancaire("253589B",520.0);
        
        Client c1 = new Client("235489", "yassine","guenidi",compte);
        c1.deposer(5000);
        c1.compte.changerTauxInteret((float) 0.01);
        c1.compte.ajouterInteret();
        c1.afficherClient();
        
}
}
    
