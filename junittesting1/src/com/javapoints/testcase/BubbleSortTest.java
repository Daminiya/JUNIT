package com.javapoints.testcase;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import com.javapoints.logic.BubbleSort;

public class BubbleSortTest {
	@Test
	public void test1() {
		System.out.println("test case bubble sorting");
		int[] array = { 5, 2, 89, 0, 10, 3, 20, 1 };
		int[] sorted = { 0, 1, 2, 3, 5, 10, 20, 89 };
		BubbleSort.sort(array);
		assertEquals(true, Arrays.equals(array, sorted));
	}

	@Test
	public void test2() {
		System.out.println("test case bubble2 sorting");
		int SIZE = 1000;
		int[] list = new int[SIZE];
		int[] expectedList = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			int rand = (int) (Math.random() * SIZE);
			list[i] = rand;
			expectedList[i] = rand;
		}
		BubbleSort.sort(list);
		Arrays.sort(expectedList);
		assertEquals(true, Arrays.equals(list, expectedList));

		for (int i = 0; i < SIZE; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	

}
