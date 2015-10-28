/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Class.Intervale;
import Core.Partie;
import Enum.Plus_ou_Moins;
import Joueur.Arbitre;
import Joueur.Joueur;
import Joueur.JoueurHumain;
import Joueur.JoueurMachine;
import Statics.Fabrique;
import Statics.Helper;
import Tournoi.Tournoi;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public class Main {
 
    public static void main(String[] args) throws Exception {
        
        int lvl = 3;
        Intervale intervale = Fabrique.getIntegraleAlea(lvl);
        int valeurAtrouver = Fabrique.getRandomNbr(intervale);
        
        /*
        JoueurHumain joueurHumain = new JoueurHumain("Zouhair", intervale);
        JoueurMachine joueurMachine = new JoueurMachine("Machine1", intervale);
        JoueurMachine joueurDecho  = new JoueurMachine("Machine2", intervale);
        Arbitre arbitre = new Arbitre("arbitre", intervale, valeurAtrouver);
        Partie parti = new Partie(arbitre, joueurDecho, joueurMachine);
        parti.start();
        */
        ArrayList<Joueur> candidats = new ArrayList<Joueur>();
        
        candidats.add(new JoueurMachine("Machine1", (Intervale)intervale.clone()));
        candidats.add(new JoueurMachine("Machine2", (Intervale)intervale.clone()));
        candidats.add(new JoueurMachine("Machine3", (Intervale)intervale.clone()));
        candidats.add(new JoueurHumain("Zouhair", (Intervale)intervale.clone()));
        
        
        Tournoi tournoi = new Tournoi(candidats);
        tournoi.startTournoi();
        
        //System.out.println(tournoi.distribute().size());
        
        
        
        
        
    }
    
}
