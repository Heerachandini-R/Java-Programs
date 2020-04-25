package com.java.heera;

public class StringReverseUsingStringBuilder {

	public static void main(String[] args) {
		//JavaBrains
		String str = "HelloWorld!";
		System.out.println(reverseWithStringBuilder(str));
	}

	private static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}