/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Class.Intervale;
import Class.Personnage;
import Enum.Plus_ou_Moins;

/**
 *
 * @author zouhairhajji
 */
public class Arbitre extends Personnage implements Interface.Iarbitre{

    private int valeurAtrouver;
    private Intervale initialIntervale;

    public Arbitre(String nom, Intervale initialIntervale, int valeurAtrouver) throws CloneNotSupportedException {
        super(nom);
        this.valeurAtrouver = valeurAtrouver;
        this.initialIntervale = (Intervale)initialIntervale.clone();
    }
    
    

    @Override
    public boolean isTricher(int coup) {
        return this.initialIntervale.auMilieu(coup);
    }

    @Override
    public String showIntervale(Joueur joueur) {
        return "L'intervale est " + joueur.getIntervale();
    }

    @Override
    public Plus_ou_Moins setJugement(int essai) {
        if (!this.isTricher(essai))
            return Plus_ou_Moins._TRICHER_;
        if( essai >this.valeurAtrouver )
            return Plus_ou_Moins._PLUS_GRAND_;
        else if ( essai < this.valeurAtrouver )
            return Plus_ou_Moins._PLUS_PETIT_;
        return Plus_ou_Moins._EGALE_;
    }


    @Override
    public String MontrerTour(Joueur joueur) {
        String res ="";
        if("JoueurHumain".equalsIgnoreCase(joueur.getClass().getSimpleName()))
            res = "Arbitre : C'est le tour du joueur :> " + joueur.getName();
        else
            res = "Arbitre : C'est le tour de la machine :> " + joueur.getName();
        return res;
    }

    @Override
    public String MontrerEssaiJoueur(Joueur joueur) {
        return "Le joueur : "+joueur.getName()+" : à choisi la valeur : ";
    }

    @Override
    public String MontrerResultOfCoup(Plus_ou_Moins state) {
        String res = "Arbitre : ";
        
        if( state == Plus_ou_Moins._TRICHER_ )
            res += "Merd ! Vous avez tricher , Vous allez perdre .... Valeur à  trouver : " + this.valeurAtrouver  ;
        else if ( state == Plus_ou_Moins._EGALE_ )
            res += "Yahou, Vous avez gagner :) .";
        else 
            res += state ;
        return res;
    }
    
    

    
    
    
    
    
    
}
