/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Enum.Role;
import static Enum.Role.*;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public class Accout extends Compte{

    private Role role;
    private ArrayList<Compte> comptes;
    
    
    public Accout(String nomDuCompte, String motDePasse,Role role) {
        super(nomDuCompte, motDePasse);
        comptes = new ArrayList<>();
        this.role = role;
    }

    public Accout(String nomDuCompte, String motDePasse) {
        this(nomDuCompte, motDePasse, _USER_);
    }

    @Override
    public String toString() {
        return "Accout{" + "role=" + role + ", comptes=" + comptes + " \n\t Classe pere : "+super.toString()+"}";
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }
    
    
}
