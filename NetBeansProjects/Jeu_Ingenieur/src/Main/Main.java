/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Joueur;
import Class.*;
import Exception.TournoiNotSupported;
import Joueur.*;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public class Main {
    
    public static void main(String[] args) throws TournoiNotSupported, CloneNotSupportedException {
        ArrayList<Joueur> listJoueur = new ArrayList<Joueur>();
        
        Arbitre arbitre = new Arbitre("Arbitre 1");
        JoueurHumain joueurHumain = new JoueurHumain("Zouhair");
        JoueurDecho joueurMachine = new JoueurDecho("Machine 1");
        JoueurDecho joueurMachine2 = new JoueurDecho("Machine 2");
        JoueurDecho joueurMachine3 = new JoueurDecho("Machine 3");
        JoueurDecho joueurMachine4 = new JoueurDecho("Machine 4");
        
        listJoueur.add(joueurMachine);
        listJoueur.add(joueurMachine2);
        listJoueur.add(joueurMachine3);
        listJoueur.add(joueurMachine4);
        
        Partie partie = new Partie(arbitre, joueurHumain, joueurMachine);
        Tournoi tournoi = new Tournoi(listJoueur, arbitre);
        
        System.out.println(tournoi.startTournoi());;
    }
    
    
    
}
