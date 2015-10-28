/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

import Class.Intervale;
import Enum.Plus_ou_Moins;
import java.util.Scanner;

/**
 *
 * @author zouhairhajji
 */
public class JoueurHumain extends Joueur {

    private Scanner scanner;

    public JoueurHumain(String nom, Intervale intervale) {
        super(nom, intervale);
        this.scanner  =new Scanner(System.in);
    }
    
    
    @Override
    public int getCoup() {
        super.validerEssai();
        try{
            return this.scanner.nextInt();
        }catch(Exception ex){
            return 0;
        }
    }

    
    
}
