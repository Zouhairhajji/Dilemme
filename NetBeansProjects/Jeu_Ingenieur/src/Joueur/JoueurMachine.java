/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Abstract.Joueur;
import Class.Intervale;

/**
 *
 * @author zouhairhajji
 */
public class JoueurMachine extends Joueur{

    public JoueurMachine(String nom) {
        super(nom);
    }

    @Override
    public boolean getCoup() {
        try {
            super.lastCoup = intervale.getBorneMin() + (int)(Math.random() * ((intervale.getBorneMax()- intervale.getBorneMin()) + 1));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
