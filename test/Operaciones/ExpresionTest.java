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
public class ExpresionTest {
    
    public ExpresionTest() {
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
    public void testAnalizar() {
        System.out.println("analizar");
        String expresion = "";
        Expresion instance = new Expresion();
        instance.analizar(expresion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        Expresion instance = new Expresion();
        double expResult = 0.0;
        double result = instance.evaluar();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDarValorVariable() {
        System.out.println("darValorVariable");
        char variable = ' ';
        double valor = 0.0;
        Expresion instance = new Expresion();
        instance.darValorVariable(variable, valor);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetErrorMatematico() {
        System.out.println("getErrorMatematico");
        Expresion instance = new Expresion();
        boolean expResult = false;
        boolean result = instance.getErrorMatematico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
