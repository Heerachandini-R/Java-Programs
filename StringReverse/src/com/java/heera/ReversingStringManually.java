package com.java.heera;

public class ReversingStringManually {

	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println(StringReverse(str));
	}

	private static String StringReverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb = sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}