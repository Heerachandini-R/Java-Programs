package com.java.heera;

public class StringExample1 {

	public static void main(String[] args) {
		String string1= new String ("Heera");
		string1.concat("Chandini");
		System.out.println(string1); //string is immutable , so we can't change the existing object
		//System.out.println(string1.concat("Chandini"));

	}

}
