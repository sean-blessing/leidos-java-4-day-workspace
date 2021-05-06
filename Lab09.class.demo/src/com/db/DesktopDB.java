package com.db;

public class DesktopDB implements DesktopDAO {
	
	private String[] desktops = {"HP", "Acer", "Dell"};

	@Override
	public String[] getAllDesktops() {
		return desktops;
	}

	@Override
	public String getDesktop() {
		return desktops[0];
	}

	@Override
	public void addDesktop(String name) {
		// not yet implemented
		// implement with Collections
	}

	@Override
	public void updateDesktop(String name) {
		// not yet implemented

	}

	@Override
	public void deleteDesktop(String name) {
		// not yet implemented

	}

}
