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
public abstract class Account {
    
    private String login;
    private String password;
    private Date dateCreation;
    private ArrayList<InformationsSecrete> questionReponseSecrete;
    
    
    
}
