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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class GestionEmprunts {
    private List<Emprunt> emprunts;

    public GestionEmprunts() {
        this.emprunts = chargerEmpruntsDepuisFichier();
    }
    
    public void enregistrerEmprunt(Livre livre, Utilisateur utilisateur, LocalDate dateRetourPrevue) {
        if(livre != null && utilisateur != null ){
            Emprunt nouvelEmprunt = new Emprunt(livre, utilisateur, LocalDate.now(), dateRetourPrevue);
            emprunts.add(nouvelEmprunt);
            System.out.println("Emprunt enregistré avec succès !");
        }
        else {
            System.out.println("Emprunt non enregistré Veuillez vérifier du nouveau !");
        }
    }
    
    public void afficherEmpruntsEnCours() {
        System.out.println("Emprunts en cours :");
        for (Emprunt emprunt : emprunts) {
            if (!emprunt.isRetourne()) {
                System.out.println(emprunt);
            }
        }
    }
    
    public void marquerCommeRetourne(Livre livre) {
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getLivre().equals(livre) && !emprunt.isRetourne()) {
                emprunt.marquerCommeRetourne();
                System.out.println("Emprunt marqué comme retourné.");
                return;
            }
        }
        System.out.println("Aucun emprunt en cours trouvé pour ce livre.");
    }
    
    
    public void sauvegarderEmpruntsDansFichier() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emprunts.dat"))) {
            oos.writeObject(emprunts);
            System.out.println("Données sauvegardées avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des emprunts : " + e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    private List<Emprunt> chargerEmpruntsDepuisFichier() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emprunts.dat"))) {
            return (List<Emprunt>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier d'emprunts trouvé. Une nouvelle liste sera créée.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement des emprunts : " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
