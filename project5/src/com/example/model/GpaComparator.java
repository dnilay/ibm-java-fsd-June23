package com.example.model;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		double f=o1.getGPA()-o2.getGPA();
		if(f==0)
		{
			return 0;
		}
		else if(f<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}

	
	
	
}
