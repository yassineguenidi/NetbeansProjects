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
public class Locateur extends Personne{
    private String nomClub ;
    private String adrClub ;

    public Locateur(String nomClub, String adrClub, String nom, String prenom) {
        super(nom, prenom);
        this.nomClub = nomClub;
        this.adrClub = adrClub;
    }
    
    public void afficheLocateur(){
        System.out.println(this.getNom() +" "+this.getPrenom()+" "+ this.nomClub +" "+this.adrClub);
    }
}
