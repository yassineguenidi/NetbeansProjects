/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2td1para;

/**
 *
 * @author yassi
 */

    public class Matrice {
    private int[][] valeurs;

    /**
     *
     * @param valeurs
     */
    public Matrice(int[][] valeurs) {
        this.valeurs = valeurs;
    }

    public int[][] getValeurs() {
        return valeurs;
    }

    public Matrice produit(Matrice m) throws InterruptedException {
        int[][] resultats = new int[2][2];
        Thread[] threads = new Thread[4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                final int ligne = i;
                final int colonne = j;
                Thread thread = new Thread(() -> {
                    int somme = 0;
                    for (int k = 0; k < 2; k++) {
                        somme += valeurs[ligne][k] * m.getValeurs()[k][colonne];
                    }
                    resultats[ligne][colonne] = somme;
                });
                threads[i * 2 + j] = thread;
                thread.start();
            }
        }

        for (Thread thread : threads) {
            thread.join();
        }

        return new Matrice(resultats);
    }
}



