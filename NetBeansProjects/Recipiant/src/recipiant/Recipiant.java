/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipiant;

/**
 *
 * @author zouhairhajji
 */
public class Recipiant {

    private int volume,contenant;

    
    
    /**
     * constructeur Par defaut ; initialise les valeurs par default .
     */
    public Recipiant(int volume) {
         this.volume = 200;
         this.contenant = 0;
    }
    public Recipiant() {
         this.volume = 100;
         this.contenant = 0;
    }

    

    public int getContenant() {
        return contenant;
    }

    public void setContenant(int contenant) {
        this.contenant = contenant;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    
}
