/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipiant;

import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zouhairhajji
 */
public class RecipiantTest {

   
   

    //@Test ( expected =IllegalAnnotationException.class )
    @Test ( expected = IndexOutOfBoundsException.class )
    public void testSomeMethod() {
        ArrayList<String> instance = new ArrayList<>();
        instance.clear();
        System.out.println("héhé");
        String string = instance.get(-12);
        System.out.println(string+"héhé");
    }

    /**
     * Test of getContenant method, of class Recipiant.
     */
    @Test
    public void testGetContenant() {
        System.out.println("getContenant");
        Recipiant instance = new Recipiant();
        int expResult = 0;
        int result = instance.getContenant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setContenant method, of class Recipiant.
     */
    @Test
    public void testSetContenant() {
        System.out.println("setContenant");
        int contenant = 0;
        Recipiant instance = new Recipiant();
        instance.setContenant(contenant);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVolume method, of class Recipiant.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Recipiant instance = new Recipiant();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, expResult);
    }

    /**
     * Test of setVolume method, of class Recipiant.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int volume = 0;
        Recipiant instance = new Recipiant();
        instance.setVolume(volume);
    }
    
}
