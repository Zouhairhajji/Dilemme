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
public abstract class Joueur {
    
    protected Intervalle intervale;
    
    public static final int _PLUS_GRAND_ = 1;
    public static final int _PLUS_PETIT_ = 2;
    public static final int _EGAUX_ = 0;
    
    public Joueur(Intervalle intervale) {
        this.intervale = intervale;
    }
    public Joueur(int borneMin,int borneMax) {
        this(new Intervalle(borneMin, borneMax));
    }
    public Joueur(int borneMax) {
        this(new Intervalle(borneMax));
    }
    
    
    
    
    
    
    public abstract int getCoup();
    
    public abstract int testSecret(int essai);
    
    public void setReponse(int reponse) {
       System.out.print("Vous avez choisi la valeur " + reponse);
    }
    
}
