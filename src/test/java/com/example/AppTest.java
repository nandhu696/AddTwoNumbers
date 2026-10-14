
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(30, new App().add(10, 20));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, new App().add(-2, -3));
    }
}
