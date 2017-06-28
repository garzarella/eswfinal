/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoNewton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Passig
 */
public class NewtonTest {
    
    private static Newton newton = new Newton();
    
    public NewtonTest() {
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

    @org.junit.Test
    public void testNewtonFalso() {
        assertNotEquals(10, newton.newton(1, 2, 0.0000001), 0.1);
  
    }
    
    @org.junit.Test
    public void testNewtonVerdadeiro() {
       assertEquals(1.3308395421, newton.newton(1, 2, 0.0000001), 0.0000000001);
       
    }
    
    @org.junit.Test
    public void testNewtonNaN() {
       assertEquals(Double.NaN, newton.newton(1, 1, 0.0000001), 0.0000000001);
    }
    
}
