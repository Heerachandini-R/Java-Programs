package com.java.heera;
import java.util.Scanner;

public class StringReverse1 {
	public static void main(String[] args) {
		System.out.println("Enter the string to reverse:");
		Scanner scn = new Scanner(System.in);
		String str1= scn.nextLine();
		String reverseStr1="";
		scn.close();
		for(int i=str1.length()-1;i>=0;i--) {
			reverseStr1=reverseStr1+str1.charAt(i);
		}
		System.out.println("Reversed String: "+reverseStr1);
	}
}
