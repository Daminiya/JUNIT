package com.javapoints.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javapoints.logic.Sorting;


public class SortingTestCase {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Run @BeforeClass.........");
	}

	@Before
	public  void setUpBefore() throws Exception {
		System.out.println("Run @Before.........");
	}
	@Test
	 public void testMaxValue() {
	   System.out.println("test case Max sorting");
	   assertEquals(10, Sorting.getMax(new int []{1,2,3,10}));
	 }
	@Test
	 public void testMinValue() {
	   System.out.println("test case min sorting");
	   assertEquals(10, Sorting.getMin(new int []{1,2,3,10}));
	 }

	
	@After
	public void tearDown() throws Exception {
		System.out.println("Run @After");
	}
	@AfterClass
	public static void tearDownAfterClass()throws Exception{
		System.out.println("Run @AfterClass");
	}
}
