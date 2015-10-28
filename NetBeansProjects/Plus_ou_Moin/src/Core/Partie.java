/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Enum.Plus_ou_Moins;
import Joueur.Arbitre;
import Joueur.Joueur;
import Statics.Helper;
import java.util.Date;

/**
 *
 * @author zouhairhajji
 */
public class Partie {
    
    private Joueur joueur,joueurAdv;
    private Arbitre arbitre;
    private Date dateDebut,dateFin;
    

    public Partie(Arbitre arbitre, Joueur joueur, Joueur joueurAdv ) {
        this.arbitre = arbitre;
        
        this.joueur = joueur;
        this.joueurAdv = joueurAdv;
    }
    
    
    
    
    public Joueur start(){
        
        boolean runningGame =false;
        int essai,essaiAdv;
        Plus_ou_Moins state;
        Joueur winner = null;
        
        this.dateDebut = new Date();
        
        do{
            /*
                Partit joueur
            */
            System.out.println(arbitre.MontrerTour(joueur));
            System.out.println("\t"+arbitre.showIntervale(joueur));
            
            System.out.print(arbitre.MontrerEssaiJoueur(joueur));
            essai = joueur.getCoup();
            System.out.println(essai+"...!!!");
            state = arbitre.setJugement(essai);
            
            System.out.println("\n" + arbitre.MontrerResultOfCoup(state));
            
            if(state == Plus_ou_Moins._TRICHER_ ){
                winner = this.joueurAdv;
                break;
            }else if( state == Plus_ou_Moins._EGALE_ ){
                winner = this.joueur;
                break;
            }else{
                joueur.setIntervale(essai, state);
            }
            /*
                Partit Adv
            */
            Helper.sout(1);
            System.out.println(arbitre.MontrerTour(joueurAdv));
            System.out.println("\t"+arbitre.showIntervale(joueurAdv));
            
            System.out.print(arbitre.MontrerEssaiJoueur(joueurAdv));
            essaiAdv = joueurAdv.getCoup();
            System.out.println(essaiAdv+"...!!!");
            state = arbitre.setJugement(essaiAdv);
            
            System.out.println("\t" + arbitre.MontrerResultOfCoup(state));
            
            if(state == Plus_ou_Moins._TRICHER_ ){
                winner = this.joueur;
                break;
            }else if( state == Plus_ou_Moins._EGALE_ ){
                winner = this.joueurAdv;
                break;
            }else{
                joueurAdv.setIntervale(essaiAdv, state);
            }
            
                
               
            
            
            
            Helper.sout(3);
        }while(!runningGame);
        
        
        System.out.println("Nombre d'essai est : "  + winner.getAttempt()); 
        
        this.dateFin = new Date();
        return winner;
    }
    
    
    
}
