/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Intervale;
import Enum.Reponse;

/**
 *
 * @author zouhairhajji
 */
public interface Joueur {
    
    public int getCoup();
    public boolean definirValeurADevnier(Intervale intervale);
    public void setResponse(Reponse reponse);
    
    public Reponse juger(int valeur);

    
}
