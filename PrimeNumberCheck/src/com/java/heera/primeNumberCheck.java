package com.java.heera;
import java.util.Scanner;

public class primeNumberCheck {
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scan.nextInt();
		scan.close();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) // If isPrime is true then the number is prime else not
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}
