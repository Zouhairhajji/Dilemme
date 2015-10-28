/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Abstract.Personnage;
import Enum.Reponse;

/**
 *
 * @author zouhairhajji
 */
public class Arbitre extends Personnage implements Interface.Arbitre{

    private ArbitreSpeaker speaker;
    
    public Arbitre(String nom) {
        super(nom);
        speaker = new ArbitreSpeaker();
    }

    @Override
    public boolean estTricher(int valeurAtrouver, int valeurDeviner, Reponse reponse) {
        Reponse reponseData = this.generateResultOfCoup(valeurAtrouver, valeurDeviner);
        return (reponseData != reponse) ;
    }

    public ArbitreSpeaker getSpeaker() {
        return speaker;
    }
    
    public Intervale generateIntervale(int lvl){
        int valeurParLvl = 50;
        int nbrNiveau = (lvl <= 0)  ? 1  : lvl ; 
        int nbrMin = (int)(Math.random() * ((valeurParLvl) + 1));
        int nbrMax = (nbrMin + (int)(Math.random() * ((50 * lvl - nbrMin) + 1)))*nbrNiveau;
        Intervale intervale =  new Intervale();
        intervale.setBorneMax(nbrMax);
        intervale.setBorneMin(nbrMin);
        return intervale;
    }
    public Intervale generateIntervale(){
        return this.generateIntervale(3);
    }
    
    
    
    
    
}
