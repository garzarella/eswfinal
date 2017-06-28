package MetodoRegulaFalsi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegulaFalsiTest {

    private static RegulaFalsi regulaFalsi = new RegulaFalsi();
    
    public RegulaFalsiTest() {
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
    public void testRegulaFalsiIntervaloNulo() {
        regulaFalsi.regulaFalsi(1, 1, 0.005);
        regulaFalsi.regulaFalsi(4, 4, 0.0001);
    }
    
    /*
        Teste simulando funcionamento correto da classe
    */
    @Test
    public void testRegulaFalsiAssertEquals() {
        assertEquals(1.4473570678, regulaFalsi.regulaFalsi(1, 2, 0.001), 0.0000000001);
    }
    
    /*
        Teste garantindo que o resultado de xn seja diferente.
    */
    @Test
    public void testRegulaFalsiAssertFalse() {
        /*
    A expressão abaixo deve ser diferente do valor obtido devido a tolerância menor do double (uma vez
    que mais valores após o final do expected são encontradas no software)
        */    
        assertNotEquals(1.4473570678, regulaFalsi.regulaFalsi(1, 2, 0.001), 0.00000000000001);
        
        //A expressão abaixo deverá retornar um valor expected diferente
        assertNotEquals(2, regulaFalsi.regulaFalsi(1, 2, 0.1), 0.01);
    }
    
    
    
    
    
    

}
