/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Abstract.Joueur;
import Exception.TournoiNotSupported;
import Static.Helper;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public class Tournoi {

    private static int nbrMinModTournoi = 2;
    private ArrayList<Joueur> candidats;
    private Arbitre arbitre;

    public Tournoi(ArrayList<Joueur> listDesJoueurs, Arbitre arbitre) throws TournoiNotSupported {
        if ((listDesJoueurs.size() % nbrMinModTournoi) != 0) {
            throw new TournoiNotSupported();
        }
        this.candidats = listDesJoueurs;
        this.arbitre = arbitre;
    }

    public Joueur startTournoi(ArrayList<Joueur> participant) throws CloneNotSupportedException {
        if (participant.size() == 1) 
            return participant.get(0);
        
        ArrayList<Joueur> Gagnant = new ArrayList<>();
        for (int i = 0; i < participant.size(); i += 2) {
            Helper.sout(10);
            Partie parti = new Partie(this.arbitre, participant.get(i), participant.get(i + 1));
            Gagnant.add(parti.start());
        }
        return startTournoi(Gagnant);
    }

    public Joueur startTournoi() throws CloneNotSupportedException {
        return this.startTournoi(this.candidats);
    }

}
