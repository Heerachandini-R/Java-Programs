package com.java.heera;

import java.util.Scanner;

public class Assignment_LargestOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter two numbers :");
		Scanner scan =new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		if(num1>num2)
			System.out.println("Number1  is bigger than number2");
		else
			System.out.println("Number2  is bigger than number1");

	}

}
