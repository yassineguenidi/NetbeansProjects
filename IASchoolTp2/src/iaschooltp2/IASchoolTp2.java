/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2;

import static iaschooltp2.Date.compareDatesStat;
import java.util.Scanner;

/**
 *
 * @author yassi
 */
public class IASchoolTp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir l'entier j : ");
        int j = scanner.nextInt();

        System.out.print("Veuillez saisir l'entier m : ");
        int m = scanner.nextInt();
        
        System.out.print("Veuillez saisir l'entier a : ");
        int a = scanner.nextInt();
        
        Date d = new Date(j,m,a);
        
        d.afficher();
        
        System.out.print("Veuillez saisir l'entier j : ");
        int j2 = scanner.nextInt();

        System.out.print("Veuillez saisir l'entier m : ");
        int m2 = scanner.nextInt();
        
        System.out.print("Veuillez saisir l'entier a : ");
        int a2 = scanner.nextInt();
        
        Date d2 = new Date(j2,m2,a2);
        
        System.out.println("methode 1");
        System.out.println(d.compareDates(d2));
        
        
        System.out.println("methode 2");
        System.out.println(compareDatesStat(d, d2));
    }
    
}
