/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Abstract.Joueur;
import Enum.Reponse;

/**
 *
 * @author zouhairhajji
 */
public class JoueurDecho extends Joueur{

    public JoueurDecho(String nom) {
        super(nom);
    }

    @Override
    public int getCoup() {
        super.lastCoup =  this.intervale.getMilieu();
        return super.lastCoup;
    }

    @Override
    public Reponse juger(int valeur) {
        super.lastReponse=  super.generateResultOfCoup(super.valeurADeviner, valeur);
        return super.lastReponse;
    }

    @Override
    public boolean definirValeurADevnier(Intervale intervale) {
        try {
            this.valeurADeviner = (100 + (int)(Math.random() * ((990) + 1)));
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
