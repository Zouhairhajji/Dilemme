/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Compte.Account;
import Comptes.Compte;
import Compte.Last_Login;
import Enums.TypeUser;
import java.util.ArrayList;
import java.util.Date;
import static Enums.TypeUser.*;

/**
 *
 * @author zouhairhajji
 */
public abstract class User extends Account{
    
    private Date dateCreation;
    private TypeUser typeUser;
    
    private ArrayList<Last_Login> last_login;
    private ArrayList<Compte> comptesUsers;
    
    
    
}
