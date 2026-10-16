/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricegeneratrice;

/**
 *
 * @author yassi
 */
public class MatriceGeneratrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int[][] matrice1 = {{7, 5, 4}, {4, 10, 9}, {10, 1, 2}};
        int[][] matrice2 = {{1, 7, 8}, {12, 3, 8}, {3, 7, 13}};

        Matrice mat1 = new Matrice(matrice1);
        Matrice mat2 = new Matrice(matrice2);

        Matrice resultat = mat1.produit(mat2);

        System.out.println(resultat);
    }
    
    
}
