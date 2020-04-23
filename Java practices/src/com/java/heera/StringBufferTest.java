package com.java.heera;

public class StringBufferTest {

	public static void main(String[] args) {
		/*StringBuffer 
		 * StringBuffermethods are "Synchronized" so it is "Thread Safe".
		 * it's "performance is less" compared to StringBuilder as one thread work at a time.
		 * StringBuffer can be created using "new" keyword only .
		 * StringBuffers default capacity/memory location is 16.
		 */

		StringBuffer sb = new StringBuffer();
		// StringBuffer sb=new StringBuffer(100); ---- > capacity will be 100
		System.out.println("size: " + sb.length() + " | Capacity: " + sb.capacity());
		// appending Heerachandini to StringBuffer

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
		
		//making the size 71 so the capacity will double to 172
		sb.append("KalliatPanoliThalasseryKannur");
		System.out.println(sb+" | size: "+sb.length() +" | Capacity: "+sb.capacity());
	}
}
