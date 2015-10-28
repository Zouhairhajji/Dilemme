/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comptes;

import Compte.Account;
import Compte.InformationsSecrete;
import Enums.TypeCompte;
import static Enums.TypeCompte.*;
import java.util.ArrayList;

/**
 *
 * @author zouhairhajji
 */
public abstract class Compte extends Account{
    
    private ArrayList<InformationsSecrete> questionReponseSecrete;
    private TypeCompte typeCompte;
    
}
