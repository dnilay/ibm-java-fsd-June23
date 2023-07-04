package com.example;

public class TestStack implements Runnable {

	private Mystack mystack;
	
	{
		mystack=new Mystack();
	}
	@Override
	public void run() {
		
		mystack.push('a');
		mystack.push('b');
		mystack.push('b');
		mystack.push('b');
		mystack.push('b');
		mystack.push('b');
		mystack.push('b');
		mystack.push('b');
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	}

}
