/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Joueur;
import Abstract.Personnage;
import Class.Arbitre;
import Class.JoueurDecho;
import Class.JoueurHumain;
import Class.Partie;
import Enum.Reponse;



/**
 *
 * @author zouhairhajji
 */
public class Main {
    
    public static void main(String[] args) {
        
        Reponse reponse;
        Joueur joueurMachine = new JoueurDecho("Machine 1");
        Joueur joueurHumain = new JoueurHumain("Zouhair 1");
        Arbitre arbitre = new Arbitre("Arbitre ");
        Partie partie = new Partie(arbitre, joueurHumain, joueurMachine);
        partie.start();
        //partie.boucleNbrPlayer(joueurHumain);
        
       
        
        
        
        
        
        
    }
    
}
