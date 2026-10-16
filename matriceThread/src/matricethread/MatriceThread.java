/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricethread;


/**
 *
 * @author yassi
 */
public class MatriceThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
      int[][] matrice1 = {{1, 2}, {3, 4}};
        int[][] matrice2 = {{5, 6}, {7, 8}};

        Matrice m1 = new Matrice(matrice1);
        Matrice m2 = new Matrice(matrice2);

        Matrice resultat = m1.produit(m2);

        System.out.println(resultat);
    }
    
}
