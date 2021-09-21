package com.qa.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationExampleTest {

	// Only once
	// Before the tests within that class run.
	// Always static
	@BeforeClass
	public static void setUp() {
		System.out.println("Before Class");
	}

	// This is to executed before EVERY @Test annotation
	@Before
	public void init() {
		System.out.println("Before Test");
	}

	// The Test annotation denotes that the method below should be ran
	// as part of the JUnit test
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test
	public void test3() {
		System.out.println("Test 3");
	}

	// Ignore - to skip that method
	@Test
	@Ignore
	public void test4() {
		System.out.println("Test 4");
	}

	// Executed after EVERY @Test annotation
	@After
	public void after() {
		System.out.println("After Test");
	}

	// Runs after the test - it is ran last
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}

}
