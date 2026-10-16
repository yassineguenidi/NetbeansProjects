/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricethread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author yassi
 */


public class Matrice {
    private int[][] matrice;

    public Matrice(int[][] matrice) {
        this.matrice = matrice;
    }

    public Matrice produit(Matrice autre) throws InterruptedException {
        int[][] autreMatrice = autre.matrice;
        int n = matrice.length;
        int[][] resultat = new int[n][n];

        Thread[] threads = new Thread[n * n];
        int index = 0;

        // Créer un thread pour chaque élément du résultat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                final int iFinal = i;
                final int jFinal = j;
                threads[index++] = new Thread(() -> {
                    int sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += matrice[iFinal][k] * autreMatrice[k][jFinal];
                    }
                    resultat[iFinal][jFinal] = sum;
                });
            }
        }

        // Lancer tous les threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Attendre que tous les threads se terminent
        for (Thread thread : threads) {
            thread.join();
        }

        return new Matrice(resultat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrice) {
            for (int i : row) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
