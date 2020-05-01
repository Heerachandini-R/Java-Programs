package com.java.heera;

public class OperatorTest3 {

	public static void main(String[] args) {
		int n=5;
		n*=n+=10;
		System.out.println(n);

		
		/*************  SOLUTION
		 
	           <--------	  ( right side to left side)
		 n*=n+=10
		 n=n*(n+10)
		 =5*(5+10)
		 =5*(25)
		 =75
		 
		 ************/
	}

}
