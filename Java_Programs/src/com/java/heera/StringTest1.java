package com.java.heera;

public class StringTest1 {

	public static void main(String[] args) {
		/*
		 * string literals are created in string pool before creating it will check
		 * whether it is available in the string pool s1 and s2 are string literals and
		 * pointing to same memory in string pool
		 */

		// s1==s2 compares the reference /memeory in the stringpool
		String s1 = "heera";
		String s2 = "heera";
		System.out.println(s1 == s2); // true

		// string s3 & s4 are pointing to different memory
		String s3 = new String("heera");
		String s4 = new String("heera");
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4));// true

		// obj.equals(obj) compares two object values
		String s5 = "heera";
		String s6 = "Heera";
		System.out.println(s5.equals(s6));// false -- case sensitive
		System.out.println(s5.equalsIgnoreCase(s6)); // true

	}
}
