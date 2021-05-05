package com.lab8.business;

import java.util.Date;

public class Timepiece {
	private Date currentTime;

	public Timepiece(Date currentTime) {
		super();
		this.currentTime = currentTime;
	}
	
	public void getCurrentTime() {
		System.out.println(currentTime);
	}

}
