package com.java.heera;

public class StringReverseManually1 {
	public static void main(String[] args) {
		String str1 = "Java Program";
		System.out.println(StringReverseManually(str1));
	}

	private static String StringReverseManually(String str1) {
		StringBuilder sb = new StringBuilder();
		for (int i = str1.length() - 1; i >= 0; i--) {
			sb = sb.append(str1.charAt(i));
		}
		return sb.toString();
	}
}
