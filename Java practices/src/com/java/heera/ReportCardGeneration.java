package com.java.heera;

import java.util.Scanner;

public class ReportCardGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Report Card Generation");
		System.out.println("enter student name:");
		String name = sc.nextLine();
		System.out.println("enter no of subjects: ");
		int numsub = sc.nextInt();
		// System.out.println("enter mark of subject n["+n[i]+"] : ");
		int[] marks = new int[numsub];

		for (int i = 0; i < numsub; i++) {
			System.out.println("enter mark for Subject-" + (i + 1) + ":\t");
			marks[i] = sc.nextInt();
		}

		System.out.println("-------------------------------");
		System.out.println("\t REPORT CARD");
		System.out.println("Name :" + name);
		System.out.println("-------------------------------");
		System.out.println("SUBJECT\t\t    \tMARKS");
		System.out.println("-------------------------------");
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject-" + (i + 1) + "\t\t " + marks[i]);
			total = total + marks[i];
		}
		System.out.println("-------------------------------");
		float avg = (float) total / numsub;
		System.out.println("TOTAL: " + total + "\t  AVERAGE:" + avg);
		// using printf function
		// System.out.printf("Total:%d\t Average:%.2f\n",total,avg);
		System.out.println("-------------------------------");
	}
}
