package com.driver.test;

import static org.junit.Assert.*;

import com.driver.B;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    public void testMethodOverriding() {
        B b = new B();

        String result  = b.meth();

        assertEquals("Method is overridden in extended class B", result);
    }
}
