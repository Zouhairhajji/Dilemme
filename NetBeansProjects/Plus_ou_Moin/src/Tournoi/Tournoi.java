/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tournoi;

import Class.Intervale;
import Core.Partie;
import Exceptions.TournoiNotSupported;
import Joueur.Arbitre;
import Joueur.Joueur;
import Statics.Fabrique;
import Statics.Helper;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public class Tournoi {

    private static int nbrMinModTournoi = 4;
    private ArrayList<Joueur> candidats;

    public Tournoi(ArrayList<Joueur> listDesJoueurs) throws TournoiNotSupported {
        if ((listDesJoueurs.size() % nbrMinModTournoi) != 0) {
            throw new TournoiNotSupported();
        }
        this.candidats = listDesJoueurs;
    }

    public Joueur startTournoi(ArrayList<Joueur> participant) throws CloneNotSupportedException {
        if (participant.size() == 0) {
            return participant.get(0);
        }
        ArrayList<Joueur> Gagnant = new ArrayList<Joueur>();
        int conteur = 0;
        for (int i = 0; i < participant.size(); i += 2) {
            Intervale intervale = Fabrique.getIntegraleAlea(3);
            Helper.sout(10);
            System.out.println("Valeur CHoisi ; " + i + " : " + (i+1));
            Partie parti = new Partie(new Arbitre("Arbitre", intervale, Fabrique.getRandomNbr(intervale)), participant.get(i), participant.get(i + 1));
            Gagnant.add(parti.start());
        }
        startTournoi(Gagnant);
        return null;
    }

    public Joueur startTournoi() throws CloneNotSupportedException {
        return this.startTournoi(this.candidats);
    }

    public ArrayList<Tournoi> distribute() throws TournoiNotSupported {
        ArrayList<Tournoi> tournois = new ArrayList<Tournoi>();
        ArrayList<Joueur> joueurs = null;
        int conteur = 0;
        for (int j = 0; j < this.candidats.size() / nbrMinModTournoi; j++) {
            joueurs = new ArrayList<Joueur>();
            for (int i = 0; i < nbrMinModTournoi; i++) {
                joueurs.add(this.candidats.get((i + conteur)));
            }
            conteur += nbrMinModTournoi;
            tournois.add(new Tournoi(joueurs));
        }
        return tournois;
    }

}
