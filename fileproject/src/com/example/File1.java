package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {



	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("hello.txt");
			try {
				FileWriter output = new FileWriter("output.txt");
				try {
					char[] buffer = new char[128];
					int charsRead;

					// read the first buffer
					charsRead = input.read(buffer);
					while (charsRead != -1) {
						output.write(buffer, 0, charsRead);

						// read the next buffer
						charsRead = input.read(buffer);
					}

				} finally {
					output.close();
				}
			} finally {
				input.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
