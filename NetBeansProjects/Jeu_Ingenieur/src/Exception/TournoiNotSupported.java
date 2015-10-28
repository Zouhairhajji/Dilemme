/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author zouhairhajji
 */
public class TournoiNotSupported extends Exception{

    public TournoiNotSupported() {
        super("On peut pas faire un tournoi avec ce nombre de candidat .");
    }
    public TournoiNotSupported(String message) {
        super(message);
    }

    

    
    
    
}
