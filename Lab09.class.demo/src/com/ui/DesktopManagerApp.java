package com.ui;

import com.db.DesktopDAO;
import com.db.DesktopDB;

public class DesktopManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Desktop Manager");

		DesktopDAO dao = new DesktopDB();
		
		System.out.println("All desktops:");
		for (String s: dao.getAllDesktops()) {
			System.out.println(s);
		}
		
		System.out.println("Get a single desktop:");
		System.out.println(dao.getDesktop());
		
		
		System.out.println("bye");
	}

}
