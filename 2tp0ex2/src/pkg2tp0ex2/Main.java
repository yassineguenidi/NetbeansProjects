/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp0ex2;

/**
 *
 * @author yassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Peuple peuple = new Peuple(20);
        Personne p1 =new Personne("Yassine","Guenidi");
        Personne p2 =new Personne("ahmed","ahmed");
        Personne p3 =new Personne("amir","amir");
        Personne p4 =new Personne("mariem","mariem");
        Client c1 = new Client(12,"fatma","fatma");
        Client c2 = new Client(13,"mourad","mourad");
        Client c3 = new Client(14,"med","med");
        
        peuple.naissance(p1);
        peuple.naissance(p2);
        peuple.naissance(p3);
        peuple.naissance(p4);
        peuple.naissance(c1);
        peuple.naissance(c2);
        peuple.naissance(c3);
        
        peuple.explorer();
    }
    
}
