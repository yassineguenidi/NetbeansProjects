/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2compterendu1;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("yassine", "guenidi", "06598099");
        Section idsd = new Section();
        idsd.ajouterEtudiant(e1);
    }
    
}
