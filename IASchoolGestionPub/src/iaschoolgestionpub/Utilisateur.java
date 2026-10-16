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
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int compteur = chargerCompteurDepuisFichier();
    private String nom ;
    private String prenom ;
    private String email ;
    private String numTel ;
    private long id ;
    

    public Utilisateur(String nom, String prenom, String email, String numTel) {
        compteur++ ;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numTel = numTel;
        this.id = compteur;
        sauvegarderCompteurDansFichier();
    }

    public Utilisateur() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + 
                "nom=" + nom + 
                ", prenom=" + prenom + 
                ", email=" + email + 
                ", numTel=" + numTel + 
                ", id=" + id + '}';
    }
    
    
    // Charger le compteur depuis un fichier
    private static int chargerCompteurDepuisFichier() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("compteurUsers.dat"))) {
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("compteurUsers.dat"))) {
            oos.writeInt(compteur);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du compteur : " + e.getMessage());
        }
    }
    
    
}
