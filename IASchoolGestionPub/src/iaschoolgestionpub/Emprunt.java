/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschoolgestionpub;

import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author yassi
 */

public class Emprunt implements Serializable {
    private static final long serialVersionUID = 1L;
    private Livre livre;
    private Utilisateur utilisateur;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private boolean retourne;

    public Emprunt(Livre livre, Utilisateur utilisateur, LocalDate dateEmprunt, LocalDate dateRetourPrevue) {
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.retourne = false;
    }

    public Livre getLivre() {
        return livre;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public boolean isRetourne() {
        return retourne;
    }

    public void marquerCommeRetourne() {
        this.retourne = true;
    }

    @Override
    public String toString() {
        return "Livre: " + livre.getTitre() +
               ", Utilisateur: " + utilisateur.getNom() +
               ", Date d'emprunt: " + dateEmprunt +
               ", Date de retour prévue: " + dateRetourPrevue +
               ", Retourné: " + (retourne ? "Oui" : "Non");
    }
}
