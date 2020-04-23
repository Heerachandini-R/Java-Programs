package com.java.heera;

public class ArrayExample1 {

	public static void main(String[] args) {

		/*
		 * array initialization- once an array is created you cannot increase or
		 * decrease the size of the array
		 */
		// array initialization
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("Length of the array: " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value of number" + (i + 1) + " is: " + numbers[i]);
		}
		System.out.println();

		// for each loop/ extended for loop (since JDK 1.5)
		System.out.print("Number array contains numbers : ");
		for (int number : numbers) {
			System.out.print(number + "\t");
		}
		System.out.println();
		
		System.out.println("Value of index5 is: "+numbers[5]);

		
	}

}
