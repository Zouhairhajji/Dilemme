/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jouet;

import exam.Armoire;
import exam.Bebe;

/**
 *
 * @author zouhairhajji
 */
public class Robot extends Jouet{
    
    public void Jouer(Armoire armoire,Bebe bebe){
        bebe.changerVetement(armoire);
    }
    
}
