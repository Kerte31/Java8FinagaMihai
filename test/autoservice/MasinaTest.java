/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai
 */
public class MasinaTest {
    
    public MasinaTest() {
    }

    /**
     * Test of getMarca method, of class Masina.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        String expResult = "MERCEDES";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Masina.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVitezaMaxima method, of class Masina.
     */
    @Test
    public void testGetVitezaMaxima() {
        System.out.println("getVitezaMaxima");
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        int expResult = 260;
        int result = instance.getVitezaMaxima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVitezaMaxima method, of class Masina.
     */
    @Test
    public void testSetVitezaMaxima() {
        System.out.println("setVitezaMaxima");
        int vitezaMaxima = 0;
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        instance.setVitezaMaxima(vitezaMaxima);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCuloare method, of class Masina.
     */
    @Test
    public void testGetCuloare() {
        System.out.println("getCuloare");
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        Masina.Culoare expResult = Masina.Culoare.BLUE;
        Masina.Culoare result = instance.getCuloare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCuloare method, of class Masina.
     */
    @Test
    public void testSetCuloare() {
        System.out.println("setCuloare");
        Masina.Culoare culoare = null;
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        instance.setCuloare(culoare);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPretVanzare method, of class Masina.
     */
    @Test
    public void testGetPretVanzare() {
        System.out.println("getPretVanzare");
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        int expResult = 12000;
        int result = instance.getPretVanzare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPretInchirierePeZi method, of class Masina.
     */
    @Test
    public void testGetPretInchirierePeZi() {
        System.out.println("getPretInchirierePeZi");
        Masina instance = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        int expResult = 25;
        int result = instance.getPretInchirierePeZi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
