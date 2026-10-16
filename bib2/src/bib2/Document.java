/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib2;

/**
 *
 * @author yassi
 */
public class Document {
     protected int NumEnreg;
     protected String titre;
     public Document(int NumEnreg, String titre) {
        this.NumEnreg = NumEnreg;
        this.titre = titre;
    }

  
    
    public String toString() {
        return "Document{" + "NumEnreg=" + NumEnreg + ", titre=" + titre + '}';
    }
    
}
