package com.java.heera;

public class ReverseString {

	public static void main(String[] args) {
		//String Reverse without using any inbuilt function
		String string="Malayalam";
		String revString="";
		for(int i=string.length()-1;i>=0;i--)
		{
			revString=revString+string.charAt(i);
		}
		System.out.println(revString);
	}
}