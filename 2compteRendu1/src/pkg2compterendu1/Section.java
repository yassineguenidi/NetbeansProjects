/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2compterendu1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class Section {
    int num ;
    private List listEtudiants = new ArrayList<Etudiant>(); 
    
    public void ajouterEtudiant(Etudiant e){
        listEtudiants.add(e);
    }
    
    public void supprimerEtudiant(Etudiant e){
        listEtudiants.remove(e);
    }
    
}
