/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;


/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain implements Joueur{

    protected Intervalle intervale;
    
    public static final int _PLUS_GRAND_ = 1;
    public static final int _PLUS_PETIT_ = 2;
    public static final int _EGAUX_ = 0;
    

    public JoueurHumain(Intervalle intervale) {
        this.intervale = intervale;
    }
    public JoueurHumain(int borneMin,int borneMax) {
        this(new Intervalle(borneMin, borneMax));
    }
    public JoueurHumain(int borneMax) {
        this(new Intervalle(borneMax));
    }
    
    
    @Override
    public int getCoup() {
        return Input.readInt();
    }

    @Override
    public void setReponse(int reponse) {
        System.out.print("Vous avez choisi la valeur " + reponse);
    }

    @Override
    public int testSecret(int essai) {
        this.setReponse(essai);
        return this.getCoup();
    }
    
}
