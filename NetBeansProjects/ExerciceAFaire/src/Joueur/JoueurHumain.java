/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Input.Input;
import Input.Intervalle;


/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain extends Joueur{


    

    public JoueurHumain(Intervalle intervale) {
        super(intervale);
    }
    public JoueurHumain(int borneMin,int borneMax) {
        super(new Intervalle(borneMin, borneMax));
    }
    public JoueurHumain(int borneMax) {
        super(new Intervalle(borneMax));
    }
    
    
    @Override
    public int getCoup() {
        return Input.readInt();
    }

    @Override
    public void setReponse(int reponse) {
        System.out.print("Vous avez choisi la valeur " + reponse);
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
