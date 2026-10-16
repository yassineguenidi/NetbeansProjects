/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib;

/**
 *
 * @author yassi
 */
public class Bib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Document d =new Document(0,"les mesirables");
     Livre l = new Livre("aaa", 0, 0, "aaa");
     d.toString();
    // l.toString();
    }
    
}
   class Document {
    private int ne ;
    private String titre ;

    public Document(int ne, String titre) {
        this.ne = ne;
        this.titre = titre;
    }

    public int getNe() {
        return ne;
    }

    public String getTitre() {
        return titre;
    }
    @Override
    public String toString(){
        return ("le numero d'inscription est "+getNe()+"le titre "+getTitre());
    }
    
}
class Livre extends Document{
    private String auteur ;
    private int nbPage ;

    public Livre(String auteur, int nbPage, int ne, String titre) {
        super(ne, titre);
        this.auteur = auteur;
        this.nbPage = nbPage;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPage() {
        return nbPage;
    }
    @Override
    public String toString(){
        return ("l'auteur est "+this.auteur +"le nbre du pages est "+ this.nbPage);
    }
}
class Roman extends Livre{
    private int prix ;

    public Roman(int prix, String auteur, int nbPage, int ne, String titre) {
        super(auteur, nbPage, ne, titre);
        this.prix = prix;
    }

    

    public int getPrix() {
        return prix;
    }
    @Override
    public String toString(){
        return ("le prix est "+ this.prix);
    }
            
}

class Manuel extends Livre{
    private int niveauSclaire ;

    public Manuel(int niveauSclaire, String auteur, int nbPage, int ne, String titre) {
        super(auteur, nbPage, ne, titre);
        this.niveauSclaire = niveauSclaire;
    }

  

    public int getNiveauSclaire() {
        return niveauSclaire;
    }
    @Override
    public String toString(){
        return ("le niveau est "+this.niveauSclaire);
    }
    
}
class Revue extends Document {
    private int mois ;
    private int annee ;

    public Revue(int mois, int annee, int ne, String titre) {
        super(ne, titre);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }
    @Override
   public String toString (){
       return (this.mois+"/"+this.annee);
   }
}
class Dictionnaire extends Document{
    private String langue ;

    public Dictionnaire(String langue, int ne, String titre) {
        super(ne, titre);
        this.langue = langue;
    }

    @Override
   public String toString(){
       return ("la langue est "+this.langue);
   }
    
}
class langue {
    String fr  ;
} 