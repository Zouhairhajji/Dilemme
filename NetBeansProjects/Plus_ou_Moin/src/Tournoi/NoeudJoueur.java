/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tournoi;

import Joueur.Joueur;

/**
 *
 * @author zouhairhajji
 */
public class NoeudJoueur {
    private int idParent;
    private int idJoueur;
    private NoeudJoueur joueurDroit,joueurGauche;

    public NoeudJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
        this.idParent = -1;
        this.joueurDroit = null;
        this.joueurGauche = null;
    }
    public NoeudJoueur() {
        this.idJoueur = -1;
        this.idParent = -1;
        this.joueurDroit = null;
        this.joueurGauche = null;
    }
    
    
    
    public void setParent(int idParent){
        this.idParent = idParent;
    }
    public void setFd(NoeudJoueur idFd){
        this.joueurDroit = idFd;
    }
    public void setFg(NoeudJoueur idFg){
        this.joueurGauche = idFg;
    }

    public NoeudJoueur getFd() {
        return joueurDroit;
    }
    public NoeudJoueur getFg() {
        return joueurGauche;
    }
    
    
    
    
}
