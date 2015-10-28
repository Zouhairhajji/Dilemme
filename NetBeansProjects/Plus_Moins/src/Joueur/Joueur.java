/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Class.Intervale;
import Class.Personnage;
import Class.Score;
import Enum.Plus_ou_Moins;
import Interface.Ijoueur;
import Statics.Fabrique;

/**
 *
 * @author zouhairhajji
 */
public abstract class Joueur extends Personnage implements Ijoueur{

    protected Score score;
    protected Intervale intervale;
    protected int attempt;
    protected int nbrToFind;
    /**
     * Attr : nbrToFind = valeur que l'adv doit deviner  
     */
    
    public Joueur(String nom,Intervale intervale) {
        super(nom);
        try{
            this.intervale = (Intervale) intervale.clone();
        }catch(Exception ex){
            System.out.println("Error : Integrale ...");
        }
        
        this.score = new Score();
        attempt  = 0;
    }

    public Intervale getIntervale() {
        return intervale;
    }
    
    
    @Override
    public void validerEssai(){
        this.attempt ++;
    }
    
    @Override
    public void setIntervale(int essai, Plus_ou_Moins stateEssai) {
        switch(stateEssai){
            case _PLUS_PETIT_:
                this.intervale.setBorneMin(essai + 1);
                break;
            case _PLUS_GRAND_:
                this.intervale.setBorneMax(essai - 1);
                break;
            default:
                break;
        }
    }

    public int getAttempt() {
        return attempt;
    }
    
    
    
    
}
