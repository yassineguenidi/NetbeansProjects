/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yassi
 */
public class Commandes {
    private HashMap<String,ArrayList<Produit>> cmds;
    private int N;
    public int getN() {
        return N;
    }
    public Commandes() {
        cmds = new HashMap<>();
        N=0;
    }
    public void ajouterLigne() {
        N++;
        cmds.put("Commande n"+N, new ArrayList<>());
    }
    public void ajouter(String x,Produit p) {
        cmds.get(x).add(p);
    }
    public void afficher() {
        for (String key : cmds.keySet()) {
            System.out.println(key); 
            for (Produit p : cmds.get(key)) {
                System.out.println(p);
            }
        }
    }
}