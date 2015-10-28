/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enum.Plus_ou_Moins;

/**
 *
 * @author zouhairhajji
 */
public abstract class Personnage {
    
    private static int identifiant;
    
    protected int id;
    protected String nom;
    
    
    static{
        identifiant = 0;
    }

    public Personnage( String nom) {
        identifiant ++;
        this.id = identifiant;
        this.nom = nom;
    }

    public String getName() {
        return nom;
    }

    
    
    
    
   
    
    
    
}
