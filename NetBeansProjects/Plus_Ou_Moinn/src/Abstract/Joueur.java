/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import Class.Intervale;
import Class.Score;
import Enum.Reponse;

/**
 *
 * @author zouhairhajji
 */
public abstract class Joueur extends Personnage implements Interface.Joueur{

    protected Intervale intervale;
    protected int valeurADeviner,lastCoup,attempt;
    protected Reponse lastReponse;
    protected Score score;
    
    public Joueur(String nom) {
        super(nom);
        this.score = new Score();
        this.initiateData();
    }
    
    
    public void initiateData(){
        this.attempt = 0;
        this.intervale = new Intervale();
    }

    
    
    

    

    @Override
    public void setResponse(Reponse reponse) {
        switch(reponse){
            case _PLUS_GRAND_:
                this.intervale.setBorneMax(this.lastCoup);
                break;
            case _PLUS_PETIT_:
                this.intervale.setBorneMin(this.lastCoup);
                break;
            default:
                break;
        }
    }

    public Intervale getIntervale() {
        return intervale;
    }
   

    public String getName() {
        return nom;
    }

    public int getLastCoup() {
        return lastCoup;
    }
    public Reponse getLastReponse() {
        return lastReponse;
    }

    public Score getScore() {
        return score;
    }

    public int getValeurADeviner() {
        return valeurADeviner;
    }

    public void setIntervale(Intervale intervale) {
        this.intervale = intervale;
    }
    
    
    
    
    
}
