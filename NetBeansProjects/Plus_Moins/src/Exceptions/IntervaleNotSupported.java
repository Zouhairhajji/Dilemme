/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author zouhairhajji
 */
public class IntervaleNotSupported extends Exception{

    public IntervaleNotSupported(String message) {
        super(message);
    }

    public IntervaleNotSupported() {
        super("L'intervale n'est plus correcte ... ");
    }
    
    
    
}
