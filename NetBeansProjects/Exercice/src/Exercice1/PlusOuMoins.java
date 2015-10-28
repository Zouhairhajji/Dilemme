/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

import java.util.Scanner;

/**
 *
 * @author zouhairhajji
 */
public class PlusOuMoins {

    public static void main(String[] args) {

        int valeurADeviner;
        int valeurDevine;
        int nbrTentative;
        boolean valeurtrouvé;
        
        
        

        while(true){
            
            nbrTentative = 0;
            valeurtrouvé = false;

            valeurADeviner = Input.readInt();
            System.out.println("Valeur à deviné est : " + valeurADeviner);
            for(int i = 0;i<10;i++)
                System.out.println("\n");
            
            
            do {
                valeurDevine = Input.readInt();

                if (valeurADeviner < valeurDevine) {
                    System.out.println("Plus grand");
                    nbrTentative += 1;
                } else if (valeurADeviner > valeurDevine) {
                    System.out.println("Plus petit");
                    nbrTentative += 1;
                } else {
                    valeurtrouvé = true;
                    System.out.println("Trouvé : nombre de tentative est : " + nbrTentative);
                }
            } while (!valeurtrouvé);
        }
        
        
        
            

    }

}
