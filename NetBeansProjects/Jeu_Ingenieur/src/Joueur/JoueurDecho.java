/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Abstract.Joueur;
import Class.Intervale;
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
    public boolean getCoup() {
        try {
            super.lastCoup = super.intervale.getMilieu();
            super.attempt += 1;
            return true;
        } catch (Exception e) {
            return true;
        }
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
}
