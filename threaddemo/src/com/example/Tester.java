package com.example;

public class Tester {

	public static void main(String[] args) {
		TestStack s = new TestStack();
		Thread t = new Thread(s);
		t.start();
		Thread t1 = new Thread(s);
		t1.start();
	}

}
