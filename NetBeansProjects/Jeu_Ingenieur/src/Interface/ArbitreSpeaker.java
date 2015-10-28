/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Intervale;
import Class.Partie;

/**
 *
 * @author zouhairhajji
 */
public interface ArbitreSpeaker {
    
    public String presenterPartit(Partie partie, Intervale intervale);
    
    public String montrerIntervale(Abstract.Joueur joueur);
    
    public String montrerTour(Abstract.Joueur joueur);
    
    public String demanderDefinirNbr(Abstract.Joueur joueur);
    public String confirmerDefinirNbr(Abstract.Joueur joueur);
    public String redemanderDefinirNbr(Abstract.Joueur joueur);
    
    
    public String demanderGetCoup(Abstract.Joueur joueur);
    public String redemanderGetCoup(Abstract.Joueur joueur);
    
    public String montrerCoup(Abstract.Joueur joueur);
    
    public String demanderJuger(Abstract.Joueur joueur);
    public String monterJuger(Abstract.Joueur joueur);
    
    
    
    
}
