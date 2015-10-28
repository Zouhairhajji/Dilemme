/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import model.Partie;
import mvc.controller.Controller;

/**
 *
 * @author zouhairhajji
 */
public class Model {

    private Partie partie;
    private Controller controller;
    
    
    public Model(Controller aThis) {
        this.partie = new Partie();
        this.controller = aThis;
    }

    public Partie getPartie() {
        return partie;
    }
    
    
    
    
}
