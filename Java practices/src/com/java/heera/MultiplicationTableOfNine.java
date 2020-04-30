package com.java.heera;

import java.util.Scanner;

public class MultiplicationTableOfNine {
//generate multiplication table of 9
	public static void main(String[] args) {
		int num = 9;
		System.out.println("***** Multiplication Table of 9 ****** ");
		for (int i = 1; i <= 10; i++) {
			int product = i * num;
			System.out.println(num + "*" + i + " = " + product);
		}
	}
}
