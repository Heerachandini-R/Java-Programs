package com.java.heera;
import java.util.Scanner;

public class VowelOrNot1 {

	public static void main(String[] args) {
		boolean isVowel=false;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=scn.next().charAt(0);
		scn.close();
		
		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			isVowel=true;
		}
		if(isVowel==true) {
			System.out.println("The character is a Vowel");
		}
		else {
			if(ch>'a'||ch>'A' && ch<'z'||ch<'Z') {
				System.out.println("The character is a Consonant");
				
			}
			else
				System.out.println("The character is not an alphabet");
		}
	}

}
