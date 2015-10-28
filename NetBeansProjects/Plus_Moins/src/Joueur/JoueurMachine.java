/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Class.Intervale;
import Enum.Plus_ou_Moins;

/**
 *
 * @author zouhairhajji
 */
public class JoueurMachine extends Joueur{

    public JoueurMachine(String nom, Intervale intervale) {
        super(nom, intervale);
    }

    

    @Override
    public int getCoup() {
        super.validerEssai();
        return this.intervale.getBorneMin() + (int)(Math.random() * ((this.intervale.getBorneMax() - this.intervale.getBorneMin()) + 1));
    }
    
}
