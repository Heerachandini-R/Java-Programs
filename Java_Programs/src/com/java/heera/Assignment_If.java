package com.java.heera;

import java.util.Scanner;

public class Assignment_If {

	public static void main(String[] args) {
		System.out.println("Enter the age:");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		
		if(age<18)
			System.out.println("Not eligible for voting");
		else 
			System.out.println("Eligible for voting");

	}

}
