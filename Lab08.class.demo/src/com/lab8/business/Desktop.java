package com.lab8.business;

import java.text.NumberFormat;

public class Desktop extends Computer {

	private int height;

	public Desktop(String brand, double price, int height) {
		super(brand, price);
		this.height = height;
	}

	public Desktop() {
		super();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Desktop Computer:  "+super.toString()+ ", height=" + height+ " inches tall";
	}

	@Override
	public String getPriceFormatted() {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		currencyFormat.setMinimumFractionDigits(3);
		return currencyFormat.format(price);		
	}
}
