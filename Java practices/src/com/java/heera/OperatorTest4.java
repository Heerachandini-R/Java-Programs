package com.java.heera;

public class OperatorTest4 {

	public static void main(String[] args) {
		int a,b,c,d;
		a=b=c=d=20;
		a+=b-=c*=d/=2;
		
		
		/* *********SOLUTION
		 * a+=b-=c*=d/=2;
		 * 
		 * d= d/2 => 20/2=10
		 * c=c*d => 20*10=200
		 * b=b-c=> 20-200 = -180
		 * a=a+b=> 20+ -180= -160
		 * 
		 * 
		 *  */
		System.out.println(a+"|"+b+"|"+c+"|"+d);

	}

}
