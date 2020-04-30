package com.java.heera;

public class ArrayDemo_EvenNumbers {
//create an array of ten integers and print only even values
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Even values are: ");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				System.out.print(array1[i] + "\t ");
			}

		}
// array to print odd values while creating an array
		System.out.println();
		System.out.println("Odd values are:");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 != 0) {
				System.out.print(array1[i] + "\t");
			}
		}
	}
}
