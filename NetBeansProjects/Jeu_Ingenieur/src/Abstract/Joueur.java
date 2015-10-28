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
        this.intervale  = new Intervale();
    }


    @Override
    public void setResponse(Reponse reponse) {
        switch(reponse){
            case _PLUS_GRAND_:
                this.intervale.setBorneMax(this.lastCoup-1);
                break;
            case _PLUS_PETIT_:
                this.intervale.setBorneMin(this.lastCoup+1);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean definirValeurADevnier(Intervale intervale) {
        try {
            this.valeurADeviner = intervale.getBorneMin() + (int)(Math.random() * ((intervale.getBorneMax()- intervale.getBorneMin()) + 1));
            return true;
        } catch (Exception e) {
            return false;
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
    
    
    @Override
    public Reponse juger(int valeur) {
        this.lastReponse=  this.generateResultOfCoup(this.valeurADeviner, valeur);
        return this.lastReponse;
    }

    @Override
    public String toString() {
        return "Joueur{" + "Nom = "+super.nom+", intervale=" + intervale + ", valeurADeviner=" + valeurADeviner + ", lastCoup=" + lastCoup + ", attempt=" + attempt + ", lastReponse=" + lastReponse + ", score=" + score + '}';
    }
    
    
    
    
}
