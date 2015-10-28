/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


/**
 *
 * @author zouhairhajji
 */
public class Intervale {
    
    private int borneMin,borneMax;

    public Intervale() throws Exception {
       this(0, 1000);
    }
    
    public Intervale(int borneMax) throws Exception {
       this(0, borneMax);
    }

    public Intervale(int borneMin, int borneMax) throws Exception {
        if(borneMax < borneMin) throw new Exception("BorneMax ne peut pas être inférieure à BorneMin");
        this.borneMin = borneMin;
        this.borneMax = borneMax;
    }

    
    public boolean estVide(){
        return ((borneMax - borneMin) <= 0);
    }
    
    public int getMilieu(){
        return (int)  ((borneMax + borneMin +1) / 2  );
    }
    
    public boolean auMilieu(int valeur){
        return ( estVide() ||  (valeur < this.borneMin) ||  (valeur > this.borneMax) )  ? false : true;
    }
    
    
    @Override
    public String toString() {
        return  "[ " + borneMin + " , " + borneMax + " ]";
        //return super.toString();
    }

    public int getBorneMin() {
        return borneMin;
    }

    public void setBorneMin(int borneMin) throws Exception {
        this.borneMin = borneMin;
        if(estVide()) throw  new Exception("deed");
    }

    public int getBorneMax() {
        return borneMax;
        
    }

    public void setBorneMax(int borneMax) {
        this.borneMax = borneMax;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return new Intervale(this.borneMin, this.borneMax)    ;
        } catch (Exception ex) {
            return null;
        }
        
    }
    
}



