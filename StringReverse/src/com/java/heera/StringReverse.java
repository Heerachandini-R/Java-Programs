package com.java.heera;

public class StringReverse {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String reverseStr = "";
		for (int i = s1.length()-1; i >=0 ; i--) {
			reverseStr = reverseStr + s1.charAt(i);
		}
		System.out.println("Reversed String: "+reverseStr);
	}
}