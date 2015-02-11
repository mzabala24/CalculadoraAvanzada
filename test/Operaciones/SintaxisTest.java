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
public class SintaxisTest {
    
    public SintaxisTest() {
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
    public void testSinEspacios(){
        String expresion="5 +5";
        Sintaxis objeto= new Sintaxis();
        String resultado=objeto.sinEspacios(expresion);
        assertEquals("5+5", resultado);
                
                }
    
    @Test
    public void testCadenaVacia() {
        String expresion = "contenido";
        Sintaxis instance = new Sintaxis();
        boolean expResult = false;
        boolean result = instance.cadenaVacia(expresion);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testDosOperadoresSeguidos(){
        
        String expresion="++";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.dosOperadoresSeguidos(expresion);
        assertEquals(esperado, resutado);
    }
    
     @Test
    public void testOperadorParentesisCierra(){
        
        String expresion="(+)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.operadorParentesisCierra(expresion);
        assertEquals(esperado, resutado);
    }
    
     @Test
    public void testParentesisOperadorAbre(){
        
        String expresion="(+3)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parentesisOperadorAbre(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testAbreOperador(){
        
        String expresion="+(+3)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.iniciaOperador(expresion);
        assertEquals(esperado, resutado);
    }
    
     @Test
    public void testCierraOperador(){
        
        String expresion="+(+3)/";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.finalizaOperador(expresion);
        assertEquals(esperado, resutado);
    }
    @Test
    public void testParentesisDesbalanceados(){
        
        String expresion="+(+3)/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parenctesisDesbalanceados(expresion);
        assertEquals(esperado, resutado);
    }
    @Test
    public void testParentesisVacios(){
        
        String expresion="+(+3())/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parenctesisVacio(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testParentesisDesbalanceadosNoCorrespondencia(){
        
        String expresion="+(+3)/)(";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parentesisBalanceoIncorrecto(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testParentesisCierraSeguidoNumero(){
        
        String expresion="+(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parentesisNumeroCierra(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testParentesisAbreSeguidoNumero(){
        
        String expresion="+7(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parentesisNumeroAbre(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testDoblePuntoReal(){
        
        String expresion="+(+3..5)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.doblePuntoNumero(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testParentesisCierraSeguidoVariable(){
        
        String expresion="+(+3)x7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.parentesisCierraVariable(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testVariableSeguidaPunto(){
        
        String expresion="+(+3)z.7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.variableLuegoPunto(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testPuntoSeguidoVariable(){
        
        String expresion=".z+(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.puntoLuegoVariable(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testNumeroAntesDeVariable(){
        
        String expresion="+(+3x+1)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.numeroAntesVariable(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testNumeroDespuesVariable(){
        
        String expresion="x7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.variableDespuesNumero(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testCaracterInvalido(){
        
        String expresion="+(+3)7@/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.caracterInvalido(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testVerificaLetrasSeguidasCuatro(){
        
        String expresion="abcd+(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.verificaCuatroLetras(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testFuncionInvalida(){
        
        String expresion="sins+(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.funcionInvalida(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testDosLetrasSeguidas(){
        
        String expresion="+(+3+tk+)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.variableInvalida(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testAntesDeParentesisLetra(){
        
        String expresion="+x(+3)7/)";
        Sintaxis instancia = new Sintaxis();
        boolean esperado=true;
        boolean resutado=instancia.variableParentesisAbre(expresion);
        assertEquals(esperado, resutado);
    }
    
    @Test
    public void testEvaluaSintaxis() {
        
        String expresion = "(5+6*30)*7^8*y+sin(x+1)";
        Sintaxis instance = new Sintaxis();
        int expResult = 0;
        int result = instance.evaluaSintaxis(expresion);
        System.out.println(instance.mensajeSintaxis(result));
        assertEquals(expResult, result);
       
    }

    
    
}
