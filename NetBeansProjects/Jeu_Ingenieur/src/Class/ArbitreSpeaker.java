/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Joueur;
import Static.Helper;

/**
 *
 * @author zouhairhajji
 */
public class ArbitreSpeaker implements Interface.ArbitreSpeaker{
    
    private final  String[] langage = 
       {"Arbitre : ",
        "",
        ""};

    
    
    
    
    @Override
    public String montrerIntervale(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getIntervale();
    }

    @Override
    public String montrerTour(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" ;  A vous de jouer !  ";
    }

    @Override
    public String demanderDefinirNbr(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" ; Veuillez definir votre valeur secrete . ";
    }

    @Override
    public String confirmerDefinirNbr(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" a bien definit sa valeur secrete .  ";
    }

    @Override
    public String redemanderDefinirNbr(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" ; Veuillez redefinir votre valeur secrete  ";
    }
    
    @Override
    public String presenterPartit(Partie partie,Intervale intervale) {
        return this.langage[0] + " Bienvenue, Partit n°: "+ partie.getId_partit()+", "+ partie.getJoueur().getName() + " vs "+ partie.getJoueurAdv().getName() + " ,    L'intervale est : "+ intervale;
    }

    @Override
    public String demanderGetCoup(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName() + " ; A vous de deviner la valeur !! ";
    }

    @Override
    public String redemanderGetCoup(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName() + " ; Veuillez redefinir votre coup !! ";
    }
    
    @Override
    public String montrerCoup(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName() + " a choisit la valeur "+ joueur.getLastCoup();
    }

    @Override
    public String demanderJuger(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" ; A vous de juger la valeur deviné  ";
    }

    @Override
    public String monterJuger(Abstract.Joueur joueur) {
        return this.langage[0] + joueur.getName()+" ; A juger :   " + Helper.enumToString(joueur.getLastReponse());
    }

    
    
    

    

    
    
    
    
    
}
