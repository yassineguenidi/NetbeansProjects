/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp1ex1;

import static java.lang.System.in;
import java.util.LinkedList;

/**
 *
 * @author yassi
 */
public class Commande {
    LinkedList<Produit> list = new LinkedList();
    private float prixTotal=0 ;

    public Commande() {   
    }
    
    
    public void ajouterProduit(Produit p){
        list.add(p);
        prixTotal+= p.getPrixProd();
    }
    
    
    public void retirerProduit(int num){
        for(Produit p :  list){
            if(p.getNumProd()==num){
                list.remove(p);
                prixTotal-= p.getPrixProd();
                break ;
            }
        }
    }
       
    public void retirerProduit(Produit p){
        list.remove(p);
    }
    public int nombreProduit(){
        return list.size();
    }

    @Override
    public String toString() {
        return "Commande { " + "list= " + list + ", prixTotal= " + prixTotal + '}';
    }
    
    public boolean estPresent(Produit p){
        return list.contains(p);
    }

    public float getPrixTotal() {
        return prixTotal;
    }
    
    
}
