/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Class.Intervale;

/**
 *
 * @author zouhairhajji
 */
public class JoueurDecho extends Joueur  {

    public JoueurDecho(String nom, Intervale intervale) {
        super(nom, intervale);
    }

    @Override
    public int getCoup() {
        super.validerEssai();
        return this.intervale.getMilieu();
    }
    
}
