package com.leidos.packageapp.business;

public class ColorTelevision extends Television {
	private int colorTint;

	public ColorTelevision(String brandIn, int volumeIn, int colorTint) {
		super(brandIn, volumeIn);
		this.colorTint = colorTint;
	}

	// using generate constructor from superclass...
	public ColorTelevision(String brandIn, int volumeIn) {
		super(brandIn, volumeIn);
		// TODO Auto-generated constructor stub
	}

	public int getColorTint() {
		return colorTint;
	}

	public void setColorTint(int colorTint) {
		this.colorTint = colorTint;
	}

	@Override
	public String toString() {
		return "ColorTelevision [colorTint=" + colorTint + ", toString()=" + super.toString() + "]";
	}

	
	

}
