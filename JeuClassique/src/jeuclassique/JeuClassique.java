/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuclassique;

/**
 *
 * @author yassi
 */
public class JeuClassique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Début de la partie
    Puissance4 jeu = new Puissance4();
    System.out.println("Bienvenue à Puissance 4 !");
    System.out.println("Le joueur 1 joue avec 'X' et le joueur 2 joue avec 'O'.");

    // Affichage initial de la grille
    jeu. getGrille().afficherPlateaux();

    while (true) {
        // 1. Le joueur commence chaque tour par placer un jeton
        System.out.println("Tour du joueur " + (jeu.getJoueurActuel().getId() + 1) +
                " (" + jeu.getJoueurActuel().getJetonJoueur() + ")");
        System.out.print("Choisissez une colonne (0-6) : ");

        // Lecture de la colonne choisie
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int colonne = scanner.nextInt();

        // 2. On vérifie si le jeton a été bien placé
        if (!jeu.getJoueurActuel().placerJeton(colonne, jeu.getGrille())) {
            // 2.1. Si non, on affiche la grille
            System.out.println("Colonne invalide ou pleine. Essayez une autre.");
            jeu.getGrille().afficherPlateaux();
            continue;
        }

        // 2.2. Si oui
        // 2.2.1. On affiche la grille
        jeu.getGrille().afficherPlateaux();

        // 2.2.1. On vérifie si le jeton permet de gagner
        if (jeu.gagner()) {
            // 2.2.1.1. Si oui, le joueur actuel est le gagnant
            System.out.println("Félicitations ! Le joueur " +
                    (jeu.getJoueurActuel().getId() + 1) + " a gagné !");
            break;
        }

        // 2.2.2. On vérifie s'il y a une égalité
        if (jeu.estEgalite()) {
            // 2.2.2.1. Si oui, la partie est à égalité
            System.out.println("La partie est à égalité !");
            break;
        }

        // 2.2.3. On incrémente le compteur de tour
        jeu.incrementTourActuel();

        // 2.2.4. On change le joueur actuel
        System.out.println("Au tour du joueur suivant.");
    }

    System.out.println("Merci d'avoir joué à Puissance 4 !");
}
}
