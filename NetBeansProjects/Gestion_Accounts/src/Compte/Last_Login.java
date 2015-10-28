/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compte;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zouhairhajji
 */
public class Last_Login {
    
    private ArrayList<Date> lastLogin;

    public Last_Login() {
        this.lastLogin = new ArrayList<>();
    }
    
    public void add(Date date){
        this.lastLogin.add(date);
    }
    
    public ArrayList<Date> getLastLogin() {
        return lastLogin;
    }
    
    
    
    
}
