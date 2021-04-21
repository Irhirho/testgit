package org.qtk.testeverything.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by SiriusTK on 16/9/13.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSum() throws Exception {
        calculator.sum(212.3, 34.2);
    }

    @Test
    public void testMultiply() throws Exception {
        calculator.multiply(343.77, 195.9);
    }
}