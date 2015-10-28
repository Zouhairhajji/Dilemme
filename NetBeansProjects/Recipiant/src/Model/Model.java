/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Controller.Controller;
import recipiant.Recipiant;

/**
 *
 * @author zouhairhajji
 */
public class Model {
    
    private Recipiant recipiantBefore,recipiantAfter;
    private Controller controller;

    public Model(Controller controller) {
        this.controller = controller;
        this.recipiantAfter = new Recipiant();
        this.recipiantBefore = new Recipiant();
    }

    public Recipiant getRecipiantBefore() {
        return recipiantBefore;
    }

    public Recipiant getRecipiantAfter() {
        return recipiantAfter;
    }
    
    
}
