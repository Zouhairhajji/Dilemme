package Main;

import Classes.Accout;
import Static.Files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zouhairhajji
 */
public class Main {
    public static void main(String[] args) {
        Accout compte = new Accout("Zouhair HAJJI", "Maxquejaime");
        System.out.println(Files.CreateFile("File.txt"));
        
        System.out.println(Files.getHomeDire());
        System.out.println(Files.folderRacineExist());
        
    }
}
