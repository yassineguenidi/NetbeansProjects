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
public class Film {
    public String  titre ;
    private String genre ;
    private String id ;

    public Film(String titre, String genre, String id) {
        this.titre = titre;
        this.genre = genre;
        this.id = id;
    }
    
    public void afficheFIlm(){
        System.out.println(this.titre+" "+this.genre+" "+this.id);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
