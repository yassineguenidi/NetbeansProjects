/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neud;

import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author yassi
 */

    public class Neud {
    private int[][] valeurs;

    public Neud(int[][] valeurs) {
        this.valeurs = valeurs;
    }

    public int[][] getValeurs() {
        return valeurs;
    }

    public Neud produit(Neud m) throws InterruptedException {
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

        return new Neud(resultats);
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
    int t1 [] ;
    int t2 [];  int i, j;
  int res[][];
    public Neud(int t1 [], int t2 [],int res [][],int i,int j) {
        this.t1 = t1;
        this.t2 = t2;
        this.res=res ;
        this.i=i;
        this.j=j;
    }
    
    
    public void run(){
        try{
            int nb=0;
            for(int i=0;i<t1.length;i++)
                nb+=t1[i]*t2[i];
            res[i][j]=nb;
        }
        catch(Exception e){
            printStackTrace(e);
        }
        
        
    }
    
    public int calcul(int a){
        return a;
    }
    */

