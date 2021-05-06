package com.lab8.business;

import java.text.NumberFormat;

public class Laptop extends Computer {
	private int size;

	public Laptop(String brand, double price, int size) {
		super(brand, price);
		this.size = size;
	}

	public Laptop() {
		super();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Laptop Computer:  "+super.toString()+ ", size=" + size+ " inches diagonal";
	}

	@Override
	public String getPriceFormatted() {
		// add currency format
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		return currencyFormat.format(price);
	}

	
	
	
	
}
