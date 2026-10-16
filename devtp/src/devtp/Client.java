/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devtp;

/**
 *
 * @author yassi
 */
public class Client extends Personne {
     String numIdentite ;

    public Client(String numIdentite, String nom, String prenom) {
        super(nom, prenom);
        this.numIdentite = numIdentite;
    }


    public void affichieClient() {
       System.out.println(this.getNom() +" "+this.getPrenom()+" "+ this.numIdentite)    ;
    }
     
}
