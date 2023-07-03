package org.example;

import java.io.IOException;

public class App {

	public static void main(String args[]) {
		/*
		 * BufferedReader bufferedReader = null;
		 * 
		 * bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.print("Enter 1st Value: "); String str =
		 * bufferedReader.readLine(); int num1 = Integer.parseInt(str);
		 * System.out.print("Enter 2nd Value: "); str = bufferedReader.readLine(); int
		 * num2 = Integer.parseInt(str); System.out.println(num1 / num2);
		 * 
		 * bufferedReader.close(); int a = 10; int b = 20; System.out.println(a + b);
		 * 
		 * System.out.println("out side try/catch...");
		 */

		EmployeeFactory factory = new EmployeeFactory();
		try {
			factory.createEmployee();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("error occured...!"+e.getMessage());
		} catch (SalaryCheckException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

	}

}
