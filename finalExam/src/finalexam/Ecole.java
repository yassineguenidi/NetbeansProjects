/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author yassi
 */
public class Ecole {
    
    private HashMap<String ,ArrayList<Eleve>> ecol ;
    
  

    public Ecole(){
        ecol= new HashMap<>();
    }
    
    public void AjouterNiveau(String niveau){
        ecol.put(niveau, new ArrayList<>());
    }
    
    public void Ajouter(String x, Eleve e){
       /*try{
           for (String key : ecol.keySet()) {
            for (Eleve el : ecol.get(key)) {
                if(el.getNum()==e.getNum())
                    break ;
                else{
                    ecol.get(x).add(e);
                }
            }
        }
       } catch(Exception ex){JOptionPane.showMessageDialog(null, "cet eleve est deja enregistré");}
      */     
       ecol.get(x).add(e);
    }
    
    public Eleve afficherPremier(String key){
        
        float max = 0 ;
        Eleve e2 = new Eleve();
        for (Eleve el : ecol.get(key)) {
                if(el.getMoyenne()>max){
                    max= el.getMoyenne() ; 
                    e2=el ;
                }
        }
        return e2 ;
        }
        
        
        
    
    
    public void afficher() {
        for (String key : ecol.keySet()) {
            System.out.println(key); 
            for (Eleve e : ecol.get(key)) {
                System.out.println(e);
            }
        }
    }
    
    
}


