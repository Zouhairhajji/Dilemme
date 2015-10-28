/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author zouhairhajji
 */
public class Partie extends Observable {
 
    private final ArrayList<Coup> coups;

    public Partie() {
        this.coups = new ArrayList<>();
    }
    
    /**
     * @param joueur Correspend au coup du premier joueur
     * @param joueurAdv Correspend au coup du deuxieme joueur
     */
    public void addCoup(boolean joueur, boolean joueurAdv){
        this.coups.add(new Coup(joueur, joueurAdv));
        setChanged();
        notifyObservers(this);
    }
    
    /**
     *  @param noJoueur _>  0 ou 1
     *  @param noCoup   _>  commence par 0
     *  @return le score d'un joueur 0/1 en fonction du noCoup
     */
    public double getScore(int noJoueur, int noCoup) {
        Coup coup = coups.get(noCoup);
        
        if ( coup.getCoupJoueur() && coup.getCoupJoueurAdv() ) {
            return 3;
        }else if ( !coup.getCoupJoueur() && coup.getCoupJoueurAdv() ) {
            return ( noJoueur == 1 ) ? 0 : 5;
        }else if ( coup.getCoupJoueur() && !coup.getCoupJoueurAdv() ) {
            return ( noJoueur == 1 ) ? 5 : 0;
        }else{
            return 1;
        }
    }
    
    /**
     *  @param noJoueur _>  0 ou 1
     *  @param noCoup   _>  commence par 0
     *  @return On return les chaines de caracteres en fonction du coup
     */
    public String getChoix(int noJoueur, int noCoup){
        double gain = this.getScore(noJoueur, noCoup);
        
        if ( gain == 0 || gain == 1 ) 
            return "D";
        else
            return "C";
    }
    
    /**
     * cette méthode permet de retourner le nombre de coups
     * @return le nombre de partie
     */
    public int getNbrCoups() {
        return coups.size();
    }

    /**
     * @param noJoueur 1/0 represente le joueur
     * @return renvoie le score d'un joueur
     */
    public double getScorePlayer(int noJoueur){
        double resultat = 0;
        for(int i =0; i<getNbrCoups() ;i++)
            resultat += getScore(noJoueur, i);
        
        return resultat;
    }

    
}
