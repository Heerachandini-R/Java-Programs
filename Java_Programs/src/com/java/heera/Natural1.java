package com.java.heera;

public class Natural1 {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("The first 10 natural numbers are:");
		while (num <= 10) {
			if (num == 10)
				System.out.print(num);
			else
				System.out.print(num + ",");
			num = num + 1;
		}

	}

}
