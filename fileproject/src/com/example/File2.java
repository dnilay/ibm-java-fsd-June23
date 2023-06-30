package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader=null;
		BufferedWriter bufferedWriter=null;
		
		try {
			FileReader reader=new FileReader("hello.txt");
			bufferedReader=new BufferedReader(reader);
			
				FileWriter writer=new FileWriter("output1.txt");
				
				bufferedWriter=new BufferedWriter(writer);
				String line=null;
				line=bufferedReader.readLine();
				while(line !=null)
				{
					bufferedWriter.write(line, 0, line.length());
					bufferedWriter.newLine();
					line=bufferedReader.readLine();
				}
			 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			bufferedWriter.close();
			bufferedWriter.close();
		}
		

	}

}
