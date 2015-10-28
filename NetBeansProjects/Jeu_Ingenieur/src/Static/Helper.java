/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

import Enum.Reponse;

/**
 *
 * @author zouhairhajji
 */
public  class Helper {
    
    public static void sout(int n){
        for(int i = 0;i<n;i++)
            System.out.println("\n");
    }
    public static void sout(){
        sout(2);
    }
    
    public static String enumToString(Reponse reponse){
        switch( reponse ){
            case _EGALE_:
                return "Egale";
                
            case _PLUS_PETIT_:
                return "Plus Petit";
                
            case _PLUS_GRAND_:
                return "Plus Grand";
                
            case _TRICHER_:
                return "Tricher";
            
            default:
                return "Undefined";
        }
    }
}
