/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2td1para;

import java.util.Arrays;

/**
 *
 * @author yassi
 */
public class Ex2td1para {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
         int[][] valeursA = {{1, 2}, {3, 4}};
    int[][] valeursB = {{5, 6}, {7, 8}};

    Matrice A = new Matrice(valeursA);
    Matrice B = new Matrice(valeursB);

    Matrice C = A.produit(B);

    System.out.println("A : " + Arrays.deepToString(A.getValeurs()));
    System.out.println("B : " + Arrays.deepToString(B.getValeurs()));
    System.out.println("C : " + Arrays.deepToString(C.getValeurs()));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
     /* //  int mat [][] =new int[2][2];
     int   mat[][]={{1,2},{1,2}};
        int res[][]=new int[2][2];
        for(int i =0;i<2;i++)
     
           
        {  Thread thread = new Thread(() -> {
                    double nb = 0;
                    for (int k = 0; k < 2; k++) {
                        nb+=mat[i][k]*mat[k][i]
                    }
                    res[i][j]=nb;
                });
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
        
    }
          
           

        }
    }
    */
}
