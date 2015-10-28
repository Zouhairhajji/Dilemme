/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Abstract.Joueur;
import Enum.Reponse;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain extends Joueur{

    private Scanner scanner;
    
    public JoueurHumain(String nom) {
        super(nom);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getCoup() {
        try {
            super.lastCoup =  this.scanner.nextInt();
            return super.lastCoup;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Reponse juger(int valeur) {
        Reponse state = Reponse._UNDEFINED_;
        try{
            switch(this.scanner.nextInt()){
                case 0 : 
                    state =  Reponse._EGALE_;
                    break;
                case 1 : 
                    state = Reponse._PLUS_PETIT_;
                    break;
                case 2 : 
                    state = Reponse._PLUS_GRAND_;
                    break;
                default:
                    state = Reponse._UNDEFINED_;
                    break;
            }
        }catch(Exception ex){
        }
        super.lastReponse= state;
        return state;
    }
    
    public Reponse juger() {
        return this.juger(0);
    }
    
    @Override
    public boolean definirValeurADevnier(Intervale intervale) {
        try {
            
                this.valeurADeviner = this.scanner.nextInt();
            
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
}

