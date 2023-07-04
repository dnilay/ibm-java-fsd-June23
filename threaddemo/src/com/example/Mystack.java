package com.example;

public class Mystack {
	private int index=-1;
	private char[] info=new char[6];
	
	
	public  void push(char item)
	{
		synchronized (this) {
		
			info[++index]=item;
		}
		
	}
	
	public synchronized char pop()
	{
		return info[index--];
	}

}
