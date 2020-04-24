package com.java.heera;
import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		
		char ch;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		ch=scn.next().charAt(0);
		if(ch== 'a'|| ch=='A'|| ch=='e'||ch== 'E'||ch=='i'||ch=='I'||ch=='O'||ch== 'O'||ch=='u'||ch=='U') {
			System.out.println("This is a vowel");
		}
		
		else {
			System.out.println("This is not a vowel");
		}
		scn.close();
	}
}
