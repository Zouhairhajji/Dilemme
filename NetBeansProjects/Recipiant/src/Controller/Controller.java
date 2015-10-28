/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import Views.View;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author zouhairhajji
 */
public class Controller {

    private Model model;
    private View ihm;

    public Controller() {
        this.model = new Model(this);
        ihm = new View();
        
        
        ihm.getRecipiantAfter().setMaximum(model.getRecipiantAfter().getVolume());
        ihm.getRecipiantBefore().setMaximum(model.getRecipiantBefore().getVolume());
        
        
        ihm.getRecipiantAfter().setValue(model.getRecipiantAfter().getContenant());
        ihm.getRecipiantBefore().setValue(model.getRecipiantBefore().getContenant());
        
        ihm.setVisible(true);
        this.addListener();
    }

    public void afficher() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "toto";
    }

    
    
    
    public void addListener() {
        this.ihm.getRecipiantBefore().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.getRecipiantBefore().setContenant(ihm.getRecipiantBefore().getValue());
                ihm.getMessageBefore().setText(model.getRecipiantBefore().getContenant()+" / "+model.getRecipiantBefore().getVolume());
                model.getRecipiantBefore().setContenant(ihm.getRecipiantBefore().getValue());
                checkButtonValidity();
            }
        });
        this.ihm.getRecipiantAfter().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.getRecipiantAfter().setContenant(ihm.getRecipiantAfter().getValue());
                ihm.getMessageAfter().setText(model.getRecipiantAfter().getContenant()+" / "+model.getRecipiantAfter().getVolume());
                model.getRecipiantAfter().setContenant(ihm.getRecipiantAfter().getValue());
                checkButtonValidity();
            }
        });
        this.ihm.getInitialiser().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.getRecipiantAfter().setContenant(0);
                model.getRecipiantBefore().setContenant(0);
                updateJlabels();
                updateJsliders();
                
            }
        });  
        
        this.ihm.getVerser().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int valeurAVerser = model.getRecipiantBefore().getContenant();
                int contenantAfter = model.getRecipiantAfter().getContenant();
                if( !((contenantAfter +  valeurAVerser ) > model.getRecipiantAfter().getVolume()) ){
                    model.getRecipiantBefore().setContenant(0);
                    model.getRecipiantAfter().setContenant(model.getRecipiantAfter().getContenant() + valeurAVerser);
                    updateJlabels();
                    updateJsliders();
                }    
                checkButtonValidity();
            }
        });
    }
    
    public void updateJsliders(){
        ihm.getRecipiantAfter().setValue(model.getRecipiantAfter().getContenant());
        ihm.getRecipiantBefore().setValue(model.getRecipiantBefore().getContenant());
    }
    public void updateJlabels(){
        ihm.getMessageAfter().setText(model.getRecipiantAfter().getContenant()+" / "+model.getRecipiantAfter().getVolume());
        ihm.getMessageBefore().setText(model.getRecipiantBefore().getContenant()+" / "+model.getRecipiantBefore().getVolume());
    }
    public void checkButtonValidity(){
        if( ((model.getRecipiantBefore().getContenant() +  model.getRecipiantAfter().getContenant() ) > model.getRecipiantAfter().getVolume()) ){
            ihm.getVerser().setEnabled(false);
            ihm.getRemplir().setEnabled(false);
        }else{
            ihm.getVerser().setEnabled(true);
            ihm.getRemplir().setEnabled(true);
        }
            
    }
}

