/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zouhairhajji
 */
public class Coup {

    private boolean CoupJoueur, CoupJoueurAdv;
    
    
    Coup(boolean joueur, boolean joueurAdv) {
        this.CoupJoueur = joueur;
        this.CoupJoueurAdv = joueurAdv;
    }

    public boolean getCoupJoueur() {
        return CoupJoueur;
    }

    public boolean getCoupJoueurAdv() {
        return CoupJoueurAdv;
    }

    
    
    
    
    
}
