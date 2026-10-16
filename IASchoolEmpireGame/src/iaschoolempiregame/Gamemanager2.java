package iaschoolempiregame;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author yassi
 */
public class Gamemanager2 {

    //EnemyEmpire e1 =new EnemyEmpire("yass", 10);
    private List<EnemyEmpire> enemyEmpires = new ArrayList<>();
    private List<Alliance> alliance = new ArrayList<>();
    private Empire e ;
    
    public Gamemanager2() {
       e = new Empire(100, 50, 20);

        // Ajout d'ennemis
        enemyEmpires.add(new EnemyEmpire("Yass", 10));
        enemyEmpires.add(new EnemyEmpire("Drake", 15));
        enemyEmpires.add(new EnemyEmpire("Zorg", 20));
        
        alliance.add(new Alliance("Yass", "Actif"));
        alliance.add(new Alliance("Drake", "Inactif"));
            
        menu();
    }

    
    public void afficherEmpireEnemy(){
        for (int i = 0; i < enemyEmpires.size(); i++) {
            System.out.println("List de enemy : ");
            System.out.println("nom : " + enemyEmpires.get(i).getNom());
            System.out.println("Nbre de soldats : " + enemyEmpires.get(i).getNbrSoldats());
}
    }
    
    public void afficherAlliance(){
        for (int i = 0; i < alliance.size(); i++) {
            System.out.println("List de Alliance : ");
            System.out.println("nom : " + alliance.get(i).getNomEmpire());
            System.out.println("Nbre de soldats : " + alliance.get(i).getStatut());
}
    }
    
    
    
    public void menu(){
        
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            // Afficher le menu
            System.out.println("\n===== MENU =====");
            afficherEmpireEnemy();
            System.out.println("Actions disponibles :");
            System.out.println("1. Construire un bâtiment");
            System.out.println("2. Entraîner des soldats");
            System.out.println("3. Attaquer un ennemi");
            System.out.println("4. Entraîner des soldats");
            //System.out.println("5. Attaquer un empire ennemi");
            System.out.println("5. rompre une alliance");
            System.out.println("6. Passer une alliance");
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
                //case 4:
                    //System.out.println("Vous avez choisi l'option 5.");
                    //
                   // break;
                case 5:
                    System.out.println("Vous avez choisi l'option 6.");
                    rompre();
                    break;
                case 6:
                    System.out.println("Vous avez choisi l'option 7.");
                    former();
                    break;
                
                    
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
        afficherEmpireEnemy();
        System.out.println("Veuillez choisir un ennemi à attaquer");
        
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        System.out.println("Veuillez choisir un ennemi à attaquer:");
        while (choix < 0 || choix > enemyEmpires.size()) {
            choix = scanner.nextInt();
            if (choix < 0 || choix > enemyEmpires.size()) {
                System.out.println("Veuillez entrer un nombre valide :");
            }
        }
        
        
        if (e.getSoldats()>= enemyEmpires.get(choix).nbrSoldats) {
            e.setSoldats(e.getSoldats()- enemyEmpires.get(choix).nbrSoldats );
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
        e.addOr(20);
        e.addQuantite(100);
        e.addSoldats(150);
        
        e.afficherEtat();
        System.out.println("Are you ready ! ");
    }
    
    private void former(){
        
    }
    private void rompre(){
        
    }
    
}
