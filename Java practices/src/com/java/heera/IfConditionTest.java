package com.java.heera;

public class IfConditionTest {

	public static void main(String[] args) {
		int balance =10000;
		boolean withdraw;
		if(balance<0)
			withdraw=false;
		else
			withdraw=true;
		System.out.println("Can I withdraw:  "+withdraw);
			

	}

}
