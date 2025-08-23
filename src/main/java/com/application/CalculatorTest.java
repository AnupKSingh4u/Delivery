package com.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

	 private final Calculator calculator = new Calculator();

	    @Test
	    public void testAdd() {
	        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
	    }
	
}
