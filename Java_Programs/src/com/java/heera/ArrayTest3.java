package com.java.heera;

public class ArrayTest3 {

	public static void main(String[] args) {
		/*
		 * Creation of Multi-dimension array
		 *  'n' is an array containing other arrays,
		 * which is called two dimensional array or Multi-dimensional array
		 */
		int[][] n = new int[5][4];
		System.out.println("size of array :" + n.length);
		for (int i = 0; i < n.length; i++) {
			System.out.println("size of n[" + i + "] is :" + n[i].length);
		}
		System.out.println();

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
