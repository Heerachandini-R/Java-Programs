package com.java.heera;

public class OddOrEven {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		sc.close();
		int reminder=number%2;
		if(reminder==0)
			System.out.println(number+ " is an Even number");
		else
			System.out.println(number+ " is an Odd number");

	}

}
