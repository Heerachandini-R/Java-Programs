package com.java.heera;

public class ArrayTest4 {

	public static void main(String[] args) {
		// Two-Dimension Array (Multi-Dimension Array) Initialization
		int[][] n = { {1,2,3},{4,5}, {6,7,8,9} };
		System.out.println("Size of the array: " + n.length);
		for (int i = 0; i < n.length; i++) {
			System.out.println("size of n[" + i + "] is: " + n[i].length);
		}
		System.out.println();

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Extended For loop
		/*	for (int[] x : n) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
		System.out.println();
		} */
	}
}
