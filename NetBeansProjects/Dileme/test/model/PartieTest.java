/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import model.Partie;
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
public class PartieTest {
    
    private Partie partie;
    
    @Before
    public void setUp() {
        this.partie = new Partie();
    }
    
    
    
    @Test
    public void testCoupCC(){
        partie.addCoup(true, true);
        assertEquals( 1, partie.getNbrCoups());
        assertEquals(3, partie.getScore(0, 0), 1e-6);
        assertEquals(3, partie.getScore(1, 0), 1e-6);
    }
    
    @Test
    public void testCoupCD(){
        partie.addCoup(true, false);
        assertEquals( 1, partie.getNbrCoups());
        assertEquals(5, partie.getScore(0, 0), 1e-6);
        assertEquals(0, partie.getScore(1, 0), 1e-6);
    }
    
    @Test
    public void testCoupDC(){
        partie.addCoup(false, true);
        assertEquals( 1, partie.getNbrCoups());
        assertEquals(0, partie.getScore(0, 0), 1e-6);
        assertEquals(5, partie.getScore(1, 0), 1e-6);
    }
    
    
    @Test
    public void testCoupDD(){
        partie.addCoup(false, false);
        assertEquals( 1, partie.getNbrCoups());
        assertEquals(1, partie.getScore(0, 0), 1e-6);
        assertEquals(1, partie.getScore(1, 0), 1e-6);
    }
    
    @Test
    public void testChoix(){
        partie.addCoup(true, true);
        assertEquals( 1, partie.getNbrCoups());
        partie.addCoup(false, true);
        assertEquals( 2, partie.getNbrCoups());
        
        assertEquals( "D" , partie.getChoix(0, 1));
        assertEquals( "C" , partie.getChoix(1, 1));
    }
    
    @Test
    public void testScore(){
        partie.addCoup(true, true); //  les deux joueurs ont 3 ans de prison
        assertEquals( 1, partie.getNbrCoups());
        partie.addCoup(false, true); // le premier joueur a 5 ans de prison parcequ'il a menti, alors que le 2 est liberé
        assertEquals( 2, partie.getNbrCoups());
        
        assertEquals( 8 , partie.getScorePlayer(0) , 1e-6);
        assertEquals( 3 , partie.getScorePlayer(1) , 1e-6);
    }
    
}
