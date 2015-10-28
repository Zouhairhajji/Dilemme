/**
 * <b> Class Partie qui gere un defie de deux joueur  </b>
 *
 */
package Class;

import Abstract.Joueur;
import Enum.Reponse;
import Joueur.JoueurHumain;
import Static.Helper;
import static Static.Helper.sout;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zouhairhajji
 */
public class Partie {

    private Arbitre arbitre;
    private Joueur joueur, joueurAdv;
    private static int id_partit;

    static {
        id_partit = 0;
    }

    public Partie(Arbitre arbitre, Joueur joueur, Joueur joueurAdv) {
        this.arbitre = arbitre;
        this.joueur = joueur;
        this.joueurAdv = joueurAdv;
        id_partit++;
    }

    public Joueur start() {
        boolean runningPartie = false;
        int coup, coupAdv;
        Intervale intervale;
        Reponse state;
        Joueur winner = this.joueurAdv;

        intervale = this.arbitre.generateIntervale();

        this.initPlayers(intervale);
        
        this.joueurAdv.setIntervale(intervale);
        
        System.out.println(this.arbitre.getSpeaker().presenterPartit(this, intervale));

        this.boucleDefinirNbr(joueur, intervale);
        System.out.println(this.arbitre.getSpeaker().confirmerDefinirNbr(joueur));

        this.boucleDefinirNbr(joueurAdv, intervale);
        System.out.println(this.arbitre.getSpeaker().confirmerDefinirNbr(joueurAdv));

        do {
            /**************************************************************************************************
             *********************************   Partie Joueur   **********************************************
             **************************************************************************************************
             */
            /**
             * Le joueur saisie le coup
             */
            this.boucleGetCoup(joueur);
            System.out.println(this.arbitre.getSpeaker().montrerCoup(joueur));
            /**
             * Le joueurAdv juge le coup
             */
            System.out.println(this.arbitre.getSpeaker().demanderJuger(joueurAdv));
            state = this.joueurAdv.juger(joueur.getLastCoup());
            System.out.println(this.arbitre.getSpeaker().monterJuger(joueurAdv));
            /**
             * Verifier si le joueur a triché 
             */
            if (arbitre.estTricher(this.joueurAdv.getValeurADeviner(), this.joueur.getLastCoup(), this.joueurAdv.getLastReponse())){
                System.out.println("JoueurAdv A triché");
                winner = joueur;
                break;
            }else{
                this.joueur.setResponse(this.joueurAdv.getLastReponse());
                if(state == Reponse._EGALE_){
                    winner = joueur;
                    break;
                }
            }
            
            /**************************************************************************************************
             ********************************* Partie Joueur Adv **********************************************
             **************************************************************************************************
             */
            sout(1);
            
            this.boucleGetCoup(joueurAdv);
            System.out.println(this.arbitre.getSpeaker().montrerCoup(joueurAdv));
            /**
             * Le joueurAdv juge le coup
             */
            System.out.println(this.arbitre.getSpeaker().demanderJuger(joueur));
            state = this.joueur.juger(joueurAdv.getLastCoup());
            System.out.println(this.arbitre.getSpeaker().monterJuger(joueur));
            /**
             * Verifier si le joueur a triché 
             */
            if (arbitre.estTricher(this.joueur.getValeurADeviner(), this.joueurAdv.getLastCoup(), this.joueur.getLastReponse())){
                System.out.println("Joueur A triché");
                winner = joueurAdv;
                break;
            }else{
                this.joueurAdv.setResponse(this.joueur.getLastReponse());
                if(state == Reponse._EGALE_){
                    winner = joueurAdv;
                    break;
                }
            }
            
            
        } while (!runningPartie);

        winner.getScore().addScore();
        Helper.sout();
        return winner;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public void initPlayers(Intervale intervale){
        try {
            
            this.joueur.initiateData();
            this.joueurAdv.initiateData();
            
            this.joueur.setIntervale((Intervale)intervale.clone());
            this.joueurAdv.setIntervale((Intervale)intervale.clone());
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Partie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void boucleDefinirNbr(Joueur joueur, Intervale intervale) {
        boolean running = true;

        if (joueur instanceof JoueurHumain) {
            System.out.print(this.arbitre.getSpeaker().demanderDefinirNbr(joueur));
        } else {
            System.out.println(this.arbitre.getSpeaker().demanderDefinirNbr(joueur));
        }

        do {
            running = !joueur.definirValeurADevnier(intervale);
            if (running) {
                if (joueur instanceof JoueurHumain) {
                    System.out.print(this.arbitre.getSpeaker().redemanderDefinirNbr(joueur));
                } else {
                    System.out.println(this.arbitre.getSpeaker().redemanderDefinirNbr(joueur));
                }
            }
        } while (running);
    }

    public void boucleGetCoup(Joueur joueur) {
        boolean running = true;
        System.out.println(this.arbitre.getSpeaker().montrerIntervale(joueur));
        System.out.print(this.arbitre.getSpeaker().demanderGetCoup(joueur));
        do {
            running = !joueur.getCoup();
            if (running) {
                System.out.print(this.arbitre.getSpeaker().redemanderGetCoup(joueur));
            }
        } while (running);
    }

    public int getId_partit() {
        return id_partit;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public Joueur getJoueurAdv() {
        return joueurAdv;
    }
}
