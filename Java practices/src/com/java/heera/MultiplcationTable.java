package com.java.heera;

import java.util.Scanner;

public class MultiplcationTable {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println("Multiplication table of "+num );
		for (int i = 1; i <= 10; i++) {
			int product = num * i;
			
			System.out.println(num + "*" + i + "=" + product);
		}

	}

}
