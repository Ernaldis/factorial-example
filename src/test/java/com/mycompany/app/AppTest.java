package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testFactorial() {
        assertEquals(1, App.factorial(1));
    }

    @Test
    public void testFactorialOf3() {
      assertEquals(6, App.factorial(3));
    }
}
