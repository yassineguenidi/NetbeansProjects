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
public class GestionUtilisateurs {
    public static List<Utilisateur> utilisateurs = new ArrayList<>();

    public GestionUtilisateurs() {
        this.utilisateurs = chargerUtilisateursDepuisFichier() ;
    }
    
    
    
    public void ajouterUtilisateur(Utilisateur u){
        utilisateurs.add(u);
    }    
    
    public void ajouterUtilisateur(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Donner un nom d'utilisateur :");
        String nom = scanner.nextLine();
        
        System.out.println("Donner un prenom d'utilisateur :");
        String prenom = scanner.nextLine();
       
        System.out.println("Donner un email pour l'utilisateur :");
        String email = scanner.nextLine();
        
        System.out.println("Donner un numTel pour d'utilisateur :");
        String  numTel = scanner.nextLine();

        Utilisateur utilisateur = new Utilisateur(nom, prenom, email, numTel);
        
        utilisateurs.add(utilisateur);
        
        System.out.println("Utilisateur ajouté : " + utilisateur);
    }
    
    public void mettreAJourUtilisateur(String nom, String prenom) {
    Scanner scanner = new Scanner(System.in);

    for (Utilisateur utilisateur : utilisateurs) {
        if (utilisateur.getNom().equals(nom) && utilisateur.getNom().equals(prenom)) {
            System.out.println("Quel attribut voulez-vous mettre à jour ?");
            System.out.println("1. Nom");
            System.out.println("2. Prenom");
            System.out.println("3. Email");
            System.out.println("4. NumTelephone");

            int choix = scanner.nextInt();  
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nouveau nom :");
                    String nouveauNom = scanner.nextLine();
                    utilisateur.setNom(nouveauNom);
                    break;
                case 2:
                    System.out.println("Entrez le nouveau prenom :");
                    String nouveauPrenom = scanner.nextLine();
                    utilisateur.setPrenom(nouveauPrenom);
                    break;
                case 3:
                    System.out.println("Entrez le nouveau email :");
                    String nouveauEmail = scanner.nextLine();
                    utilisateur.setEmail(nouveauEmail);
                    break;
                case 4:
                    System.out.println("Entrez la nouvelle numTel :");
                    String nouveauTel = scanner.nextLine();
                    utilisateur.setNumTel(nouveauTel);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
            
            System.out.println("Utilisateur mis à jour : " + utilisateur);
            return;
        }
    }
    System.out.println("Utilisateur avec le nom " + nom + " et prenom "  + prenom + " non trouvé.");
}
    
    public void rechercherUtilisateurParNom(String NomRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de utilisateurs avec le nom contenant : " + NomRecherche);

        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getNom().toLowerCase().contains(NomRecherche.toLowerCase())) {
                System.out.println(utilisateur);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun utilisateur trouvé avec le nom contenant : " + NomRecherche);
        }
    }
    
    public void rechercherUtilisateurParPrenom(String PrenomRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de utilisateurs avec le prenom contenant : " + PrenomRecherche);

        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getPrenom().toLowerCase().contains(PrenomRecherche.toLowerCase())) {
                System.out.println(utilisateur);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun utilisateur trouvé avec le prenom contenant : " + PrenomRecherche);
        }
    }
    
    public Utilisateur rechercherUtilisateur(String PrenomRecherche, String NomRecherche) {
        boolean trouve = false;
        System.out.println("Recherche de utilisateurs avec le prenom contenant : " + PrenomRecherche);

        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getPrenom().toLowerCase().equalsIgnoreCase(PrenomRecherche.toLowerCase()) && 
                    utilisateur.getNom().toLowerCase().equalsIgnoreCase(NomRecherche.toLowerCase())) {
                trouve = true;
                return(new Utilisateur(utilisateur.getNom(), utilisateur.getPrenom(), utilisateur.getEmail(), utilisateur.getNumTel()));
                //System.out.println(utilisateur);
                //
            }
            else return null ;
        }

        if (!trouve) {
            System.out.println("Aucun utilisateur trouvé avec le prenom contenant : " + PrenomRecherche);
            return null ;      
        }
        return null ;
    }
    
    public void afficherUtilisateurs() {
        if (utilisateurs.isEmpty()) {
            System.out.println("Aucun utilisateur à afficher.");
        } else {
            System.out.println("Liste des utilisateurs :");
            for (Utilisateur utilisateur : utilisateurs) {
                System.out.println(utilisateur); 
            }
        }
    }
    
    public void supprimerUtilisateur(String nom, String prenom) {
        
        boolean utilisateurSupprime = utilisateurs.removeIf(utilisateur -> 
            utilisateur.getNom().equals(nom) && utilisateur.getPrenom().equals(prenom));
    
        if (utilisateurSupprime) {
            System.out.println("L'utilisateur \"" + prenom + " " + nom + "\" a été supprimé.");
        } else {
            System.out.println("Aucun utilisateur trouvé avec le nom \"" + nom + "\" et le prénom \"" + prenom + "\".");
        }
    }
    
    
    public void sauvegarderUtilisateursDansFichier() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("utilisateurs.dat"))) {
            oos.writeObject(utilisateurs);
            System.out.println("Données sauvegardées avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde des utilisateurs : " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    private List<Utilisateur> chargerUtilisateursDepuisFichier() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("utilisateurs.dat"))) {
            return (List<Utilisateur>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier d'utilisateur trouvé. Une nouvelle liste sera créée.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement des utilisateurs : " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
