/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author zouhairhajji
 */
public abstract class Compte {
    
    private String nomDuCompte,motDePasse;
    private InfoSecret informationsSecretes;
    private Date dateCreation;

    public Compte(String nomDuCompte, String motDePasse, InfoSecret informationsSecretes, Date dateCreation) {
        this.nomDuCompte = nomDuCompte;
        this.motDePasse = motDePasse;
        this.informationsSecretes = informationsSecretes;
        this.dateCreation = dateCreation;
    }

    public Compte(String nomDuCompte, String motDePasse){
        this(nomDuCompte, motDePasse, new InfoSecret("", ""), new Date());
    }

    @Override
    public String toString() {
        return " -- Compte{" + "nomDuCompte=" + nomDuCompte + ", motDePasse=" + motDePasse + ", informationsSecretes=" + informationsSecretes + ", dateCreation=" + dateCreation + " } --";
    }
    
    
    
    
    
    
    
    
}
