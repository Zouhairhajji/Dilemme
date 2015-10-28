/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Input.Intervalle;

/**
 *
 * @author zouhairhajji
 */
public class JoueurDechotomique extends Joueur{

    
    
    
    
    public JoueurDechotomique(Intervalle intervale) {
        super(intervale);
    }
    public JoueurDechotomique(int borneMin,int borneMax) {
        this(new Intervalle(borneMin, borneMax));
    }
    public JoueurDechotomique(int borneMax) {
        this(new Intervalle(borneMax));
    }
    
    
    
    
    
    
    @Override
    public int getCoup() {
        return intervale.getMilieu();
    }

    @Override
    public void setReponse(int reponse) {
        
    }

    
    
    
    @Override
    public int testSecret(int essai) {
        if(essai > super.intervale.getBorneMax())
            return _PLUS_GRAND_;
        else if (essai < super.intervale.getBorneMin())
            return _PLUS_PETIT_;
        return _EGAUX_;
    }
    
}
