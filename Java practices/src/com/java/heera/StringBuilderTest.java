package com.java.heera;

public class StringBuilderTest {

	public static void main(String[] args) {

		/*StringBuilder is same as StringBuffer except
		 * StringBuilder methods are "Not-Thread Safe"(Not-Synchronized) .
		 * so "performance is high" than StringBuffer as multiple thread can run at a time
		 * ie, data is not safe when multiple threads run at the same time.
		 * StringBuilder is preferred 
		 * StringBuilder is created using"new" keyword only 
		 *  default capacity/memory location is 16
		 */

		StringBuilder sb = new StringBuilder();
		// StringBuilder sb=new StringBuilder(100); ---- > capacity will be 100
		System.out.println("size: " + sb.length() + " | Capacity: " + sb.capacity());
		// appending Heerachandini to StringBuilder

		sb.append("Heerachandini");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());
		/*
		 * When we add the content/character once again the default capacity will double
		 * after 16
		 */

		sb.append("Ram");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());

		/*
		 * adding one more character making size of the content to 17 will double the
		 * capacity to 35
		 */
		sb.append("a");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());

		// making the size of the content 25 by adding character
		sb.append("Chandran");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());

		// making the size of the content 35 will double the capacity to 70
		sb.append("VidhunRajSreedharan");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());

		// making the size 71 so the capacity will double to 172
		sb.append("KalliatPanoliThalasseryKannur");
		System.out.println(sb + " | size: " + sb.length() + " | Capacity: " + sb.capacity());

	}

}
