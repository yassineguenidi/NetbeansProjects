/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschoolgestionpub;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author yassi
 */
public class GestionPubliotheque {
    
    GestionLivres gestionLivres ;
    GestionUtilisateurs gestionUtilisateurs ;
    GestionEmprunts gestionEmprunts ;
    
    
    public GestionPubliotheque() {
        gestionLivres = new GestionLivres() ;
        gestionUtilisateurs = new GestionUtilisateurs() ;
        gestionEmprunts = new GestionEmprunts() ;
        
        menu();
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Affichage du menu
            System.out.println("Menu Principal :");
            System.out.println("1. Gestion des livres");
            System.out.println("2. Gestion des utilisateurs");
            System.out.println("3. Gestion des emprunts");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la ligne après le choix de l'utilisateur

            switch (choix) {
                case 1:
                    menuLivres();
                    break;
                case 2:
                    menuUtilisateurs();
                    break;
                case 3:
                    menuEmprunts();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;  // Quitter le programme
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }

    }
    
    public void menuLivres(){
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu de gestion des livres :");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Mettre à jour un livre");
            System.out.println("3. Supprimer un livre");
            System.out.println("4. Afficher tous les livres");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();
            
            switch (choix) {
                case 1:
                    gestionLivres.ajouterLivre();
                    gestionLivres.sauvegarderLivresDansFichier();
                    break;
                case 2:
                    System.out.println("donner un titre du livre à mettre à jour");
                    Scanner sc = new Scanner(System.in);
                    String titre = sc.nextLine();
                    gestionLivres.mettreAJourLivre(titre);
                    gestionLivres.sauvegarderLivresDansFichier();
                    break;
                case 3:
                    System.out.println("donner un titre du livre à supprimer");
                    sc = new Scanner(System.in);
                    titre = sc.nextLine();
                    gestionLivres.supprimerLivre(titre);
                    gestionLivres.sauvegarderLivresDansFichier();
                    break;
                case 4:
                    gestionLivres.afficherLivres();
                    gestionLivres.sauvegarderLivresDansFichier();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    gestionLivres.sauvegarderLivresDansFichier();
                    return;  // Quitter le menu livres
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    gestionLivres.sauvegarderLivresDansFichier();
            }
        }
    }
    
    public void menuUtilisateurs(){
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu de gestion des utilisateurs :");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Mettre à jour un utilisateur");
            System.out.println("3. Supprimer un utilisateur");
            System.out.println("4. Afficher tous les utilisateurs");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();
            
            switch (choix) {
                case 1:
                    gestionUtilisateurs.ajouterUtilisateur();
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
                    break;
                case 2:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("donner le nom d'utilisateur");
                    String nom = sc.nextLine();
                    System.out.println("donner le prenom d'utilisateur");
                    String prenom = sc.nextLine();
                    gestionUtilisateurs.mettreAJourUtilisateur(nom, prenom);
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
                    break;
                    
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("donner le nom d'utilisateur");
                    nom = sc.nextLine();
                    System.out.println("donner le prenom d'utilisateur");
                    prenom = sc.nextLine();
                    gestionUtilisateurs.supprimerUtilisateur(nom, prenom);
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
                    break;
                case 4:
                    gestionUtilisateurs.afficherUtilisateurs();
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
                    break;
                case 5:
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
                    System.out.println("Retour au menu principal...");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    gestionUtilisateurs.sauvegarderUtilisateursDansFichier();
            }
        }
}
    
    public void menuEmprunts(){
        Scanner scanner = new Scanner(System.in);
        GestionEmprunts gestionEmprunts = new GestionEmprunts();
        
        while (true) {
            System.out.println("Menu de gestion des emprunts :");
            System.out.println("1. Enregistrer un emprunt");
            System.out.println("2. Afficher les emprunts en cours");
            System.out.println("3. Marquer un emprunt comme retourné");
            System.out.println("4. Sauvegarder les emprunts dans un fichier");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consommer la ligne après l'entrée de l'option
            
            switch (choix) {
                case 1:
                    System.out.println("donner le titre du livre à emprunter");
                    
                    Scanner sc = new Scanner(System.in);
                    String titre = sc.nextLine();
                    Livre livre = gestionLivres.rechercherLivreParTitre2(titre);
                    if (livre == null){
                        System.out.println("Ce livre n'existe pas");
                        break ;
                    }
                    else{
                        System.out.println("donner le nom de l'utilisateur");
                    
                        sc = new Scanner(System.in);
                        String nom = sc.nextLine();
                    
                        System.out.println("donner le prenom de l'utilisateur");
                    
                        sc = new Scanner(System.in);
                        String prenom = sc.nextLine();
                    
                        Utilisateur utilisateur = gestionUtilisateurs.rechercherUtilisateur(nom, prenom);
                        if (utilisateur == null){
                            break ;
                        }
                        else{
                            
                            System.out.println("donner le nombre du jours");
                    
                            sc = new Scanner(System.in);
                            int nbr = sc.nextInt();
                            gestionEmprunts.enregistrerEmprunt(livre, utilisateur, LocalDate.now().plusDays(nbr));
                            gestionEmprunts.sauvegarderEmpruntsDansFichier();
                            break;
                        }
                    }
                    
                    
                    
                case 2:
                    gestionEmprunts.afficherEmpruntsEnCours();
                    gestionEmprunts.sauvegarderEmpruntsDansFichier();
                    break;
                case 3:
                    
                    System.out.println("donner le titre du livre à retourner");
                    
                    sc = new Scanner(System.in);
                    titre = sc.nextLine();
                    
                    livre = gestionLivres.rechercherLivreParTitre2(titre);
                    gestionEmprunts.marquerCommeRetourne(livre); 
                    gestionEmprunts.sauvegarderEmpruntsDansFichier();
                    break;
                case 4:
                    gestionEmprunts.sauvegarderEmpruntsDansFichier();
                    break;
                case 5:
                    gestionEmprunts.sauvegarderEmpruntsDansFichier();
                    System.out.println("Retour au menu principal...");
                    return;
                default:
                    gestionEmprunts.sauvegarderEmpruntsDansFichier();
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }   
    }
      
}
