/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntregaTIS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class FuncionFactorialTest {
    
    public FuncionFactorialTest() {
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

    /**
     * Test of main method, of class FuncionFactorial.
     */
    @org.junit.Test
    public void testMain() {
        String[] args = null;
        FuncionFactorial.main(args);       
    }

    /**
     * Test of factorial method, of class FuncionFactorial.
     */
   
    @org.junit.Test
    public void TestFactorialFlujo1() {
        float numero = 0;
        float expResult = 1;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);      
    }
    
    @org.junit.Test
    public void TestFactorialFlujo2() {
        float numero = -10;
        float expResult = -10;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);    
    }
     @org.junit.Test
    public void TestFactorialFlujo3() {
        float numero = 5;
        float expResult = 120;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        
    }

    //Flujo 4 - Factorial de la suma de dos numeros
    @org.junit.Test
    public void TestFactorialFlujo4() {
        float numero = 5 + 5;
        
        float expResult = 3628800;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        
    }
    
    //Flujo5 - Factorial de un numero decimal
    @org.junit.Test
    public void TestFactorialFlujo5() {
        float numero = (float)2.2;
        float expResult = (float) 2.2;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);        
    }
    
    //Flujo6 - Factorial de un numero grande, solo da hasta 34, de resto sale infinito, se controla eso
    @org.junit.Test
    public void TestFactorialFlujo6() {
        float numero = 34;
        float expResult = (float) 2.9523282E38;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        
    }
}
