package com.java.heera;

public class StringMethods {

	public static void main(String[] args) {
		String str="Heerachandini";
		System.out.println("size: "+str.length()); //13
		System.out.println(str.indexOf("a"));//4
		System.out.println(str.lastIndexOf("a")); //7
		System.out.println(str.charAt(9)); //d
		System.out.println(str.toUpperCase());  //HEERACHANDINI
		System.out.println(str.toLowerCase());  //heerachandini
		System.out.println(str.replace('a', '*'));  //Heer*ch*ndini
		System.out.println(str); //Heerachandini
		System.out.println(str.indexOf('i', 5));//10
		
		str="   heera chandini   ";
		System.out.println(str.trim());
		System.out.println(str.length());//20 including white space
	}
}
