package com.java.heera;

public class SubString {

	public static void main(String[] args) {
		String str = "Everything is possible";
		//To find character at a particular index using charAt() method
		char charAtIndex = str.charAt(7);
		System.out.println(charAtIndex);
		System.out.println(str.charAt(9));
		
		String str1="I am successful";
		System.out.println(str1.substring(2,11));
		
		String subString=str1.substring(4);
		System.out.println(subString);
	}
}