/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import jouet.Jouet;
import jouet.Mounika;
import jouet.Robot;
import vetement.Pantalon;
import vetement.Pull;

/**
 *
 * @author zouhairhajji
 */
public class Bebe {
    
    private Pull pull;
    private Pantalon pantalon;
    private boolean isPlaying;

    private Chambre chambre;
    
    public Bebe() {
        this.pull = new Pull();
        this.pantalon = new Pantalon();
        this.isPlaying = false;
        chambre = new Chambre();
    }
    
    public boolean changerVetement(){
        return this.changerVetement(chambre.getArmoire());
    }
    
    public void jouerAvecBebe(int indexJouer){
        this.jouerAvecBebe(indexJouer);
    }
    
    public void jouerAvecBebe(Jouet jouet){
        if(!this.isPlaying)
            return;
        this.isPlaying = true;
        if(jouet instanceof Robot){
            ((Robot)jouet).Jouer(this.chambre.getArmoire(), this);
        }else{
            ((Mounika)jouet).Jouer();
        }
            
    }
    public void nePasJouer(){
        this.isPlaying = false;
    }
    
    public boolean changerVetement(Armoire armoire){
        if(armoire.getPantalons().size() < 1 || armoire.getPulls().size() < 1)
            return false;
        Pull pullTemp = armoire.getPulls().remove(0);
        Pantalon pantalonTemp = armoire.getPantalons().remove(0);
        armoire.getPantalons().add(this.pantalon);
        armoire.getPulls().add(this.pull);
        setPantalon(pantalonTemp);
        setPull(pullTemp);
        return true;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public void setPull(Pull pull) {
        this.pull = pull;
    }
    
    
}
