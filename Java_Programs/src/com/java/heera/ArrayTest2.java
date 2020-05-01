package com.java.heera;

public class ArrayTest2 {

	public static void main(String[] args) {
		/*Array creation
		 * The default value of
		  byte,short,long,int : 0
		  float ,double : 0.0
		  char : '\u0000'
		  boolean : false
		  Object/string : null
		 * 
		 * */
		int[] marks = new int[6];
		marks[0] = 92;
		marks[1] = 88;
		System.out.println("Marks of array =" + marks.length);
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + "\t");
		}

		System.out.println();

		double[] salary = new double[9];
		for (double sal : salary) {
			System.out.print(sal + "\t");
		}
		System.out.println();

		boolean[] status = new boolean[5];
		for (boolean stat : status) {
			System.out.print(stat + "\t");
		}
		System.out.println();
		
		String[] names =new String[7];
		for(String name:names) {
			System.out.print(name+"\t");
		}
		System.out.println();
		
		
	}

}
