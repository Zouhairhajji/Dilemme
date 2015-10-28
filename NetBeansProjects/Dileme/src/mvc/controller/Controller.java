/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import mvc.view.View;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import mvc.model.Model;

/**
 *
 * @author zouhairhajji
 */
public class Controller {
    
    private View view;
    private Model model;

    public Controller() {
        this.model = new Model(this);
        this.view = new View(model.getPartie());
        this.model.getPartie().addObserver(this.view);
        this.view.setVisible(true);
        this.initComponent();
    }
    
    
    
    public void initComponent(){
        this.view.getPanelProchainCoup().getCc().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.getPartie().addCoup(true, true);
            }
        });
        this.view.getPanelProchainCoup().getCd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.getPartie().addCoup(true, false);
            }
        });
        this.view.getPanelProchainCoup().getDc().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.getPartie().addCoup(false, true);
            }
        });
        this.view.getPanelProchainCoup().getDd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.getPartie().addCoup(false, false);
            }
        });
    }
    
    
}
