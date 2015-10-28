/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

/**
 *
 * @author zouhairhajji
 */
public class Intervalle {
    
    private int valMin,valMax;

    public Intervalle(int valMin, int valMax) {
        this.valMin = valMin;
        this.valMax = valMax;
    }

    public Intervalle(int valMax) {
        this.valMin = 0;
        this.valMax = valMax;
    }
    
    public Intervalle() {
        this(0,1000);
    }

    public int getMilieu(){
        return this.valMax - this.valMin;
    }
    
    public boolean estVide(){
        return (this.getMilieu() <= 0) ? true : false ;
    }
    
    
    
    
    
    public int getBorneMax() {
        return valMax;
    }

    public int getBorneMin() {
        return valMin;
    }
    

    
    
    
    public void setMax(int valMax) {
        this.valMax = valMax;
    }

    public void setMin(int valMin) {
        this.valMin = valMin;
    }
    
    

    
    
    
    
    
    
}
