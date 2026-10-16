/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iaschoolempiregame;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author yassi
 */
public class GameManager {

    Empire e ;
    public GameManager() {
        e = new Empire(100, 50, 20);
        menu();
    }

    public Empire getE() {
        return e;
    }

    public void setE(Empire e) {
        this.e = e;
    }
    
    
    
    public void menu(){
        
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            // Afficher le menu
            System.out.println("\n===== MENU =====");
            System.out.println("Actions disponibles :");
            System.out.println("1. Construire un bâtiment");
            System.out.println("2. Entraîner des soldats");
            System.out.println("3. Attaquer un ennemi");
            System.out.println("4. Passer au tour suivant");
            System.out.println("0. Quitter");
            System.out.print("Entrez votre choix: ");
            
            // Lire le choix de l'utilisateur
            choix = scanner.nextInt();

            // Traiter le choix
            switch (choix) {
                case 1:
                    
                    System.out.println("Vous avez choisi l'option 1.");
                    construireBatiment();
                    break ;
                    
                case 2:
                    System.out.println("Vous avez choisi l'option 2.");
                    entrainerSoldats();
                    break ;
                    
                case 3:
                    System.out.println("Vous avez choisi l'option 3.");
                    attaquerEnnemi() ;
                    break ;
                case 4:
                    System.out.println("Vous avez choisi l'option 4.");
                    passerTourSuivant();
                    break ;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    if(e.getSoldats()<=0 || e.getOr()<=0  && e.getQuantite()<=0){
                        choix=0;
                    }
                    break;
            }
        } while (choix != 0);

        scanner.close();
    }

    private void construireBatiment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. construire une ferme( +10 nourriture par tour coute 20 or");
        System.out.println("2. construire une mine ( +10 or par tour coute 20 nourriture");
        System.out.println("Choix : ");
        int choice = scanner.nextInt();
        if ( choice== 1 && e.getOr() >= 20){
        e.souOr(20);
        e.addQuantite(10);
        System.out.println("Vous avez construit un batiment ! ");
        }
        else if( choice== 2 &&  e.getQuantite() >= 20){
            e.souQuantite(20);
        e.addOr(10);
        System.out.println("Vous avez construit une mine ! ");
        }
        else {System.out.println("Pas assez de ressources pour construire :( ! ");}
        e.afficherEtat();
    }

    private void entrainerSoldats() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("combien de soldats vous allez entrainer (10 or et 5 nourriture pour chacun");
        System.out.print("Entrez votre choix: ");
        int chx = scanner.nextInt();
        
        if (e.getOr() >= chx * 10 && e.getQuantite() >= chx * 5 ){
            e.souOr(chx * 10);
            e.souQuantite(chx * 5);
            System.out.println("Vous avez entrainé vos soldats ! ");
        }
        else {
            System.out.println("Pas assez de ressources pour s'entrainer ! ");
        }
        
        e.afficherEtat();
    }

    private void attaquerEnnemi() {
        Random random = new Random();
        int randomInt = random.nextInt(20)+1;
        if (e.getSoldats()>=randomInt) {
            e.setSoldats(e.getSoldats()-randomInt);
            e.addOr(50);
            System.out.println("Félicitations ! vous avez gagné ce combat ! ");
        }
        else {
            e.setSoldats(0);
            System.out.println("Vous avez perdu le combat ! ");
        }
        
        e.afficherEtat();
    }

    private void passerTourSuivant() {
        Random random = new Random();
        System.out.println("Passage au tour suivant");
        //e.addOr(20);
        //e.addQuantite(100);
        //e.addSoldats(150);
        //e.afficherEtat();
        //System.out.println("Are you ready ! ");
        int event = random.nextInt(3);
        switch(event){
            case 1:
                System.out.println("Une recolte abondane a augmenté votre nourriture !");
                
                    
            case 2:
                System.out.println("Un marchand a offert 20 or !.");
               
                    
            case 3:
                System.out.println("une famine resuit votre nourriture...");
        }
        
    }
    
    
}
