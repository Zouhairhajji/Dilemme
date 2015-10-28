/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author zouhairhajji
 */
public class Chambre {
    
    private Armoire armoire;
    private Bebe bebe;
    private CoffreJouet coffre;

    public Chambre() {
        this.armoire = new Armoire();
        this.bebe = new Bebe();
        this.coffre = new CoffreJouet();
    }

    public Armoire getArmoire() {
        return armoire;
    }

    public CoffreJouet getCoffre() {
        return coffre;
    }
    
    
    
    
    
}
