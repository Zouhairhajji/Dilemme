/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Enum.Plus_ou_Moins;
import Joueur.Joueur;

/**
 *
 * @author zouhairhajji
 */
public interface Iarbitre {
    
    public Plus_ou_Moins setJugement(int essai);
    public boolean isTricher(int coup);
    
    public String showIntervale(Joueur joueur);
    public String MontrerTour(Joueur joueur);
    public String MontrerEssaiJoueur(Joueur joueur);
    public String MontrerResultOfCoup(Plus_ou_Moins state);
    
    
    
}
