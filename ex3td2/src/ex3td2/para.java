/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3td2;

/**
 *
 * @author yassi
 */
import java.util.concurrent.Semaphore;

public class para {

  private Semaphore redacteur = new Semaphore(1);
  private Semaphore lecteur = new Semaphore(1);
  private int nbLecteurs = 0;

  public void debutLecture() throws InterruptedException {
    lecteur.acquire();
    nbLecteurs++;
    if (nbLecteurs == 1) {
      redacteur.acquire();
    }
    lecteur.release();
  }

  public void finLecture() throws InterruptedException {
    lecteur.acquire();
    nbLecteurs--;
    if (nbLecteurs == 0) {
      redacteur.release();
    }
    lecteur.release();
  }

  public void debutEcriture() throws InterruptedException {
    redacteur.acquire();
  }

  public void finEcriture() {
    redacteur.release();
  }

}
