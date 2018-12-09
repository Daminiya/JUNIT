package com.javapoints.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javapoints.logic.Calculation;

public class TestCase1 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Run @BeforeClass.........");
	}

	@Before
	public void setUpBefore() throws Exception {
		System.out.println("Run @Before.........");
	}

	@Test
	public void testArea() {
		System.out.println("test case Area");
		assertEquals(600, Calculation.getArea(20, 30));

	}

	@Test
	public void testCube() {
		System.out.println("test case Cube");
		assertEquals(27, Calculation.getCube(3));

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Run @After");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Run @AfterClass");
	}
}
