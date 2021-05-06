package com.lab8.ui;

import com.lab8.business.*;

public class ComputerManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Computer Manager App!");
		
		Laptop lap1 = new Laptop("Acer", 1199.99, 15);
		Desktop desk1 = new Desktop("HP", 799.99, 22);
		
		//Computer comp = new Computer("Acer", 599.99); abstract classes can't be instantiated
		
		Computer[] pcs = new Computer[2];
		pcs[0] = lap1;
		pcs[1] = desk1;
		
		printComputerDetails(pcs);
		
		System.out.println("Bye");

	}
	
	private static void printComputerDetails(Computer[] pcs) {
		for (Computer c: pcs) {
			System.out.println(c);
			System.out.println(c.getClass().getSimpleName());
		}
	}

	
	
	
	
}
