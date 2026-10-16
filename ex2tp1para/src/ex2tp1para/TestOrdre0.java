/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2tp1para;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yassi
 */
public class TestOrdre0 implements Runnable {
	int pas_de_comptage = 0;
	String nom = null;
	int maxv = 0;

	public TestOrdre0(String nom, int increment, int max) {
		this.pas_de_comptage = increment;
		this.nom = nom;
		this.maxv = max;
	}
/* Test_ordre0 compte de 0 a maxv moins 1 et affiche son comptage à l´ecran*/
	public void run() {
		System.out.format("Ici le  thread %s, je debute!\n", nom);
		int myValue=0;
		for (int i = 0; i < maxv; i++) {
			waithere(200);
                    try {
                        sleep(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestOrdre0.class.getName()).log(Level.SEVERE, null, ex);
                    }
			System.out.format("[%s] dit  %d\n", nom, myValue);
			myValue += pas_de_comptage;
		}
	}

	

	public static void waithere(int num) {
		try {
			int delay = (int) (Math.random() * num);
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
