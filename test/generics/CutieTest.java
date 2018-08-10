/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class CutieTest {
    
    public CutieTest() {
    }

    /**
     * Test of getT method, of class Cutie.
     */
    @Test
    public void testGetT() {
        System.out.println("getT");
        Cutie instance = new Cutie();
        Incaltaminte expResult = null;
        Incaltaminte result = instance.getT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setT method, of class Cutie.
     */
    @Test
    public void testSetT() {
        System.out.println("setT");
        Cutie instance = new Cutie();
        Incaltaminte t = null;
        instance.setT(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
