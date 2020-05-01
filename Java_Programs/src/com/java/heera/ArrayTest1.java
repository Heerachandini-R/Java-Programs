package com.java.heera;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] marks = { 92, 98, 80, 65, 74, 83 };
		System.out.println("No of subjects: " + marks.length);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark for subject-" + (i + 1) + " = " + marks[i]);
		}
		
		//Extended for loop OR For each loop - from jdk 1.5 onwards
		System.out.print("Marks Obtained: ");
		for (int mark : marks) {
			System.out.print(mark + "\t");
		}
		System.out.println();

	}

}
