package com.github.AnupKSingh4u.test;





import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.AnupKSingh4u.Calculator;


public class CalculatorTest {

	 private final Calculator calculator = new Calculator();

	    @Test
	    public void testAdd() {
	        assertEquals("2 + 3 should equal 5", 5, calculator.add(2, 3));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals("3 - 2 should equal 1", 1, calculator.subtract(3, 2));
	    }
	
}
