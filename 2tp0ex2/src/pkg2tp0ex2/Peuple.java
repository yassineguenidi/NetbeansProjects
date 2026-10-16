/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp0ex2;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author yassi
 */
public class Peuple {
    List Hommes = new ArrayList(); 
    int nbHommes ;

    public Peuple(int nbHommes) {
        this.nbHommes = nbHommes;
    }
    
    void naissance(Homme H){
        if (Hommes.size()<nbHommes){
            Hommes.add(H);
        }
    }
    void explorer(){
        Iterator <Homme> iter = Hommes.iterator();
        while (iter.hasNext()){
            iter.next().identite();
        }
           
}
    }

    