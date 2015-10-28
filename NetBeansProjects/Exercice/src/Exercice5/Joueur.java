/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;

import Exercice4.*;

/**
 *
 * @author zouhairhajji
 */
public interface Joueur {
    
    public int getCoup();
    public void setReponse(int reponse);
    public int testSecret(int essai);
    
}
