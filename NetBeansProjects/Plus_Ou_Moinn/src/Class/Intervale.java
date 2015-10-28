/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Exception.IntervaleNotSupported;

/**
 *
 * @author zouhairhajji
 */
public class Intervale {
    private int borneMin,borneMax;

    public Intervale() {
        this(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private Intervale(int borneMin, int borneMax) {
        this.borneMin = borneMin;
        this.borneMax = borneMax;
    }
    
    public boolean isValide() throws IntervaleNotSupported{
        if(borneMin == Integer.MIN_VALUE || borneMax == Integer.MAX_VALUE  || (borneMin > borneMax) )
            return false;
        return true;   
    }
    
    public int getMilieu(){
        return (int)(this.borneMax + this.borneMin) / 2 ;
    }

    
    
    
    public void setBorneMax(int borneMax) {
        if(this.borneMax < borneMax)
            return;
        this.borneMax = borneMax;
    }
    
    public void setBorneMin(int borneMin) {
        if(this.borneMin > borneMin)
            return;
        this.borneMin = borneMin;
    }
    
    @Override
    public String toString(){
        String max = (this.borneMax == Integer.MAX_VALUE ) ? "..." : this.borneMax+"";
        String min = (this.borneMin == Integer.MIN_VALUE ) ? "..." : this.borneMin+"";
        return " Intervale : [ "+ min + " , "+ max+" ]." ;
    }
    
    
    
}
