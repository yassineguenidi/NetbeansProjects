/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschoolgestionpub;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author yassi
 */
public class Livre implements Serializable{
    private static final long serialVersionUID = 1L;
    private static int compteur = chargerCompteurDepuisFichier();
    private String titre;
    private String auteur;
    private String genre ;
    private int annee;
    private long id ;

    public Livre() {
    }

    public Livre(String titre, String auteur, String genre, int annee) {
        compteur ++;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.annee = annee;
        this.id = compteur;
        sauvegarderCompteurDansFichier();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Livre{" + 
                "id=" + id + '}'+
                "titre=" + titre + 
                ", auteur=" + auteur + 
                ", genre=" + genre + 
                ", annee=" + annee +'}';
    }
    
    // Charger le compteur depuis un fichier
    private static int chargerCompteurDepuisFichier() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("compteurLivres.dat"))) {
            return ois.readInt();
        } catch (FileNotFoundException e) {
            //System.out.println("Fichier compteur non trouvé. Initialisation à 0.");
            return 0; // Si le fichier n'existe pas, initialiser à 0
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement du compteur : " + e.getMessage());
            return 0;
        }
    }

    // Sauvegarder le compteur dans un fichier
    private static void sauvegarderCompteurDansFichier() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("compteurLivres.dat"))) {
            oos.writeInt(compteur);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du compteur : " + e.getMessage());
        }
    }

    
}
