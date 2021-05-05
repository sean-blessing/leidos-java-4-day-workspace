package com.leidos.packageapp.ui;

import com.leidos.packageapp.business.ColorTelevision;
import com.leidos.packageapp.business.Television;

public class PackagesApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Package App");
		
		Television tv1 = new Television("RCA", 30);
		System.out.println(tv1);
		
		ColorTelevision ctv = new ColorTelevision("Samsung", 90, 9);
		System.out.println(ctv);
		
		System.out.println("Bye");

	}

}
