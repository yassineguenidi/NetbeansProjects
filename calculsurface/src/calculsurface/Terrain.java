/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculsurface;

/**
 *
 * @author yassi
 */
class Terrain {

    // Tableau contenant les formes de ce terrain
    private Forme[] liste;
    // Cette variable indique combien il y a d'éléments dans le tableau
    private int nbFormes = 0;

    public Terrain (Forme[] list) {
        list = new Forme[10];
    }

    Terrain(Rectangle r1, Rectangle r2, Rectangle r3, Cercle c1, Cercle c2, Cercle c3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * Ajoute une nouvelle Forme à la liste.
     * @return true si la Forme a pu être ajoutée, false si le terrain est plein
     */
    public boolean ajouterForme(Forme forme) {
        if (nbFormes < liste.length) {
            liste[nbFormes] = forme;
            nbFormes++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcule la surface totale de toutes les formes
     * @return La surface totale
     */
    public double calculerSurfaceTotale () {
        double somme = 0.0;
        for (int i = 0; i < nbFormes; i++) {
            somme += liste[i].calculerSurface();
        }
        return somme;
    }

    public void afficherSurfaceTotale () {
        double surfaceTotale = calculerSurfaceTotale();
        System.out.println("La surface totale est " + surfaceTotale);
    }
}
