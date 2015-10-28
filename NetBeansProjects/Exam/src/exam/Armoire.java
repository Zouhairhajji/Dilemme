/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import vetement.Pantalon;
import vetement.Pull;

/**
 *
 * @author zouhairhajji
 */
public class Armoire {
    
    private ArrayList<Pull> pulls;
    private ArrayList<Pantalon> pantalons;

    public Armoire() {
        pulls = new ArrayList<>();
        pantalons = new ArrayList<>();
    }

    public ArrayList<Pantalon> getPantalons() {
        return pantalons;
    }

    public ArrayList<Pull> getPulls() {
        return pulls;
    }
    
    
    
    
}
