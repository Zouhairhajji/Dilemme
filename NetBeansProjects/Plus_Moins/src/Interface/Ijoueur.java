/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Intervale;
import Enum.Plus_ou_Moins;

/**
 *
 * @author zouhairhajji
 */
public interface Ijoueur {
    
    
    public int getCoup();
    
    public  void setIntervale(int essai,Plus_ou_Moins stateEssai);
    public void validerEssai();
    
    
    
}
