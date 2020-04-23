package com.java.heera;

public class MirroredRightTrianglePattern {

	public static void main(String[] args) {
		//int i, j;
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
