/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain implements Joueur{

    
    
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
