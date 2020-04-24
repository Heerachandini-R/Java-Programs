package com.java.heera;

import java.util.Scanner;

public class Assignment_PositiveNegative {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		if(num<0)
			System.out.println("The number is negative");
		else if (num>0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is Zero");
	}
}
