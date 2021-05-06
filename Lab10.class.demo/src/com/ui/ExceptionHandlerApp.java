package com.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Exception Handler App");

		Scanner sc = new Scanner(System.in);

		int nbr1 = 0;
		boolean success = false;
		while (!success) {
			try {
				System.out.print("Enter a whole number: ");
				nbr1 = sc.nextInt();
				success = true;
			} 
			catch (InputMismatchException ime) {
				System.out.println("Invalid input.  Please try again.");
//				System.out.println("m:"+ime.getCause());
//				System.out.println("c:"+ime.getCause());
//				System.out.println("lm:"+ime.getLocalizedMessage());
//				ime.printStackTrace();
				sc.nextLine();   // discards input
			}
			finally {
				// executes after success or exception
				// always executes
				// not required in this instance
			}
		}
		System.out.println("You entered " + nbr1);

		double dbl1=0;
		success = false;
		while (!success) {
			try {
				System.out.print("Enter a decimal number:  ");
				dbl1 = sc.nextDouble();
				success = true;
			} catch (Exception e) {
				System.out.println("Invalid input.  Please try again.");
				sc.nextLine();
			}
		}
		System.out.println("You entered " + dbl1);

		System.out.println("bye");

	}

}
