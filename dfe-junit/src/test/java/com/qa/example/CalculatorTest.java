package com.qa.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c;

	@Before
	public void init() {
		c = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(7, c.add(3, 4));
//		assertTrue(c.add(3, 4) == 7);
	}

	@Test
	public void subtract() {
		assertEquals(15, c.subtract(20, 5));
	}

	@Test
	public void conditionalTrueTest() {
		assertEquals(12, c.conditionalCalc(10, 2, true));
	}

	@Test
	public void conditionalFalseTest() {
		assertEquals(8, c.conditionalCalc(10, 2, false));
	}
}
