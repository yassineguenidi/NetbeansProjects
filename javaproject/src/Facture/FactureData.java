/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facture;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class FactureData {
     public Map<Integer,Facture> data = new HashMap<Integer,Facture>() ;

    public void initData(){
      Facture facture = new Facture(0,"amin","amin",270,270,0);
      data.put(1, facture);
    
    }
    public FactureData(){
        initData();             
    }
}
