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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yassi
 */
public class GestionLivres {

    private static List<Livre> livres  = new ArrayList<>();; 
    
    public GestionLivres() {
        
        this.livres = chargerLivresDepuisFichier() ;
       
    }
    
    public void ajouterLivre(Livre l){
        livres.add(l);
    }
    
    public void ajouterLivre(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Donner un nom du livre :");
        String nom = scanner.nextLine();
        
        System.out.println("Donner l'auteur du livre :");
        String auteur = scanner.nextLine();
       
        System.out.println("Donner le genre du livre :");
        String genre = scanner.nextLine();
        
        System.out.println("Donner l'année de publication :");
        int annee = scanner.nextInt();
        
        
        
        

        Livre livre = new Livre(nom, auteur, genre, annee);
        
        livres.add(livre);
        
        System.out.println("Livre ajouté : " + livre);
        
    }
    
    public void mettreAJourLivre(String titre) {
    Scanner scanner = new Scanner(System.in);

    for (Livre livre : livres) {
        if (livre.getTitre().equals(titre)) {
            System.out.println("Quel attribut voulez-vous mettre à jour ?");
            System.out.println("1. Titre");
            System.out.println("2. Auteur");
            System.out.println("3. Genre");
            System.out.println("4. Année");

            int choix = scanner.nextInt();  
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nouveau titre :");
                    String nouveauTitre = scanner.nextLine();
                    livre.setTitre(nouveauTitre);
                    break;
                case 2:
                    System.out.println("Entrez le nouveau auteur :");
                    String nouvelAuteur = scanner.nextLine();
                    livre.setAuteur(nouvelAuteur);
                    break;
                case 3:
                    System.out.println("Entrez le nouveau genre :");
                    String nouveauGenre = scanner.nextLine();
                    livre.setGenre(nouveauGenre);
                    break;
                case 4:
                    System.out.println("Entrez la nouvelle année :");
                    int nouvelleAnnee = scanner.nextInt();
                    livre.setAnnee(nouvelleAnnee);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
            
            System.out.println("Livre mis à jour : " + livre);
            return;
        }
    }
    System.out.println("Livre avec le titre " + titre + " non trouvé.");
}
    
    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("Aucun livre à afficher.");
        } else {
            System.out.println("Liste des livres :");
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        }
    }
    
    public void rechercherLivreParTitre(String titreRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de livres avec le titre : " + titreRecherche);

        for (Livre livre : livres) {
            if (livre.getTitre().toLowerCase().equalsIgnoreCase(titreRecherche.toLowerCase())) {
                System.out.println(livre);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun livre trouvé avec le titre : " + titreRecherche);
        }
    }
    
    public Livre rechercherLivreParTitre2(String titreRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de livres avec le titre : " + titreRecherche);

        for (Livre livre : livres) {
            if (livre.getTitre().toLowerCase().equalsIgnoreCase(titreRecherche.toLowerCase())) {
                System.out.println(livre);
                return livre ;
                
                //trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun livre trouvé avec le titre : " + titreRecherche);
            return null ;
        }
        return null ;
    }
    
    public void rechercherLivreParAuteur(String auteurRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de livres avec l'auteur : " + auteurRecherche);

        for (Livre livre : livres) {
            if (livre.getAuteur().toLowerCase().equalsIgnoreCase(auteurRecherche.toLowerCase())) {
                System.out.println(livre);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun livre trouvé avec l'auteur : " + auteurRecherche);
        }
    }

    public void supprimerLivre(String titre) {
    boolean livreSupprime = livres.removeIf(livre -> livre.getTitre().equals(titre));
    
    if (livreSupprime) {
        System.out.println("Le livre avec le titre \"" + titre + "\" a été supprimé.");
    } else {
        System.out.println("Aucun livre trouvé avec le titre \"" + titre + "\".");
    }
}
    
    public void sauvegarderLivresDansFichier() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livres.dat"))) {
            oos.writeObject(livres);
            System.out.println("Données sauvegardées avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des livres : " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    private List<Livre> chargerLivresDepuisFichier() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("livres.dat"))) {
            return (List<Livre>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier de livres trouvé. Une nouvelle liste sera créée.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement des livres : " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
