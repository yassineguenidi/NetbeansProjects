/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author yassi
 */
import java.util.List;
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      employeProduction ep = new employeProduction("yassine", "guenidi", 21);
      System.out.println("ton salaire est :"+ep.calculSalaire());
      
      employeProductionRisque epr = new employeProductionRisque("yassine", "guenidi", 21);
      System.out.println("ton salaire apres le prime est :"+epr.calculSalaire());
      
      employeProductionRisque epr2 = new employeProductionRisque("amin", "amin", 21);
      System.out.println("ton salaire apres le prime est :"+epr2.calculSalaire());
      
      Personnel p= new Personnel();
   
      p.ajouterEmploye(new employeProductionRisque("yassine", "guenidi", 21));
     /* p.ajouterEmploye(epr);
      p.ajouterEmploye(epr2);*/
        System.out.println("bonjour");
}
}