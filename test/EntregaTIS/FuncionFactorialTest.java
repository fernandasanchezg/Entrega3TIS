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
        System.out.println("main");
        String[] args = null;
        FuncionFactorial.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of factorial method, of class FuncionFactorial.
     */
   
    @org.junit.Test
    public void TestFactorialFlujo1() {
        System.out.println("factorial");
        float numero = 0;
        float expResult = 1;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @org.junit.Test
    public void TestFactorialFlujo2() {
        System.out.println("factorial");
        float numero = -10;
        float expResult = -10;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @org.junit.Test
    public void TestFactorialFlujo3() {
        System.out.println("factorial");
        float numero = 5;
        float expResult = 120;
        float result = FuncionFactorial.factorial(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
