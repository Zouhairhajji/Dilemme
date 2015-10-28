/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

/**
 *
 * @author zouhairhajji
 */
public class PlusOuMoin {

    public static void main(String[] args) {

        int valeurADeviner;
        int valeurDevine;
        int nbrTentative;
        boolean valeurtrouvé;

        nbrTentative = 0;
        
        int ProgrammeADeviner;
        System.out.println("Veuillez taper : \n\t 1 : Joueur vs Joueur \n\t 2 Joueur vs Machine");
        ProgrammeADeviner = Input.readInt();
        if ( ProgrammeADeviner == 1 ) {

            while (true) {
                
                
                valeurtrouvé = false;
                
                System.out.println("Exircice 1 : Veuillez saisie un nombre à Deviner");
                
                valeurADeviner = Input.readInt();
                System.out.println("Valeur à deviné est : " + valeurADeviner);
                for (int i = 0; i < 10; i++) {
                    System.out.println("\n");
                }

                do {
                    valeurDevine = Exercice1.Input.readInt();

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

        } else if ( ProgrammeADeviner == 2 ){
                System.out.println("Joueur vs Machine");
                boolean valeurEstTrouve = false;
                int stateValeurDevine = 3; 
                /*
                    0 -> Egale
                    1 -> Trop grand
                    2 -> trop petit 
                    3 -> aucune : Valeur par defaut
                */
                
                
                int valeurMax, valeurMin = 0;
                System.out.println("Exircice 2 : Veuillez saisie un nombre à Deviner");
                valeurADeviner = Input.readInt();
                System.out.println("Valeur à deviné est : " + valeurADeviner);
                valeurMax = Input.readInt();
                System.out.println("Valeur max est " + valeurMax);
                for (int i = 0; i < 10; i++) 
                    System.out.println("\n");
                
                
                do{
                    valeurDevine = (int)(Math.random() * (valeurMax - valeurMin) + valeurMin);
                    System.out.println("La machine a proposé  : " +  valeurDevine);
                    stateValeurDevine = Input.readInt();
                    if ( stateValeurDevine ==  1 ){
                        valeurMax = valeurDevine - 1;
                        nbrTentative += 1;
                    }else if ( stateValeurDevine ==  2 ){
                        nbrTentative += 1;
                        valeurMin = valeurDevine + 1;
                    }else{
                        valeurEstTrouve = true;
                        System.out.println("Valeur est trouvé Bravo  nbr de tentative : " +  nbrTentative );
                    }
                    
                }while(!valeurEstTrouve);
                
                
                
                
                
        }

    }

}
