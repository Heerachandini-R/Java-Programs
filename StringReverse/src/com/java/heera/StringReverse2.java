package com.java.heera;

public class StringReverse2 {
	public static void main(String[] args) {
		String string1 = "Java Programming";
		StringBuilder sb = new StringBuilder();
		for (int i = string1.length() - 1; i >= 0; i--) {
			//using append() method of stringBuilder class
			sb = sb.append(string1.charAt(i));
		}
		System.out.println("Reversed String: "+sb);
	}
}