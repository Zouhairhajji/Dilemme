/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Abstract.Joueur;
import Class.Intervale;
import Enum.Reponse;
import java.util.Scanner;

/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain extends Joueur {

    private Scanner scanner;

    public JoueurHumain(String nom) {
        super(nom);
    }

    @Override
    public boolean getCoup() {
        scanner = new Scanner(System.in);
        try {
            super.lastCoup = this.scanner.nextInt();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean definirValeurADevnier(Intervale intervale) {
        scanner = new Scanner(System.in);
        try {
            super.valeurADeviner = this.scanner.nextInt();
            return !(super.valeurADeviner < intervale.getBorneMin() || super.valeurADeviner > intervale.getBorneMax());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Reponse juger(int valeur) {
        Reponse state = Reponse._UNDEFINED_;
        try {
            switch (this.scanner.nextInt()) {
                case 0:
                    state = Reponse._EGALE_;
                    break;
                case 1:
                    state = Reponse._PLUS_PETIT_;
                    break;
                case 2:
                    state = Reponse._PLUS_GRAND_;
                    break;
                default:
                    state = Reponse._UNDEFINED_;
                    break;
            }
        } catch (Exception ex) {
        }
        super.lastReponse = state;
        return state;
    }

}
