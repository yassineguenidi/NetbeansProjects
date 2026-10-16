/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2compterendu1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yassi
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private String cin ;
    private List listNotes = new ArrayList<Float>(); 

    public Etudiant(String nom, String prenom, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;

    }

    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public List getListNotes() {
        return listNotes;
    }

    public void setListNotes(List listNotes) {
        this.listNotes = listNotes;
    }
    
    public float getMoyenne(){
        float sum =0;
        for (int i = 0; i < listNotes.size(); i++)
            sum += (float) listNotes.get(i);
 
        return sum/listNotes.size();
        }
    
    public void resultat(){
        if(getMoyenne()<10)
            System.out.println("Non admis");
        else 
            System.out.println("Admis");
    }
}
