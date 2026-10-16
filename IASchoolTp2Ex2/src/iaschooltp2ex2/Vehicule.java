/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2ex2;

/**
 *
 * @author yassi
 */
public class Vehicule { 
    public static int nombre =0;
    
    String marque ;
    final int puissanceFiscale = 250 ;
    int vitesseMax ;
    int vitesseCour;

    public Vehicule(String marque, int vitesseMax, int vitesseCour) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
        this.vitesseCour = vitesseCour; 
        nombre++;
    }

    public Vehicule() {
        nombre++;
    }

    public static int getNombre() {
        return nombre;
    }

    public static void setNombre(int nombre) {
        Vehicule.nombre = nombre;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseCour() {
        return vitesseCour;
    }

    public void setVitesseCour(int vitesseCour) {
        this.vitesseCour = vitesseCour;
    }
    
    
    
    public void demarrer(int v){
        this.vitesseCour =v ;
    }
    
    public void eteindre(){
        this.vitesseCour =0 ;
    }
    
    public void afficher(){
        System.out.println("Marque " + getMarque()+"\n" );
        System.out.println("Puissance Fiscale " + puissanceFiscale +"\n" );
        System.out.println("Vitesse max " + getVitesseMax()+"\n" );
        System.out.println("Vitesse courante " + getVitesseCour() +"\n" );
    }
    
    
    
    
    
    
    
    
    
}
