/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statics;

import Class.Intervale;



/**
 *
 * @author zouhairhajji
 */
public class Fabrique {
    
    private static int valeurParNiveau;
    
    static{
        valeurParNiveau = 50;
    }
    
    public static Intervale getIntegraleAlea(int niveau){
        
        try {
            int nbrNiveau = (niveau <= 0)  ? 1  : niveau ; 
            
            
            
            int nbrMin = (int)(Math.random() * ((valeurParNiveau) + 1));
            
            int nbrMax = (nbrMin + (int)(Math.random() * ((valeurParNiveau * niveau - nbrMin) + 1)));
            
            nbrMax = ( (nbrMax <= nbrMin) || (nbrMax - nbrMin)< 10 ) ? nbrMax + nbrMin + niveau*10 : nbrMax;
            
            return new Intervale(nbrMin, nbrMax);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static int getRandomNbr(Intervale intervale){
        return intervale.getBorneMin() + (int)(Math.random() * ((intervale.getBorneMax() - intervale.getBorneMin()) + 1));
    }
    
    
    
}
