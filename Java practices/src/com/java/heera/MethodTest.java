package com.java.heera;

public class MethodTest {
	public static void writeName() {
		System.out.println("Welcome, guest");
	}

	static void writeName(String name) {
		System.out.println("Welcome" + name);
	}

	static int addNum(int x, int y) {
		int res = x + y;
		return res;
	}

	public static void main(String[] args) {
		writeName();
		writeName(" Rahul");
		System.out.println("Sum =" + addNum(10, 25));
	}
}
