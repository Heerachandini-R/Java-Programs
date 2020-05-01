package com.java.heera;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Sachin";
		/*Returns true if and only if the argument is a 
		 * String object that represents the same sequence of 
		 * characters as this object.*/
		//equals method compares the object s1 & s2
		//Returns "true" if the character sequence of the strings are same or not
		System.out.println(s1.equals(s2));
		
		//compares two strings lexicographically
		//Returns 0 if(result=0), both are equal; result >0  & result <0
		System.out.println(s1.compareTo(s2));
		
		String s3="Tendulkar";
		String s4="TENDULKAR";
		/* Returns true if and only if the argument is a 
		 * String object that represents the same sequence of 
		 * characters as this object, ignoring differences in case.*/
		System.out.println(s3.equalsIgnoreCase(s4));
		
		/*Returns true if and only if the argument is a 
		 * String object that represents the same sequence of 
		 * characters as this object, ignoring differences in case.*/
		System.out.println(s3.compareToIgnoreCase(s4));
		String s5= s1+" "+s3;
		//concatenation of two strings
		System.out.println(s1.concat(s3));
		System.out.println(s5);
		
		System.out.println(s1==s2);
	}
}