/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Joueur;
import Class.Arbitre;
import Class.Intervale;
import Class.Partie;
import Class.Tournoi;
import Exception.TournoiNotSupported;
import Joueur.JoueurDecho;
import Joueur.JoueurHumain;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zouhairhajji
 */
public class MainConsole {

 
    public static void main(String[] args) throws TournoiNotSupported, CloneNotSupportedException {
        boolean running = true;

        

        do {
            showMessage();
            
            switch (getNbrValide()) {
                case 1 :
                    System.out.println("Vous avez choisir 1 joueur vs joueur");
                    System.out.print("Veuillez choisir le nom du 1er personnage :>  ");
                    String firstName = new Scanner(System.in).next();
                    System.out.print("Veuillez choisir le nom du 2eme personnage :>  ");
                    String secondName = new Scanner(System.in).next();
                    if(secondName == null ? firstName == null : secondName.equals(firstName))
                        secondName += " 2";
                    Joueur joueur = new Partie(new Arbitre("Arbitre 1"), new JoueurHumain(firstName), new JoueurHumain(secondName)).start();
                    System.out.println("Le Gagant est : " + joueur);
                    break;
                case 2 :
                    System.out.println("Vous avez choisir 2 joueur vs Machine");
                    System.out.print("Veuillez choisir le nom de votre personnage :>  ");
                    Joueur joueur2 = new Partie(new Arbitre("Arbitre 1"), new JoueurHumain(new Scanner(System.in).next()), new JoueurDecho("JoueurMachine 1") ).start();
                    System.out.println("Le Gagant est : " + joueur2);
                    break;
                case 3 :
                    System.out.println("Vous avez choisir 3 : Organiser un tournoi .. Bon courage !! ");
                    int valeur = getNbrMultipleOf2(); 
                    System.out.print("Veuillez choisir le nom de votre personnage :>  ");
                    String nom = new Scanner(System.in).next();
                    
                    ArrayList<Joueur> joueurs = new ArrayList<>();
                    joueurs.add(new JoueurHumain(nom));
                    for(int i =1;i<valeur;i++){
                        joueurs.add(new JoueurDecho("Joueur Auto " + i));
                    }
                    Joueur joueur3 = new Tournoi(joueurs, new Arbitre("Arbitre")).startTournoi();
                    System.out.println("Le Gagant est : " + joueur3);
                    break;
                default : 
                    break;
            }

        } while (running);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int getNbrMultipleOf2(){
        boolean running = true;
        System.out.print("Veuillez choisir le nombre de participant :  ");
        do {
            try {
                
                int choix = new Scanner(System.in).nextInt();
                if ((choix % 4) == 0) {
                    running = false;
                    return choix;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Veuillez choisir un nombre : multiple de 4 :  ");
            }
        } while (running);
        return -1;
    }
    
    public static void showMessage() {
        System.out.println("******  Bonjour  ******");
        System.out.println("******  Veuillez choisir une option !  ******");
        System.out.println("******  1 - Joueur vs Joueur");
        System.out.println("******  2 - Joueur vs Machine");
        System.out.println("******  3 - Choisir une tournoi");
        System.out.println("******  ****** ******  ******");
    }

    public static int getNbrValide() {
        boolean running = true;
        do {
            try {

                int choix = new Scanner(System.in).nextInt();
                if ((choix > 0)) {
                    running = false;
                    return choix;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Veuillez choisir un choix valide ");
            }
        } while (running);
        return -1;
    }
}
