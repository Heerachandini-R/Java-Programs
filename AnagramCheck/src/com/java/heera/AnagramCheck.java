package com.java.heera;

import java.util.Arrays;

public class AnagramCheck {
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] Arrays1 = s1.toLowerCase().toCharArray();
			char[] Arrays2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);
			if (status) {
				System.out.println(s1 + " and " + s2 + " are Anagrams");

			} else {
				System.out.println(s1 + " and" + s2 + "are not Anagrams");
			}
		}

	}

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");

	}
}
