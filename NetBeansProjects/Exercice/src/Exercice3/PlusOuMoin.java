/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice3;

/**
 *
 * @author zouhairhajji
 */
public class PlusOuMoin {

    public static final int _PLUS_GRAND_ = 1;
    public static final int _PLUS_PETIT_ = 2;
    public static final int _EGAUX_ = 0;

    public static int testerValeur(int valeurADeviner, int valeurDevine) {
        if (valeurADeviner > valeurDevine) 
            return _PLUS_PETIT_;
        else if (valeurADeviner < valeurDevine) 
            return _PLUS_GRAND_;
        
        return _EGAUX_;

    }

    public static void print(int nbrLine) {
        for (int i = 0; i < nbrLine; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        int valeurMaxOrdi = 1000, valeurMinOrdi = 0, valeurDevineOrdi, valeurDevinePlayer, valeurADevine, nbrAttempt = 0;
        boolean gameFinished = false;
        boolean playerWin = false;
        boolean runningGame = true;
        boolean running = true;
        

        while (running) {
            valeurADevine = (int) (Math.random() * (valeurMaxOrdi - valeurMinOrdi) + valeurMinOrdi);

            //System.out.println("Valeur est choisit " + valeurADevine + "\n");
            valeurMaxOrdi = 1000;
            valeurMinOrdi = 0;
            runningGame = true;
            gameFinished = false;
            nbrAttempt = 0;

            do {

                valeurDevineOrdi = (int) (Math.random() * (valeurMaxOrdi - valeurMinOrdi) + valeurMinOrdi);
                System.out.println("L'adv a choisi la valeur " + valeurDevineOrdi);

                if (testerValeur(valeurADevine, valeurDevineOrdi) == 1) {
                    System.out.println("\t PLUS GRAND ,,,");
                    valeurMaxOrdi = valeurDevineOrdi;
                } else if (testerValeur(valeurADevine, valeurDevineOrdi) == 2) {
                    System.out.println("\t PLUS PETIT ,,,");
                    valeurMinOrdi = valeurDevineOrdi;
                } else if (testerValeur(valeurADevine, valeurDevineOrdi) == 0) {
                    System.out.println("\t ******************** YAHOU ******************** ,,,");
                    gameFinished = true;
                }

                if (!gameFinished) {
                    System.out.print("Vous avez choisi la valeur ");
                    valeurDevinePlayer = Input.readInt();
                    if (testerValeur(valeurADevine, valeurDevinePlayer) == 1) {
                        System.out.println("\t PLUS GRAND ,,,");
                    } else if (testerValeur(valeurADevine, valeurDevinePlayer) == 2) {
                        System.out.println("\t PLUS PETIT ,,,");
                    } else if (testerValeur(valeurADevine, valeurDevinePlayer) == 0) {
                        System.out.println("\t ******************** YAHOU ******************** ,,,");
                        gameFinished = true;
                        playerWin = true;
                    }
                }
                nbrAttempt += 1;
                print(2);

                if (gameFinished) {
                    if (playerWin) {
                        System.out.print("Le Joueur Qui a gagné");
                    } else {
                        System.out.print("La machine Qui a gagné");
                    }
                    System.out.println(" : nbr de tentative : " + nbrAttempt);
                    System.out.println("Vous voulez vraiment rejouer  ? ??");
                    System.out.println(" \t 1 : Oui ");
                    System.out.println(" \t 2 : Non ");

                    if (Input.readInt() == 2) {
                        System.out.println("Bye Bye ....");
                        running = false;
                    }else{
                        print(4);
                    }
                    runningGame = false;
                }
                

            } while (runningGame);
        }

    }

}
