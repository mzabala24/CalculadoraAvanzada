/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CalculosBasicosTest {
    
    public CalculosBasicosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 2;
        int b = 3;
        CalculosBasicos instance = new CalculosBasicos();
        int expResult = 5;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 4;
        int b = 4;
        CalculosBasicos instance = new CalculosBasicos();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 0;
        int b = 0;
        CalculosBasicos instance = new CalculosBasicos();
        int expResult = 0;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 0;
        CalculosBasicos instance = new CalculosBasicos();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPotenciacion() {
        System.out.println("potenciacion");
        int a = 2;
        int b = 3;
        CalculosBasicos instance = new CalculosBasicos();
        int expResult = 8;
        int result = instance.potenciacion(a, b);
        assertEquals(expResult, result);
        
    }
    
}
