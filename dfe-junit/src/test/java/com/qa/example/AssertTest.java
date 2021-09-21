package com.qa.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AssertTest {
	
	@Test
	
	public void assertEqualsTest() {
		boolean boo = true;
		assertEquals(true, boo);
	}
	
	@Test
	public void boolIsTrueTest() {
		boolean boo = true;
		assertTrue("Expected: Flag set to true", boo);
	}

	@Test
	public void falseTest() {
		boolean boo1 = false;
		assertFalse("Expected: Flag set to false", boo1);
	}

	@Test
	public void objectIsNull() {
		Object obj = null;
		assertNull("Expected: Null Object", obj);
	}

	@Test
	public void objectNotNull() {
		Object obj = "Something";
		assertNotNull("Expected: Not null object", obj);
	}

	@Test
	public void objectsAreTheSame() {
		Object obj = "Anoush Lowton";
		Object obj2 = obj;
		assertSame("Expected: Both objects to be the same", obj, obj2);
	}

	@Test
	public void objectsNotTheSame() {
		Object obj1 = "Alpha";
		Object obj2 = "Beta";
		assertNotSame("Expected: both objects are not the same", obj1, obj2);
	}

	@SuppressWarnings("unused")
	@Test
	public void failTest() {
		if (false) {
			fail();
		} else {
			assertTrue(true);
		}
	}
}
