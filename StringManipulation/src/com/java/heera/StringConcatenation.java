package com.java.heera;

public class StringConcatenation {

	public static void main(String[] args) {
		String str1="Heera";
		String str2="Chandini";
		//concatenation using arithmetic "+" operator
		String str3=str1+str2;
		System.out.println(str3);
		//concatenation using "string.concat()" method
		System.out.println(str2.concat(str1));
		System.out.println(str1.concat(str2));
	}
}
