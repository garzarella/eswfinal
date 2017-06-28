/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoSecante;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class SecanteTest {
    
    private static Secante secante = new Secante();
    
    public SecanteTest() {
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

    /*
    Testando intervalo nulo (quando a é igual a b)
    */
    @Test(expected=IllegalArgumentException.class)
    public void testSecanteIntervaloNulo() {
        secante.secante(1, 1, 0.01);
        secante.secante(0, 0, 0.1);
    }
    
    /*
        Teste simulando funcionamento correto da classe
    */
    @Test
    public void testSecanteAssertEquals() {
        assertEquals(0.3604217029, secante.secante(0, 1, 0.00001), 0.0000000001);
    }
    
    /*
        Teste garantindo que o resultado de xn seja diferente.
    */
    @Test
    public void testSecanteAssertFalse() {
        /*
    A expressão abaixo deve ser diferente do valor obtido devido a tolerância menor do double (uma vez
    que mais valores após o final do expected são encontradas no software)
        */    
        assertNotEquals(0.3604217029, secante.secante(0, 1, 0.00001), 0.00000000001);
        
        //A expressão abaixo deverá retornar um valor expected diferente
        assertNotEquals(1, secante.secante(0, 1, 0.00001), 0.1);
    }
    
}
