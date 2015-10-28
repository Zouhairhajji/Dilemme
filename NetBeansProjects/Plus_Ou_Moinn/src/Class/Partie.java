/**
 *<b> Class Partie qui gere un defie de deux joueur  </b>
 * 
 */
package Class;

import Abstract.Joueur;
import Enum.Reponse;
import Static.Helper;
import static Static.Helper.sout;

/**
 *
 * @author zouhairhajji
 */
public class Partie {
    
    private Arbitre arbitre;
    private Joueur joueur,joueurAdv;
    private static int id_partit;
    
    static{
        id_partit= 0;
    }

    public Partie(Arbitre arbitre, Joueur joueur, Joueur joueurAdv) {
        this.arbitre = arbitre;
        this.joueur = joueur;
        this.joueurAdv = joueurAdv;
        id_partit ++;
    }
    
    public Joueur start(){
        boolean runningPartie = false;
        int coup,coupAdv;
        Intervale intervale;
        Reponse state;
        Joueur winner = this.joueurAdv;
        Helper.sout();
        intervale = this.arbitre.generateIntervale();
        System.out.println(this.arbitre.getSpeaker().presenterPartit(this,intervale));
        System.out.print(this.arbitre.getSpeaker().demanderDefinirNbr(this.joueur));
        this.joueur.definirValeurADevnier(intervale);
        System.out.println(this.arbitre.getSpeaker().ConfirmerDefinirNbr(this.joueur));

        System.out.println(this.arbitre.getSpeaker().demanderDefinirNbr(this.joueurAdv));
        this.joueurAdv.definirValeurADevnier(intervale);
        System.out.println(this.arbitre.getSpeaker().ConfirmerDefinirNbr(this.joueurAdv));
        do{
            
            
        }while(!runningPartie);
        
        winner.getScore().addScore();
        return winner;
    }
    
    
    /**
     *Cette méthode permet de relir un nombre tant que une exeption est survenue
     */
    public boolean boucleNbrPlayer(Joueur joueur){
        /*
        boolean state = joueur.definirValeurADevnier();
        System.out.println(state);
        if(!state){
          state = joueur.definirValeurADevnier();
        System.out.println(state);
        }
        */
        /*
        boolean state = false;
        do{
            state = joueur.definirValeurADevnier();
            System.out.println(state);
        }while(!state);
        return true;
        */
        /*
        if(!joueur.definirValeurADevnier()){
            return boucleNbrPlayer(joueur);
        }else{
            return true;
        }
        */
        return true;
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
