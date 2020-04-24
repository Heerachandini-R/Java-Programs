package com.java.heera;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Swap two numbers without using a third variable
		int a = 5;
		int b = 4;
		System.out.println("Values Before swaping: " + "a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Values After swaping: " + "a=" + a + " b=" + b);
	}
}
