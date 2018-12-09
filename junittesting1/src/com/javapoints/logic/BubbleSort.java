package com.javapoints.logic;

public class BubbleSort {
	public static void sort(int[] list) {
		int n = list.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (list[i - 1] > list[i]) {
					int temp = list[i - 1];
					list[i - 1] = list[i];
					list[i] = temp;
					swapped = true;
				}
			}
			n = n - 1;
		}
	}
}
