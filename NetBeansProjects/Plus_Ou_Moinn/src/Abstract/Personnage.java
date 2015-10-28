/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import Enum.Reponse;

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

    

    public int getId() {
        return id;
    }

    

    public void setName(String nom) {
        this.nom = nom;
    }
    

    
    public Reponse generateResultOfCoup(int valeurAtrouver, int valeurDeviner){
        if( valeurDeviner < valeurAtrouver )
            return Reponse._PLUS_PETIT_;
        else if ( valeurDeviner > valeurAtrouver )
            return Reponse._PLUS_GRAND_;
        else if ( valeurDeviner == valeurAtrouver )
            return Reponse._EGALE_;
        
        return Reponse._UNDEFINED_;
    }
    
    
    
}
