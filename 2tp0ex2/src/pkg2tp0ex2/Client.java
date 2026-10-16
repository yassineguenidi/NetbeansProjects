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
public class Client extends Personne implements Homme{
    private int numero ;

    public Client(int numero, String nom, String prenom) {
        super(nom, prenom);
        this.numero = numero;
    }

    @Override
    public void identite() {
        System.out.println("le Numero : "+numero);
        super.identite(); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
    
}
