/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveData;

/**
 *
 * @author zouhairhajji
 */
public interface SaveLoadData {
    
    public boolean saveData(Object ... object);
    public Object[] loadData();
    
}
