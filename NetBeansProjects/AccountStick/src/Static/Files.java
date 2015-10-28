/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

import java.io.File;

/**
 *
 * @author zouhairhajji
 */
public class Files {
    
    
    private static final String _home_Dir_Path_ = "user.home";
    private static final String _home_Dir_Name_ = "AccountStick";
    private static final String _Path_Separator_ = "/";
    
    public static String getHomeDire(){
        return getPath(_home_Dir_Path_)+_Path_Separator_+_home_Dir_Name_;
    }
    
    private static String getPath(String repository){
        return System.getProperty(repository);
    }
    
    
    public static boolean folderRacineExist(){
        try {
            File file = new File(Files.getHomeDire());
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public static String CreateFile(String fileName){
        try {
            new File(Files.getHomeDire()+_Path_Separator_+fileName);
            return Files.getHomeDire()+_Path_Separator_+fileName;
        } catch (Exception ex) {
            return "Error";
        }
    }
    
}
