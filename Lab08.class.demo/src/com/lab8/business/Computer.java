package com.lab8.business;

public abstract class Computer {
	private String brand;
	protected double price;
	
	public Computer() {
		super();
	}

	public Computer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String getPriceFormatted();

	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + getPriceFormatted();
	}
}
