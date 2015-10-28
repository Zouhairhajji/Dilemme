/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;

import Exercice3.*;
import Exercice2.*;
import Exercice1.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author zouhairhajji
 */
public class Input {
    
    public static String readLine(){
        String s = "";
        try{
            s = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        }catch(Exception e){
            return s;
        }        
        return s;
    }
    
    
    
    public static int readInt(){
        int res = 0;
        try{
            res = Integer.parseInt(readLine());
        }catch(Exception e){
            throw  new RuntimeException("Input.readInt : not an integer");
        }        
        return res;
    }
    
}
