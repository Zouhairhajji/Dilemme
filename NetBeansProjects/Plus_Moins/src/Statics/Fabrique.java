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
    private static int defaultLvl;
    static{
        valeurParNiveau = 50;
        defaultLvl = 2;
    }
    
    public static Intervale getIntegraleAlea(){
        
        try {
            int nbrNiveau = (defaultLvl <= 0)  ? 1  : defaultLvl ; 
            
            
            
            int nbrMin = (int)(Math.random() * ((valeurParNiveau) + 1));
            
            int nbrMax = (nbrMin + (int)(Math.random() * ((valeurParNiveau * defaultLvl - nbrMin) + 1)))*nbrNiveau;
            
            nbrMax = ( (nbrMax <= nbrMin) || (nbrMax - nbrMin)< 10 ) ? nbrMax + nbrMin + defaultLvl*10 : nbrMax;
            
            return new Intervale(nbrMin, nbrMax);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static int getRandomNbr(Intervale intervale){
        return intervale.getBorneMin() + (int)(Math.random() * ((intervale.getBorneMax() - intervale.getBorneMin()) + 1));
    }
    
    
    
}
